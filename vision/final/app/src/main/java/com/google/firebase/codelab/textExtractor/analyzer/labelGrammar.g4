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

tamanoPorcion_statement : TAMANODEPORCION NUMERO? OZ? NUMERO G?
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

sodio_statement : SODIO NUMERO G?
                ;

proteina_statement : PROTEINAS NUMERO G?
                ;
NUMERO :  [0-9]+;
ACCENT : [á|é] | [í|ó] | 'ú' | [Á|É] | [Í|Ó] | 'Ú' ;
NOACCENT : [a|e] | [i|o] | 'u' | [A|E] | [I|O] | 'U' ;
VOWEL :  ACCENT | NOACCENT ;

TAMANODEPORCION : [T|t]VOWEL'm'VOWEL[n|ñ]VOWEL'd'VOWEL'l'VOWEL[P|p]VOWEL'rc'VOWEL VOWEL 'n' ;
OZ : [oz] ;

EMPAQUE : [E|e]'mp' VOWEL 'q' VOWEL VOWEL ;

CALORIAS : [C|c] VOWEL [L|l] VOWEL [R|r] VOWEL VOWEL [S|s] ;


GRASA : [G|g] 'r' VOWEL 's' VOWEL 's'? ;
TOTAL : [T|t] VOWEL 't' VOWEL 'l' VOWEL?'s'? ;


CARBOHIDRATOS : [C|c] VOWEL 'rb' VOWEL 'h' VOWEL 'dr' VOWEL 't' VOWEL 's' ;


AZUCARES : [A|a][z|n] VOWEL 'c' VOWEL 'r' VOWEL 's' ;


SODIO : [S|s] VOWEL 'd' VOWEL VOWEL;


PROTEINAS : [P|p]'r' VOWEL 't' VOWEL VOWEL 'n' VOWEL ;

G : ([m]?)'g' ;
WS : (' ' | '\r' | '\n' | '\t' | ':' | ';' | '%' | '-') -> skip;
ANY : .+? -> skip;



//terminales


