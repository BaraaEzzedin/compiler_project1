// Generated from /home/abdalrhman/Desktop/compiler_project1/src/PyFlaskGrammar/PythonLexer.g4 by ANTLR 4.13.2
package PyFlaskGrammar.PyFlaskGrammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            INDENT = 1, DEDENT = 2, BOOL = 3, PRINT = 4, DEF = 5, RETURN = 6, IMPORT = 7, FROM = 8,
            AND = 9, OR = 10, BREAK = 11, CONTINUE = 12, CLASS = 13, GLOBAL = 14, AS = 15, AT = 16,
            ASSIGN = 17, COMMA = 18, DOT = 19, COLON = 20, LPARENS = 21, RPARENS = 22, LSB = 23,
            RSB = 24, LBK = 25, RBK = 26, ADD = 27, SUB = 28, MUL = 29, DIV = 30, LT = 31, GT = 32,
            LE = 33, GE = 34, EQ = 35, NE = 36, IF = 37, ELIF = 38, ELSE = 39, FOR = 40, IN = 41, WHILE = 42,
            VAR = 43, ID = 44, NUMBER = 45, STRING = 46, NEWLINE = 47, WS = 48, COMMENT = 49;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "BOOL", "PRINT", "DEF", "RETURN", "IMPORT", "FROM", "AND", "OR", "BREAK",
                "CONTINUE", "CLASS", "GLOBAL", "AS", "AT", "ASSIGN", "COMMA", "DOT",
                "COLON", "LPARENS", "RPARENS", "LSB", "RSB", "LBK", "RBK", "ADD", "SUB",
                "MUL", "DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "IF", "ELIF", "ELSE",
                "FOR", "IN", "WHILE", "VAR", "ID", "NUMBER", "DIGIT", "STRING", "NEWLINE",
                "WS", "COMMENT", "SPACES"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, "'print'", "'def'", "'return'", "'import'", "'from'",
                "'and'", "'or'", "'break'", "'continue'", "'class'", "'global'", "'as'",
                "'@'", "'='", "','", "'.'", "':'", "'('", "')'", "'['", "']'", "'{'",
                "'}'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='",
                "'!='", "'if'", "'elif'", "'else'", "'for'", "'in'", "'while'", "'var'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "INDENT", "DEDENT", "BOOL", "PRINT", "DEF", "RETURN", "IMPORT",
                "FROM", "AND", "OR", "BREAK", "CONTINUE", "CLASS", "GLOBAL", "AS", "AT",
                "ASSIGN", "COMMA", "DOT", "COLON", "LPARENS", "RPARENS", "LSB", "RSB",
                "LBK", "RBK", "ADD", "SUB", "MUL", "DIV", "LT", "GT", "LE", "GE", "EQ",
                "NE", "IF", "ELIF", "ELSE", "FOR", "IN", "WHILE", "VAR", "ID", "NUMBER",
                "STRING", "NEWLINE", "WS", "COMMENT"
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "PythonLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 18:
                LPARENS_action((RuleContext) _localctx, actionIndex);
                break;
            case 19:
                RPARENS_action((RuleContext) _localctx, actionIndex);
                break;
            case 20:
                LSB_action((RuleContext) _localctx, actionIndex);
                break;
            case 21:
                RSB_action((RuleContext) _localctx, actionIndex);
                break;
            case 22:
                LBK_action((RuleContext) _localctx, actionIndex);
                break;
            case 23:
                RBK_action((RuleContext) _localctx, actionIndex);
                break;
            case 45:
                NEWLINE_action((RuleContext) _localctx, actionIndex);
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
            case 45:
                return NEWLINE_sempred((RuleContext) _localctx, predIndex);
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
            "\u0004\u00001\u0168\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002" +
                    "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002" +
                    "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002" +
                    "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002" +
                    "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007" +
                    "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007" +
                    "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007" +
                    "+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007" +
                    "0\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0003\u0000v\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
                    "\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001" +
                    "\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f" +
                    "\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014" +
                    "\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016" +
                    "\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018" +
                    "\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b" +
                    "\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e" +
                    "\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 " +
                    "\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001" +
                    "#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001" +
                    "%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'" +
                    "\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0005)\u010f\b)\n)\f)\u0112" +
                    "\t)\u0001*\u0004*\u0115\b*\u000b*\f*\u0116\u0001*\u0001*\u0004*\u011b" +
                    "\b*\u000b*\f*\u011c\u0003*\u011f\b*\u0001*\u0001*\u0003*\u0123\b*\u0001" +
                    "*\u0004*\u0126\b*\u000b*\f*\u0127\u0003*\u012a\b*\u0001+\u0001+\u0001" +
                    ",\u0001,\u0001,\u0001,\u0005,\u0132\b,\n,\f,\u0135\t,\u0001,\u0001,\u0001" +
                    ",\u0001,\u0001,\u0005,\u013c\b,\n,\f,\u013f\t,\u0001,\u0003,\u0142\b," +
                    "\u0001-\u0001-\u0001-\u0003-\u0147\b-\u0001-\u0001-\u0003-\u014b\b-\u0001" +
                    "-\u0003-\u014e\b-\u0003-\u0150\b-\u0001-\u0001-\u0001.\u0004.\u0155\b" +
                    ".\u000b.\f.\u0156\u0001.\u0001.\u0001/\u0001/\u0005/\u015d\b/\n/\f/\u0160" +
                    "\t/\u0001/\u0001/\u00010\u00040\u0165\b0\u000b0\f0\u0166\u0000\u00001" +
                    "\u0001\u0003\u0003\u0004\u0005\u0005\u0007\u0006\t\u0007\u000b\b\r\t\u000f" +
                    "\n\u0011\u000b\u0013\f\u0015\r\u0017\u000e\u0019\u000f\u001b\u0010\u001d" +
                    "\u0011\u001f\u0012!\u0013#\u0014%\u0015\'\u0016)\u0017+\u0018-\u0019/" +
                    "\u001a1\u001b3\u001c5\u001d7\u001e9\u001f; =!?\"A#C$E%G&I\'K(M)O*Q+S," +
                    "U-W\u0000Y.[/]0_1a\u0000\u0001\u0000\t\u0003\u0000AZ__az\u0004\u00000" +
                    "9AZ__az\u0002\u0000EEee\u0002\u0000++--\u0001\u000009\u0002\u0000\"\"" +
                    "\\\\\u0002\u0000\'\'\\\\\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u017b\u0000" +
                    "\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000" +
                    "\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000" +
                    "\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r" +
                    "\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011" +
                    "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015" +
                    "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019" +
                    "\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d" +
                    "\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001" +
                    "\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000" +
                    "\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000" +
                    "\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/" +
                    "\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000" +
                    "\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000" +
                    "\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=" +
                    "\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000" +
                    "\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000" +
                    "\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K" +
                    "\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000" +
                    "\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000" +
                    "\u0000U\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[" +
                    "\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000" +
                    "\u0000\u0000\u0001u\u0001\u0000\u0000\u0000\u0003w\u0001\u0000\u0000\u0000" +
                    "\u0005}\u0001\u0000\u0000\u0000\u0007\u0081\u0001\u0000\u0000\u0000\t" +
                    "\u0088\u0001\u0000\u0000\u0000\u000b\u008f\u0001\u0000\u0000\u0000\r\u0094" +
                    "\u0001\u0000\u0000\u0000\u000f\u0098\u0001\u0000\u0000\u0000\u0011\u009b" +
                    "\u0001\u0000\u0000\u0000\u0013\u00a1\u0001\u0000\u0000\u0000\u0015\u00aa" +
                    "\u0001\u0000\u0000\u0000\u0017\u00b0\u0001\u0000\u0000\u0000\u0019\u00b7" +
                    "\u0001\u0000\u0000\u0000\u001b\u00ba\u0001\u0000\u0000\u0000\u001d\u00bc" +
                    "\u0001\u0000\u0000\u0000\u001f\u00be\u0001\u0000\u0000\u0000!\u00c0\u0001" +
                    "\u0000\u0000\u0000#\u00c2\u0001\u0000\u0000\u0000%\u00c4\u0001\u0000\u0000" +
                    "\u0000\'\u00c7\u0001\u0000\u0000\u0000)\u00ca\u0001\u0000\u0000\u0000" +
                    "+\u00cd\u0001\u0000\u0000\u0000-\u00d0\u0001\u0000\u0000\u0000/\u00d3" +
                    "\u0001\u0000\u0000\u00001\u00d6\u0001\u0000\u0000\u00003\u00d8\u0001\u0000" +
                    "\u0000\u00005\u00da\u0001\u0000\u0000\u00007\u00dc\u0001\u0000\u0000\u0000" +
                    "9\u00de\u0001\u0000\u0000\u0000;\u00e0\u0001\u0000\u0000\u0000=\u00e2" +
                    "\u0001\u0000\u0000\u0000?\u00e5\u0001\u0000\u0000\u0000A\u00e8\u0001\u0000" +
                    "\u0000\u0000C\u00eb\u0001\u0000\u0000\u0000E\u00ee\u0001\u0000\u0000\u0000" +
                    "G\u00f1\u0001\u0000\u0000\u0000I\u00f6\u0001\u0000\u0000\u0000K\u00fb" +
                    "\u0001\u0000\u0000\u0000M\u00ff\u0001\u0000\u0000\u0000O\u0102\u0001\u0000" +
                    "\u0000\u0000Q\u0108\u0001\u0000\u0000\u0000S\u010c\u0001\u0000\u0000\u0000" +
                    "U\u0114\u0001\u0000\u0000\u0000W\u012b\u0001\u0000\u0000\u0000Y\u0141" +
                    "\u0001\u0000\u0000\u0000[\u014f\u0001\u0000\u0000\u0000]\u0154\u0001\u0000" +
                    "\u0000\u0000_\u015a\u0001\u0000\u0000\u0000a\u0164\u0001\u0000\u0000\u0000" +
                    "cd\u0005t\u0000\u0000de\u0005r\u0000\u0000ef\u0005u\u0000\u0000fv\u0005" +
                    "e\u0000\u0000gh\u0005f\u0000\u0000hi\u0005a\u0000\u0000ij\u0005l\u0000" +
                    "\u0000jk\u0005s\u0000\u0000kv\u0005e\u0000\u0000lm\u0005T\u0000\u0000" +
                    "mn\u0005r\u0000\u0000no\u0005u\u0000\u0000ov\u0005e\u0000\u0000pq\u0005" +
                    "F\u0000\u0000qr\u0005a\u0000\u0000rs\u0005l\u0000\u0000st\u0005s\u0000" +
                    "\u0000tv\u0005e\u0000\u0000uc\u0001\u0000\u0000\u0000ug\u0001\u0000\u0000" +
                    "\u0000ul\u0001\u0000\u0000\u0000up\u0001\u0000\u0000\u0000v\u0002\u0001" +
                    "\u0000\u0000\u0000wx\u0005p\u0000\u0000xy\u0005r\u0000\u0000yz\u0005i" +
                    "\u0000\u0000z{\u0005n\u0000\u0000{|\u0005t\u0000\u0000|\u0004\u0001\u0000" +
                    "\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005e\u0000\u0000\u007f\u0080" +
                    "\u0005f\u0000\u0000\u0080\u0006\u0001\u0000\u0000\u0000\u0081\u0082\u0005" +
                    "r\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\u0084\u0005t\u0000" +
                    "\u0000\u0084\u0085\u0005u\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086" +
                    "\u0087\u0005n\u0000\u0000\u0087\b\u0001\u0000\u0000\u0000\u0088\u0089" +
                    "\u0005i\u0000\u0000\u0089\u008a\u0005m\u0000\u0000\u008a\u008b\u0005p" +
                    "\u0000\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005r\u0000\u0000" +
                    "\u008d\u008e\u0005t\u0000\u0000\u008e\n\u0001\u0000\u0000\u0000\u008f" +
                    "\u0090\u0005f\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092\u0005" +
                    "o\u0000\u0000\u0092\u0093\u0005m\u0000\u0000\u0093\f\u0001\u0000\u0000" +
                    "\u0000\u0094\u0095\u0005a\u0000\u0000\u0095\u0096\u0005n\u0000\u0000\u0096" +
                    "\u0097\u0005d\u0000\u0000\u0097\u000e\u0001\u0000\u0000\u0000\u0098\u0099" +
                    "\u0005o\u0000\u0000\u0099\u009a\u0005r\u0000\u0000\u009a\u0010\u0001\u0000" +
                    "\u0000\u0000\u009b\u009c\u0005b\u0000\u0000\u009c\u009d\u0005r\u0000\u0000" +
                    "\u009d\u009e\u0005e\u0000\u0000\u009e\u009f\u0005a\u0000\u0000\u009f\u00a0" +
                    "\u0005k\u0000\u0000\u00a0\u0012\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005" +
                    "c\u0000\u0000\u00a2\u00a3\u0005o\u0000\u0000\u00a3\u00a4\u0005n\u0000" +
                    "\u0000\u00a4\u00a5\u0005t\u0000\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6" +
                    "\u00a7\u0005n\u0000\u0000\u00a7\u00a8\u0005u\u0000\u0000\u00a8\u00a9\u0005" +
                    "e\u0000\u0000\u00a9\u0014\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005c\u0000" +
                    "\u0000\u00ab\u00ac\u0005l\u0000\u0000\u00ac\u00ad\u0005a\u0000\u0000\u00ad" +
                    "\u00ae\u0005s\u0000\u0000\u00ae\u00af\u0005s\u0000\u0000\u00af\u0016\u0001" +
                    "\u0000\u0000\u0000\u00b0\u00b1\u0005g\u0000\u0000\u00b1\u00b2\u0005l\u0000" +
                    "\u0000\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005b\u0000\u0000\u00b4" +
                    "\u00b5\u0005a\u0000\u0000\u00b5\u00b6\u0005l\u0000\u0000\u00b6\u0018\u0001" +
                    "\u0000\u0000\u0000\u00b7\u00b8\u0005a\u0000\u0000\u00b8\u00b9\u0005s\u0000" +
                    "\u0000\u00b9\u001a\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005@\u0000\u0000" +
                    "\u00bb\u001c\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000\u00bd" +
                    "\u001e\u0001\u0000\u0000\u0000\u00be\u00bf\u0005,\u0000\u0000\u00bf \u0001" +
                    "\u0000\u0000\u0000\u00c0\u00c1\u0005.\u0000\u0000\u00c1\"\u0001\u0000" +
                    "\u0000\u0000\u00c2\u00c3\u0005:\u0000\u0000\u00c3$\u0001\u0000\u0000\u0000" +
                    "\u00c4\u00c5\u0005(\u0000\u0000\u00c5\u00c6\u0006\u0012\u0000\u0000\u00c6" +
                    "&\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005)\u0000\u0000\u00c8\u00c9\u0006" +
                    "\u0013\u0001\u0000\u00c9(\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005[\u0000" +
                    "\u0000\u00cb\u00cc\u0006\u0014\u0002\u0000\u00cc*\u0001\u0000\u0000\u0000" +
                    "\u00cd\u00ce\u0005]\u0000\u0000\u00ce\u00cf\u0006\u0015\u0003\u0000\u00cf" +
                    ",\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005{\u0000\u0000\u00d1\u00d2\u0006" +
                    "\u0016\u0004\u0000\u00d2.\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005}\u0000" +
                    "\u0000\u00d4\u00d5\u0006\u0017\u0005\u0000\u00d50\u0001\u0000\u0000\u0000" +
                    "\u00d6\u00d7\u0005+\u0000\u0000\u00d72\u0001\u0000\u0000\u0000\u00d8\u00d9" +
                    "\u0005-\u0000\u0000\u00d94\u0001\u0000\u0000\u0000\u00da\u00db\u0005*" +
                    "\u0000\u0000\u00db6\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005/\u0000\u0000" +
                    "\u00dd8\u0001\u0000\u0000\u0000\u00de\u00df\u0005<\u0000\u0000\u00df:" +
                    "\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005>\u0000\u0000\u00e1<\u0001\u0000" +
                    "\u0000\u0000\u00e2\u00e3\u0005<\u0000\u0000\u00e3\u00e4\u0005=\u0000\u0000" +
                    "\u00e4>\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005>\u0000\u0000\u00e6\u00e7" +
                    "\u0005=\u0000\u0000\u00e7@\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005=" +
                    "\u0000\u0000\u00e9\u00ea\u0005=\u0000\u0000\u00eaB\u0001\u0000\u0000\u0000" +
                    "\u00eb\u00ec\u0005!\u0000\u0000\u00ec\u00ed\u0005=\u0000\u0000\u00edD" +
                    "\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005i\u0000\u0000\u00ef\u00f0\u0005" +
                    "f\u0000\u0000\u00f0F\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005e\u0000" +
                    "\u0000\u00f2\u00f3\u0005l\u0000\u0000\u00f3\u00f4\u0005i\u0000\u0000\u00f4" +
                    "\u00f5\u0005f\u0000\u0000\u00f5H\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005" +
                    "e\u0000\u0000\u00f7\u00f8\u0005l\u0000\u0000\u00f8\u00f9\u0005s\u0000" +
                    "\u0000\u00f9\u00fa\u0005e\u0000\u0000\u00faJ\u0001\u0000\u0000\u0000\u00fb" +
                    "\u00fc\u0005f\u0000\u0000\u00fc\u00fd\u0005o\u0000\u0000\u00fd\u00fe\u0005" +
                    "r\u0000\u0000\u00feL\u0001\u0000\u0000\u0000\u00ff\u0100\u0005i\u0000" +
                    "\u0000\u0100\u0101\u0005n\u0000\u0000\u0101N\u0001\u0000\u0000\u0000\u0102" +
                    "\u0103\u0005w\u0000\u0000\u0103\u0104\u0005h\u0000\u0000\u0104\u0105\u0005" +
                    "i\u0000\u0000\u0105\u0106\u0005l\u0000\u0000\u0106\u0107\u0005e\u0000" +
                    "\u0000\u0107P\u0001\u0000\u0000\u0000\u0108\u0109\u0005v\u0000\u0000\u0109" +
                    "\u010a\u0005a\u0000\u0000\u010a\u010b\u0005r\u0000\u0000\u010bR\u0001" +
                    "\u0000\u0000\u0000\u010c\u0110\u0007\u0000\u0000\u0000\u010d\u010f\u0007" +
                    "\u0001\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001" +
                    "\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001" +
                    "\u0000\u0000\u0000\u0111T\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000" +
                    "\u0000\u0000\u0113\u0115\u0003W+\u0000\u0114\u0113\u0001\u0000\u0000\u0000" +
                    "\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000" +
                    "\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011e\u0001\u0000\u0000\u0000" +
                    "\u0118\u011a\u0005.\u0000\u0000\u0119\u011b\u0003W+\u0000\u011a\u0119" +
                    "\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a" +
                    "\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f" +
                    "\u0001\u0000\u0000\u0000\u011e\u0118\u0001\u0000\u0000\u0000\u011e\u011f" +
                    "\u0001\u0000\u0000\u0000\u011f\u0129\u0001\u0000\u0000\u0000\u0120\u0122" +
                    "\u0007\u0002\u0000\u0000\u0121\u0123\u0007\u0003\u0000\u0000\u0122\u0121" +
                    "\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125" +
                    "\u0001\u0000\u0000\u0000\u0124\u0126\u0003W+\u0000\u0125\u0124\u0001\u0000" +
                    "\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000" +
                    "\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000" +
                    "\u0000\u0000\u0129\u0120\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000" +
                    "\u0000\u0000\u012aV\u0001\u0000\u0000\u0000\u012b\u012c\u0007\u0004\u0000" +
                    "\u0000\u012cX\u0001\u0000\u0000\u0000\u012d\u0133\u0005\"\u0000\u0000" +
                    "\u012e\u0132\b\u0005\u0000\u0000\u012f\u0130\u0005\\\u0000\u0000\u0130" +
                    "\u0132\t\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u012f" +
                    "\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131" +
                    "\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136" +
                    "\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0142" +
                    "\u0005\"\u0000\u0000\u0137\u013d\u0005\'\u0000\u0000\u0138\u013c\b\u0006" +
                    "\u0000\u0000\u0139\u013a\u0005\\\u0000\u0000\u013a\u013c\t\u0000\u0000" +
                    "\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000" +
                    "\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000" +
                    "\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000" +
                    "\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0005\'\u0000\u0000" +
                    "\u0141\u012d\u0001\u0000\u0000\u0000\u0141\u0137\u0001\u0000\u0000\u0000" +
                    "\u0142Z\u0001\u0000\u0000\u0000\u0143\u0144\u0004-\u0000\u0000\u0144\u0150" +
                    "\u0003a0\u0000\u0145\u0147\u0005\r\u0000\u0000\u0146\u0145\u0001\u0000" +
                    "\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000" +
                    "\u0000\u0000\u0148\u014b\u0005\n\u0000\u0000\u0149\u014b\u0002\f\r\u0000" +
                    "\u014a\u0146\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000" +
                    "\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014e\u0003a0\u0000\u014d\u014c" +
                    "\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150" +
                    "\u0001\u0000\u0000\u0000\u014f\u0143\u0001\u0000\u0000\u0000\u014f\u014a" +
                    "\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152" +
                    "\u0006-\u0006\u0000\u0152\\\u0001\u0000\u0000\u0000\u0153\u0155\u0007" +
                    "\u0007\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001" +
                    "\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001" +
                    "\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0006" +
                    ".\u0007\u0000\u0159^\u0001\u0000\u0000\u0000\u015a\u015e\u0005#\u0000" +
                    "\u0000\u015b\u015d\b\b\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000" +
                    "\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000" +
                    "\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000" +
                    "\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0006/\u0007\u0000\u0162" +
                    "`\u0001\u0000\u0000\u0000\u0163\u0165\u0007\u0007\u0000\u0000\u0164\u0163" +
                    "\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0164" +
                    "\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167b\u0001" +
                    "\u0000\u0000\u0000\u0015\u0000u\u0110\u0116\u011c\u011e\u0122\u0127\u0129" +
                    "\u0131\u0133\u013b\u013d\u0141\u0146\u014a\u014d\u014f\u0156\u015e\u0166" +
                    "\b\u0001\u0012\u0000\u0001\u0013\u0001\u0001\u0014\u0002\u0001\u0015\u0003" +
                    "\u0001\u0016\u0004\u0001\u0017\u0005\u0001-\u0006\u0006\u0000\u0000";
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

    void openBrace() {
        this.opened++;
    }

    void closeBrace() {
        this.opened--;
    }

    void onNewLine() {
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
        } else {
            emit(commonToken(PythonLexer.NEWLINE, newLine));
            int indent = getIndentationCount(spaces);
            int previous = indents.isEmpty() ? 0 : indents.peek();
            if (indent == previous) {
                // skip indents of the same size as the present indent-size
                skip();
            } else if (indent > previous) {
                indents.push(indent);
                emit(commonToken(PythonLexer.INDENT, spaces));
            } else {
                // Possibly emit more than 1 DEDENT token.
                while (!indents.isEmpty() && indents.peek() > indent) {
                    this.emit(createDedent());
                    indents.pop();
                }
            }
        }
    }

    @Override
    public void reset() {
        tokens = new java.util.LinkedList<>();
        indents = new ArrayDeque<>();
        opened = 0;
        lastToken = null;
        super.reset();
    }
}