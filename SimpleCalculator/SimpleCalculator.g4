grammar SimpleCalculator;

@header {
    //package grammers;
}

@members {
  int result = 0;
}

prog
    @after {System.out.println(count+" ints");}
    :	(expr NEWLINE)* ;

expr:	e1=expr ('*'|'/') e2=expr {}
    |	e1=expr ('+'|'-') e2=expr {}
    |	INT { System.out.println("atomic = "+$INT.text);}
    |	'(' expr ')' {}
    ;

NEWLINE
    : [\r\n]+ ;

INT
    : [0-9]+ ;

fragment WS
    : [ \t\n\r]+ -> skip;