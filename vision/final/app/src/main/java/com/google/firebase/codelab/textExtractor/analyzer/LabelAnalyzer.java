package com.google.firebase.codelab.textExtractor.analyzer;

import android.os.Build;
import android.util.Log;
import android.widget.ProgressBar;

import androidx.annotation.RequiresApi;

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


    public LabelAnalyzer() {
        amountNutrients = new int[SIZE];
        blockNutrients = new boolean[SIZE];
        resetFilters();
    }

    public LabelAnalyzer(boolean multipleOcurrences) {
        amountNutrients = new int[SIZE];
        blockNutrients = new boolean[SIZE];

        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < 5; j++){
                occurrence[i][j] = new Occurrence();
            }
        }

        resetFilters();
    }

    public void analyze(String textFiltered){

        boolean exitAnalyze = true;

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes


        labelChecker(TAM_PORCION, listener.getTamanoPorcion(),"Tamano de la porcion: ");
        labelChecker(PORCIONES, listener.getPorciones(), "Porciones por empaque: ");
        labelChecker(CALORIAS, listener.getCalorias(), "Calorias: ");
        labelChecker(GRASAS, listener.getGrasas(), "Grasa Total: ");
        labelChecker(CARBOHIDRATOS, listener.getCarbs(), "Carbohidratos: ");
        labelChecker(AZUCARES, listener.getAzucares(), "Azucares: ");
        labelChecker(SODIO, listener.getSodio(), "Sodio: ");
        labelChecker(PROTEINAS, listener.getProteinas(), "Proteina: ");

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean analyze(String textFiltered, ProgressBar progressBar, int progress){

        boolean exitAnalyze = true;

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes


        labelCheckerV2(TAM_PORCION, listener.getTamanoPorcion(),"Tamano de la porcion: ", progressBar, progress);
        labelCheckerV2(PORCIONES, listener.getPorciones(), "Porciones por empaque: ", progressBar, progress);
        labelCheckerV2(CALORIAS, listener.getCalorias(), "Calorias: ", progressBar, progress);
        labelCheckerV2(GRASAS, listener.getGrasas(), "Grasa Total: ", progressBar, progress);
        labelCheckerV2(CARBOHIDRATOS, listener.getCarbs(), "Carbohidratos: ", progressBar, progress);
        labelCheckerV2(AZUCARES, listener.getAzucares(), "Azucares: ", progressBar, progress);
        labelCheckerV2(SODIO, listener.getSodio(), "Sodio: ", progressBar, progress);
        labelCheckerV2(PROTEINAS, listener.getProteinas(), "Proteina: ", progressBar, progress);

        for(boolean block : blockNutrients){
            exitAnalyze &= block;
        }

        if(exitAnalyze)
            clearOcurrences();

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

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void labelCheckerV2(int labelItem, int listenerData, String label, ProgressBar progressBar, int progress){
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
                            progress++;
                            progressBar.setProgress(progress, true);
                            Log.d("final_label_data", label  + amountNutrients[labelItem] + " ocurrence = " + occurrence[labelItem][i].getOcurrences());
                            return;
                        }
                    }
                }
            }
        }
    }

    public void clearOcurrences(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < 5; j++){
                occurrence[i][j].setOcurrences(0);
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
