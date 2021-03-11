// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/textExtractor\labelGrammar.g4 by ANTLR 4.9.1
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
		NUMERO=1, GRASA=2, TOTALES=3, TOTAL=4, PROTEINAS=5, CARBOHIDRATOS=6, AZUCARES=7, 
		G=8, SODIO=9, WS=10, ANY=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERO", "GRASA", "TOTALES", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", 
			"AZUCARES", "G", "SODIO", "WS", "ANY"
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
			null, "NUMERO", "GRASA", "TOTALES", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", 
			"AZUCARES", "G", "SODIO", "WS", "ANY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rq\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bW\n\b\f\b\16\b"+
		"Z\13\b\5\b\\\n\b\3\t\5\t_\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\6\fn\n\f\r\f\16\fo\3o\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\3\2\17\3\2\62;\5\2IIii~~\5\2VVvv~~\5\2RRrr~~\6\2"+
		"kk~~\u00af\u00af\u00c5\u00c5\5\2EEee~~\5\2CCcc~~\6\2ww~~\u00bc\u00bc\u00c5"+
		"\u00c5\3\2||\6\2c|~~\u00bc\u00bc\u00c5\u00c5\3\2oo\5\2UUuu~~\6\2\13\f"+
		"\17\17\"\"<=\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\3\32\3\2\2\2\5\36\3\2\2\2\7$\3\2\2\2\t,\3\2\2\2\13\62\3"+
		"\2\2\2\r=\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23b\3\2\2\2\25h\3\2\2\2\27m"+
		"\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\4\3\2\2\2\36\37\t\3\2\2\37 \7t\2\2 !\7c\2\2!\"\7u\2\2\"#\7"+
		"c\2\2#\6\3\2\2\2$%\t\4\2\2%&\7q\2\2&\'\7v\2\2\'(\7c\2\2()\7n\2\2)*\7g"+
		"\2\2*+\7u\2\2+\b\3\2\2\2,-\t\4\2\2-.\7q\2\2./\7v\2\2/\60\7c\2\2\60\61"+
		"\7n\2\2\61\n\3\2\2\2\62\63\t\5\2\2\63\64\7t\2\2\64\65\7q\2\2\65\66\7v"+
		"\2\2\66\67\7g\2\2\678\3\2\2\289\t\6\2\29:\7p\2\2:;\7c\2\2;<\7u\2\2<\f"+
		"\3\2\2\2=>\t\7\2\2>?\7c\2\2?@\7t\2\2@A\7d\2\2AB\7q\2\2BC\7j\2\2CD\7k\2"+
		"\2DE\7f\2\2EF\7t\2\2FG\7c\2\2GH\7v\2\2HI\7q\2\2IJ\7u\2\2J\16\3\2\2\2K"+
		"L\t\b\2\2LM\7|\2\2MN\t\t\2\2NO\7e\2\2OP\7c\2\2PQ\7t\2\2QR\7g\2\2R\\\7"+
		"u\2\2ST\t\b\2\2TX\t\n\2\2UW\t\13\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[K\3\2\2\2[S\3\2\2\2\\\20\3\2\2\2]_\t\f\2\2"+
		"^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7i\2\2a\22\3\2\2\2bc\t\r\2\2cd\7q\2\2"+
		"de\7f\2\2ef\7k\2\2fg\7q\2\2g\24\3\2\2\2hi\t\16\2\2ij\3\2\2\2jk\b\13\2"+
		"\2k\26\3\2\2\2ln\13\2\2\2ml\3\2\2\2no\3\2\2\2op\3\2\2\2om\3\2\2\2p\30"+
		"\3\2\2\2\b\2\34X[^o\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}