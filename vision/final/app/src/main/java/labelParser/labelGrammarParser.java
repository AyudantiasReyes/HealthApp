// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor/analyzer\labelGrammar.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class labelGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAMANO=1, DELA=2, PORCION=3, OZ=4, POR=5, EMPAQUE=6, CALORIAS=7, DE=8, 
		VALORES=9, DIARIOS=10, NUMERO=11, GRASA=12, TOTALES=13, TOTAL=14, PROTEINAS=15, 
		CARBOHIDRATOS=16, AZUCARES=17, G=18, SODIO=19, WS=20, ANY=21;
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_tamanoPorcion_statement = 2, 
		RULE_porcionesEmpaque_statement = 3, RULE_caloriasDeGrasa_statemnt = 4, 
		RULE_valoresDiarios_statement = 5, RULE_caloriasStatemnt = 6, RULE_grasaTotal_statement = 7, 
		RULE_carbs_statement = 8, RULE_azucar_statement = 9, RULE_sodio_statement = 10, 
		RULE_proteina_statement = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "statements", "tamanoPorcion_statement", "porcionesEmpaque_statement", 
			"caloriasDeGrasa_statemnt", "valoresDiarios_statement", "caloriasStatemnt", 
			"grasaTotal_statement", "carbs_statement", "azucar_statement", "sodio_statement", 
			"proteina_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'dela'", null, null, null, null, null, "'DE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAMANO", "DELA", "PORCION", "OZ", "POR", "EMPAQUE", "CALORIAS", 
			"DE", "VALORES", "DIARIOS", "NUMERO", "GRASA", "TOTALES", "TOTAL", "PROTEINAS", 
			"CARBOHIDRATOS", "AZUCARES", "G", "SODIO", "WS", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "labelGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public labelGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAMANO) | (1L << PORCION) | (1L << CALORIAS) | (1L << VALORES) | (1L << GRASA) | (1L << PROTEINAS) | (1L << CARBOHIDRATOS) | (1L << AZUCARES) | (1L << SODIO))) != 0)) {
				{
				{
				setState(24);
				statements();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public GrasaTotal_statementContext grasaTotal_statement() {
			return getRuleContext(GrasaTotal_statementContext.class,0);
		}
		public Carbs_statementContext carbs_statement() {
			return getRuleContext(Carbs_statementContext.class,0);
		}
		public Azucar_statementContext azucar_statement() {
			return getRuleContext(Azucar_statementContext.class,0);
		}
		public Sodio_statementContext sodio_statement() {
			return getRuleContext(Sodio_statementContext.class,0);
		}
		public Proteina_statementContext proteina_statement() {
			return getRuleContext(Proteina_statementContext.class,0);
		}
		public TamanoPorcion_statementContext tamanoPorcion_statement() {
			return getRuleContext(TamanoPorcion_statementContext.class,0);
		}
		public PorcionesEmpaque_statementContext porcionesEmpaque_statement() {
			return getRuleContext(PorcionesEmpaque_statementContext.class,0);
		}
		public CaloriasStatemntContext caloriasStatemnt() {
			return getRuleContext(CaloriasStatemntContext.class,0);
		}
		public CaloriasDeGrasa_statemntContext caloriasDeGrasa_statemnt() {
			return getRuleContext(CaloriasDeGrasa_statemntContext.class,0);
		}
		public ValoresDiarios_statementContext valoresDiarios_statement() {
			return getRuleContext(ValoresDiarios_statementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				grasaTotal_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				carbs_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				azucar_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				sodio_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				proteina_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				tamanoPorcion_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				porcionesEmpaque_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(37);
				caloriasStatemnt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(38);
				caloriasDeGrasa_statemnt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(39);
				valoresDiarios_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TamanoPorcion_statementContext extends ParserRuleContext {
		public TerminalNode TAMANO() { return getToken(labelGrammarParser.TAMANO, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(labelGrammarParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(labelGrammarParser.NUMERO, i);
		}
		public TerminalNode DELA() { return getToken(labelGrammarParser.DELA, 0); }
		public TerminalNode PORCION() { return getToken(labelGrammarParser.PORCION, 0); }
		public TerminalNode OZ() { return getToken(labelGrammarParser.OZ, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public TamanoPorcion_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanoPorcion_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterTamanoPorcion_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitTamanoPorcion_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitTamanoPorcion_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanoPorcion_statementContext tamanoPorcion_statement() throws RecognitionException {
		TamanoPorcion_statementContext _localctx = new TamanoPorcion_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tamanoPorcion_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TAMANO);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELA) {
				{
				setState(43);
				match(DELA);
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORCION) {
				{
				setState(46);
				match(PORCION);
				}
			}

			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(49);
				match(NUMERO);
				}
				break;
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OZ) {
				{
				setState(52);
				match(OZ);
				}
			}

			setState(55);
			match(NUMERO);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(56);
				match(G);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PorcionesEmpaque_statementContext extends ParserRuleContext {
		public TerminalNode PORCION() { return getToken(labelGrammarParser.PORCION, 0); }
		public TerminalNode POR() { return getToken(labelGrammarParser.POR, 0); }
		public TerminalNode EMPAQUE() { return getToken(labelGrammarParser.EMPAQUE, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public PorcionesEmpaque_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porcionesEmpaque_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterPorcionesEmpaque_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitPorcionesEmpaque_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitPorcionesEmpaque_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PorcionesEmpaque_statementContext porcionesEmpaque_statement() throws RecognitionException {
		PorcionesEmpaque_statementContext _localctx = new PorcionesEmpaque_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_porcionesEmpaque_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(PORCION);
			setState(60);
			match(POR);
			setState(61);
			match(EMPAQUE);
			setState(62);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaloriasDeGrasa_statemntContext extends ParserRuleContext {
		public TerminalNode CALORIAS() { return getToken(labelGrammarParser.CALORIAS, 0); }
		public TerminalNode DE() { return getToken(labelGrammarParser.DE, 0); }
		public TerminalNode GRASA() { return getToken(labelGrammarParser.GRASA, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public CaloriasDeGrasa_statemntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caloriasDeGrasa_statemnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterCaloriasDeGrasa_statemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitCaloriasDeGrasa_statemnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitCaloriasDeGrasa_statemnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaloriasDeGrasa_statemntContext caloriasDeGrasa_statemnt() throws RecognitionException {
		CaloriasDeGrasa_statemntContext _localctx = new CaloriasDeGrasa_statemntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_caloriasDeGrasa_statemnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CALORIAS);
			setState(65);
			match(DE);
			setState(66);
			match(GRASA);
			setState(67);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValoresDiarios_statementContext extends ParserRuleContext {
		public TerminalNode VALORES() { return getToken(labelGrammarParser.VALORES, 0); }
		public TerminalNode DIARIOS() { return getToken(labelGrammarParser.DIARIOS, 0); }
		public ValoresDiarios_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoresDiarios_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterValoresDiarios_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitValoresDiarios_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitValoresDiarios_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresDiarios_statementContext valoresDiarios_statement() throws RecognitionException {
		ValoresDiarios_statementContext _localctx = new ValoresDiarios_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valoresDiarios_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(VALORES);
			setState(70);
			match(DIARIOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaloriasStatemntContext extends ParserRuleContext {
		public TerminalNode CALORIAS() { return getToken(labelGrammarParser.CALORIAS, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public CaloriasStatemntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caloriasStatemnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterCaloriasStatemnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitCaloriasStatemnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitCaloriasStatemnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaloriasStatemntContext caloriasStatemnt() throws RecognitionException {
		CaloriasStatemntContext _localctx = new CaloriasStatemntContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caloriasStatemnt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CALORIAS);
			setState(73);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrasaTotal_statementContext extends ParserRuleContext {
		public TerminalNode GRASA() { return getToken(labelGrammarParser.GRASA, 0); }
		public TerminalNode TOTAL() { return getToken(labelGrammarParser.TOTAL, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public GrasaTotal_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grasaTotal_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterGrasaTotal_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitGrasaTotal_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitGrasaTotal_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrasaTotal_statementContext grasaTotal_statement() throws RecognitionException {
		GrasaTotal_statementContext _localctx = new GrasaTotal_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_grasaTotal_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(GRASA);
			setState(76);
			match(TOTAL);
			setState(77);
			match(NUMERO);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(78);
				match(G);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Carbs_statementContext extends ParserRuleContext {
		public TerminalNode CARBOHIDRATOS() { return getToken(labelGrammarParser.CARBOHIDRATOS, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode TOTALES() { return getToken(labelGrammarParser.TOTALES, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Carbs_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carbs_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterCarbs_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitCarbs_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitCarbs_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Carbs_statementContext carbs_statement() throws RecognitionException {
		Carbs_statementContext _localctx = new Carbs_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_carbs_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(CARBOHIDRATOS);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOTALES) {
				{
				setState(82);
				match(TOTALES);
				}
			}

			setState(85);
			match(NUMERO);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(86);
				match(G);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Azucar_statementContext extends ParserRuleContext {
		public TerminalNode AZUCARES() { return getToken(labelGrammarParser.AZUCARES, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Azucar_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azucar_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterAzucar_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitAzucar_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitAzucar_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Azucar_statementContext azucar_statement() throws RecognitionException {
		Azucar_statementContext _localctx = new Azucar_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_azucar_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(AZUCARES);
			setState(90);
			match(NUMERO);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(91);
				match(G);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sodio_statementContext extends ParserRuleContext {
		public TerminalNode SODIO() { return getToken(labelGrammarParser.SODIO, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Sodio_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sodio_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterSodio_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitSodio_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitSodio_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sodio_statementContext sodio_statement() throws RecognitionException {
		Sodio_statementContext _localctx = new Sodio_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sodio_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SODIO);
			setState(95);
			match(NUMERO);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(96);
				match(G);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proteina_statementContext extends ParserRuleContext {
		public TerminalNode PROTEINAS() { return getToken(labelGrammarParser.PROTEINAS, 0); }
		public TerminalNode NUMERO() { return getToken(labelGrammarParser.NUMERO, 0); }
		public TerminalNode G() { return getToken(labelGrammarParser.G, 0); }
		public Proteina_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proteina_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).enterProteina_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof labelGrammarListener ) ((labelGrammarListener)listener).exitProteina_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof labelGrammarVisitor ) return ((labelGrammarVisitor<? extends T>)visitor).visitProteina_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proteina_statementContext proteina_statement() throws RecognitionException {
		Proteina_statementContext _localctx = new Proteina_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_proteina_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PROTEINAS);
			setState(100);
			match(NUMERO);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==G) {
				{
				setState(101);
				match(G);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\5\4/\n\4\3\4\5\4\62\n\4\3\4\5\4\65\n"+
		"\4\3\4\5\48\n\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tR\n\t\3\n\3\n\5\nV\n\n\3"+
		"\n\3\n\5\nZ\n\n\3\13\3\13\3\13\5\13_\n\13\3\f\3\f\3\f\5\fd\n\f\3\r\3\r"+
		"\3\r\5\ri\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2s\2\35\3\2"+
		"\2\2\4*\3\2\2\2\6,\3\2\2\2\b=\3\2\2\2\nB\3\2\2\2\fG\3\2\2\2\16J\3\2\2"+
		"\2\20M\3\2\2\2\22S\3\2\2\2\24[\3\2\2\2\26`\3\2\2\2\30e\3\2\2\2\32\34\5"+
		"\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3"+
		"\2\2\2\37\35\3\2\2\2 +\5\20\t\2!+\5\22\n\2\"+\5\24\13\2#+\5\26\f\2$+\5"+
		"\30\r\2%+\5\6\4\2&+\5\b\5\2\'+\5\16\b\2(+\5\n\6\2)+\5\f\7\2* \3\2\2\2"+
		"*!\3\2\2\2*\"\3\2\2\2*#\3\2\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2*\'\3\2\2"+
		"\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,.\7\3\2\2-/\7\4\2\2.-\3\2\2\2./\3\2"+
		"\2\2/\61\3\2\2\2\60\62\7\5\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\65\7\r\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\7\6\2\2"+
		"\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29;\7\r\2\2:<\7\24\2\2;:\3\2\2\2;<"+
		"\3\2\2\2<\7\3\2\2\2=>\7\5\2\2>?\7\7\2\2?@\7\b\2\2@A\7\r\2\2A\t\3\2\2\2"+
		"BC\7\t\2\2CD\7\n\2\2DE\7\16\2\2EF\7\r\2\2F\13\3\2\2\2GH\7\13\2\2HI\7\f"+
		"\2\2I\r\3\2\2\2JK\7\t\2\2KL\7\r\2\2L\17\3\2\2\2MN\7\16\2\2NO\7\20\2\2"+
		"OQ\7\r\2\2PR\7\24\2\2QP\3\2\2\2QR\3\2\2\2R\21\3\2\2\2SU\7\22\2\2TV\7\17"+
		"\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\r\2\2XZ\7\24\2\2YX\3\2\2\2YZ\3"+
		"\2\2\2Z\23\3\2\2\2[\\\7\23\2\2\\^\7\r\2\2]_\7\24\2\2^]\3\2\2\2^_\3\2\2"+
		"\2_\25\3\2\2\2`a\7\25\2\2ac\7\r\2\2bd\7\24\2\2cb\3\2\2\2cd\3\2\2\2d\27"+
		"\3\2\2\2ef\7\21\2\2fh\7\r\2\2gi\7\24\2\2hg\3\2\2\2hi\3\2\2\2i\31\3\2\2"+
		"\2\17\35*.\61\64\67;QUY^ch";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}