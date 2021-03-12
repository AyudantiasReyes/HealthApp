package com.google.firebase.codelab.textExtractor.analyzer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabelCleaner {

    private static final String FILTRO_GRASAS = "[g|G]rasa;[t|T]otal;[0-9]+g?";
    private static final String FILTRO_CARBS = "[C|c]arbohidratos;[0-9]+g?|[C|c]arbohidratos;totales;[0-9]+g?" ;
    private static final String FILTRO_AZUCAR = "[A|a][z][a-z|ú]*;[0-9]+g?|Az[u|ú]cares;[0-9]+g?" ;
    private static final String FILTRO_SODIO = "[S|s]odio;[0-9]+m?g?" ;
    private static final String FILTRO_PROTEINA = "[P|p]rote[i|í]nas;[0-9]+g?" ;


    private static final String[] FILTERS = {FILTRO_GRASAS, FILTRO_CARBS, FILTRO_AZUCAR, FILTRO_SODIO, FILTRO_PROTEINA};


    public static String cleanLabelText(String labelText){
        StringBuilder filteredString = new StringBuilder();

        for(String expression : FILTERS){
            Pattern pattern = Pattern.compile(expression);
            Matcher m = pattern.matcher(labelText);

            if(m.find()){
               filteredString.append(m.group()).append(';');
            }
        }

        return filteredString.toString();
    }

}
