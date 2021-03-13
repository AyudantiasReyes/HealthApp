package com.google.firebase.codelab.textExtractor.listeners;

import android.util.Log;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import labelParser.labelGrammarBaseListener;
import labelParser.labelGrammarParser;

public class LabelDataListener extends labelGrammarBaseListener {

    private int tamanoPorcion = -1;
    private int porciones = -1;
    private int calorias = -1;
    private int grasas = -1;
    private int sodio = -1;
    private int carbohidratos = -1;
    private int proteinas = -1;
    private int azucares = -1;

    public LabelDataListener() {

    }



    @Override
    public void enterInit(labelGrammarParser.InitContext ctx) {
        super.enterInit(ctx);
    }

    @Override
    public void exitInit(labelGrammarParser.InitContext ctx) {
        super.exitInit(ctx);

        if(calorias != -1 && grasas != -1 && carbohidratos != -1 && proteinas == -1)
            proteinas = (int) Math.ceil((float)(calorias - 9*grasas - 4*carbohidratos) / 4);
    }

    @Override
    public void enterStatements(labelGrammarParser.StatementsContext ctx) {
        super.enterStatements(ctx);
    }

    @Override
    public void exitStatements(labelGrammarParser.StatementsContext ctx) {
        super.exitStatements(ctx);
    }

    @Override
    public void enterTamanoPorcion_statement(labelGrammarParser.TamanoPorcion_statementContext ctx) {
        super.enterTamanoPorcion_statement(ctx);

        for(TerminalNode t : ctx.NUMERO()){
            tamanoPorcion = (t.getText() != null ? Integer.parseInt(t.getText()) : -1);
        }

    }

    @Override
    public void enterPorcionesEmpaque_statement(labelGrammarParser.PorcionesEmpaque_statementContext ctx) {
        super.enterPorcionesEmpaque_statement(ctx);

        porciones = (ctx.NUMERO().getText() != null ? Integer.parseInt(ctx.NUMERO().getText()) : -1);

    }

    @Override
    public void exitPorcionesEmpaque_statement(labelGrammarParser.PorcionesEmpaque_statementContext ctx) {
        super.exitPorcionesEmpaque_statement(ctx);
    }

    @Override
    public void enterCaloriasStatement(labelGrammarParser.CaloriasStatementContext ctx) {
        super.enterCaloriasStatement(ctx);
        Log.d("ENTER", "enterCaloriasStatement: " + ctx.NUMERO().getText());
        calorias = (ctx.NUMERO().getText() != null ? Integer.parseInt(ctx.NUMERO().getText()) : -1);

    }
    @Override
    public void exitCaloriasStatement(labelGrammarParser.CaloriasStatementContext ctx) {
        super.exitCaloriasStatement(ctx);
    }

    @Override
    public void exitTamanoPorcion_statement(labelGrammarParser.TamanoPorcion_statementContext ctx) {
        super.exitTamanoPorcion_statement(ctx);
    }

    @Override
    public void enterGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx) {
        super.enterGrasaTotal_statement(ctx);

        if(ctx.G() == null){
            grasas = Integer.parseInt(ctx.NUMERO().getText()) / 10;
        }
        else{
            grasas = Integer.parseInt(ctx.NUMERO().getText());
        }
    }

    @Override
    public void enterCarbs_statement(labelGrammarParser.Carbs_statementContext ctx) {
        super.enterCarbs_statement(ctx);
        Log.d("ENTER", "enterCarbsStatement: " + ctx.NUMERO().getText());
        if(ctx.G() == null){
            carbohidratos = Integer.parseInt(ctx.NUMERO().getText()) / 10;
        }
        else{
            carbohidratos = Integer.parseInt(ctx.NUMERO().getText());
        }
    }

    @Override
    public void exitCarbs_statement(labelGrammarParser.Carbs_statementContext ctx) {
        super.exitCarbs_statement(ctx);
    }

    @Override
    public void enterAzucar_statement(labelGrammarParser.Azucar_statementContext ctx) {
        super.enterAzucar_statement(ctx);
        if(ctx.G() == null){
            azucares = Integer.parseInt(ctx.NUMERO().getText()) / 10;
        }
        else{
            azucares = Integer.parseInt(ctx.NUMERO().getText());
        }
    }

    @Override
    public void exitAzucar_statement(labelGrammarParser.Azucar_statementContext ctx) {
        super.exitAzucar_statement(ctx);
    }

    @Override
    public void enterSodio_statement(labelGrammarParser.Sodio_statementContext ctx) {
        super.enterSodio_statement(ctx);


        sodio = (ctx.NUMERO() != null ? Integer.parseInt(ctx.NUMERO().getText()) : 0);

    }

    @Override
    public void exitSodio_statement(labelGrammarParser.Sodio_statementContext ctx) {
        super.exitSodio_statement(ctx);
    }

    @Override
    public void enterProteina_statement(labelGrammarParser.Proteina_statementContext ctx) {
        super.enterProteina_statement(ctx);
    }

    @Override
    public void exitProteina_statement(labelGrammarParser.Proteina_statementContext ctx) {
        super.exitProteina_statement(ctx);
    }

    @Override
    public void exitGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx) {
        super.exitGrasaTotal_statement(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    public int getTamanoPorcion() {
        return tamanoPorcion;
    }

    public int getPorciones() {
        return porciones;
    }

    public int getCalorias() {
        return calorias;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getSodio() {
        return sodio;
    }

    public int getCarbohidratos() {
        return carbohidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public int getAzucares() {
        return azucares;
    }
}
