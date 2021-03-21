package com.google.firebase.codelab.textExtractor.analyzer;

import android.util.Log;

import com.google.firebase.codelab.textExtractor.groups.Occurrence;
import com.google.firebase.codelab.textExtractor.listeners.LabelDataListener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.Serializable;

import labelParser.labelGrammarLexer;
import labelParser.labelGrammarParser;

public class LabelAnalyzer implements Serializable {


    public final static int TAM_PORCION = 0;
    public final static int PORCIONES = 1;
    public final static int CALORIAS = 2;
    public final static int GRASAS = 3;
    public final static int CARBOHIDRATOS = 4;
    public final static int AZUCARES = 5;
    public final static int SODIO = 6;
    public final static int PROTEINAS = 7;
    private final static int SIZE = 8;
    private final static int SIZE_OCCURRENCES = 5;
    private final static int MAX_OCCURRENCES = 5;
    private final static int NOT_FOUND = -1;



    private int[] amountNutrients;
    private boolean[] blockNutrients;
    private Occurrence occurrence[][] = new Occurrence[SIZE][SIZE_OCCURRENCES];
    private boolean multipleOcurrences;

    public LabelAnalyzer(boolean multipleOcurrences) {
        this.multipleOcurrences = multipleOcurrences;
        amountNutrients = new int[SIZE];
        blockNutrients = new boolean[SIZE];

        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < 5; j++){
                occurrence[i][j] = new Occurrence();
            }
        }

        resetFilters();
    }

    public boolean analyze(String textFiltered){

        boolean exitAnalyze = true;

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes


        if(multipleOcurrences){
            labelCheckerV2(TAM_PORCION, listener.getTamanoPorcion(),"Tamano de la porcion: ");
            labelCheckerV2(PORCIONES, listener.getPorciones(), "Porciones por empaque: ");
            labelCheckerV2(CALORIAS, listener.getCalorias(), "Calorias: ");
            labelCheckerV2(GRASAS, listener.getGrasas(), "Grasa Total: ");
            labelCheckerV2(CARBOHIDRATOS, listener.getCarbs(), "Carbohidratos: ");
            labelCheckerV2(AZUCARES, listener.getAzucares(), "Azucares: ");
            labelCheckerV2(SODIO, listener.getSodio(), "Sodio: ");
            labelCheckerV2(PROTEINAS, listener.getProteinas(), "Proteina: ");
        }
        else{
            labelChecker(TAM_PORCION, listener.getTamanoPorcion(),"Tamano de la porcion: ");
            labelChecker(PORCIONES, listener.getPorciones(), "Porciones por empaque: ");
            labelChecker(CALORIAS, listener.getCalorias(), "Calorias: ");
            labelChecker(GRASAS, listener.getGrasas(), "Grasa Total: ");
            labelChecker(CARBOHIDRATOS, listener.getCarbs(), "Carbohidratos: ");
            labelChecker(AZUCARES, listener.getAzucares(), "Azucares: ");
            labelChecker(SODIO, listener.getSodio(), "Sodio: ");
            labelChecker(PROTEINAS, listener.getProteinas(), "Proteina: ");

        }



        for(boolean block : blockNutrients){
            exitAnalyze &= block;
        }

        return exitAnalyze;

    }

    private void labelChecker(int labelItem, int listenerData, String label){
        if(!blockNutrients[labelItem]){
            if(listenerData != -1){
                blockNutrients[labelItem] = true;
                amountNutrients[labelItem] = listenerData;
                Log.d("final_label_data", label  + amountNutrients[labelItem]);
            }
        }
    }

    private void labelCheckerV2(int labelItem, int listenerData, String label){
        if(!blockNutrients[labelItem]){
            // Si nos da un dato
            if(listenerData != NOT_FOUND){
                //Checamos renglon de articulo correspondiente
                for (int i = 0; i < SIZE_OCCURRENCES; i++){
                    //si el numero dentro del renglon es -1, significa que esta vacio, entonces metemos el dato que nos llego y salimos del metodo
                    if(occurrence[labelItem][i].getNumber() == NOT_FOUND){
                        occurrence[labelItem][i].setNumber(listenerData);
                        return;
                    }
                    //Si encontramos un dato que ya esta en el renglon, aumentamos su ocurrencia
                    else if(occurrence[labelItem][i].getNumber() == listenerData){
                        occurrence[labelItem][i].incrementOcurrencies();
                        //Si las ocurrencias son 3, bloqueamos nutriente, asignamos el valor, y retornamos
                        if(occurrence[labelItem][i].getOcurrences() >= MAX_OCCURRENCES){
                            blockNutrients[labelItem] = true;
                            amountNutrients[labelItem] = listenerData;
                            Log.d("final_label_data", label  + amountNutrients[labelItem] + " ocurrence = " + occurrence[labelItem][i].getOcurrences());
                            return;
                        }
                    }
                }
            }
        }
    }

    public int[] getAmountNutrients() {
        return amountNutrients;
    }

    public void resetFilters(){
        for(int i = 0; i < SIZE; i++){
            blockNutrients[i] = false;
        }
    }
}
