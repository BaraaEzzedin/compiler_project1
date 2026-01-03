parser grammar PythonParser;

options { tokenVocab = PythonLexer; }

// -------------------------------------------------
// PROGRAM
// -------------------------------------------------
prog
    : stat* EOF
    ;

// -------------------------------------------------
// STATEMENTS
// -------------------------------------------------
stat
    : assignStat
    | printStat
    | ifStat
    | forStat
    | whileStat
    | funcDef
    | classDef
    | returnStat
    | breakStat
    | continueStat
    | importStat
    | exprStat
    | arrayAssignStat
    | NEWLINE
    ;

printStat
    : PRINT LPARENS expr RPARENS NEWLINE?              # PrintStatement
    ;

assignStat
    : VAR? ID ASSIGN expr NEWLINE?                     # Assignment
    ;

exprStat
    : expr NEWLINE?
    ;

returnStat
    : RETURN expr (COMMA NUMBER)? NEWLINE?                             # ReturnStatement
    ;

breakStat
    : BREAK NEWLINE?                                   # BreakStatement
    ;

continueStat
    : CONTINUE NEWLINE?                                # ContinueStatement
    ;

arrayAssignStat
    : expr LSB expr RSB ASSIGN expr NEWLINE?    # ArrayAssignment
    ;
// -------------------------------------------------
// IMPORTS
// -------------------------------------------------
importStat
        :IMPORT dottedName (COMMA dottedName)* NEWLINE #ImportModule
        | FROM dottedName IMPORT ID (COMMA ID)* NEWLINE #ImportFrom
;

dottedName : ID (DOT ID)* ;


// -------------------------------------------------
// FUNCTIONS
// -------------------------------------------------
funcDef
    : decorator* DEF ID LPARENS paramList? RPARENS COLON? NEWLINE block # FunctionDefinition
    ;

paramList
    : ID (COMMA ID)*               # ParameterList
    ;

classDef
    : CLASS ID (LPARENS ID RPARENS)? COLON NEWLINE block
      # ClassDefinition
    ;
decorator
    : AT dottedName LPARENS argList? RPARENS NEWLINE       # DecoratorWithArgs
    | AT dottedName NEWLINE                                # DecoratorNoArgs
    ;

// -------------------------------------------------
// CONTROL FLOW
// -------------------------------------------------
ifStat
    : IF expr COLON NEWLINE block (NEWLINE* ELSE COLON? NEWLINE block)?
    ;

forStat
    : FOR expr IN expr COLON NEWLINE block                # ForStatement
    ;

whileStat
    : WHILE expr NEWLINE block                             # WhileStatement
    ;

block
    : INDENT stat+ DEDENT
    ;

// -------------------------------------------------
// EXPRESSIONS
// -------------------------------------------------
expr
    : expr op=(OR|AND) expr                      # LogicalExpr
    | expr op=(MUL|DIV) expr                     # MultDivExpr
    | expr op=(ADD|SUB) expr                     # AddSubExpr
    | expr op=(LT|GT|GE|LE|EQ|NE) expr           # ComparisonExpr
    | expr ASSIGN expr                           # KeyValue
    | expr LSB expr RSB                          # IndexExpr
    | LPARENS ID FOR ID IN expr (IF expr)? RPARENS # GeneratorExpression
    | ID LPARENS argList? RPARENS                # FunctionCallExpr
    | expr DOT expr                              # AttributeExpr
    | LSB argList? RSB                           # ArrayLiteral
    | LPARENS expr RPARENS                       # ParenExpr
    | LBK dictBody? RBK                          # DictLiteral
    | NUMBER                                     # NumberLiteral
    | STRING                                     # StringLiteral
    | BOOL                                       # BooleanLiteral
    | ID                                         # IdentifierExpr
;

dictBody: NEWLINE* pair (NEWLINE* ',' NEWLINE* pair)* NEWLINE*;

pair: STRING COLON expr;


argList : (arg (COMMA arg)*)?;
arg : NEWLINE* expr NEWLINE* | ID ASSIGN expr ;
