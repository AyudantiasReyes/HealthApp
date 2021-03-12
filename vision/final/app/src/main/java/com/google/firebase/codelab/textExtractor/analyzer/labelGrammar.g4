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
           | caloriasStatemnt
           | caloriasDeGrasa_statemnt
           | valoresDiarios_statement
           ;

tamanoPorcion_statement : TAMANO DELA? PORCION? NUMERO? OZ? NUMERO G?
                        ;
porcionesEmpaque_statement : PORCION POR EMPAQUE NUMERO
                           ;

caloriasDeGrasa_statemnt : CALORIAS DE GRASA NUMERO
                         ;

valoresDiarios_statement : VALORES DIARIOS
                         ;

caloriasStatemnt : CALORIAS NUMERO
                 ;

grasaTotal_statement : GRASA TOTAL NUMERO G?
                     ;

carbs_statement : CARBOHIDRATOS TOTALES? NUMERO G?
                ;

azucar_statement : AZUCARES NUMERO G?
                 ;

sodio_statement : SODIO NUMERO G?
                ;

proteina_statement : PROTEINAS NUMERO G?
                ;

TAMANO : [T|t][a]([a-z] | [ñ])*;
DELA : 'dela' ;
PORCION : [P|p]'orci'[o|ó]'n'('es')? ;
OZ : ('oz' | 'az') ;
POR : [P|p]'or' ;
EMPAQUE : [E|e]'mp'[a-z]* ;
CALORIAS : [C|c]('al' | 'AL') ;
DE : 'DE' ;
VALORES : [V|v]'i'?'al'[a-z]* ;
DIARIOS : [D|d]'i'([a-z])* ;
NUMERO :  [0-9]+ ;
GRASA : [G|g]'r'[a-z]*|[G|g]'R'[A-Z]*;
TOTALES : [T|t]'otales' ;
TOTAL : [T|t]'otal' ;
PROTEINAS : [P|p]'rote'[i|í]'nas' ;
CARBOHIDRATOS : [C|c]'arbohidratos';
AZUCARES : [A|a]'z'[u|ú]'cares' | [A|a][z][a-z|ú]*;
G : ([m]?)'g' ;
SODIO : [S|s]'odio' ;

WS : (' ' | '\r' | '\n' | '\t' | ':' | ';' | '%' | '-') -> skip;
ANY : .+? -> skip;



//terminales


