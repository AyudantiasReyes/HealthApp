package com.google.firebase.codelab.textExtractor.analyzer;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabelCleaner {
    private static final String FILTRO_TAM_PORCION = "[T|t][a-z]?am[a-zA-Z|ó|ñ]*([0-9]+)?(oz|az|o)?([0-9]+)g?" ;

    private static final String FILTRO_PORCIONES = "[E|e][m|n][a-zA-Z]*[0-9]+" ;

    private static final String FILTRO_CALORIAS = "[C|c]([alo]|[ALO])[a-zA-Z|Í]*[0-9]+|" +
            "[C|c]([elo]|[ELO])[a-zA-Z|Í]*[0-9]+" ;

    private static final String FILTRO_GRASAS = "[g|G]r[a|e|i|o|u]s[a|e|i|o|u][t|T|]ot[a|e|i|o|u]l[0-9][0-9]?g?|" +
            "[g|G]r[a|e|i|o|u]s[a|e|i|o|u][t|T|]ot[a|e|i|o|u]l[O|D]?g?|" +
            "[g|G]r[a|e|i|o|u]s[a|e|i|o|u][t|T|]ot[a|e|i|o|u][0-9][0-9]?g?" ;

    private static final String FILTRO_CARBS = "[C|c]arbohidratos[0-9][0-9]?g?|" +
            "[C|c]arbohidratostotales[0-9][0-9]?g?|" +
            "[C|c][a|e|o|i|u]rb[a-z]*[0-9][0-9]?g?|" +
            "[C|c][a|e|o|i|u]rb[a-z]*[O|D][0-9]?g?" ;

    private static final String FILTRO_AZUCAR = "[A|a][z][a-z|ú]*[0-9][0-9]?g?|" +
            "Az[u|ú]cares[0-9][0-9]?g?|" +
            "[A|a][z][a-z|ú]*[O|D][0-9]?g?|" +
            "Az[u|ú]cares[O|D][0-9]?g?" ;

    private static final String FILTRO_SODIO = "[S|s]odio([0-9]+|O)m?g?" ;

    private static final String FILTRO_PROTEINA = "[P|p]rote[i|í]na[s]?[0-9][0-9]?g?" ;

    private static final String[] FILTERS = {
            FILTRO_TAM_PORCION,
            FILTRO_PORCIONES,
            FILTRO_CALORIAS,
            FILTRO_GRASAS,
            FILTRO_CARBS,
            FILTRO_AZUCAR,
            FILTRO_SODIO,
            FILTRO_PROTEINA
    };


    public static String cleanLabelText(String labelText){
        StringBuilder filteredString = new StringBuilder();

        for(String expression : FILTERS){
            Pattern pattern = Pattern.compile(expression);
            Matcher m = pattern.matcher(labelText);

            if(m.find()){
               filteredString.append(m.group()).append(";\n\r");
            }
        }
        Log.d("FILTRADA", filteredString.toString() + "HERE");
        return filteredString.toString();
    }

}
