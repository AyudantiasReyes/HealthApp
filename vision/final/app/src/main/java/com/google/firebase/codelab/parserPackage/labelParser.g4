//No terminales
grammar labelParser;

init : statements
     ;

statements : statement*
           ;


statement : grasaTotal_statement
          | carbohidratos_statement
          | proteinas_statement
          | azucares_statement
          | sodio_statement
          ;

grasaTotal_statement : GRASA TOTAL NUMERO G
                     ;

carbohidratos_statement : CARBOHIDRATOS NUMERO G
                        ;

proteinas_statement : PROTEINAS NUMERO G
                    ;

azucares_statement : AZUCARES NUMERO G
                   ;

sodio_statement : SODIO NUMERO G
                ;

NUMERO : [0-9]+ ;
CALORIAS : [C|c]'aloria'([s])? ;
GRASA : [G|g]'rasa' ;
TOTAL : [T|t]'otal' ;
PROTEINAS : [P|p]'roteina'([s])? ;
CARBOHIDRATOS : [C|c]'arbohidrato'([s])?;
AZUCARES : [A|a]'zucare'([s])? ;
G : ([m]?)'g' ;
SODIO : [S|s]'odio' ;
SEMICOLON : ';' -> skip;

//terminales


