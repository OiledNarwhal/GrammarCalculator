grammar Calculator;

@header 
{
    import java.util.*;
}

@members
{
    Map<String, Integer> varMap;
}

exprList: topExpr ( ';' topExpr)* ';'? ; 

varDef: VAR ID '=' expr;

topExpr: expr
    { System.out.println("result: " + Integer.toString($expr.i));}
;

expr returns [int i]: 

    //Regular Math
    el=expr op='*' er=expr { $i=$el.i*$er.i; System.out.println($i);}
    | el=expr op='/' er=expr { $i=$el.i/$er.i; System.out.println($i);}
    | el=expr op='+' er=expr { $i=$el.i+$er.i; System.out.println($i);}
    | el=expr op='-' er=expr { $i=$el.i-$er.i; System.out.println($i);}

    //Boolean Operations
    | el=expr op='&&' er=expr { if($el.i != 0 && $er.i !=0 ) {$i = 1;} else {$i = 0;} System.out.println($i);}
    | el=expr op='||' er=expr { if($el.i != 0 || $er.i !=0 ) {$i = 1;} else {$i = 0;} System.out.println($i);}
    | op='!' e=expr { if($e.i != 0 ) {$i = 0;} else {$i = 1;} System.out.println($i);}

    //Square Root and Read
    | op='sqrt(' e=expr ')' { $i = (int)(Math.sqrt($e.i)); System.out.println($i);}

    //Math Library Functions
    | op= 's(' e=expr ')' { $i = (int)(Math.sin($e.i)); System.out.println($i);}
    | op= 'c(' e=expr ')' { $i = (int)(Math.cos($e.i)); System.out.println($i);}
    | op= 'l(' e=expr ')' { $i = (int)(Math.log($e.i)); System.out.println($i);}
    | op= 'e(' e=expr ')' { $i = (int)(Math.exp($e.i)); System.out.println($i);}

    //Statements Dunno How to Work it.
    | op= 'print(' e=expr ')' { $i = 1; System.out.println($e.i);}

    //Variable Recognition
    | VAR
    | varDef {varMap.put($VAR.text, Integer.parseInt($INT.text)); System.out.println(varMap.get($VAR.text));}

    //Others
    | INT { $i=Integer.parseInt($INT.text); }
    //| DBL { $i=Double.parseDouble($DBL.text); }
    | ID    
    | COMMENT            
    | '(' e=expr ')'    
    ;

VAR: 'var';  // keyword
ID: [_A-Za-z]+;
INT: '-'?[0-9]+ ;
DBL: [0-9]*'.'[0-9]*;
COMMENT: '/*'~[\r\n]*'*/';
WS : [ \t\r\n]+ -> skip ;