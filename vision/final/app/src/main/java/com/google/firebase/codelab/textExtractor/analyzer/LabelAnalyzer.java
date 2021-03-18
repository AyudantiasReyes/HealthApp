package com.google.firebase.codelab.textExtractor.analyzer;

import android.util.Log;

import com.google.firebase.codelab.textExtractor.listeners.LabelDataListener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Arrays;

import labelParser.labelGrammarLexer;
import labelParser.labelGrammarParser;

public class LabelAnalyzer {

    public final static int TAM_PORCION = 0;
    public final static int PORCIONES = 1;
    public final static int CALORIAS = 2;
    public final static int GRASAS = 3;
    public final static int CARBOHIDRATOS = 4;
    public final static int AZUCARES = 5;
    public final static int SODIO = 6;
    public final static int PROTEINAS = 7;
    private final static int SIZE = 8;

    private int[] amountNutrients;
    private boolean[] blockNutrients;

    public LabelAnalyzer() {
        amountNutrients = new int[SIZE];
        blockNutrients = new boolean[SIZE];

        resetFilters();
    }

    public boolean analyze(String textFiltered){

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes


        //obtener los nutrientes
        amountNutrients[TAM_PORCION] = listener.getTamanoPorcion();
        amountNutrients[CALORIAS] = listener.getCalorias();
        amountNutrients[PORCIONES] = listener.getPorciones();
        amountNutrients[GRASAS] = listener.getGrasas();
        amountNutrients[CARBOHIDRATOS] = listener.getCarbs();
        amountNutrients[PROTEINAS] = listener.getProteinas();
        amountNutrients[AZUCARES] = listener.getAzucares();
        amountNutrients[SODIO] = listener.getSodio();
        amountNutrients[PROTEINAS] = listener.getProteinas();



        Log.d("NUTRIENTES_TAM", "TAM = " + amountNutrients[TAM_PORCION]);
        Log.d("NUTRIENTES_POR", "PORCIONES = " + amountNutrients[PORCIONES]);
        Log.d("NUTRIENTES_CAL", "CALORIAS = " + amountNutrients[CALORIAS]);
        Log.d("NUTRIENTES_GRA", "GRASAS = " + amountNutrients[GRASAS]);
        Log.d("NUTRIENTES_CARB", "CARBOHIDRATOS = " + amountNutrients[CARBOHIDRATOS]);
        Log.d("NUTRIENTES_PRO", "PROTEINAS = " + amountNutrients[PROTEINAS]);
        Log.d("NUTRIENTES_AZU", "AZUCARES = " + amountNutrients[AZUCARES]);
        Log.d("NUTRIENTES_SOD", "SODIO = " + amountNutrients[SODIO]);


        return false;

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
