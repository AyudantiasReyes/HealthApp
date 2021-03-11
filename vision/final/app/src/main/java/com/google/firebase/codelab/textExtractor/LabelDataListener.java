package com.google.firebase.codelab.textExtractor;

import android.util.Log;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import labelParser.labelGrammarBaseListener;
import labelParser.labelGrammarParser;

public class LabelDataListener extends labelGrammarBaseListener {


    public LabelDataListener() {
        Log.d("const", "LabelDataListener: ");
    }


    @Override
    public void enterInit(labelGrammarParser.InitContext ctx) {
        super.enterInit(ctx);
    }

    @Override
    public void exitInit(labelGrammarParser.InitContext ctx) {
        super.exitInit(ctx);


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
    public void enterGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx) {
        super.enterGrasaTotal_statement(ctx);

        if(ctx.G() == null){
            int numero = Integer.parseInt(ctx.NUMERO().getText()) / 10;
            Log.d("FOUND_NU", "GRASA:" + numero + "g");

        }
        else{
            Log.d("FOUND_NU", "GRASA: " + ctx.NUMERO().getText() + "g");
        }
    }

    @Override
    public void enterCarbs_statement(labelGrammarParser.Carbs_statementContext ctx) {
        super.enterCarbs_statement(ctx);
        if(ctx.G() == null){
            int numero = Integer.parseInt(ctx.NUMERO().getText()) / 10;
            Log.d("FOUND_NU", "CARBS:" + numero + "g");

        }
        else{
            Log.d("FOUND_NU", "CARBS: " + ctx.NUMERO().getText() + "g");
        }
    }

    @Override
    public void exitCarbs_statement(labelGrammarParser.Carbs_statementContext ctx) {
        super.exitCarbs_statement(ctx);
    }

    @Override
    public void enterAzucar_statement(labelGrammarParser.Azucar_statementContext ctx) {
        super.enterAzucar_statement(ctx);
    }

    @Override
    public void exitAzucar_statement(labelGrammarParser.Azucar_statementContext ctx) {
        super.exitAzucar_statement(ctx);
    }

    @Override
    public void enterSodio_statement(labelGrammarParser.Sodio_statementContext ctx) {
        super.enterSodio_statement(ctx);
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
}
