parser grammar ProjectParser;

options {
  tokenVocab = ProjectLexer;
}

program: node* EOF     #ProgramDef
        ;

node: htmlElement       #HtmlNode
    | jinjaElement      #JinjaNode
    | HTML_TEXT         #TextNode
    ;



htmlElement
    : normalElement               #HtmlNormalElement
    | selfClosingElement          #HtmlSelfClosingElement
    | script                      #HtmlScriptElement
    | style                       #HtmlStyleElement
    ;

normalElement
    : TAG_OPEN TAG_NAME htmlAttribute* TAG_CLOSE
    htmlContent
    TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE        #NormalTag;

selfClosingElement
    : TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH TAG_CLOSE    #SelfCloseTag
    ;


htmlContent
    : htmlChardata? ((htmlElement| jinjaElement | HTML_COMMENT) htmlChardata?)*       #Content
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?        #Attribute
    ;

htmlChardata
    : HTML_TEXT    #HtmlText
    | SEA_WS       #HtmlSpace
    ;

htmlMisc
    : HTML_COMMENT    #HtmlComment
    | SEA_WS          #HtmlWhiteSpace
    ;
script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)    #HtmlScript
    ;

style
    : STYLE_OPEN cssStyle STYLE_CLOSE     #HtmlStyle
    ;

jinjaElement: jinjaVariable    #JinjaVariableElement
            | jinjaBlock       #JinjaBlockElement
            ;

jinjaVariable: JINJA_VAR_OPEN jinjaExpression JINJA_VAR_CLOSE     #Variable;

jinjaBlock:  JINJA_BLOCK_OPEN jinjaBody                           #Bloc;

jinjaBody: forStatement     #JinjaForBody
         | ifStatement       #JinjaIfBody
         | jinjaExpression   #JinjaExpressionBody
         ;

jinjaExpression
    : jinjaPrimary   #JinjaPrimaryExpr
    | jinjaExpression PLUS_JINJA jinjaExpression    #JinjaAddExpr
    | jinjaExpression MINUS_JINJA jinjaExpression   #JinjaSubExpr
    | jinjaExpression MULTI_JINJA jinjaExpression   #JinjaMulExpr
    | jinjaExpression EQUALS_EQUALS_JINJA jinjaExpression    #JinjaEqExpr
    | jinjaExpression NOT_EQUALS_JINJA jinjaExpression       #JinjaNeqExpr
    | jinjaExpression PIPE IDENTIFIER_JINJA                  #JinjaFilterExpr
    ;

jinjaPrimary
    : IDENTIFIER_JINJA (DOT_JINJA IDENTIFIER_JINJA)*    #JinjaIdentifier
    | NUMBER_JINJA  #JinjaNumber
    | STRING_JINJA   #JinjaString
    | LPAREN jinjaExpression RPAREN   #JinjaParenExpr
    ;

forStatement
                  : JINJA_FOR IDENTIFIER_JINJA JINJA_IN jinjaExpression JINJA_BLOCK_CLOSE
                    node*
                    JINJA_BLOCK_OPEN JINJA_END_FOR JINJA_BLOCK_CLOSE
                    #JinjaForStatement
                  ;

ifStatement
                 : JINJA_IF jinjaExpression JINJA_BLOCK_CLOSE
                   node*
                   (elifBlock)*
                   (elseBlock)?
                   JINJA_BLOCK_OPEN JINJA_END_IF JINJA_BLOCK_CLOSE
                   #JinjaIfStatement
                 ;

elifBlock: JINJA_BLOCK_OPEN
           JINJA_ELIF jinjaExpression
           JINJA_BLOCK_CLOSE
           node*
           #JinjaElifBlock
           ;

elseBlock: JINJA_BLOCK_OPEN
           JINJA_ELSE
           JINJA_BLOCK_CLOSE
           node*
           #JinjaElseBlock
           ;

cssStyle: cssStatement*      #CssStyleDef;

cssStatement: cssRule         #CssRuleStatement
            | cssAtRule       #CssAtRuleStatement;

cssRule
    : cssSelector LBRACE cssDeclaration* RBRACE    #CssRuleDef
    ;

cssSelector
    : selectorGroup         #CssSelectorDef
    ;

selectorGroup
    : selector (COMMA selector)*    #CssSelectorGroup
    ;

selector
    : compoundSelector (compoundSelector)*     #CssSelectorDescendant  // space = descendant
    ;

compoundSelector
    : simpleSelector+    #CssCompoundSelector
    ;

simpleSelector
        : STAR      #CssUniversalSelector
        | pseudoSelector      #CssPseudoSelector
        | typeSelector pseudoSelector?   #CssTypeSelector
        | classSelector pseudoSelector?  #CssClassSelector
        | idSelector pseudoSelector?     #CssIdSelector
    ;

typeSelector
    : IDENTIFIER_CSS    #CssType
    ;

classSelector
    : DOT IDENTIFIER_CSS      #CssClass
    ;

idSelector
    : HASH IDENTIFIER_CSS    #CssId
    ;

pseudoSelector
    : COLON IDENTIFIER_CSS   #CssPseudo
    ;

cssDeclaration
    : IDENTIFIER_CSS COLON cssValue SEMI       #Declaration
    | CSS_CUSTOM_PROP COLON cssValue SEMI      #CssCustomProperty
    ;

cssFunction
    : IDENTIFIER_CSS CSS_LPAREN cssValueList? CSS_RPAREN     #Function
    ;

cssValueList
    : cssValue (COMMA cssValue)*    #ValueList
    ;

cssValue
    : cssTerm (cssTerm | COMMA)+    #CssMultipleValues
    | cssTerm      #CssSingleValue
    ;

cssTerm
    : cssFunction      #CssFunctionTerm
    | DASH? NUMBER_CSS UNIT?     #CssNumberTerm
    | COLOR     #CssColor
    | COLOR_RGB     #CssRgbColor
    | COLOR_RGBA      #CssRgbaColor
    | COLOR_HSL       #CssHslColor
    | COLOR_HSLA      #CssHslaColor
    | STRING_CSS      #CssString
    | IDENTIFIER_CSS  #CssIdentifier
    | CSS_VAR         #CssVariable
    | CSS_CALC        #CssCalc
    ;


cssAtRule: cssMedia     #CssMediaRule;

cssMedia
    : CSS_MEDIA cssMediaQuery LBRACE cssRule+ RBRACE     #Media
    ;

cssMediaQuery
    : CSS_LPAREN cssMediaExpr CSS_RPAREN      #MediaQuery
    ;

cssMediaExpr
    : IDENTIFIER_CSS COLON cssValue          #MediaExpr
    ;
