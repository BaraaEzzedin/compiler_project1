lexer grammar PythonLexer;

// lexer
BOOL: 'true'|'false';
PRINT: 'print';
DEF: 'def';
RETURN: 'return';
IMPORT: 'import';
FROM: 'from';
AND: 'and';
OR: 'or';
BREAK: 'break';
CONTINUE: 'continue';
CLASS: 'class';
AS: 'as';
AT: '@';
ASSIGN: '=';
COMMA:',';
DOT: '.';
COLON: ':';
LPARENS: '(';
RPARENS: ')';
LSB: '[';
RSB: ']';
LBK: '{';
RBK: '}';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
WHILE: 'while';
VAR: 'var';


ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER
    : DIGIT+ ('.' DIGIT+)? ([eE] [+\-]? DIGIT+)?
    ;

fragment DIGIT : [0-9];
STRING
    : '"'  ( ~["\\]  | '\\' . )* '"'
    | '\'' ( ~['\\]  | '\\' . )* '\''
    ;
NEWLINE: ('\r'? '\n')+ ;

//NEWLINE: ('\r'? '\n' (' ' | '\t')*);
WS: [ \t]+ -> skip;
//COMMENT: '#' ~[\r\n]* -> skip;
//NEWLINE: ( '\r\n' | '\r' | '\n' );
//NEWLINE
//    : ('\r'? '\n') [ \t]* ;

//WS: [ \t]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
INDENT: '<INDENT>';
DEDENT: '<DEDENT>';
