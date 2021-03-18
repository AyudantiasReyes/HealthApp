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
		NUMERO=1, ACCENT=2, NOACCENT=3, VOWEL=4, TAMANODEPORCION=5, OZ=6, EMPAQUE=7, 
		CALORIAS=8, GRASA=9, TOTAL=10, CARBOHIDRATOS=11, AZUCARES=12, SODIO=13, 
		PROTEINAS=14, G=15, WS=16, ANY=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERO", "ACCENT", "NOACCENT", "VOWEL", "TAMANODEPORCION", "OZ", "EMPAQUE", 
			"CALORIAS", "GRASA", "TOTAL", "CARBOHIDRATOS", "AZUCARES", "SODIO", "PROTEINAS", 
			"G", "WS", "ANY"
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
			null, "NUMERO", "ACCENT", "NOACCENT", "VOWEL", "TAMANODEPORCION", "OZ", 
			"EMPAQUE", "CALORIAS", "GRASA", "TOTAL", "CARBOHIDRATOS", "AZUCARES", 
			"SODIO", "PROTEINAS", "G", "WS", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\5"+
		"\4\64\n\4\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"g\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\13\5\13r\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20\u009d\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\6\22\u00a6\n\22\r\22\16\22\u00a7\3\22\3\22\3\u00a7\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23\3\2\24\3\2\62;\b\2~~\u00a3\u00a3\u00ab\u00ab\u00af\u00af"+
		"\u00b5\u00b5\u00c5\u00c5\7\2~~\u00c5\u00c5\u201e\u201e\u2032\u2032\uffff"+
		"\uffff\r\2CCGGKKQQWWccggkkqqww~~\5\2VVvv~~\6\2pp~~\u00b3\u00b3\u00c5\u00c5"+
		"\5\2RRrr~~\4\2qq||\5\2GGgg~~\5\2EEee~~\5\2NNnn~~\5\2TTtt~~\5\2UUuu~~\5"+
		"\2IIii~~\5\2CCcc~~\5\2pp||~~\3\2oo\b\2\13\f\17\17\"\"\'\'//<=\2\u00b4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3&\3\2\2\2\5\60\3\2\2\2\7\63\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\rL"+
		"\3\2\2\2\17N\3\2\2\2\21W\3\2\2\2\23`\3\2\2\2\25h\3\2\2\2\27s\3\2\2\2\31"+
		"\u0083\3\2\2\2\33\u008c\3\2\2\2\35\u0092\3\2\2\2\37\u009c\3\2\2\2!\u00a0"+
		"\3\2\2\2#\u00a5\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)\4\3\2\2\2*\61\t\3\2\2+,\7\u00c5\2\2,\61\7\u00bc\2\2-\61\t\4\2"+
		"\2./\7\u00c5\2\2/\61\7\u0163\2\2\60*\3\2\2\2\60+\3\2\2\2\60-\3\2\2\2\60"+
		".\3\2\2\2\61\6\3\2\2\2\62\64\t\5\2\2\63\62\3\2\2\2\64\b\3\2\2\2\658\5"+
		"\5\3\2\668\5\7\4\2\67\65\3\2\2\2\67\66\3\2\2\28\n\3\2\2\29:\t\6\2\2:;"+
		"\5\t\5\2;<\7o\2\2<=\5\t\5\2=>\t\7\2\2>?\5\t\5\2?@\7f\2\2@A\5\t\5\2AB\7"+
		"n\2\2BC\5\t\5\2CD\t\b\2\2DE\5\t\5\2EF\7t\2\2FG\7e\2\2GH\3\2\2\2HI\5\t"+
		"\5\2IJ\5\t\5\2JK\7p\2\2K\f\3\2\2\2LM\t\t\2\2M\16\3\2\2\2NO\t\n\2\2OP\7"+
		"o\2\2PQ\7r\2\2QR\3\2\2\2RS\5\t\5\2ST\7s\2\2TU\5\t\5\2UV\5\t\5\2V\20\3"+
		"\2\2\2WX\t\13\2\2XY\5\t\5\2YZ\t\f\2\2Z[\5\t\5\2[\\\t\r\2\2\\]\5\t\5\2"+
		"]^\5\t\5\2^_\t\16\2\2_\22\3\2\2\2`a\t\17\2\2ab\7t\2\2bc\5\t\5\2cd\7u\2"+
		"\2df\5\t\5\2eg\7u\2\2fe\3\2\2\2fg\3\2\2\2g\24\3\2\2\2hi\t\6\2\2ij\5\t"+
		"\5\2jk\7v\2\2kl\5\t\5\2ln\7n\2\2mo\5\t\5\2nm\3\2\2\2no\3\2\2\2oq\3\2\2"+
		"\2pr\7u\2\2qp\3\2\2\2qr\3\2\2\2r\26\3\2\2\2st\t\13\2\2tu\5\t\5\2uv\7t"+
		"\2\2vw\7d\2\2wx\3\2\2\2xy\5\t\5\2yz\7j\2\2z{\5\t\5\2{|\7f\2\2|}\7t\2\2"+
		"}~\3\2\2\2~\177\5\t\5\2\177\u0080\7v\2\2\u0080\u0081\5\t\5\2\u0081\u0082"+
		"\7u\2\2\u0082\30\3\2\2\2\u0083\u0084\t\20\2\2\u0084\u0085\t\21\2\2\u0085"+
		"\u0086\5\t\5\2\u0086\u0087\7e\2\2\u0087\u0088\5\t\5\2\u0088\u0089\7t\2"+
		"\2\u0089\u008a\5\t\5\2\u008a\u008b\7u\2\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\t\16\2\2\u008d\u008e\5\t\5\2\u008e\u008f\7f\2\2\u008f\u0090\5\t\5\2\u0090"+
		"\u0091\5\t\5\2\u0091\34\3\2\2\2\u0092\u0093\t\b\2\2\u0093\u0094\7t\2\2"+
		"\u0094\u0095\5\t\5\2\u0095\u0096\7v\2\2\u0096\u0097\5\t\5\2\u0097\u0098"+
		"\5\t\5\2\u0098\u0099\7p\2\2\u0099\u009a\5\t\5\2\u009a\36\3\2\2\2\u009b"+
		"\u009d\t\22\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u009f\7i\2\2\u009f \3\2\2\2\u00a0\u00a1\t\23\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\b\21\2\2\u00a3\"\3\2\2\2\u00a4\u00a6\13\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\22\2\2\u00aa$\3\2\2\2\f\2(\60\63"+
		"\67fnq\u009c\u00a7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}