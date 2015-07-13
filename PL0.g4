grammar PL0;

program
  : block DOT
  ;

block
  : consts? vars? procedure* statement
  ;

consts
  : CONST Ident CASSIGN Number (COMMA Ident CASSIGN Number)* SEMIC
  ;

vars
  : VAR Ident (COMMA Ident)* SEMIC
  ;

procedure
  : PROCEDURE Ident SEMIC block SEMIC
  ;

statement
  : Ident ASSIGN expression                 # assignStat
  | CALL Ident                              # callStat
  | BANG Ident                              # bangStat
  | BEGIN statement (SEMIC statement)* END  # beginStat
  | IF condition THEN statement             # ifStat
  | WHILE condition DO statement            # whileStat
  ;

condition
  : ODD expression
  | expression op=(EQ|LT|LTE|GT|GTE) expression
  ;

expression
  : opt_sign=(PLUS|MINUS)? term (opt_term)*
  ;
  
opt_term
  : op=(PLUS|MINUS) term
  ;

term
  : factor (opt_factor)*
  ;
  
opt_factor
  : op=(MULT|DIV) factor
  ;

factor
  : Ident                 # identFactor
  | Number                # numberFactor
  | OPAR expression CPAR  # parExpr
  ;
  
ODD : 'odd' ;
CALL: 'call' ;
BANG : '!' ;
OR : '||' ;
AND : '&&' ;
EQ : '==' ;
NEQ : '!=' ;
GT : '>' ;
LT : '<' ;
GTE : '>=' ;
LTE : '<=' ;
PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;

CASSIGN : '=' ;
ASSIGN : ':=' ;
OPAR : '(' ;
CPAR : ')' ;
COMMA : ',' ;
SEMIC : ';' ;
DOT : '.' ;

TRUE : 'true' ;
FALSE : 'false' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
DO: 'do' ;
THEN : 'then' ;
BEGIN : 'begin' ;
END : 'end' ;
PROCEDURE : 'procedure' ;
VAR : 'var' ;
CONST : 'const' ;

Ident  : ALPHA (ALPHA | DIGIT)* ;
Number : DIGIT+ ;

ALPHA : 'a'..'z' | 'A'..'Z' ;
DIGIT : '0'..'9' ;

WS      : [ \r\t\n]+  -> skip ;   // skip spaces, tabs, newlines
Comment : '{' .*? '}' -> skip ;   // skip comments
