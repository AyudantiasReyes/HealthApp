// Generated from C:/Users/Omar Valdivia/Documents/GitHub/HealthApp/vision/final/app/src/main/java/com/google/firebase/codelab/parserPackage\labelParser.g4 by ANTLR 4.9.1
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
public class labelParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, CALORIAS=2, GRASA=3, TOTAL=4, PROTEINAS=5, CARBOHIDRATOS=6, 
		AZUCARES=7, G=8, SODIO=9, SEMICOLON=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMERO", "CALORIAS", "GRASA", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", 
			"AZUCARES", "G", "SODIO", "SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "CALORIAS", "GRASA", "TOTAL", "PROTEINAS", "CARBOHIDRATOS", 
			"AZUCARES", "G", "SODIO", "SEMICOLON"
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


	public labelParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "labelParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fi\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\31\n\2\r\2\16\2\32\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"Y\n\b\3\t\5\t\\\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\13\3\2\62;\5"+
		"\2EEee~~\3\2uu\5\2IIii~~\5\2VVvv~~\5\2RRrr~~\5\2CCcc~~\3\2oo\5\2UUuu~"+
		"~\2n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2"+
		"\2\2\5\34\3\2\2\2\7\'\3\2\2\2\t-\3\2\2\2\13\63\3\2\2\2\r?\3\2\2\2\17O"+
		"\3\2\2\2\21[\3\2\2\2\23_\3\2\2\2\25e\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2"+
		"\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\4\3\2\2\2\34\35\t\3\2"+
		"\2\35\36\7c\2\2\36\37\7n\2\2\37 \7q\2\2 !\7t\2\2!\"\7k\2\2\"#\7c\2\2#"+
		"%\3\2\2\2$&\t\4\2\2%$\3\2\2\2%&\3\2\2\2&\6\3\2\2\2\'(\t\5\2\2()\7t\2\2"+
		")*\7c\2\2*+\7u\2\2+,\7c\2\2,\b\3\2\2\2-.\t\6\2\2./\7q\2\2/\60\7v\2\2\60"+
		"\61\7c\2\2\61\62\7n\2\2\62\n\3\2\2\2\63\64\t\7\2\2\64\65\7t\2\2\65\66"+
		"\7q\2\2\66\67\7v\2\2\678\7g\2\289\7k\2\29:\7p\2\2:;\7c\2\2;=\3\2\2\2<"+
		">\t\4\2\2=<\3\2\2\2=>\3\2\2\2>\f\3\2\2\2?@\t\3\2\2@A\7c\2\2AB\7t\2\2B"+
		"C\7d\2\2CD\7q\2\2DE\7j\2\2EF\7k\2\2FG\7f\2\2GH\7t\2\2HI\7c\2\2IJ\7v\2"+
		"\2JK\7q\2\2KM\3\2\2\2LN\t\4\2\2ML\3\2\2\2MN\3\2\2\2N\16\3\2\2\2OP\t\b"+
		"\2\2PQ\7|\2\2QR\7w\2\2RS\7e\2\2ST\7c\2\2TU\7t\2\2UV\7g\2\2VX\3\2\2\2W"+
		"Y\t\4\2\2XW\3\2\2\2XY\3\2\2\2Y\20\3\2\2\2Z\\\t\t\2\2[Z\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2]^\7i\2\2^\22\3\2\2\2_`\t\n\2\2`a\7q\2\2ab\7f\2\2bc\7k"+
		"\2\2cd\7q\2\2d\24\3\2\2\2ef\7=\2\2fg\3\2\2\2gh\b\13\2\2h\26\3\2\2\2\t"+
		"\2\32%=MX[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}