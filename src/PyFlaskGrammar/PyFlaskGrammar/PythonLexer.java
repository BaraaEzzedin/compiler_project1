// Generated from /home/abdalrhman/Desktop/compiler_project1/src/PyFlaskGrammar/PythonLexer.g4 by ANTLR 4.13.2
package PyFlaskGrammar.PyFlaskGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, BOOL=3, PRINT=4, DEF=5, RETURN=6, IMPORT=7, FROM=8, 
		AND=9, OR=10, BREAK=11, CONTINUE=12, CLASS=13, AS=14, AT=15, ASSIGN=16, 
		COMMA=17, DOT=18, COLON=19, LPARENS=20, RPARENS=21, LSB=22, RSB=23, LBK=24, 
		RBK=25, ADD=26, SUB=27, MUL=28, DIV=29, LT=30, GT=31, LE=32, GE=33, EQ=34, 
		NE=35, IF=36, ELIF=37, ELSE=38, FOR=39, IN=40, WHILE=41, VAR=42, ID=43, 
		NUMBER=44, STRING=45, NEWLINE=46, WS=47, COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOL", "PRINT", "DEF", "RETURN", "IMPORT", "FROM", "AND", "OR", "BREAK", 
			"CONTINUE", "CLASS", "AS", "AT", "ASSIGN", "COMMA", "DOT", "COLON", "LPARENS", 
			"RPARENS", "LSB", "RSB", "LBK", "RBK", "ADD", "SUB", "MUL", "DIV", "LT", 
			"GT", "LE", "GE", "EQ", "NE", "IF", "ELIF", "ELSE", "FOR", "IN", "WHILE", 
			"VAR", "ID", "NUMBER", "DIGIT", "STRING", "NEWLINE", "WS", "COMMENT", 
			"SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'print'", "'def'", "'return'", "'import'", "'from'", 
			"'and'", "'or'", "'break'", "'continue'", "'class'", "'as'", "'@'", "'='", 
			"','", "'.'", "':'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'if'", 
			"'elif'", "'else'", "'for'", "'in'", "'while'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "BOOL", "PRINT", "DEF", "RETURN", "IMPORT", 
			"FROM", "AND", "OR", "BREAK", "CONTINUE", "CLASS", "AS", "AT", "ASSIGN", 
			"COMMA", "DOT", "COLON", "LPARENS", "RPARENS", "LSB", "RSB", "LBK", "RBK", 
			"ADD", "SUB", "MUL", "DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "IF", 
			"ELIF", "ELSE", "FOR", "IN", "WHILE", "VAR", "ID", "NUMBER", "STRING", 
			"NEWLINE", "WS", "COMMENT"
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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			LPARENS_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			RPARENS_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			LSB_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			RSB_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			LBK_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			RBK_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LPARENS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			this.openBrace();
			break;
		}
	}
	private void RPARENS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			this.closeBrace();
			break;
		}
	}
	private void LSB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			this.openBrace();
			break;
		}
	}
	private void RSB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			this.closeBrace();
			break;
		}
	}
	private void LBK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			this.openBrace();
			break;
		}
	}
	private void RBK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			this.closeBrace();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			this.onNewLine();
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00000\u015f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"t\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0005(\u0106\b(\n(\f(\u0109\t(\u0001"+
		")\u0004)\u010c\b)\u000b)\f)\u010d\u0001)\u0001)\u0004)\u0112\b)\u000b"+
		")\f)\u0113\u0003)\u0116\b)\u0001)\u0001)\u0003)\u011a\b)\u0001)\u0004"+
		")\u011d\b)\u000b)\f)\u011e\u0003)\u0121\b)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0005+\u0129\b+\n+\f+\u012c\t+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u0133\b+\n+\f+\u0136\t+\u0001+\u0003+\u0139\b+\u0001,"+
		"\u0001,\u0001,\u0003,\u013e\b,\u0001,\u0001,\u0003,\u0142\b,\u0001,\u0003"+
		",\u0145\b,\u0003,\u0147\b,\u0001,\u0001,\u0001-\u0004-\u014c\b-\u000b"+
		"-\f-\u014d\u0001-\u0001-\u0001.\u0001.\u0005.\u0154\b.\n.\f.\u0157\t."+
		"\u0001.\u0001.\u0001/\u0004/\u015c\b/\u000b/\f/\u015d\u0000\u00000\u0001"+
		"\u0003\u0003\u0004\u0005\u0005\u0007\u0006\t\u0007\u000b\b\r\t\u000f\n"+
		"\u0011\u000b\u0013\f\u0015\r\u0017\u000e\u0019\u000f\u001b\u0010\u001d"+
		"\u0011\u001f\u0012!\u0013#\u0014%\u0015\'\u0016)\u0017+\u0018-\u0019/"+
		"\u001a1\u001b3\u001c5\u001d7\u001e9\u001f; =!?\"A#C$E%G&I\'K(M)O*Q+S,"+
		"U\u0000W-Y.[/]0_\u0000\u0001\u0000\t\u0003\u0000AZ__az\u0004\u000009A"+
		"Z__az\u0002\u0000EEee\u0002\u0000++--\u0001\u000009\u0002\u0000\"\"\\"+
		"\\\u0002\u0000\'\'\\\\\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u0172\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000["+
		"\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0001s\u0001\u0000"+
		"\u0000\u0000\u0003u\u0001\u0000\u0000\u0000\u0005{\u0001\u0000\u0000\u0000"+
		"\u0007\u007f\u0001\u0000\u0000\u0000\t\u0086\u0001\u0000\u0000\u0000\u000b"+
		"\u008d\u0001\u0000\u0000\u0000\r\u0092\u0001\u0000\u0000\u0000\u000f\u0096"+
		"\u0001\u0000\u0000\u0000\u0011\u0099\u0001\u0000\u0000\u0000\u0013\u009f"+
		"\u0001\u0000\u0000\u0000\u0015\u00a8\u0001\u0000\u0000\u0000\u0017\u00ae"+
		"\u0001\u0000\u0000\u0000\u0019\u00b1\u0001\u0000\u0000\u0000\u001b\u00b3"+
		"\u0001\u0000\u0000\u0000\u001d\u00b5\u0001\u0000\u0000\u0000\u001f\u00b7"+
		"\u0001\u0000\u0000\u0000!\u00b9\u0001\u0000\u0000\u0000#\u00bb\u0001\u0000"+
		"\u0000\u0000%\u00be\u0001\u0000\u0000\u0000\'\u00c1\u0001\u0000\u0000"+
		"\u0000)\u00c4\u0001\u0000\u0000\u0000+\u00c7\u0001\u0000\u0000\u0000-"+
		"\u00ca\u0001\u0000\u0000\u0000/\u00cd\u0001\u0000\u0000\u00001\u00cf\u0001"+
		"\u0000\u0000\u00003\u00d1\u0001\u0000\u0000\u00005\u00d3\u0001\u0000\u0000"+
		"\u00007\u00d5\u0001\u0000\u0000\u00009\u00d7\u0001\u0000\u0000\u0000;"+
		"\u00d9\u0001\u0000\u0000\u0000=\u00dc\u0001\u0000\u0000\u0000?\u00df\u0001"+
		"\u0000\u0000\u0000A\u00e2\u0001\u0000\u0000\u0000C\u00e5\u0001\u0000\u0000"+
		"\u0000E\u00e8\u0001\u0000\u0000\u0000G\u00ed\u0001\u0000\u0000\u0000I"+
		"\u00f2\u0001\u0000\u0000\u0000K\u00f6\u0001\u0000\u0000\u0000M\u00f9\u0001"+
		"\u0000\u0000\u0000O\u00ff\u0001\u0000\u0000\u0000Q\u0103\u0001\u0000\u0000"+
		"\u0000S\u010b\u0001\u0000\u0000\u0000U\u0122\u0001\u0000\u0000\u0000W"+
		"\u0138\u0001\u0000\u0000\u0000Y\u0146\u0001\u0000\u0000\u0000[\u014b\u0001"+
		"\u0000\u0000\u0000]\u0151\u0001\u0000\u0000\u0000_\u015b\u0001\u0000\u0000"+
		"\u0000ab\u0005t\u0000\u0000bc\u0005r\u0000\u0000cd\u0005u\u0000\u0000"+
		"dt\u0005e\u0000\u0000ef\u0005f\u0000\u0000fg\u0005a\u0000\u0000gh\u0005"+
		"l\u0000\u0000hi\u0005s\u0000\u0000it\u0005e\u0000\u0000jk\u0005T\u0000"+
		"\u0000kl\u0005r\u0000\u0000lm\u0005u\u0000\u0000mt\u0005e\u0000\u0000"+
		"no\u0005F\u0000\u0000op\u0005a\u0000\u0000pq\u0005l\u0000\u0000qr\u0005"+
		"s\u0000\u0000rt\u0005e\u0000\u0000sa\u0001\u0000\u0000\u0000se\u0001\u0000"+
		"\u0000\u0000sj\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000t\u0002"+
		"\u0001\u0000\u0000\u0000uv\u0005p\u0000\u0000vw\u0005r\u0000\u0000wx\u0005"+
		"i\u0000\u0000xy\u0005n\u0000\u0000yz\u0005t\u0000\u0000z\u0004\u0001\u0000"+
		"\u0000\u0000{|\u0005d\u0000\u0000|}\u0005e\u0000\u0000}~\u0005f\u0000"+
		"\u0000~\u0006\u0001\u0000\u0000\u0000\u007f\u0080\u0005r\u0000\u0000\u0080"+
		"\u0081\u0005e\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082\u0083\u0005"+
		"u\u0000\u0000\u0083\u0084\u0005r\u0000\u0000\u0084\u0085\u0005n\u0000"+
		"\u0000\u0085\b\u0001\u0000\u0000\u0000\u0086\u0087\u0005i\u0000\u0000"+
		"\u0087\u0088\u0005m\u0000\u0000\u0088\u0089\u0005p\u0000\u0000\u0089\u008a"+
		"\u0005o\u0000\u0000\u008a\u008b\u0005r\u0000\u0000\u008b\u008c\u0005t"+
		"\u0000\u0000\u008c\n\u0001\u0000\u0000\u0000\u008d\u008e\u0005f\u0000"+
		"\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090"+
		"\u0091\u0005m\u0000\u0000\u0091\f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005a\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\u0095\u0005d"+
		"\u0000\u0000\u0095\u000e\u0001\u0000\u0000\u0000\u0096\u0097\u0005o\u0000"+
		"\u0000\u0097\u0098\u0005r\u0000\u0000\u0098\u0010\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005b\u0000\u0000\u009a\u009b\u0005r\u0000\u0000\u009b\u009c"+
		"\u0005e\u0000\u0000\u009c\u009d\u0005a\u0000\u0000\u009d\u009e\u0005k"+
		"\u0000\u0000\u009e\u0012\u0001\u0000\u0000\u0000\u009f\u00a0\u0005c\u0000"+
		"\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2\u0005n\u0000\u0000\u00a2"+
		"\u00a3\u0005t\u0000\u0000\u00a3\u00a4\u0005i\u0000\u0000\u00a4\u00a5\u0005"+
		"n\u0000\u0000\u00a5\u00a6\u0005u\u0000\u0000\u00a6\u00a7\u0005e\u0000"+
		"\u0000\u00a7\u0014\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005c\u0000\u0000"+
		"\u00a9\u00aa\u0005l\u0000\u0000\u00aa\u00ab\u0005a\u0000\u0000\u00ab\u00ac"+
		"\u0005s\u0000\u0000\u00ac\u00ad\u0005s\u0000\u0000\u00ad\u0016\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000"+
		"\u00b0\u0018\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005@\u0000\u0000\u00b2"+
		"\u001a\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b4\u001c"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005,\u0000\u0000\u00b6\u001e\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005.\u0000\u0000\u00b8 \u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005:\u0000\u0000\u00ba\"\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005(\u0000\u0000\u00bc\u00bd\u0006\u0011\u0000\u0000\u00bd"+
		"$\u0001\u0000\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf\u00c0\u0006"+
		"\u0012\u0001\u0000\u00c0&\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005[\u0000"+
		"\u0000\u00c2\u00c3\u0006\u0013\u0002\u0000\u00c3(\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005]\u0000\u0000\u00c5\u00c6\u0006\u0014\u0003\u0000\u00c6"+
		"*\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005{\u0000\u0000\u00c8\u00c9\u0006"+
		"\u0015\u0004\u0000\u00c9,\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005}\u0000"+
		"\u0000\u00cb\u00cc\u0006\u0016\u0005\u0000\u00cc.\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005+\u0000\u0000\u00ce0\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005-\u0000\u0000\u00d02\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005*"+
		"\u0000\u0000\u00d24\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005/\u0000\u0000"+
		"\u00d46\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005<\u0000\u0000\u00d68"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005>\u0000\u0000\u00d8:\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005<\u0000\u0000\u00da\u00db\u0005=\u0000\u0000"+
		"\u00db<\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005>\u0000\u0000\u00dd\u00de"+
		"\u0005=\u0000\u0000\u00de>\u0001\u0000\u0000\u0000\u00df\u00e0\u0005="+
		"\u0000\u0000\u00e0\u00e1\u0005=\u0000\u0000\u00e1@\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005!\u0000\u0000\u00e3\u00e4\u0005=\u0000\u0000\u00e4B"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005i\u0000\u0000\u00e6\u00e7\u0005"+
		"f\u0000\u0000\u00e7D\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005e\u0000"+
		"\u0000\u00e9\u00ea\u0005l\u0000\u0000\u00ea\u00eb\u0005i\u0000\u0000\u00eb"+
		"\u00ec\u0005f\u0000\u0000\u00ecF\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"e\u0000\u0000\u00ee\u00ef\u0005l\u0000\u0000\u00ef\u00f0\u0005s\u0000"+
		"\u0000\u00f0\u00f1\u0005e\u0000\u0000\u00f1H\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005f\u0000\u0000\u00f3\u00f4\u0005o\u0000\u0000\u00f4\u00f5\u0005"+
		"r\u0000\u0000\u00f5J\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005i\u0000"+
		"\u0000\u00f7\u00f8\u0005n\u0000\u0000\u00f8L\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005w\u0000\u0000\u00fa\u00fb\u0005h\u0000\u0000\u00fb\u00fc\u0005"+
		"i\u0000\u0000\u00fc\u00fd\u0005l\u0000\u0000\u00fd\u00fe\u0005e\u0000"+
		"\u0000\u00feN\u0001\u0000\u0000\u0000\u00ff\u0100\u0005v\u0000\u0000\u0100"+
		"\u0101\u0005a\u0000\u0000\u0101\u0102\u0005r\u0000\u0000\u0102P\u0001"+
		"\u0000\u0000\u0000\u0103\u0107\u0007\u0000\u0000\u0000\u0104\u0106\u0007"+
		"\u0001\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108R\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0003U*\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0115\u0001\u0000\u0000\u0000"+
		"\u010f\u0111\u0005.\u0000\u0000\u0110\u0112\u0003U*\u0000\u0111\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0001\u0000\u0000\u0000\u0115\u010f\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0120\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0007\u0002\u0000\u0000\u0118\u011a\u0007\u0003\u0000\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0003U*\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000"+
		"\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121T\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0004\u0000"+
		"\u0000\u0123V\u0001\u0000\u0000\u0000\u0124\u012a\u0005\"\u0000\u0000"+
		"\u0125\u0129\b\u0005\u0000\u0000\u0126\u0127\u0005\\\u0000\u0000\u0127"+
		"\u0129\t\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d"+
		"\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0139"+
		"\u0005\"\u0000\u0000\u012e\u0134\u0005\'\u0000\u0000\u012f\u0133\b\u0006"+
		"\u0000\u0000\u0130\u0131\u0005\\\u0000\u0000\u0131\u0133\t\u0000\u0000"+
		"\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0139\u0005\'\u0000\u0000"+
		"\u0138\u0124\u0001\u0000\u0000\u0000\u0138\u012e\u0001\u0000\u0000\u0000"+
		"\u0139X\u0001\u0000\u0000\u0000\u013a\u013b\u0004,\u0000\u0000\u013b\u0147"+
		"\u0003_/\u0000\u013c\u013e\u0005\r\u0000\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0142\u0005\n\u0000\u0000\u0140\u0142\u0002\f\r\u0000"+
		"\u0141\u013d\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0145\u0003_/\u0000\u0144\u0143"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147"+
		"\u0001\u0000\u0000\u0000\u0146\u013a\u0001\u0000\u0000\u0000\u0146\u0141"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0006,\u0006\u0000\u0149Z\u0001\u0000\u0000\u0000\u014a\u014c\u0007\u0007"+
		"\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0006-\u0007"+
		"\u0000\u0150\\\u0001\u0000\u0000\u0000\u0151\u0155\u0005#\u0000\u0000"+
		"\u0152\u0154\b\b\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u0159\u0006.\u0007\u0000\u0159^\u0001"+
		"\u0000\u0000\u0000\u015a\u015c\u0007\u0007\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e`\u0001\u0000"+
		"\u0000\u0000\u0015\u0000s\u0107\u010d\u0113\u0115\u0119\u011e\u0120\u0128"+
		"\u012a\u0132\u0134\u0138\u013d\u0141\u0144\u0146\u014d\u0155\u015d\b\u0001"+
		"\u0011\u0000\u0001\u0012\u0001\u0001\u0013\u0002\u0001\u0014\u0003\u0001"+
		"\u0015\u0004\u0001\u0016\u0005\u0001,\u0006\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
	private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	// The stack that keeps track of the indentation level.
	private Deque<Integer> indents = new ArrayDeque<>();
	// The amount of opened braces, brackets and parenthesis.
	private int opened = 0;
	// The most recently produced token.
	private Token lastToken = null;

	@Override
	public void emit(Token t) {
		super.setToken(t);
		tokens.offer(t);
	}

	@Override
	public Token nextToken() {
		// Check if the end-of-file is ahead and there are still some DEDENTS expected.
		if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
			// Remove any trailing EOF tokens from our buffer.
			for (int i = tokens.size() - 1; i >= 0; i--) {
				if (tokens.get(i).getType() == EOF) {
					tokens.remove(i);
				}
			}

			// First emit an extra line break that serves as the end of the statement.
			this.emit(commonToken(PythonLexer.NEWLINE, "\n"));

			// Now emit as much DEDENT tokens as needed.
			while (!indents.isEmpty()) {
				this.emit(createDedent());
				indents.pop();
			}

			// Put the EOF back on the token stream.
			this.emit(commonToken(PythonLexer.EOF, "<EOF>"));
		}

		Token next = super.nextToken();

		if (next.getChannel() == Token.DEFAULT_CHANNEL) {
			// Keep track of the last token on the default channel.
			this.lastToken = next;
		}

		return tokens.isEmpty() ? next : tokens.poll();
	}

	private Token createDedent() {
		CommonToken dedent = commonToken(PythonLexer.DEDENT, "");
		dedent.setLine(this.lastToken.getLine());
		return dedent;
	}

	private CommonToken commonToken(int type, String text) {
		int stop = this.getCharIndex() - 1;
		int start = text.isEmpty() ? stop : stop - text.length() + 1;
		return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	}

	// Calculates the indentation of the provided spaces, taking the
	// following rules into account:
	//
	// "Tabs are replaced (from left to right) by one to eight spaces
	//  such that the total number of characters up to and including
	//  the replacement is a multiple of eight [...]"
	//
	//  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	static int getIndentationCount(String spaces) {
		int count = 0;
		for (char ch : spaces.toCharArray()) {
			switch (ch) {
				case '\t':
					count += 8 - (count % 8);
					break;
				default:
					// A normal space char.
					count++;
			}
		}

		return count;
	}

	boolean atStartOfInput() {
		return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	}

	void openBrace(){
		this.opened++;
	}

	void closeBrace(){
		this.opened--;
	}

	void onNewLine(){
		String newLine = getText().replaceAll("[^\r\n\f]+", "");
		String spaces = getText().replaceAll("[\r\n\f]+", "");

		// Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
		// satisfy the final newline needed by the single_put rule used by the REPL.
		int next = _input.LA(1);
		int nextnext = _input.LA(2);
		if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
			// If we're inside a list or on a blank line, ignore all indents,
			// dedents and line breaks.
			skip();
		}
		else {
			emit(commonToken(PythonLexer.NEWLINE, newLine));
			int indent = getIndentationCount(spaces);
			int previous = indents.isEmpty() ? 0 : indents.peek();
			if (indent == previous) {
				// skip indents of the same size as the present indent-size
				skip();
			}
			else if (indent > previous) {
				indents.push(indent);
				emit(commonToken(PythonLexer.INDENT, spaces));
			}
			else {
				// Possibly emit more than 1 DEDENT token.
				while(!indents.isEmpty() && indents.peek() > indent) {
					this.emit(createDedent());
					indents.pop();
				}
			}
		}
	}

	@Override
	public void reset()
	{
		tokens = new java.util.LinkedList<>();
		indents = new ArrayDeque<>();
		opened = 0;
		lastToken = null;
		super.reset();
	}
}