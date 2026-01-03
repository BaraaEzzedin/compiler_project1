package Visitor;

import AST.*;
import AST.JinjaCss.*;
import AST.JinjaCss.CSSDeclarations.CSSCustomProperty;
import AST.JinjaCss.CSSDeclarations.CSSDeclaration;
import AST.JinjaCss.CSSSelectors.*;
import AST.JinjaCss.CSSStatements.CSSMediaExpression;
import AST.JinjaCss.CSSStatements.CSSMediaQuery;
import AST.JinjaCss.CSSStatements.CSSMediaRule;
import AST.JinjaCss.CSSStatements.CSSRule;
import AST.JinjaCss.CSSTerms.*;
import AST.JinjaCss.HtmlElements.*;
import AST.JinjaCss.JinjaExpressions.*;
import AST.JinjaCss.Statements.*;

import JinjaCssGrammar.ProjectParser;
import JinjaCssGrammar.ProjectParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class ProjectVisitor extends ProjectParserBaseVisitor<ASTNode> {
  @Override
  public ASTNode visitProgramDef(ProjectParser.ProgramDefContext ctx) {
    List<Statement> statements = new ArrayList<>();

    for (ProjectParser.NodeContext nodeCtx : ctx.node()) {
      ASTNode node = visit(nodeCtx);

      if (node instanceof Statement stmt) {
        statements.add(stmt);
      }
    }

    return new Program(ctx.getStart().getLine(), statements);
  }

  @Override
  public ASTNode visitCssColor(ProjectParser.CssColorContext ctx) {
    String value = ctx.getText();
    int line = ctx.getStart().getLine();
    return new CSSColor(line, value);
  }

  @Override
  public ASTNode visitCssFunctionTerm(ProjectParser.CssFunctionTermContext ctx) {
    return visit(ctx.cssFunction());
  }

  @Override
  public ASTNode visitFunction(ProjectParser.FunctionContext ctx) {
    int line = ctx.getStart().getLine();

    String functionName = ctx.IDENTIFIER_CSS().getText();

    CSSValueList arguments = null;
    if (ctx.cssValueList() != null) {
      arguments = (CSSValueList) visit(ctx.cssValueList());
    }

    return new CSSFunctionTerm(line, functionName, arguments);
  }

  @Override
  public ASTNode visitCssHslaColor(ProjectParser.CssHslaColorContext ctx) {
    String value = ctx.getText();
    int line = ctx.getStart().getLine();
    return new CSSHslaColor(line, value);
  }

  @Override
  public ASTNode visitCssHslColor(ProjectParser.CssHslColorContext ctx) {
    String value = ctx.getText();
    int line = ctx.getStart().getLine();
    return new CSSHslColor(line, value);
  }

  @Override
  public ASTNode visitCssIdentifier(ProjectParser.CssIdentifierContext ctx) {
    String value = ctx.getText();
    int line = ctx.getStart().getLine();
    return new CSSIdentifier(line, value);
  }

  @Override
  public ASTNode visitCssMultipleValues(ProjectParser.CssMultipleValuesContext ctx) {
    List<CSSTerm> terms = new ArrayList<>();
    for (ProjectParser.CssTermContext termCtx : ctx.cssTerm()) {
      CSSTerm term = (CSSTerm) visit(termCtx);
      if (term != null) {
        terms.add(term);
      }
    }

    int line = ctx.getStart().getLine();
    ;
    return new CSSMultipleValues(line, terms);
  }

  @Override
  public ASTNode visitCssNumberTerm(ProjectParser.CssNumberTermContext ctx) {
    Boolean negative = ctx.DASH() != null;
    double number = Double.parseDouble(ctx.NUMBER_CSS().getText());
    String unit = null;
    if (ctx.UNIT() != null) {
      unit = ctx.UNIT().getText();
    }
    int line = ctx.getStart().getLine();
    return new CSSNumberTerm(line, negative, number, unit);
  }

  @Override
  public ASTNode visitCssRgbaColor(ProjectParser.CssRgbaColorContext ctx) {
    int line = ctx.getStart().getLine();
    String value = ctx.getText();
    return new CSSRgbaColor(line, value);
  }

  @Override
  public ASTNode visitCssRgbColor(ProjectParser.CssRgbColorContext ctx) {
    int line = ctx.getStart().getLine();
    String value = ctx.getText();
    return new CSSRgbColor(line, value);
  }

  @Override
  public ASTNode visitCssSingleValue(ProjectParser.CssSingleValueContext ctx) {
    int line = ctx.getStart().getLine();
    CSSTerm term = (CSSTerm) visit(ctx.cssTerm());
    return new CSSSingleValue(line, term);
  }

  @Override
  public ASTNode visitCssString(ProjectParser.CssStringContext ctx) {
    int line = ctx.getStart().getLine();
    String value = ctx.STRING_CSS().getText();
    return new CSSString(line, value);
  }

  @Override
  public ASTNode visitValueList(ProjectParser.ValueListContext ctx) {
    List<CSSValue> values = new ArrayList<>();
    int line = ctx.getStart().getLine();
    for (ProjectParser.CssValueContext c : ctx.cssValue()) {
      CSSValue value = (CSSValue) visit(c);
      if (value != null) {
        values.add(value);
      }
    }
    return new CSSValueList(line, values);
  }

  @Override
  public ASTNode visitCssVariable(ProjectParser.CssVariableContext ctx) {
    int line = ctx.getStart().getLine();
    ;
    String name = ctx.getText();
    return new CSSVariable(line, name);
  }

  public ASTNode visitJinjaPrimaryExpr(ProjectParser.JinjaPrimaryExprContext ctx) {
    return visit(ctx.jinjaPrimary());
  }

  private ASTNode buildBinaryExpr(ParserRuleContext ctx, String op) {
    JinjaExpression left = (JinjaExpression) visit(ctx.getChild(0));
    JinjaExpression right = (JinjaExpression) visit(ctx.getChild(2));
    int line = ctx.getStart().getLine();

    return new JinjaBinaryExpression(line, left, right, op);
  }

  @Override
  public ASTNode visitJinjaAddExpr(ProjectParser.JinjaAddExprContext ctx) {
    return buildBinaryExpr(ctx, ctx.PLUS_JINJA().getText());
  }

  @Override
  public ASTNode visitJinjaSubExpr(ProjectParser.JinjaSubExprContext ctx) {
    return buildBinaryExpr(ctx, ctx.MINUS_JINJA().getText());
  }

  @Override
  public ASTNode visitJinjaMulExpr(ProjectParser.JinjaMulExprContext ctx) {
    return buildBinaryExpr(ctx, ctx.MULTI_JINJA().getText());
  }

  @Override
  public ASTNode visitJinjaEqExpr(ProjectParser.JinjaEqExprContext ctx) {
    return buildBinaryExpr(ctx, ctx.EQUALS_EQUALS_JINJA().getText());
  }

  @Override
  public ASTNode visitJinjaNeqExpr(ProjectParser.JinjaNeqExprContext ctx) {
    return buildBinaryExpr(ctx, ctx.NOT_EQUALS_JINJA().getText());
  }

  @Override
  public ASTNode visitJinjaIdentifier(ProjectParser.JinjaIdentifierContext ctx) {
    int line = ctx.getStart().getLine();
    if (ctx.IDENTIFIER_JINJA().size() == 1) {
      String name = ctx.IDENTIFIER_JINJA(0).getText();
      if (name.equals("true")) {
        return new JinjaBooleanExpression(line, true);
      }
      if (name.equals("false")) {
        return new JinjaBooleanExpression(line, false);
      }
    }
    List<String> parts = new ArrayList<>();
    for (var id : ctx.IDENTIFIER_JINJA()) {
      parts.add(id.getText());
    }
    return new JinjaIdentifier(line, parts);
  }

  @Override
  public ASTNode visitJinjaNumber(ProjectParser.JinjaNumberContext ctx) {
    int line = ctx.getStart().getLine();
    int value = Integer.parseInt(ctx.NUMBER_JINJA().getText());
    return new JinjaNumber(line, value);
  }

  @Override
  public ASTNode visitJinjaParenExpr(ProjectParser.JinjaParenExprContext ctx) {
    int line = ctx.getStart().getLine();
    JinjaExpression inner = (JinjaExpression) visit(ctx.jinjaExpression());
    return new JinjaParenthesesExpression(line, inner);
  }

  @Override
  public ASTNode visitJinjaString(ProjectParser.JinjaStringContext ctx) {
    int line = ctx.getStart().getLine();
    String raw = ctx.STRING_JINJA().getText();
    String value = raw.substring(1, raw.length() - 1);
    return new JinjaString(line, value);
  }

  @Override
  public ASTNode visitTextNode(ProjectParser.TextNodeContext ctx) {
    int line = ctx.getStart().getLine();
    String text = ctx.HTML_TEXT().getText();
    return new TextStatement(line, text);
  }

  @Override
  public ASTNode visitVariable(ProjectParser.VariableContext ctx) {
    int line = ctx.getStart().getLine();
    JinjaExpression expr = (JinjaExpression) visit(ctx.jinjaExpression());
    return new JinjaVariableStatement(line, expr);
  }

  @Override
  public ASTNode visitJinjaForStatement(ProjectParser.JinjaForStatementContext ctx) {
    int line = ctx.getStart().getLine();

    String variable = ctx.IDENTIFIER_JINJA().getText();
    JinjaExpression iterable = (JinjaExpression) visit(ctx.jinjaExpression());

    List<Statement> body = new ArrayList<>();
    for (ProjectParser.NodeContext nodeCtx : ctx.node()) {
      ASTNode node = visit(nodeCtx);
      if (node instanceof Statement stmt) {
        body.add(stmt);
      }
    }

    return new JinjaForStatement(line, variable, iterable, body);
  }

  @Override
  public ASTNode visitJinjaIfStatement(ProjectParser.JinjaIfStatementContext ctx) {
    int line = ctx.getStart().getLine();

    JinjaExpression condition = (JinjaExpression) visit(ctx.jinjaExpression());
    List<Statement> thenBody = new ArrayList<>();
    for (ProjectParser.NodeContext nodeCtx : ctx.node()) {
      ASTNode node = visit(nodeCtx);
      if (node instanceof Statement stmt) {
        thenBody.add(stmt);
      }
    }
    List<JinjaElifStatement> elifBlocks = new ArrayList<>();
    for (ProjectParser.ElifBlockContext elifCtx : ctx.elifBlock()) {
      JinjaElifStatement elif = (JinjaElifStatement) visit(elifCtx);
      elifBlocks.add(elif);
    }
    JinjaElseStatement elseBlock = null;
    if (ctx.elseBlock() != null) {
      elseBlock = (JinjaElseStatement) visit(ctx.elseBlock());
    }

    return new JinjaIfStatement(
        line, elseBlock, elifBlocks, thenBody, condition);
  }

  @Override
  public ASTNode visitJinjaElifBlock(ProjectParser.JinjaElifBlockContext ctx) {
    int line = ctx.getStart().getLine();

    JinjaExpression condition = (JinjaExpression) visit(ctx.jinjaExpression());

    List<Statement> body = new ArrayList<>();
    for (ProjectParser.NodeContext nodeCtx : ctx.node()) {
      ASTNode node = visit(nodeCtx);
      if (node instanceof Statement stmt) {
        body.add(stmt);
      }
    }

    return new JinjaElifStatement(line, condition, body);
  }

  @Override
  public ASTNode visitJinjaElseBlock(ProjectParser.JinjaElseBlockContext ctx) {
    int line = ctx.getStart().getLine();

    List<Statement> body = new ArrayList<>();
    for (ProjectParser.NodeContext nodeCtx : ctx.node()) {
      ASTNode node = visit(nodeCtx);
      if (node instanceof Statement stmt) {
        body.add(stmt);
      }
    }

    return new JinjaElseStatement(line, body);
  }
  //
  // @Override
  // public ASTNode visitHtmlNormalElement(ProjectParser.HtmlNormalElementContext
  // ctx) {
  // return visit(ctx.normalElement());
  // }
  //
  // @Override
  // public ASTNode visitNormalTag(ProjectParser.NormalTagContext ctx) {
  // int line = ctx.getStart().getLine();
  // String tagName = ctx.TAG_NAME(0).getText();
  // List<HtmlAttribute> attributes = new ArrayList<>();
  // for (ProjectParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
  // HtmlAttribute attr = (HtmlAttribute) visit(attrCtx);
  // if (attr != null) {
  // attributes.add(attr);
  // }
  // }
  // List<Statement> content = new ArrayList<>();
  // if (ctx.htmlContent() != null) {
  // ProjectParser.HtmlContentContext contentCtx = ctx.htmlContent();
  // for (int i = 0; i < contentCtx.getChildCount(); i++) {
  // var child = contentCtx.getChild(i);
  //
  // if (child instanceof ProjectParser.HtmlChardataContext) {
  // ASTNode node = visit(child);
  // if (node instanceof Statement stmt) {
  // content.add(stmt);
  // }
  // } else if (child instanceof ProjectParser.HtmlElementContext) {
  // ASTNode node = visit(child);
  // if (node instanceof Statement stmt) {
  // content.add(stmt);
  // }
  // } else if (child instanceof ProjectParser.JinjaElementContext) {
  // ASTNode node = visit(child);
  // if (node instanceof Statement stmt) {
  // content.add(stmt);
  // }
  // }
  // }
  // }
  //
  // return new NormalHtmlElement(line, tagName, attributes, content);
  // }
  //
  // @Override
  // public ASTNode visitAttribute(ProjectParser.AttributeContext ctx) {
  // int line = ctx.getStart().getLine();
  // String name = ctx.TAG_NAME().getText();
  // String value = null;
  //
  // if (ctx.ATTVALUE_VALUE() != null) {
  // String raw = ctx.ATTVALUE_VALUE().getText().trim();
  // if ((raw.startsWith("\"") && raw.endsWith("\"")) ||
  // (raw.startsWith("'") && raw.endsWith("'"))) {
  // value = raw.substring(1, raw.length() - 1);
  // } else {
  // value = raw;
  // }
  // }
  //
  // return new HtmlAttribute(line, name, value);
  // }
  //
  // @Override
  // public ASTNode visitHtmlText(ProjectParser.HtmlTextContext ctx) {
  // int line = ctx.getStart().getLine();
  // String text = ctx.HTML_TEXT().getText();
  // return new TextStatement(line, text);
  // }
  //
  // @Override
  // public ASTNode visitHtmlSpace(ProjectParser.HtmlSpaceContext ctx) {
  // int line = ctx.getStart().getLine();
  // String text = ctx.SEA_WS().getText();
  // return new TextStatement(line, text);
  // }

  // ============= HTML Elements =============
  // ============= HTML Elements =============
  // =======

  // ============= HTML Elements =============
  // ============= HTML Elements =============
  // ============= HTML Elements =============
  // ============= HTML Elements =============

  @Override
  public ASTNode visitHtmlNormalElement(ProjectParser.HtmlNormalElementContext ctx) {
    return visit(ctx.normalElement());
  }

  @Override
  public ASTNode visitNormalTag(ProjectParser.NormalTagContext ctx) {
    int line = ctx.getStart().getLine();
    String tagName = ctx.TAG_NAME(0).getText();

    List<HtmlAttribute> attributes = new ArrayList<>();
    for (ProjectParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
      HtmlAttribute attr = (HtmlAttribute) visit(attrCtx);
      if (attr != null) {
        attributes.add(attr);
      }
    }

    List<Statement> content = new ArrayList<>();
    if (ctx.htmlContent() != null) {
      ProjectParser.HtmlContentContext contentCtx = ctx.htmlContent();

      for (int i = 0; i < contentCtx.getChildCount(); i++) {
        var child = contentCtx.getChild(i);

        if (child instanceof ProjectParser.HtmlChardataContext) {
          ASTNode node = visit((ProjectParser.HtmlChardataContext) child);
          if (node instanceof Statement stmt) {
            content.add(stmt);
          }
        } else if (child instanceof ProjectParser.HtmlElementContext) {
          ASTNode node = visit((ProjectParser.HtmlElementContext) child);
          if (node instanceof Statement stmt) {
            content.add(stmt);
          }
        } else if (child instanceof ProjectParser.JinjaElementContext) {
          ASTNode node = visit((ProjectParser.JinjaElementContext) child);
          if (node instanceof Statement stmt) {
            content.add(stmt);
          }
        }
      }
    }

    return new NormalHtmlElement(line, tagName, attributes, content);
  }

  @Override
  public ASTNode visitAttribute(ProjectParser.AttributeContext ctx) {
    int line = ctx.getStart().getLine();
    String name = ctx.TAG_NAME().getText();
    String value = null;

    if (ctx.ATTVALUE_VALUE() != null) {
      String raw = ctx.ATTVALUE_VALUE().getText().trim();
      if ((raw.startsWith("\"") && raw.endsWith("\"")) ||
          (raw.startsWith("'") && raw.endsWith("'"))) {
        value = raw.substring(1, raw.length() - 1);
      } else {
        value = raw;
      }
    }

    return new HtmlAttribute(line, name, value);
  }

  @Override
  public ASTNode visitHtmlText(ProjectParser.HtmlTextContext ctx) {
    int line = ctx.getStart().getLine();
    String text = ctx.HTML_TEXT().getText();
    return new TextStatement(line, text);
  }

  @Override
  public ASTNode visitHtmlSpace(ProjectParser.HtmlSpaceContext ctx) {
    int line = ctx.getStart().getLine();
    String text = ctx.SEA_WS().getText();
    return new TextStatement(line, text);
  }

  @Override
  public ASTNode visitHtmlSelfClosingElement(ProjectParser.HtmlSelfClosingElementContext ctx) {
    return visit(ctx.selfClosingElement());
  }

  @Override
  public ASTNode visitSelfCloseTag(ProjectParser.SelfCloseTagContext ctx) {
    int line = ctx.getStart().getLine();
    String tagName = ctx.TAG_NAME().getText();

    List<HtmlAttribute> attributes = new ArrayList<>();
    for (ProjectParser.HtmlAttributeContext attrCtx : ctx.htmlAttribute()) {
      HtmlAttribute attr = (HtmlAttribute) visit(attrCtx);
      if (attr != null) {
        attributes.add(attr);
      }
    }

    return new SelfClosingHtmlElement(line, tagName, attributes);
  }

  @Override
  public ASTNode visitHtmlScriptElement(ProjectParser.HtmlScriptElementContext ctx) {
    return visit(ctx.script());
  }

  @Override
  public ASTNode visitHtmlScript(ProjectParser.HtmlScriptContext ctx) {
    int line = ctx.getStart().getLine();
    String scriptBody = "";

    if (ctx.SCRIPT_BODY() != null) {
      scriptBody = ctx.SCRIPT_BODY().getText();
      // Remove the closing tag
      scriptBody = scriptBody.replace("</script>", "");
    } else if (ctx.SCRIPT_SHORT_BODY() != null) {
      scriptBody = ctx.SCRIPT_SHORT_BODY().getText();
      scriptBody = scriptBody.replace("</>", "");
    }

    return new ScriptElement(line, scriptBody);
  }

  @Override
  public ASTNode visitHtmlStyleElement(ProjectParser.HtmlStyleElementContext ctx) {
    return visit(ctx.style());
  }

  @Override
  public ASTNode visitHtmlStyle(ProjectParser.HtmlStyleContext ctx) {
    int line = ctx.getStart().getLine();
    List<CSSStatement> cssStatements = new ArrayList<>();

    if (ctx.cssStyle() != null) {
      // Visit the cssStyle which is a CssStyleDefContext
      for (int i = 0; i < ctx.cssStyle().getChildCount(); i++) {
        var child = ctx.cssStyle().getChild(i);
        if (child instanceof ProjectParser.CssStatementContext) {
          ASTNode node = visit((ProjectParser.CssStatementContext) child);
          if (node instanceof CSSStatement stmt) {
            cssStatements.add(stmt);
          }
        }
      }
    }

    return new StyleElement(line, cssStatements);
  }

  @Override
  public ASTNode visitCssStyleDef(ProjectParser.CssStyleDefContext ctx) {
    // This is just a pass-through, handled in visitHtmlStyle
    return null;
  }

  // ============= CSS Selectors =============

  @Override
  public ASTNode visitCssRuleStatement(ProjectParser.CssRuleStatementContext ctx) {
    return visit(ctx.cssRule());
  }

  @Override
  public ASTNode visitCssAtRuleStatement(ProjectParser.CssAtRuleStatementContext ctx) {
    return visit(ctx.cssAtRule());
  }

  @Override
  public ASTNode visitCssSelectorDef(ProjectParser.CssSelectorDefContext ctx) {
    return visit(ctx.selectorGroup());
  }

  @Override
  public ASTNode visitCssSelectorGroup(ProjectParser.CssSelectorGroupContext ctx) {
    int line = ctx.getStart().getLine();
    List<CSSSelectorSequence> sequences = new ArrayList<>();

    for (ProjectParser.SelectorContext selectorCtx : ctx.selector()) {
      CSSSelectorSequence seq = (CSSSelectorSequence) visit(selectorCtx);
      if (seq != null) {
        sequences.add(seq);
      }
    }

    return new CSSSelector(line, sequences);
  }

  @Override
  public ASTNode visitCssSelectorDescendant(ProjectParser.CssSelectorDescendantContext ctx) {
    int line = ctx.getStart().getLine();
    List<CSSCompoundSelector> compounds = new ArrayList<>();

    for (ProjectParser.CompoundSelectorContext compoundCtx : ctx.compoundSelector()) {
      CSSCompoundSelector compound = (CSSCompoundSelector) visit(compoundCtx);
      if (compound != null) {
        compounds.add(compound);
      }
    }

    return new CSSSelectorSequence(line, compounds);
  }

  @Override
  public ASTNode visitCssCompoundSelector(ProjectParser.CssCompoundSelectorContext ctx) {
    int line = ctx.getStart().getLine();
    List<CSSSimpleSelector> simpleSelectors = new ArrayList<>();

    for (ProjectParser.SimpleSelectorContext simpleCtx : ctx.simpleSelector()) {
      CSSSimpleSelector simple = (CSSSimpleSelector) visit(simpleCtx);
      if (simple != null) {
        simpleSelectors.add(simple);
      }
    }

    return new CSSCompoundSelector(line, simpleSelectors);
  }

  @Override
  public ASTNode visitCssUniversalSelector(ProjectParser.CssUniversalSelectorContext ctx) {
    int line = ctx.getStart().getLine();
    return new CSSUniversalSelector(line);
  }

  @Override
  public ASTNode visitCssTypeSelector(ProjectParser.CssTypeSelectorContext ctx) {
    int line = ctx.getStart().getLine();
    // The typeSelector() returns a TypeSelectorContext which has a CssType
    // alternative
    String elementName = ctx.typeSelector().getText(); // Just get the text directly
    CSSPseudoSelector pseudo = null;

    if (ctx.pseudoSelector() != null) {
      pseudo = (CSSPseudoSelector) visit(ctx.pseudoSelector());
    }

    return new CSSTypeSelector(line, elementName, pseudo);
  }

  @Override
  public ASTNode visitCssClassSelector(ProjectParser.CssClassSelectorContext ctx) {
    int line = ctx.getStart().getLine();
    // The classSelector returns text like ".className", we need just "className"
    String fullText = ctx.classSelector().getText(); // Gets ".className"
    String className = fullText.substring(1); // Remove the leading "."
    CSSPseudoSelector pseudo = null;

    if (ctx.pseudoSelector() != null) {
      pseudo = (CSSPseudoSelector) visit(ctx.pseudoSelector());
    }

    return new CSSClassSelector(line, className, pseudo);
  }

  @Override
  public ASTNode visitCssIdSelector(ProjectParser.CssIdSelectorContext ctx) {
    int line = ctx.getStart().getLine();
    // The idSelector returns text like "#idName", we need just "idName"
    String fullText = ctx.idSelector().getText(); // Gets "#idName"
    String idName = fullText.substring(1); // Remove the leading "#"
    CSSPseudoSelector pseudo = null;

    if (ctx.pseudoSelector() != null) {
      pseudo = (CSSPseudoSelector) visit(ctx.pseudoSelector());
    }

    return new CSSIdSelector(line, idName, pseudo);
  }

  @Override
  public ASTNode visitCssPseudoSelector(ProjectParser.CssPseudoSelectorContext ctx) {
    return visit(ctx.pseudoSelector());
  }

  @Override
  public ASTNode visitCssPseudo(ProjectParser.CssPseudoContext ctx) {
    int line = ctx.getStart().getLine();
    String pseudoName = ctx.IDENTIFIER_CSS().getText();
    return new CSSPseudoSelector(line, pseudoName);
  }

  // ============= CSS Rules & Declarations =============

  @Override
  public ASTNode visitCssRuleDef(ProjectParser.CssRuleDefContext ctx) {
    int line = ctx.getStart().getLine();
    CSSSelector selector = (CSSSelector) visit(ctx.cssSelector());
    List<CSSDeclaration> declarations = new ArrayList<>();

    for (ProjectParser.CssDeclarationContext declCtx : ctx.cssDeclaration()) {
      ASTNode node = visit(declCtx);
      if (node instanceof CSSDeclaration decl) {
        declarations.add(decl);
      } else if (node instanceof CSSCustomProperty customProp) {
        // Convert CSSCustomProperty to CSSDeclaration
        // Custom properties should be treated as regular declarations
        CSSDeclaration decl = new CSSDeclaration(
            customProp.line,
            customProp.propertyName,
            customProp.value);
        declarations.add(decl);
      }
    }

    return new CSSRule(line, selector, declarations);
  }

  @Override
  public ASTNode visitDeclaration(ProjectParser.DeclarationContext ctx) {
    int line = ctx.getStart().getLine();
    String property = ctx.IDENTIFIER_CSS().getText();
    CSSValue value = (CSSValue) visit(ctx.cssValue());

    return new CSSDeclaration(line, property, value);
  }

  @Override
  public ASTNode visitCssCustomProperty(ProjectParser.CssCustomPropertyContext ctx) {
    int line = ctx.getStart().getLine();
    String propertyName = ctx.CSS_CUSTOM_PROP().getText();
    CSSValue value = (CSSValue) visit(ctx.cssValue());

    return new CSSCustomProperty(line, propertyName, value);
  }

  // ============= CSS At-Rules (Media Queries) =============

  @Override
  public ASTNode visitCssMediaRule(ProjectParser.CssMediaRuleContext ctx) {
    return visit(ctx.cssMedia());
  }

  @Override
  public ASTNode visitMedia(ProjectParser.MediaContext ctx) {
    int line = ctx.getStart().getLine();
    CSSMediaQuery mediaQuery = (CSSMediaQuery) visit(ctx.cssMediaQuery());
    List<CSSRule> rules = new ArrayList<>();

    for (ProjectParser.CssRuleContext ruleCtx : ctx.cssRule()) {
      CSSRule rule = (CSSRule) visit(ruleCtx);
      if (rule != null) {
        rules.add(rule);
      }
    }

    return new CSSMediaRule(line, mediaQuery, rules);
  }

  @Override
  public ASTNode visitMediaQuery(ProjectParser.MediaQueryContext ctx) {
    int line = ctx.getStart().getLine();
    CSSMediaExpression expression = (CSSMediaExpression) visit(ctx.cssMediaExpr());
    return new CSSMediaQuery(line, expression);
  }

  @Override
  public ASTNode visitMediaExpr(ProjectParser.MediaExprContext ctx) {
    int line = ctx.getStart().getLine();
    String feature = ctx.IDENTIFIER_CSS().getText();
    CSSValue value = (CSSValue) visit(ctx.cssValue());

    return new CSSMediaExpression(line, feature, value);
  }

  // ============= CSS Calc =============

  @Override
  public ASTNode visitCssCalc(ProjectParser.CssCalcContext ctx) {
    int line = ctx.getStart().getLine();
    String expression = ctx.CSS_CALC().getText();
    // Remove "calc(" and ")"
    expression = expression.substring(5, expression.length() - 1);
    return new CSSCalc(line, expression);
  }

  // ============= Jinja Filter Expression =============

  @Override
  public ASTNode visitJinjaFilterExpr(ProjectParser.JinjaFilterExprContext ctx) {
    int line = ctx.getStart().getLine();
    JinjaExpression expression = (JinjaExpression) visit(ctx.jinjaExpression());
    String filterName = ctx.IDENTIFIER_JINJA().getText();

    return new JinjaFilterExpression(line, expression, filterName);
  }
}
