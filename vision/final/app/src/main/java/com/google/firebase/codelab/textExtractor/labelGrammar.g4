//No terminales
grammar labelGrammar;

init : statements* ;

statements : grasaTotal_statement
           | carbs_statement
           | azucar_statement
           | sodio_statement
           | proteina_statement
           ;


grasaTotal_statement : GRASA TOTAL NUMERO G?
                     ;

carbs_statement : CARBOHIDRATOS NUMERO G?
                ;

azucar_statement : AZUCARES NUMERO G?
                 ;

sodio_statement : SODIO NUMERO G?
                ;

proteina_statement : PROTEINAS NUMERO G?
                ;


NUMERO :  [0-9]+ ;
GRASA : [G|g]'rasa';
TOTAL : [T|t]'otal' ;
PROTEINAS : [P|p]'roteinas' ;
CARBOHIDRATOS : [C|c]'arbohidratos' ;
AZUCARES : [A|a]'zucares' ;
G : ([m]?)'g' ;
SODIO : [S|s]'odio' ;

WS : (' ' | '\r' | '\n' | '\t' | ':' | ';') -> skip;
ANY : .+?;



//terminales


