package com.google.firebase.codelab.textExtractor.analyzer;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabelCleaner {

    // En vocales tomaremos la que sea debido a que los confunde mucho
    private static final String v = "([a|e|i|o|u|á|é|í|ó|ú|A|E|I|O|U|Á|É|Í|Ó|Ú])";

    private static final String FILTRO_TAM_PORCION = "[T|t]"+v+"m"+v+"[n|ñ]"+v+"d"+v+"l"+v+"[P|p]"+v+"rc"+v+v+"n[0-9]?[oz]?[0-9]+g?" ;

    private static final String FILTRO_PORCIONES = "[E|e]mp"+v+"q"+v+v+"[0-9]" ;

    private static final String FILTRO_CALORIAS = "[C|c]"+v+"[L|l]"+v+"[R|r]"+v+v+"[S|s][0-9]+" ;

    private static final String FILTRO_GRASAS = "[G|g]r"+v+"s"+v+"s?[T|t]"+v+"t"+v+"l[0-9]+g?" ;

    private static final String FILTRO_CARBS = "[C|c]"+v+"rb"+v+"h"+v+"dr"+v+"t"+v+"s[0-9]+g?|" +
                                               "[C|c]"+v+"rb"+v+"h"+v+"dr"+v+"t"+v+"st"+v+"t"+v+"l"+v+"s[0-9]+g?" ;

    private static final String FILTRO_AZUCAR = "[A|a][z|n]"+v+"c"+v+"r"+v+"s[0-9]+g?|" ;

    private static final String FILTRO_SODIO = "[S|s]"+v+"d"+v+v+"[0-9]+m?g?" ;

    private static final String FILTRO_PROTEINA = "[P|p]r"+v+"t"+v+v+"n"+v+"[0-9]+g?" ;

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