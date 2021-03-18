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
		TAMANO=1, OZ=2, EMPAQUE=3, CALORIAS=4, VALORES=5, DIARIOS=6, NUMERO=7, 
		TOTAL=8, GRASA=9, PROTEINAS=10, CARBOHIDRATOS=11, AZUCARES=12, G=13, SODIO=14, 
		WS=15, ANY=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAMANO", "OZ", "EMPAQUE", "CALORIAS", "VALORES", "DIARIOS", "NUMERO", 
			"TOTAL", "GRASA", "PROTEINAS", "CARBOHIDRATOS", "AZUCARES", "G", "SODIO", 
			"WS", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAMANO", "OZ", "EMPAQUE", "CALORIAS", "VALORES", "DIARIOS", "NUMERO", 
			"TOTAL", "GRASA", "PROTEINAS", "CARBOHIDRATOS", "AZUCARES", "G", "SODIO", 
			"WS", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\5\2&\n\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3\3\3\5"+
		"\3\65\n\3\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\6"+
		"\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\b\6"+
		"\bd\n\b\r\b\16\be\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0092\n\f\f\f\16\f\u0095\13\f\5\f\u0097\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\5\r\u00a9"+
		"\n\r\3\16\5\16\u00ac\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00b5"+
		"\n\17\f\17\16\17\u00b8\13\17\3\20\3\20\3\20\3\20\3\21\6\21\u00bf\n\21"+
		"\r\21\16\21\u00c0\3\21\3\21\3\u00c0\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\27\5\2VVvv~~\3\2"+
		"c|\7\2C\\c|~~\u00b5\u00b5\u00c5\u00c5\5\2GGgg~~\4\2op~~\4\2C\\c|\5\2E"+
		"Eee~~\7\2C\\c|~~\u00c5\u00c5\uffff\uffff\5\2XXxx~~\5\2FFff~~\3\2\62;\5"+
		"\2IIii~~\5\2RRrr~~\7\2C\\c|~~\u00af\u00af\u00c5\u00c5\5\2CCcc~~\6\2ww"+
		"~~\u00bc\u00bc\u00c5\u00c5\3\2||\6\2c|~~\u00bc\u00bc\u00c5\u00c5\3\2o"+
		"o\5\2UUuu~~\b\2\13\f\17\17\"\"\'\'//<=\2\u00d7\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\64\3\2\2\2\7\66\3"+
		"\2\2\2\t>\3\2\2\2\13S\3\2\2\2\rZ\3\2\2\2\17c\3\2\2\2\21g\3\2\2\2\23o\3"+
		"\2\2\2\25v\3\2\2\2\27\u0096\3\2\2\2\31\u00a8\3\2\2\2\33\u00ab\3\2\2\2"+
		"\35\u00af\3\2\2\2\37\u00b9\3\2\2\2!\u00be\3\2\2\2#%\t\2\2\2$&\t\3\2\2"+
		"%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7c\2\2()\7o\2\2)-\3\2\2\2*,\t\4\2\2"+
		"+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\4\3\2\2\2/-\3\2\2\2\60\61\7"+
		"q\2\2\61\65\7|\2\2\62\63\7c\2\2\63\65\7|\2\2\64\60\3\2\2\2\64\62\3\2\2"+
		"\2\65\6\3\2\2\2\66\67\t\5\2\2\67;\t\6\2\28:\t\7\2\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\b\3\2\2\2=;\3\2\2\2>K\t\b\2\2?@\7c\2\2@A\7n\2"+
		"\2AL\7q\2\2BC\7C\2\2CD\7N\2\2DL\7Q\2\2EF\7g\2\2FG\7n\2\2GL\7q\2\2HI\7"+
		"G\2\2IJ\7N\2\2JL\7Q\2\2K?\3\2\2\2KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2LP\3\2"+
		"\2\2MO\t\t\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\n\3\2\2\2RP\3"+
		"\2\2\2SW\t\n\2\2TV\t\3\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\f"+
		"\3\2\2\2YW\3\2\2\2Z[\t\13\2\2[_\7k\2\2\\^\t\3\2\2]\\\3\2\2\2^a\3\2\2\2"+
		"_]\3\2\2\2_`\3\2\2\2`\16\3\2\2\2a_\3\2\2\2bd\t\f\2\2cb\3\2\2\2de\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2f\20\3\2\2\2gh\t\2\2\2hi\7q\2\2ij\7v\2\2jk\3\2\2"+
		"\2kl\t\3\2\2lm\t\3\2\2mn\t\3\2\2n\22\3\2\2\2op\t\r\2\2pq\7t\2\2qr\7c\2"+
		"\2rs\3\2\2\2st\t\3\2\2tu\t\3\2\2u\24\3\2\2\2vw\t\16\2\2wx\7t\2\2xy\7q"+
		"\2\2y}\3\2\2\2z|\t\17\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~"+
		"\26\3\2\2\2\177}\3\2\2\2\u0080\u0081\t\b\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7d\2\2\u0084\u0088\3\2\2\2\u0085\u0087\t\3\2"+
		"\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0097\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\t\b\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7t\2\2\u008e\u008f\7d\2\2\u008f\u0093\3\2\2"+
		"\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0080\3\2\2\2\u0096\u008b\3\2\2\2\u0097\30\3\2\2\2\u0098\u0099\t\20\2"+
		"\2\u0099\u009a\7|\2\2\u009a\u009b\t\21\2\2\u009b\u009c\7e\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a9\7u\2\2\u00a0"+
		"\u00a1\t\20\2\2\u00a1\u00a5\t\22\2\2\u00a2\u00a4\t\23\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u0098\3\2\2\2\u00a8\u00a0\3\2"+
		"\2\2\u00a9\32\3\2\2\2\u00aa\u00ac\t\24\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7i\2\2\u00ae\34\3\2\2\2\u00af"+
		"\u00b0\t\25\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b6\3\2"+
		"\2\2\u00b3\u00b5\t\7\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\36\3\2\2\2\u00b8\u00b6\3\2\2"+
		"\2\u00b9\u00ba\t\26\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\20\2\2\u00bc"+
		" \3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\b\21\2\2\u00c3\"\3\2\2\2\25\2%-\64;KPW_e}\u0088\u0093\u0096\u00a5\u00a8"+
		"\u00ab\u00b6\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}