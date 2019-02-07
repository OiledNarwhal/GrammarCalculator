grammar Calculator;

@header 
{
    import java.util.*;
    import java.lang.*;
}

@members
{
    HashMap<String, Double> varMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);
}

exprList: topExpr ( ';' topExpr)* ';'? ; 

varDef: VAR ID '=' expr;

topExpr: expr
    { System.out.println("result: " + Double.toString($expr.i));}
;

expr returns [Double i]: 

    //Regular Math
    el=expr op='*' er=expr { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr { $i=$el.i-$er.i; }
    | el=expr op='%' er=expr { $i=$el.i%$er.i; }
    | el=expr op='^' er=expr { $i=Math.pow($el.i, $er.i); }
    | op= '++' ID { varMap.put($ID.text, varMap.getOrDefault($ID.text, 0.0) + 1.0); $i = varMap.getOrDefault($ID.text, 0.0); }
    | op= '--' ID { varMap.put($ID.text, varMap.getOrDefault($ID.text, 0.0) - 1.0); $i = varMap.getOrDefault($ID.text, 0.0); }
    | ID op= '++' { varMap.put($ID.text, varMap.getOrDefault($ID.text, 0.0) + 1.0); $i = varMap.getOrDefault($ID.text, 0.0); }
    | ID op= '--' { varMap.put($ID.text, varMap.getOrDefault($ID.text, 0.0) - 1.0); $i = varMap.getOrDefault($ID.text, 0.0); }


    //Boolean Operations
    | el=expr op='&&' er=expr { if($el.i != 0.0 && $er.i != 0.0 ) {$i = 1.0;} else {$i = 0.0;} }
    | el=expr op='||' er=expr { if($el.i != 0.0 || $er.i != 0.0 ) {$i = 1.0;} else {$i = 0.0;} }
    | op='!' e=expr { if($e.i != 0.0 ) {$i = 0.0;} else {$i = 1.0;} }

    //Square Root and Read
    | op='sqrt(' e=expr ')' { $i = (Math.sqrt($e.i)); }

    //Math Library Functions
    | op= 's(' e=expr ')' { $i = (Math.sin($e.i)); }
    | op= 'c(' e=expr ')' { $i = (Math.cos($e.i)); }
    | op= 'l(' e=expr ')' { $i = (Math.log($e.i)); }
    | op= 'e(' e=expr ')' { $i = (Math.exp($e.i)); }

    //Statements Dunno How to Work it.
    | op= 'print(' e=expr ')' { $i = 1.0; System.out.println($e.i); }
    | op= 'read()' { $i = scan.nextDouble(); }

    //Variable Recognition
    | ID '=' e=expr { $i = 1.0; varMap.put($ID.text, $e.i); }

    //Others
    | DBL { $i = Double.parseDouble($DBL.text); }
    | ID  { $i = varMap.getOrDefault($ID.text, 0.0);}
    | COMMENT  { $i = 0.0; }          
    | '(' e=expr ')'    
    ;

VAR: 'var';  // keyword
ID: [_A-Za-z]+;
DBL: '-'?[0-9]+'.'?[0-9]*;
COMMENT: '/*'~[\r\n]*'*/';
WS : [ \t\r\n]+ -> skip ;