lexer grammar ProjectLexer;

HTML_COMMENT: '<!--' .*? '-->';
HTML_WS: (' ' | '\t' | '\r'? '\n')+ ->skip;
SCRIPT_OPEN: '<script' .*? '>' -> pushMode(SCRIPT);
STYLE_OPEN: '<style' .*? '>' -> pushMode(CSS);
TAG_OPEN: '<' -> pushMode(TAG);
//jinja
JINJA_VAR_OPEN:'{{' -> pushMode(JINJA) ;
JINJA_BLOCK_OPEN: '{%' -> pushMode(JINJA) ;
HTML_TEXT: ~[<{]+;
COMMENT_JINJA: '{#' .*? '#}' -> skip;

// tag declarations
mode TAG;
TAG_CLOSE: '>' -> popMode;
TAG_SLASH: '/';
// lexing mode for attribute values
TAG_EQUALS: '=' -> pushMode(ATTVALUE);
TAG_NAME: TAG_NameStartChar TAG_NameChar*;
TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);
fragment DIGIT: [0-9];
fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
;
fragment TAG_NameStartChar: [a-zA-Z];

mode SCRIPT;
SCRIPT_BODY: .*? '</script>' -> popMode;
SCRIPT_SHORT_BODY: .*? '</>' -> popMode;
// <styles>
//mode STYLE;
//STYLE_BODY: .*? '</style>' -> popMode;
//STYLE_SHORT_BODY: .*? '</>' -> popMode;
// attribute values
mode ATTVALUE;
// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE: ' '* ATTRIBUTE -> popMode;
ATTRIBUTE: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING | ATTCHARS | HEXCHARS | DECCHARS;
fragment ATTCHARS: ATTCHAR+ ' '?;
fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];
fragment HEXCHARS: '#' [0-9a-fA-F]+;
fragment DECCHARS: [0-9]+ '%'?;
fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';
fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\'';

mode JINJA;
fragment JINJA_DIGIT: [0-9];
JINJA_VAR_CLOSE:'}}' -> popMode;
JINJA_BLOCK_CLOSE: '%}' -> popMode;
NUMBER_JINJA: DIGIT+ ('.' DIGIT+)?;
JINJA_COMMENT: '{#' .*? '#}' -> skip;
PLUS_JINJA: '+';
MINUS_JINJA: '-';
MULTI_JINJA: '*';
SLASH_JINJA: '/';
PERCENT_JINJA: '%';
DOT_JINJA: '.';
EQUALS_EQUALS_JINJA: '==';
EQUALS_JINJA: '=';
NOT_EQUALS_JINJA: '!=';
AND_JINJA: '&&';
OR_JINJA: '||';
JINJA_IN: 'in' ;
JINJA_FOR: 'for';
JINJA_END_FOR: 'endfor';
JINJA_IF: 'if';
JINJA_ELSE: 'else';
JINJA_ELIF: 'elif';
JINJA_END_IF: 'endif';
IDENTIFIER_JINJA: [a-zA-Z_] [a-zA-Z0-9_]*;
PIPE: '|';
LPAREN: '(';
RPAREN: ')';
STRING_JINJA: '"' .*? '"' | '\'' .*? '\'';
JINJA_WS: [ \t\r\n]+ -> skip;

mode CSS;
fragment LENGTH_UNIT : 'px' | 'em' | 'rem' | 'vh' | 'vw' | 'vmin' | 'vmax'| 'fr';
fragment HEX : [0-9a-fA-F];
fragment DIGIT_CSS: [0-9];
NUMBER_CSS: [+-]? DIGIT_CSS+ ('.' DIGIT_CSS+)?;
LBRACE : '{';
RBRACE : '}';
CSS_LPAREN: '(';
CSS_RPAREN: ')';
DASH   : '-';
COLON  : ':';
SEMI   : ';';
COMMA  : ',';
DOT    : '.';
STAR   : '*';
HASH   : '#';
TILDE  : '~';
STYLE_CLOSE: '</style>' -> popMode;
UNIT : LENGTH_UNIT | '%';
COLOR: HASH HEX HEX HEX (HEX HEX HEX)?;
COLOR_RGB     : 'rgb(' NUMBER_CSS+ ',' NUMBER_CSS+ ',' NUMBER_CSS+ ')';
COLOR_RGBA    : 'rgba(' NUMBER_CSS+ ',' NUMBER_CSS+ ',' NUMBER_CSS+ ',' NUMBER_CSS+ ')';
COLOR_HSL     : 'hsl(' DIGIT_CSS+ ',' DIGIT_CSS+ '%,' DIGIT_CSS+ '%)';
COLOR_HSLA    : 'hsla(' DIGIT_CSS+ ',' DIGIT_CSS+ '%,' DIGIT_CSS+ '%,' DIGIT_CSS+ ('.' DIGIT_CSS+)? ')';
CSS_IMPORT     : '@import';
CSS_MEDIA      : '@media';
CSS_FONT_FACE  : '@font-face';
CSS_KEYFRAMES  : '@keyframes';
IMPORTANT       : '!important';
CSS_KEYWORD     : 'inherit' | 'initial' | 'unset' | 'revert';
CSS_CUSTOM_PROP: '--' IDENTIFIER_CSS ('-' IDENTIFIER_CSS)*;
CSS_URL : 'url(' .*? ')';
CSS_CALC : 'calc(' .*? ')';
CSS_VAR : 'var(' '--' IDENTIFIER_CSS ')';
CSS_WS: [ \t\r\n]+ -> skip;
CSS_COMMENT: '/*' .*? '*/' -> skip;
IDENTIFIER_CSS : [a-zA-Z_-][a-zA-Z0-9_-]*;
STRING_CSS: '"' .*? '"' | '\'' .*? '\'';

