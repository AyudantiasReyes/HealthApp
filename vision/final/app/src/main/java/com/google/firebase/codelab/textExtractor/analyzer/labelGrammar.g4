//No terminales
grammar labelGrammar;

init : statements* ;

statements : grasaTotal_statement
           | carbs_statement
           | azucar_statement
           | sodio_statement
           | proteina_statement
           | tamanoPorcion_statement
           | porcionesEmpaque_statement
           | caloriasStatement
           ;

tamanoPorcion_statement : TAMANO NUMERO? OZ? NUMERO G?
                        ;

porcionesEmpaque_statement : EMPAQUE NUMERO
                           ;

caloriasStatement : CALORIAS NUMERO
                  ;

grasaTotal_statement : GRASA TOTAL NUMERO G?
                     ;

carbs_statement : CARBOHIDRATOS TOTAL? NUMERO G?
                ;

azucar_statement : AZUCARES NUMERO G?
                 ;

sodio_statement : SODIO NUMERO? G?
                ;

proteina_statement : PROTEINAS NUMERO G?
                ;

TAMANO : [T|t][a-z]?'am'[a-zA-Z|ó]*;
OZ : ('oz'|'az');
EMPAQUE : [E|e][m|n][a-zA-Z]* ;
CALORIAS : [C|c]('alo'|'ALO')[a-zA-Z|Í]* ;
VALORES : [V|v][a-z]*;
DIARIOS : [D|d]'i'([a-z])* ;
NUMERO :  [0-9]+;
TOTAL : [T|t]'ot'[a-zA-Z]*;
GRASA : [G|g]'ra'[a-z][a-z];
PROTEINAS : [P|p]'ro'[a-zA-Z|í]*;
CARBOHIDRATOS : [C|c]'arb'[a-z]*;
AZUCARES : ([A|a]'z'[u|ú]'cares')|([A|a][z][a-z|ú]*);
G : ([m]?)'g' ;
SODIO : [S|s]'od'[a-zA-Z]*;
WS : (' ' | '\r' | '\n' | '\t' | ':' | ';' | '%' | '-') -> skip;
ANY : .+? -> skip;



//terminales


