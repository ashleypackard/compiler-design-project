// Generated from PL0.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PL0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ODD=1, CALL=2, BANG=3, OR=4, AND=5, EQ=6, NEQ=7, GT=8, LT=9, GTE=10, LTE=11, 
		PLUS=12, MINUS=13, MULT=14, DIV=15, CASSIGN=16, ASSIGN=17, OPAR=18, CPAR=19, 
		COMMA=20, SEMIC=21, DOT=22, TRUE=23, FALSE=24, IF=25, ELSE=26, WHILE=27, 
		DO=28, THEN=29, BEGIN=30, END=31, PROCEDURE=32, VAR=33, CONST=34, Ident=35, 
		Number=36, ALPHA=37, DIGIT=38, WS=39, Comment=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('"
	};
	public static final String[] ruleNames = {
		"ODD", "CALL", "BANG", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", 
		"PLUS", "MINUS", "MULT", "DIV", "CASSIGN", "ASSIGN", "OPAR", "CPAR", "COMMA", 
		"SEMIC", "DOT", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "DO", "THEN", 
		"BEGIN", "END", "PROCEDURE", "VAR", "CONST", "Ident", "Number", "ALPHA", 
		"DIGIT", "WS", "Comment"
	};


	public PL0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PL0.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\7$\u00ce\n$\f$\16$\u00d1\13$\3%\6%\u00d4\n%"+
		"\r%\16%\u00d5\3&\3&\3\'\3\'\3(\6(\u00dd\n(\r(\16(\u00de\3(\3(\3)\3)\7"+
		")\u00e5\n)\f)\16)\u00e8\13)\3)\3)\3)\3)\3\u00e6\2*\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u00f1\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5W\3\2\2\2\7\\\3\2\2\2\t"+
		"^\3\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17g\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25"+
		"n\3\2\2\2\27q\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2"+
		"!|\3\2\2\2#~\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0087"+
		"\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u0090\3\2\2\2\63\u0096\3\2\2"+
		"\2\65\u0099\3\2\2\2\67\u009e\3\2\2\29\u00a4\3\2\2\2;\u00a7\3\2\2\2=\u00ac"+
		"\3\2\2\2?\u00b2\3\2\2\2A\u00b6\3\2\2\2C\u00c0\3\2\2\2E\u00c4\3\2\2\2G"+
		"\u00ca\3\2\2\2I\u00d3\3\2\2\2K\u00d7\3\2\2\2M\u00d9\3\2\2\2O\u00dc\3\2"+
		"\2\2Q\u00e2\3\2\2\2ST\7q\2\2TU\7f\2\2UV\7f\2\2V\4\3\2\2\2WX\7e\2\2XY\7"+
		"c\2\2YZ\7n\2\2Z[\7n\2\2[\6\3\2\2\2\\]\7#\2\2]\b\3\2\2\2^_\7~\2\2_`\7~"+
		"\2\2`\n\3\2\2\2ab\7(\2\2bc\7(\2\2c\f\3\2\2\2de\7?\2\2ef\7?\2\2f\16\3\2"+
		"\2\2gh\7#\2\2hi\7?\2\2i\20\3\2\2\2jk\7@\2\2k\22\3\2\2\2lm\7>\2\2m\24\3"+
		"\2\2\2no\7@\2\2op\7?\2\2p\26\3\2\2\2qr\7>\2\2rs\7?\2\2s\30\3\2\2\2tu\7"+
		"-\2\2u\32\3\2\2\2vw\7/\2\2w\34\3\2\2\2xy\7,\2\2y\36\3\2\2\2z{\7\61\2\2"+
		"{ \3\2\2\2|}\7?\2\2}\"\3\2\2\2~\177\7<\2\2\177\u0080\7?\2\2\u0080$\3\2"+
		"\2\2\u0081\u0082\7*\2\2\u0082&\3\2\2\2\u0083\u0084\7+\2\2\u0084(\3\2\2"+
		"\2\u0085\u0086\7.\2\2\u0086*\3\2\2\2\u0087\u0088\7=\2\2\u0088,\3\2\2\2"+
		"\u0089\u008a\7\60\2\2\u008a.\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d\7"+
		"t\2\2\u008d\u008e\7w\2\2\u008e\u008f\7g\2\2\u008f\60\3\2\2\2\u0090\u0091"+
		"\7h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7g\2\2\u0095\62\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098"+
		"\64\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7g\2\2\u009d\66\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7j\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a38\3\2\2\2\u00a4"+
		"\u00a5\7f\2\2\u00a5\u00a6\7q\2\2\u00a6:\3\2\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7j\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7p\2\2\u00ab<\3\2\2\2\u00ac"+
		"\u00ad\7d\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7k\2\2"+
		"\u00b0\u00b1\7p\2\2\u00b1>\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2"+
		"\2\u00b4\u00b5\7f\2\2\u00b5@\3\2\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8\7"+
		"t\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc"+
		"\7f\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"B\3\2\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"D\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7p\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9F\3\2\2\2\u00ca\u00cf\5K&\2\u00cb"+
		"\u00ce\5K&\2\u00cc\u00ce\5M\'\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0H"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5M\'\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6J\3\2\2\2"+
		"\u00d7\u00d8\t\2\2\2\u00d8L\3\2\2\2\u00d9\u00da\4\62;\2\u00daN\3\2\2\2"+
		"\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b(\2\2\u00e1"+
		"P\3\2\2\2\u00e2\u00e6\7}\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00ec\b)\2\2\u00ecR\3\2\2\2\b\2\u00cd\u00cf\u00d5\u00de\u00e6\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}