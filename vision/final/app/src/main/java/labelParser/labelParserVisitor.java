// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/parserPackage\labelParser.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link labelParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface labelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link labelParserParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(labelParserParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(labelParserParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(labelParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#grasaTotal_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrasaTotal_statement(labelParserParser.GrasaTotal_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#carbohidratos_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarbohidratos_statement(labelParserParser.Carbohidratos_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#proteinas_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProteinas_statement(labelParserParser.Proteinas_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#azucares_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzucares_statement(labelParserParser.Azucares_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link labelParserParser#sodio_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSodio_statement(labelParserParser.Sodio_statementContext ctx);
}