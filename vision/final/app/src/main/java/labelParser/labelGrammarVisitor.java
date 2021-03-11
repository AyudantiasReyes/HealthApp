// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor\labelGrammar.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link labelGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface labelGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link labelGrammarParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(labelGrammarParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(labelGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelGrammarParser#grasaTotal_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrasaTotal_statement(labelGrammarParser.GrasaTotal_statementContext ctx);
}