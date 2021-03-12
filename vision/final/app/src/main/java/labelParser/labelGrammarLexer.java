// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor/analyzer\labelGrammar.g4 by ANTLR 4.9.1
package labelParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class labelGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAMANO=1, DELA=2, PORCION=3, OZ=4, POR=5, EMPAQUE=6, CALORIAS=7, DE=8, 
		VALORES=9, DIARIOS=10, NUMERO=11, GRASA=12, TOTALES=13, TOTAL=14, PROTEINAS=15, 
		CARBOHIDRATOS=16, AZUCARES=17, G=18, SODIO=19, WS=20, ANY=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAMANO", "DELA", "PORCION", "OZ", "POR", "EMPAQUE", "CALORIAS", "DE", 
			"VALORES", "DIARIOS", "NUMERO", "GRASA", "TOTALES", "TOTAL", "PROTEINAS", 
			"CARBOHIDRATOS", "AZUCARES", "G", "SODIO", "WS", "ANY"
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


	public labelGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "labelGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3"+
		"\t\3\n\3\n\5\ng\n\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\13\3\13"+
		"\3\13\7\13u\n\13\f\13\16\13x\13\13\3\f\6\f{\n\f\r\f\16\f|\3\r\3\r\3\r"+
		"\7\r\u0082\n\r\f\r\16\r\u0085\13\r\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r"+
		"\u008d\13\r\5\r\u008f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00c3\n\22\f\22\16\22\u00c6\13\22\5\22\u00c8\n\22\3\23\5\23\u00cb\n\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26"+
		"\u00da\n\26\r\26\16\26\u00db\3\26\3\26\3\u00db\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\27\5\2VVvv~~\3\2cc\5\2c|\u00b3\u00b3\u00c5\u00c5\5\2R"+
		"Rrr~~\6\2qq~~\u00b5\u00b5\u00c5\u00c5\5\2GGgg~~\3\2c|\5\2EEee~~\5\2XX"+
		"xx~~\5\2FFff~~\3\2\62;\5\2IIii~~\3\2C\\\6\2kk~~\u00af\u00af\u00c5\u00c5"+
		"\5\2CCcc~~\6\2ww~~\u00bc\u00bc\u00c5\u00c5\3\2||\6\2c|~~\u00bc\u00bc\u00c5"+
		"\u00c5\3\2oo\5\2UUuu~~\b\2\13\f\17\17\"\"\'\'//<=\2\u00ee\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\65\3\2\2\2\7:\3\2\2"+
		"\2\tJ\3\2\2\2\13L\3\2\2\2\rP\3\2\2\2\17Z\3\2\2\2\21a\3\2\2\2\23d\3\2\2"+
		"\2\25q\3\2\2\2\27z\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0098"+
		"\3\2\2\2\37\u009e\3\2\2\2!\u00a9\3\2\2\2#\u00c7\3\2\2\2%\u00ca\3\2\2\2"+
		"\'\u00ce\3\2\2\2)\u00d4\3\2\2\2+\u00d9\3\2\2\2-.\t\2\2\2.\62\t\3\2\2/"+
		"\61\t\4\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\4"+
		"\3\2\2\2\64\62\3\2\2\2\65\66\7f\2\2\66\67\7g\2\2\678\7n\2\289\7c\2\29"+
		"\6\3\2\2\2:;\t\5\2\2;<\7q\2\2<=\7t\2\2=>\7e\2\2>?\7k\2\2?@\3\2\2\2@A\t"+
		"\6\2\2AD\7p\2\2BC\7g\2\2CE\7u\2\2DB\3\2\2\2DE\3\2\2\2E\b\3\2\2\2FG\7q"+
		"\2\2GK\7|\2\2HI\7c\2\2IK\7|\2\2JF\3\2\2\2JH\3\2\2\2K\n\3\2\2\2LM\t\5\2"+
		"\2MN\7q\2\2NO\7t\2\2O\f\3\2\2\2PQ\t\7\2\2QR\7o\2\2RS\7r\2\2SW\3\2\2\2"+
		"TV\t\b\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\16\3\2\2\2YW\3\2\2"+
		"\2Z_\t\t\2\2[\\\7c\2\2\\`\7n\2\2]^\7C\2\2^`\7N\2\2_[\3\2\2\2_]\3\2\2\2"+
		"`\20\3\2\2\2ab\7F\2\2bc\7G\2\2c\22\3\2\2\2df\t\n\2\2eg\7k\2\2fe\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7c\2\2ij\7n\2\2jn\3\2\2\2km\t\b\2\2lk\3\2\2\2"+
		"mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\24\3\2\2\2pn\3\2\2\2qr\t\13\2\2rv\7k\2"+
		"\2su\t\b\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\26\3\2\2\2xv\3\2"+
		"\2\2y{\t\f\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\30\3\2\2\2~\177"+
		"\t\r\2\2\177\u0083\7t\2\2\u0080\u0082\t\b\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008f\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\t\r\2\2\u0087\u008b\7T\2\2\u0088"+
		"\u008a\t\16\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"~\3\2\2\2\u008e\u0086\3\2\2\2\u008f\32\3\2\2\2\u0090\u0091\t\2\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7v\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u0097\7u\2\2\u0097\34\3\2\2\2\u0098\u0099\t"+
		"\2\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7n\2\2\u009d\36\3\2\2\2\u009e\u009f\t\5\2\2\u009f\u00a0\7t\2\2"+
		"\u00a0\u00a1\7q\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\t\17\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7c\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8 \3\2\2\2\u00a9\u00aa\t\t\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7j\2\2"+
		"\u00af\u00b0\7k\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\"\3\2\2\2\u00b7\u00b8\t\20\2\2\u00b8\u00b9\7|\2\2\u00b9\u00ba\t\21\2"+
		"\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00c8\7u\2\2\u00bf\u00c0\t\20\2\2\u00c0\u00c4\t\22\2\2\u00c1"+
		"\u00c3\t\23\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00b7\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c8$\3\2\2\2\u00c9\u00cb\t\24\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\7i\2\2\u00cd&\3\2\2\2\u00ce\u00cf\t\25\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7f\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7q\2\2\u00d3(\3\2\2\2\u00d4\u00d5"+
		"\t\26\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\25\2\2\u00d7*\3\2\2\2\u00d8"+
		"\u00da\13\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\26\2\2\u00de"+
		",\3\2\2\2\24\2\60\62DJW_fnv|\u0083\u008b\u008e\u00c4\u00c7\u00ca\u00db"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}