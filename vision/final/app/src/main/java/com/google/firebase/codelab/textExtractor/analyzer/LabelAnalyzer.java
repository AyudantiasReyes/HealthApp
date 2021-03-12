package com.google.firebase.codelab.textExtractor.analyzer;

import com.google.firebase.codelab.textExtractor.listeners.LabelDataListener;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import labelParser.labelGrammarLexer;
import labelParser.labelGrammarParser;

public class LabelAnalyzer {

    public final static int GRASAS = 0;
    public final static int CARBOHIDRATOS = 1;
    public final static int PROTEINAS = 2;
    public final static int AZUCARES = 3;
    public final static int SODIO = 4;
    private final static int SIZE = 5;


    public static int[] analyze(String textFiltered){
        int [] cantidadNutrientes = new int[SIZE];

        CharStream input = CharStreams.fromString(textFiltered); //crear charstream
        labelGrammarLexer lexer = new labelGrammarLexer(input); //crear analizador lexico
        CommonTokenStream tokens = new CommonTokenStream(lexer); //crear los tokens
        labelGrammarParser parser = new labelGrammarParser(tokens); //crear analizador sintactico

        ParseTree tree = parser.init(); //crear arbol para obtener nutrientes
        LabelDataListener listener = new LabelDataListener(); //crear un listener para recorrer

        ParseTreeWalker walker = new ParseTreeWalker(); //crear un caminante
        walker.walk(listener, tree); //recorrer el arbol para obtener los nutrientes

        //obtener los nutrientes
        cantidadNutrientes[GRASAS] = listener.getGrasas();
        cantidadNutrientes[CARBOHIDRATOS] = listener.getCarbohidratos();
        cantidadNutrientes[PROTEINAS] = listener.getProteinas();
        cantidadNutrientes[AZUCARES] = listener.getAzucares();
        cantidadNutrientes[SODIO] = listener.getSodio();


        return cantidadNutrientes;
    }
}
