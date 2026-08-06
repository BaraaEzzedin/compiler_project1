// Generated from ProjectParser.g4 by ANTLR 4.13.2
package JinjaCssGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_WS=2, SCRIPT_OPEN=3, STYLE_OPEN=4, TAG_OPEN=5, JINJA_VAR_OPEN=6, 
		JINJA_BLOCK_OPEN=7, HTML_TEXT=8, COMMENT_JINJA=9, TAG_CLOSE=10, TAG_SLASH=11, 
		TAG_EQUALS=12, TAG_NAME=13, TAG_WHITESPACE=14, SCRIPT_BODY=15, SCRIPT_SHORT_BODY=16, 
		ATTVALUE_VALUE=17, ATTRIBUTE=18, JINJA_VAR_CLOSE=19, JINJA_BLOCK_CLOSE=20, 
		NUMBER_JINJA=21, JINJA_COMMENT=22, PLUS_JINJA=23, MINUS_JINJA=24, MULTI_JINJA=25, 
		SLASH_JINJA=26, PERCENT_JINJA=27, DOT_JINJA=28, EQUALS_EQUALS_JINJA=29, 
		EQUALS_JINJA=30, NOT_EQUALS_JINJA=31, AND_JINJA=32, OR_JINJA=33, JINJA_IN=34, 
		JINJA_FOR=35, JINJA_END_FOR=36, JINJA_IF=37, JINJA_ELSE=38, JINJA_ELIF=39, 
		JINJA_END_IF=40, IDENTIFIER_JINJA=41, PIPE=42, LPAREN=43, RPAREN=44, COMMA_JINJA=45, 
		STRING_JINJA=46, JINJA_WS=47, NUMBER_CSS=48, LBRACE=49, RBRACE=50, CSS_LPAREN=51, 
		CSS_RPAREN=52, DASH=53, COLON=54, SEMI=55, COMMA=56, DOT=57, STAR=58, 
		HASH=59, TILDE=60, STYLE_CLOSE=61, UNIT=62, COLOR=63, COLOR_RGB=64, COLOR_RGBA=65, 
		COLOR_HSL=66, COLOR_HSLA=67, CSS_IMPORT=68, CSS_MEDIA=69, CSS_FONT_FACE=70, 
		CSS_KEYFRAMES=71, IMPORTANT=72, CSS_KEYWORD=73, CSS_CUSTOM_PROP=74, CSS_URL=75, 
		CSS_CALC=76, CSS_VAR=77, CSS_WS=78, CSS_COMMENT=79, IDENTIFIER_CSS=80, 
		STRING_CSS=81, SEA_WS=82;
	public static final int
		RULE_program = 0, RULE_node = 1, RULE_htmlElement = 2, RULE_normalElement = 3, 
		RULE_selfClosingElement = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_htmlChardata = 7, RULE_htmlMisc = 8, RULE_script = 9, RULE_style = 10, 
		RULE_jinjaElement = 11, RULE_jinjaVariable = 12, RULE_jinjaBlock = 13, 
		RULE_jinjaBody = 14, RULE_jinjaExpression = 15, RULE_jinjaPrimary = 16, 
		RULE_jinjaArgList = 17, RULE_jinjaArg = 18, RULE_forStatement = 19, RULE_ifStatement = 20, 
		RULE_elifBlock = 21, RULE_elseBlock = 22, RULE_cssStyle = 23, RULE_cssStatement = 24, 
		RULE_cssRule = 25, RULE_cssSelector = 26, RULE_selectorGroup = 27, RULE_selector = 28, 
		RULE_compoundSelector = 29, RULE_simpleSelector = 30, RULE_typeSelector = 31, 
		RULE_classSelector = 32, RULE_idSelector = 33, RULE_pseudoSelector = 34, 
		RULE_cssDeclaration = 35, RULE_cssFunction = 36, RULE_cssValueList = 37, 
		RULE_cssValue = 38, RULE_cssTerm = 39, RULE_cssAtRule = 40, RULE_cssMedia = 41, 
		RULE_cssMediaQuery = 42, RULE_cssMediaExpr = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "node", "htmlElement", "normalElement", "selfClosingElement", 
			"htmlContent", "htmlAttribute", "htmlChardata", "htmlMisc", "script", 
			"style", "jinjaElement", "jinjaVariable", "jinjaBlock", "jinjaBody", 
			"jinjaExpression", "jinjaPrimary", "jinjaArgList", "jinjaArg", "forStatement", 
			"ifStatement", "elifBlock", "elseBlock", "cssStyle", "cssStatement", 
			"cssRule", "cssSelector", "selectorGroup", "selector", "compoundSelector", 
			"simpleSelector", "typeSelector", "classSelector", "idSelector", "pseudoSelector", 
			"cssDeclaration", "cssFunction", "cssValueList", "cssValue", "cssTerm", 
			"cssAtRule", "cssMedia", "cssMediaQuery", "cssMediaExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", "'{{'", "'{%'", null, null, "'>'", 
			null, null, null, null, null, null, null, null, "'}}'", "'%}'", null, 
			null, "'+'", null, null, null, "'%'", null, "'=='", null, "'!='", "'&&'", 
			"'||'", "'in'", "'for'", "'endfor'", "'if'", "'else'", "'elif'", "'endif'", 
			null, "'|'", null, null, null, null, null, null, "'{'", "'}'", null, 
			null, null, "':'", "';'", null, null, null, "'#'", "'~'", "'</style>'", 
			null, null, null, null, null, null, "'@import'", "'@media'", "'@font-face'", 
			"'@keyframes'", "'!important'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"JINJA_VAR_OPEN", "JINJA_BLOCK_OPEN", "HTML_TEXT", "COMMENT_JINJA", "TAG_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", 
			"SCRIPT_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "JINJA_VAR_CLOSE", 
			"JINJA_BLOCK_CLOSE", "NUMBER_JINJA", "JINJA_COMMENT", "PLUS_JINJA", "MINUS_JINJA", 
			"MULTI_JINJA", "SLASH_JINJA", "PERCENT_JINJA", "DOT_JINJA", "EQUALS_EQUALS_JINJA", 
			"EQUALS_JINJA", "NOT_EQUALS_JINJA", "AND_JINJA", "OR_JINJA", "JINJA_IN", 
			"JINJA_FOR", "JINJA_END_FOR", "JINJA_IF", "JINJA_ELSE", "JINJA_ELIF", 
			"JINJA_END_IF", "IDENTIFIER_JINJA", "PIPE", "LPAREN", "RPAREN", "COMMA_JINJA", 
			"STRING_JINJA", "JINJA_WS", "NUMBER_CSS", "LBRACE", "RBRACE", "CSS_LPAREN", 
			"CSS_RPAREN", "DASH", "COLON", "SEMI", "COMMA", "DOT", "STAR", "HASH", 
			"TILDE", "STYLE_CLOSE", "UNIT", "COLOR", "COLOR_RGB", "COLOR_RGBA", "COLOR_HSL", 
			"COLOR_HSLA", "CSS_IMPORT", "CSS_MEDIA", "CSS_FONT_FACE", "CSS_KEYFRAMES", 
			"IMPORTANT", "CSS_KEYWORD", "CSS_CUSTOM_PROP", "CSS_URL", "CSS_CALC", 
			"CSS_VAR", "CSS_WS", "CSS_COMMENT", "IDENTIFIER_CSS", "STRING_CSS", "SEA_WS"
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
	public String getGrammarFileName() { return "ProjectParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramDefContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(ProjectParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ProgramDefContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterProgramDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitProgramDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitProgramDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) {
				{
				{
				setState(88);
				node();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeContext extends NodeContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNodeContext extends NodeContext {
		public JinjaElementContext jinjaElement() {
			return getRuleContext(JinjaElementContext.class,0);
		}
		public JinjaNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeContext extends NodeContext {
		public TerminalNode HTML_TEXT() { return getToken(ProjectParser.HTML_TEXT, 0); }
		public TextNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
				_localctx = new HtmlNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				htmlElement();
				}
				break;
			case JINJA_VAR_OPEN:
			case JINJA_BLOCK_OPEN:
				_localctx = new JinjaNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				jinjaElement();
				}
				break;
			case HTML_TEXT:
				_localctx = new TextNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(HTML_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingElementContext extends HtmlElementContext {
		public SelfClosingElementContext selfClosingElement() {
			return getRuleContext(SelfClosingElementContext.class,0);
		}
		public HtmlSelfClosingElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlScriptElementContext extends HtmlElementContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public HtmlScriptElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlScriptElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlScriptElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlScriptElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNormalElementContext extends HtmlElementContext {
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public HtmlNormalElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStyleElementContext extends HtmlElementContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlStyleElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new HtmlNormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				normalElement();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				selfClosingElement();
				}
				break;
			case 3:
				_localctx = new HtmlScriptElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				script();
				}
				break;
			case 4:
				_localctx = new HtmlStyleElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				style();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ParserRuleContext {
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
	 
		public NormalElementContext() { }
		public void copyFrom(NormalElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagContext extends NormalElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(ProjectParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(ProjectParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(ProjectParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(ProjectParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(ProjectParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(ProjectParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(ProjectParser.TAG_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public NormalTagContext(NormalElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalElement);
		int _la;
		try {
			_localctx = new NormalTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(TAG_OPEN);
			setState(108);
			match(TAG_NAME);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(109);
				htmlAttribute();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(TAG_CLOSE);
			setState(116);
			htmlContent();
			setState(117);
			match(TAG_OPEN);
			setState(118);
			match(TAG_SLASH);
			setState(119);
			match(TAG_NAME);
			setState(120);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ParserRuleContext {
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
	 
		public SelfClosingElementContext() { }
		public void copyFrom(SelfClosingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfCloseTagContext extends SelfClosingElementContext {
		public TerminalNode TAG_OPEN() { return getToken(ProjectParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(ProjectParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH() { return getToken(ProjectParser.TAG_SLASH, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(ProjectParser.TAG_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfCloseTagContext(SelfClosingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterSelfCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitSelfCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitSelfCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selfClosingElement);
		int _la;
		try {
			_localctx = new SelfCloseTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TAG_OPEN);
			setState(123);
			match(TAG_NAME);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(124);
				htmlAttribute();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(TAG_SLASH);
			setState(131);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends HtmlContentContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<JinjaElementContext> jinjaElement() {
			return getRuleContexts(JinjaElementContext.class);
		}
		public JinjaElementContext jinjaElement(int i) {
			return getRuleContext(JinjaElementContext.class,i);
		}
		public List<TerminalNode> HTML_COMMENT() { return getTokens(ProjectParser.HTML_COMMENT); }
		public TerminalNode HTML_COMMENT(int i) {
			return getToken(ProjectParser.HTML_COMMENT, i);
		}
		public ContentContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			_localctx = new ContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_TEXT || _la==SEA_WS) {
				{
				setState(133);
				htmlChardata();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(136);
						htmlElement();
						}
						break;
					case JINJA_VAR_OPEN:
					case JINJA_BLOCK_OPEN:
						{
						setState(137);
						jinjaElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(138);
						match(HTML_COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HTML_TEXT || _la==SEA_WS) {
						{
						setState(141);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(ProjectParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ProjectParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ProjectParser.ATTVALUE_VALUE, 0); }
		public AttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			_localctx = new AttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TAG_NAME);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(150);
				match(TAG_EQUALS);
				setState(151);
				match(ATTVALUE_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlChardataContext extends ParserRuleContext {
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
	 
		public HtmlChardataContext() { }
		public void copyFrom(HtmlChardataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextContext extends HtmlChardataContext {
		public TerminalNode HTML_TEXT() { return getToken(ProjectParser.HTML_TEXT, 0); }
		public HtmlTextContext(HtmlChardataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSpaceContext extends HtmlChardataContext {
		public TerminalNode SEA_WS() { return getToken(ProjectParser.SEA_WS, 0); }
		public HtmlSpaceContext(HtmlChardataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlChardata);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new HtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(HTML_TEXT);
				}
				break;
			case SEA_WS:
				_localctx = new HtmlSpaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
	 
		public HtmlMiscContext() { }
		public void copyFrom(HtmlMiscContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlWhiteSpaceContext extends HtmlMiscContext {
		public TerminalNode SEA_WS() { return getToken(ProjectParser.SEA_WS, 0); }
		public HtmlWhiteSpaceContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlWhiteSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlWhiteSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlWhiteSpace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends HtmlMiscContext {
		public TerminalNode HTML_COMMENT() { return getToken(ProjectParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlMisc);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				_localctx = new HtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(HTML_COMMENT);
				}
				break;
			case SEA_WS:
				_localctx = new HtmlWhiteSpaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	 
		public ScriptContext() { }
		public void copyFrom(ScriptContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlScriptContext extends ScriptContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(ProjectParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(ProjectParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(ProjectParser.SCRIPT_SHORT_BODY, 0); }
		public HtmlScriptContext(ScriptContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_script);
		int _la;
		try {
			_localctx = new HtmlScriptContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SCRIPT_OPEN);
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	 
		public StyleContext() { }
		public void copyFrom(StyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStyleContext extends StyleContext {
		public TerminalNode STYLE_OPEN() { return getToken(ProjectParser.STYLE_OPEN, 0); }
		public CssStyleContext cssStyle() {
			return getRuleContext(CssStyleContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(ProjectParser.STYLE_CLOSE, 0); }
		public HtmlStyleContext(StyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_style);
		try {
			_localctx = new HtmlStyleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(STYLE_OPEN);
			setState(166);
			cssStyle();
			setState(167);
			match(STYLE_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElementContext extends ParserRuleContext {
		public JinjaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElement; }
	 
		public JinjaElementContext() { }
		public void copyFrom(JinjaElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockElementContext extends JinjaElementContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaBlockElementContext(JinjaElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaBlockElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaBlockElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaBlockElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVariableElementContext extends JinjaElementContext {
		public JinjaVariableContext jinjaVariable() {
			return getRuleContext(JinjaVariableContext.class,0);
		}
		public JinjaVariableElementContext(JinjaElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaVariableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaVariableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaVariableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElementContext jinjaElement() throws RecognitionException {
		JinjaElementContext _localctx = new JinjaElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaElement);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_OPEN:
				_localctx = new JinjaVariableElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				jinjaVariable();
				}
				break;
			case JINJA_BLOCK_OPEN:
				_localctx = new JinjaBlockElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				jinjaBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVariableContext extends ParserRuleContext {
		public JinjaVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVariable; }
	 
		public JinjaVariableContext() { }
		public void copyFrom(JinjaVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends JinjaVariableContext {
		public TerminalNode JINJA_VAR_OPEN() { return getToken(ProjectParser.JINJA_VAR_OPEN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode JINJA_VAR_CLOSE() { return getToken(ProjectParser.JINJA_VAR_CLOSE, 0); }
		public VariableContext(JinjaVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVariableContext jinjaVariable() throws RecognitionException {
		JinjaVariableContext _localctx = new JinjaVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaVariable);
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(JINJA_VAR_OPEN);
			setState(174);
			jinjaExpression(0);
			setState(175);
			match(JINJA_VAR_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends ParserRuleContext {
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
	 
		public JinjaBlockContext() { }
		public void copyFrom(JinjaBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocContext extends JinjaBlockContext {
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public JinjaBodyContext jinjaBody() {
			return getRuleContext(JinjaBodyContext.class,0);
		}
		public BlocContext(JinjaBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitBloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitBloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaBlock);
		try {
			_localctx = new BlocContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(JINJA_BLOCK_OPEN);
			setState(178);
			jinjaBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBodyContext extends ParserRuleContext {
		public JinjaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBody; }
	 
		public JinjaBodyContext() { }
		public void copyFrom(JinjaBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionBodyContext extends JinjaBodyContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaExpressionBodyContext(JinjaBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaExpressionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaExpressionBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForBodyContext extends JinjaBodyContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public JinjaForBodyContext(JinjaBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaForBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaForBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaForBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfBodyContext extends JinjaBodyContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public JinjaIfBodyContext(JinjaBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBodyContext jinjaBody() throws RecognitionException {
		JinjaBodyContext _localctx = new JinjaBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinjaBody);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_FOR:
				_localctx = new JinjaForBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				forStatement();
				}
				break;
			case JINJA_IF:
				_localctx = new JinjaIfBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				ifStatement();
				}
				break;
			case NUMBER_JINJA:
			case IDENTIFIER_JINJA:
			case LPAREN:
			case STRING_JINJA:
				_localctx = new JinjaExpressionBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				jinjaExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
	 
		public JinjaExpressionContext() { }
		public void copyFrom(JinjaExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPrimaryExprContext extends JinjaExpressionContext {
		public JinjaPrimaryContext jinjaPrimary() {
			return getRuleContext(JinjaPrimaryContext.class,0);
		}
		public JinjaPrimaryExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilterExprContext extends JinjaExpressionContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(ProjectParser.PIPE, 0); }
		public TerminalNode IDENTIFIER_JINJA() { return getToken(ProjectParser.IDENTIFIER_JINJA, 0); }
		public JinjaFilterExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaFilterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaMulExprContext extends JinjaExpressionContext {
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public TerminalNode MULTI_JINJA() { return getToken(ProjectParser.MULTI_JINJA, 0); }
		public JinjaMulExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaEqExprContext extends JinjaExpressionContext {
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public TerminalNode EQUALS_EQUALS_JINJA() { return getToken(ProjectParser.EQUALS_EQUALS_JINJA, 0); }
		public JinjaEqExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaAddExprContext extends JinjaExpressionContext {
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public TerminalNode PLUS_JINJA() { return getToken(ProjectParser.PLUS_JINJA, 0); }
		public JinjaAddExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSubExprContext extends JinjaExpressionContext {
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public TerminalNode MINUS_JINJA() { return getToken(ProjectParser.MINUS_JINJA, 0); }
		public JinjaSubExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNeqExprContext extends JinjaExpressionContext {
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public TerminalNode NOT_EQUALS_JINJA() { return getToken(ProjectParser.NOT_EQUALS_JINJA, 0); }
		public JinjaNeqExprContext(JinjaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaNeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		return jinjaExpression(0);
	}

	private JinjaExpressionContext jinjaExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, _parentState);
		JinjaExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_jinjaExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JinjaPrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(186);
			jinjaPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new JinjaAddExprContext(new JinjaExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189);
						match(PLUS_JINJA);
						setState(190);
						jinjaExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new JinjaSubExprContext(new JinjaExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						match(MINUS_JINJA);
						setState(193);
						jinjaExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new JinjaMulExprContext(new JinjaExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(MULTI_JINJA);
						setState(196);
						jinjaExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new JinjaEqExprContext(new JinjaExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(EQUALS_EQUALS_JINJA);
						setState(199);
						jinjaExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new JinjaNeqExprContext(new JinjaExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						match(NOT_EQUALS_JINJA);
						setState(202);
						jinjaExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new JinjaFilterExprContext(new JinjaExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(203);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(204);
						match(PIPE);
						setState(205);
						match(IDENTIFIER_JINJA);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPrimaryContext extends ParserRuleContext {
		public JinjaPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPrimary; }
	 
		public JinjaPrimaryContext() { }
		public void copyFrom(JinjaPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStringContext extends JinjaPrimaryContext {
		public TerminalNode STRING_JINJA() { return getToken(ProjectParser.STRING_JINJA, 0); }
		public JinjaStringContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaParenExprContext extends JinjaPrimaryContext {
		public TerminalNode LPAREN() { return getToken(ProjectParser.LPAREN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectParser.RPAREN, 0); }
		public JinjaParenExprContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNumberContext extends JinjaPrimaryContext {
		public TerminalNode NUMBER_JINJA() { return getToken(ProjectParser.NUMBER_JINJA, 0); }
		public JinjaNumberContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCallContext extends JinjaPrimaryContext {
		public TerminalNode IDENTIFIER_JINJA() { return getToken(ProjectParser.IDENTIFIER_JINJA, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProjectParser.RPAREN, 0); }
		public JinjaArgListContext jinjaArgList() {
			return getRuleContext(JinjaArgListContext.class,0);
		}
		public JinjaCallContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIdentifierContext extends JinjaPrimaryContext {
		public List<TerminalNode> IDENTIFIER_JINJA() { return getTokens(ProjectParser.IDENTIFIER_JINJA); }
		public TerminalNode IDENTIFIER_JINJA(int i) {
			return getToken(ProjectParser.IDENTIFIER_JINJA, i);
		}
		public List<TerminalNode> DOT_JINJA() { return getTokens(ProjectParser.DOT_JINJA); }
		public TerminalNode DOT_JINJA(int i) {
			return getToken(ProjectParser.DOT_JINJA, i);
		}
		public JinjaIdentifierContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPrimaryContext jinjaPrimary() throws RecognitionException {
		JinjaPrimaryContext _localctx = new JinjaPrimaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaPrimary);
		int _la;
		try {
			int _alt;
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new JinjaCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(IDENTIFIER_JINJA);
				setState(212);
				match(LPAREN);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 81363862552576L) != 0)) {
					{
					setState(213);
					jinjaArgList();
					}
				}

				setState(216);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new JinjaIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(IDENTIFIER_JINJA);
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218);
						match(DOT_JINJA);
						setState(219);
						match(IDENTIFIER_JINJA);
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new JinjaNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(NUMBER_JINJA);
				}
				break;
			case 4:
				_localctx = new JinjaStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(STRING_JINJA);
				}
				break;
			case 5:
				_localctx = new JinjaParenExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(LPAREN);
				setState(228);
				jinjaExpression(0);
				setState(229);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaArgListContext extends ParserRuleContext {
		public JinjaArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaArgList; }
	 
		public JinjaArgListContext() { }
		public void copyFrom(JinjaArgListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaArgumentsContext extends JinjaArgListContext {
		public List<JinjaArgContext> jinjaArg() {
			return getRuleContexts(JinjaArgContext.class);
		}
		public JinjaArgContext jinjaArg(int i) {
			return getRuleContext(JinjaArgContext.class,i);
		}
		public List<TerminalNode> COMMA_JINJA() { return getTokens(ProjectParser.COMMA_JINJA); }
		public TerminalNode COMMA_JINJA(int i) {
			return getToken(ProjectParser.COMMA_JINJA, i);
		}
		public JinjaArgumentsContext(JinjaArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaArgListContext jinjaArgList() throws RecognitionException {
		JinjaArgListContext _localctx = new JinjaArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaArgList);
		int _la;
		try {
			_localctx = new JinjaArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			jinjaArg();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_JINJA) {
				{
				{
				setState(234);
				match(COMMA_JINJA);
				setState(235);
				jinjaArg();
				}
				}
				setState(240);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaArgContext extends ParserRuleContext {
		public JinjaArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaArg; }
	 
		public JinjaArgContext() { }
		public void copyFrom(JinjaArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPositionalArgContext extends JinjaArgContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaPositionalArgContext(JinjaArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaPositionalArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaPositionalArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaPositionalArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaKeywordArgContext extends JinjaArgContext {
		public TerminalNode IDENTIFIER_JINJA() { return getToken(ProjectParser.IDENTIFIER_JINJA, 0); }
		public TerminalNode EQUALS_JINJA() { return getToken(ProjectParser.EQUALS_JINJA, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaKeywordArgContext(JinjaArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaKeywordArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaKeywordArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaKeywordArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaArgContext jinjaArg() throws RecognitionException {
		JinjaArgContext _localctx = new JinjaArgContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinjaArg);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new JinjaKeywordArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(IDENTIFIER_JINJA);
				setState(242);
				match(EQUALS_JINJA);
				setState(243);
				jinjaExpression(0);
				}
				break;
			case 2:
				_localctx = new JinjaPositionalArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				jinjaExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForStatementContext extends ForStatementContext {
		public TerminalNode JINJA_FOR() { return getToken(ProjectParser.JINJA_FOR, 0); }
		public TerminalNode IDENTIFIER_JINJA() { return getToken(ProjectParser.IDENTIFIER_JINJA, 0); }
		public TerminalNode JINJA_IN() { return getToken(ProjectParser.JINJA_IN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_BLOCK_CLOSE() { return getTokens(ProjectParser.JINJA_BLOCK_CLOSE); }
		public TerminalNode JINJA_BLOCK_CLOSE(int i) {
			return getToken(ProjectParser.JINJA_BLOCK_CLOSE, i);
		}
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public TerminalNode JINJA_END_FOR() { return getToken(ProjectParser.JINJA_END_FOR, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaForStatementContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forStatement);
		try {
			int _alt;
			_localctx = new JinjaForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(JINJA_FOR);
			setState(248);
			match(IDENTIFIER_JINJA);
			setState(249);
			match(JINJA_IN);
			setState(250);
			jinjaExpression(0);
			setState(251);
			match(JINJA_BLOCK_CLOSE);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					node();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(258);
			match(JINJA_BLOCK_OPEN);
			setState(259);
			match(JINJA_END_FOR);
			setState(260);
			match(JINJA_BLOCK_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfStatementContext extends IfStatementContext {
		public TerminalNode JINJA_IF() { return getToken(ProjectParser.JINJA_IF, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_BLOCK_CLOSE() { return getTokens(ProjectParser.JINJA_BLOCK_CLOSE); }
		public TerminalNode JINJA_BLOCK_CLOSE(int i) {
			return getToken(ProjectParser.JINJA_BLOCK_CLOSE, i);
		}
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public TerminalNode JINJA_END_IF() { return getToken(ProjectParser.JINJA_END_IF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public JinjaIfStatementContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			int _alt;
			_localctx = new JinjaIfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(JINJA_IF);
			setState(263);
			jinjaExpression(0);
			setState(264);
			match(JINJA_BLOCK_CLOSE);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					node();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					elifBlock();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(277);
				elseBlock();
				}
				break;
			}
			setState(280);
			match(JINJA_BLOCK_OPEN);
			setState(281);
			match(JINJA_END_IF);
			setState(282);
			match(JINJA_BLOCK_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifBlockContext extends ParserRuleContext {
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
	 
		public ElifBlockContext() { }
		public void copyFrom(ElifBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElifBlockContext extends ElifBlockContext {
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public TerminalNode JINJA_ELIF() { return getToken(ProjectParser.JINJA_ELIF, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_CLOSE() { return getToken(ProjectParser.JINJA_BLOCK_CLOSE, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaElifBlockContext(ElifBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elifBlock);
		try {
			int _alt;
			_localctx = new JinjaElifBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(JINJA_BLOCK_OPEN);
			setState(285);
			match(JINJA_ELIF);
			setState(286);
			jinjaExpression(0);
			setState(287);
			match(JINJA_BLOCK_CLOSE);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					node();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	 
		public ElseBlockContext() { }
		public void copyFrom(ElseBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaElseBlockContext extends ElseBlockContext {
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(ProjectParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_BLOCK_CLOSE() { return getToken(ProjectParser.JINJA_BLOCK_CLOSE, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaElseBlockContext(ElseBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elseBlock);
		try {
			int _alt;
			_localctx = new JinjaElseBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(JINJA_BLOCK_OPEN);
			setState(295);
			match(JINJA_ELSE);
			setState(296);
			match(JINJA_BLOCK_CLOSE);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					node();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssStyleContext extends ParserRuleContext {
		public CssStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStyle; }
	 
		public CssStyleContext() { }
		public void copyFrom(CssStyleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStyleDefContext extends CssStyleContext {
		public List<CssStatementContext> cssStatement() {
			return getRuleContexts(CssStatementContext.class);
		}
		public CssStatementContext cssStatement(int i) {
			return getRuleContext(CssStatementContext.class,i);
		}
		public CssStyleDefContext(CssStyleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssStyleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssStyleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssStyleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStyleContext cssStyle() throws RecognitionException {
		CssStyleContext _localctx = new CssStyleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cssStyle);
		int _la;
		try {
			_localctx = new CssStyleDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 67141689L) != 0)) {
				{
				{
				setState(303);
				cssStatement();
				}
				}
				setState(308);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssStatementContext extends ParserRuleContext {
		public CssStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStatement; }
	 
		public CssStatementContext() { }
		public void copyFrom(CssStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAtRuleStatementContext extends CssStatementContext {
		public CssAtRuleContext cssAtRule() {
			return getRuleContext(CssAtRuleContext.class,0);
		}
		public CssAtRuleStatementContext(CssStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssAtRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssAtRuleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssAtRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleStatementContext extends CssStatementContext {
		public CssRuleContext cssRule() {
			return getRuleContext(CssRuleContext.class,0);
		}
		public CssRuleStatementContext(CssStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssRuleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStatementContext cssStatement() throws RecognitionException {
		CssStatementContext _localctx = new CssStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cssStatement);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
			case DOT:
			case STAR:
			case HASH:
			case IDENTIFIER_CSS:
				_localctx = new CssRuleStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				cssRule();
				}
				break;
			case CSS_MEDIA:
				_localctx = new CssAtRuleStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				cssAtRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
	 
		public CssRuleContext() { }
		public void copyFrom(CssRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleDefContext extends CssRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ProjectParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProjectParser.RBRACE, 0); }
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public CssRuleDefContext(CssRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssRuleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssRuleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssRuleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cssRule);
		int _la;
		try {
			_localctx = new CssRuleDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			cssSelector();
			setState(314);
			match(LBRACE);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_CUSTOM_PROP || _la==IDENTIFIER_CSS) {
				{
				{
				setState(315);
				cssDeclaration();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
	 
		public CssSelectorContext() { }
		public void copyFrom(CssSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorDefContext extends CssSelectorContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public CssSelectorDefContext(CssSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssSelectorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssSelectorDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssSelectorDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cssSelector);
		try {
			_localctx = new CssSelectorDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			selectorGroup();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
	 
		public SelectorGroupContext() { }
		public void copyFrom(SelectorGroupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorGroupContext extends SelectorGroupContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProjectParser.COMMA, i);
		}
		public CssSelectorGroupContext(SelectorGroupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selectorGroup);
		int _la;
		try {
			_localctx = new CssSelectorGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			selector();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(326);
				match(COMMA);
				setState(327);
				selector();
				}
				}
				setState(332);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorDescendantContext extends SelectorContext {
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public CssSelectorDescendantContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssSelectorDescendant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssSelectorDescendant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssSelectorDescendant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selector);
		int _la;
		try {
			_localctx = new CssSelectorDescendantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			compoundSelector();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 67108921L) != 0)) {
				{
				{
				setState(334);
				compoundSelector();
				}
				}
				setState(339);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundSelectorContext extends ParserRuleContext {
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
	 
		public CompoundSelectorContext() { }
		public void copyFrom(CompoundSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCompoundSelectorContext extends CompoundSelectorContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CssCompoundSelectorContext(CompoundSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssCompoundSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssCompoundSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssCompoundSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_compoundSelector);
		try {
			int _alt;
			_localctx = new CssCompoundSelectorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(341); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(340);
					simpleSelector();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(343); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	 
		public SimpleSelectorContext() { }
		public void copyFrom(SimpleSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssUniversalSelectorContext extends SimpleSelectorContext {
		public TerminalNode STAR() { return getToken(ProjectParser.STAR, 0); }
		public CssUniversalSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssUniversalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssUniversalSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPseudoSelectorContext extends SimpleSelectorContext {
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public CssPseudoSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssPseudoSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssPseudoSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssTypeSelectorContext extends SimpleSelectorContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public CssTypeSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssClassSelectorContext extends SimpleSelectorContext {
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public CssClassSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdSelectorContext extends SimpleSelectorContext {
		public IdSelectorContext idSelector() {
			return getRuleContext(IdSelectorContext.class,0);
		}
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public CssIdSelectorContext(SimpleSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleSelector);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new CssUniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(STAR);
				}
				break;
			case COLON:
				_localctx = new CssPseudoSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				pseudoSelector();
				}
				break;
			case IDENTIFIER_CSS:
				_localctx = new CssTypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				typeSelector();
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(348);
					pseudoSelector();
					}
					break;
				}
				}
				break;
			case DOT:
				_localctx = new CssClassSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				classSelector();
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(352);
					pseudoSelector();
					}
					break;
				}
				}
				break;
			case HASH:
				_localctx = new CssIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				idSelector();
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(356);
					pseudoSelector();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
	 
		public TypeSelectorContext() { }
		public void copyFrom(TypeSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssTypeContext extends TypeSelectorContext {
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public CssTypeContext(TypeSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeSelector);
		try {
			_localctx = new CssTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(IDENTIFIER_CSS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends ParserRuleContext {
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
	 
		public ClassSelectorContext() { }
		public void copyFrom(ClassSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssClassContext extends ClassSelectorContext {
		public TerminalNode DOT() { return getToken(ProjectParser.DOT, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public CssClassContext(ClassSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classSelector);
		try {
			_localctx = new CssClassContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(DOT);
			setState(364);
			match(IDENTIFIER_CSS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends ParserRuleContext {
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
	 
		public IdSelectorContext() { }
		public void copyFrom(IdSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdContext extends IdSelectorContext {
		public TerminalNode HASH() { return getToken(ProjectParser.HASH, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public CssIdContext(IdSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_idSelector);
		try {
			_localctx = new CssIdContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(HASH);
			setState(367);
			match(IDENTIFIER_CSS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoSelectorContext extends ParserRuleContext {
		public PseudoSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoSelector; }
	 
		public PseudoSelectorContext() { }
		public void copyFrom(PseudoSelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPseudoContext extends PseudoSelectorContext {
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public CssPseudoContext(PseudoSelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoSelectorContext pseudoSelector() throws RecognitionException {
		PseudoSelectorContext _localctx = new PseudoSelectorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pseudoSelector);
		try {
			_localctx = new CssPseudoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(COLON);
			setState(370);
			match(IDENTIFIER_CSS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
	 
		public CssDeclarationContext() { }
		public void copyFrom(CssDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCustomPropertyContext extends CssDeclarationContext {
		public TerminalNode CSS_CUSTOM_PROP() { return getToken(ProjectParser.CSS_CUSTOM_PROP, 0); }
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectParser.SEMI, 0); }
		public CssCustomPropertyContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssCustomProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssCustomProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssCustomProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends CssDeclarationContext {
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectParser.SEMI, 0); }
		public DeclarationContext(CssDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cssDeclaration);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_CSS:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(IDENTIFIER_CSS);
				setState(373);
				match(COLON);
				setState(374);
				cssValue();
				setState(375);
				match(SEMI);
				}
				break;
			case CSS_CUSTOM_PROP:
				_localctx = new CssCustomPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(CSS_CUSTOM_PROP);
				setState(378);
				match(COLON);
				setState(379);
				cssValue();
				setState(380);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionContext extends ParserRuleContext {
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
	 
		public CssFunctionContext() { }
		public void copyFrom(CssFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends CssFunctionContext {
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(ProjectParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(ProjectParser.CSS_RPAREN, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public FunctionContext(CssFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cssFunction);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IDENTIFIER_CSS);
			setState(385);
			match(CSS_LPAREN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 13691224097L) != 0)) {
				{
				setState(386);
				cssValueList();
				}
			}

			setState(389);
			match(CSS_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueListContext extends ParserRuleContext {
		public CssValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueList; }
	 
		public CssValueListContext() { }
		public void copyFrom(CssValueListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends CssValueListContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProjectParser.COMMA, i);
		}
		public ValueListContext(CssValueListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListContext cssValueList() throws RecognitionException {
		CssValueListContext _localctx = new CssValueListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cssValueList);
		int _la;
		try {
			_localctx = new ValueListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			cssValue();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				setState(393);
				cssValue();
				}
				}
				setState(398);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
	 
		public CssValueContext() { }
		public void copyFrom(CssValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMultipleValuesContext extends CssValueContext {
		public List<CssTermContext> cssTerm() {
			return getRuleContexts(CssTermContext.class);
		}
		public CssTermContext cssTerm(int i) {
			return getRuleContext(CssTermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProjectParser.COMMA, i);
		}
		public CssMultipleValuesContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssMultipleValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssMultipleValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssMultipleValues(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSingleValueContext extends CssValueContext {
		public CssTermContext cssTerm() {
			return getRuleContext(CssTermContext.class,0);
		}
		public CssSingleValueContext(CssValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssSingleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssSingleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssSingleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssValue);
		try {
			int _alt;
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new CssMultipleValuesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				cssTerm();
				setState(402); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(402);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER_CSS:
						case DASH:
						case COLOR:
						case COLOR_RGB:
						case COLOR_RGBA:
						case COLOR_HSL:
						case COLOR_HSLA:
						case CSS_CALC:
						case CSS_VAR:
						case IDENTIFIER_CSS:
						case STRING_CSS:
							{
							setState(400);
							cssTerm();
							}
							break;
						case COMMA:
							{
							setState(401);
							match(COMMA);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(404); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new CssSingleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				cssTerm();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssTermContext extends ParserRuleContext {
		public CssTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssTerm; }
	 
		public CssTermContext() { }
		public void copyFrom(CssTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHslColorContext extends CssTermContext {
		public TerminalNode COLOR_HSL() { return getToken(ProjectParser.COLOR_HSL, 0); }
		public CssHslColorContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssHslColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssHslColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssHslColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentifierContext extends CssTermContext {
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public CssIdentifierContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringContext extends CssTermContext {
		public TerminalNode STRING_CSS() { return getToken(ProjectParser.STRING_CSS, 0); }
		public CssStringContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRgbaColorContext extends CssTermContext {
		public TerminalNode COLOR_RGBA() { return getToken(ProjectParser.COLOR_RGBA, 0); }
		public CssRgbaColorContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssRgbaColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssRgbaColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssRgbaColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionTermContext extends CssTermContext {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssFunctionTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssFunctionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssFunctionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHslaColorContext extends CssTermContext {
		public TerminalNode COLOR_HSLA() { return getToken(ProjectParser.COLOR_HSLA, 0); }
		public CssHslaColorContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssHslaColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssHslaColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssHslaColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVariableContext extends CssTermContext {
		public TerminalNode CSS_VAR() { return getToken(ProjectParser.CSS_VAR, 0); }
		public CssVariableContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssCalcContext extends CssTermContext {
		public TerminalNode CSS_CALC() { return getToken(ProjectParser.CSS_CALC, 0); }
		public CssCalcContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssCalc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssColorContext extends CssTermContext {
		public TerminalNode COLOR() { return getToken(ProjectParser.COLOR, 0); }
		public CssColorContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberTermContext extends CssTermContext {
		public TerminalNode NUMBER_CSS() { return getToken(ProjectParser.NUMBER_CSS, 0); }
		public TerminalNode DASH() { return getToken(ProjectParser.DASH, 0); }
		public TerminalNode UNIT() { return getToken(ProjectParser.UNIT, 0); }
		public CssNumberTermContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRgbColorContext extends CssTermContext {
		public TerminalNode COLOR_RGB() { return getToken(ProjectParser.COLOR_RGB, 0); }
		public CssRgbColorContext(CssTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssRgbColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssRgbColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssRgbColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTermContext cssTerm() throws RecognitionException {
		CssTermContext _localctx = new CssTermContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cssTerm);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new CssFunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				cssFunction();
				}
				break;
			case 2:
				_localctx = new CssNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(410);
					match(DASH);
					}
				}

				setState(413);
				match(NUMBER_CSS);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(414);
					match(UNIT);
					}
				}

				}
				break;
			case 3:
				_localctx = new CssColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(COLOR);
				}
				break;
			case 4:
				_localctx = new CssRgbColorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(COLOR_RGB);
				}
				break;
			case 5:
				_localctx = new CssRgbaColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(COLOR_RGBA);
				}
				break;
			case 6:
				_localctx = new CssHslColorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				match(COLOR_HSL);
				}
				break;
			case 7:
				_localctx = new CssHslaColorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(421);
				match(COLOR_HSLA);
				}
				break;
			case 8:
				_localctx = new CssStringContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(422);
				match(STRING_CSS);
				}
				break;
			case 9:
				_localctx = new CssIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(423);
				match(IDENTIFIER_CSS);
				}
				break;
			case 10:
				_localctx = new CssVariableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(424);
				match(CSS_VAR);
				}
				break;
			case 11:
				_localctx = new CssCalcContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(425);
				match(CSS_CALC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssAtRuleContext extends ParserRuleContext {
		public CssAtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAtRule; }
	 
		public CssAtRuleContext() { }
		public void copyFrom(CssAtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaRuleContext extends CssAtRuleContext {
		public CssMediaContext cssMedia() {
			return getRuleContext(CssMediaContext.class,0);
		}
		public CssMediaRuleContext(CssAtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssMediaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssMediaRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAtRuleContext cssAtRule() throws RecognitionException {
		CssAtRuleContext _localctx = new CssAtRuleContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cssAtRule);
		try {
			_localctx = new CssMediaRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			cssMedia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaContext extends ParserRuleContext {
		public CssMediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMedia; }
	 
		public CssMediaContext() { }
		public void copyFrom(CssMediaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaContext extends CssMediaContext {
		public TerminalNode CSS_MEDIA() { return getToken(ProjectParser.CSS_MEDIA, 0); }
		public CssMediaQueryContext cssMediaQuery() {
			return getRuleContext(CssMediaQueryContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ProjectParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProjectParser.RBRACE, 0); }
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public MediaContext(CssMediaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaContext cssMedia() throws RecognitionException {
		CssMediaContext _localctx = new CssMediaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cssMedia);
		int _la;
		try {
			_localctx = new MediaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CSS_MEDIA);
			setState(431);
			cssMediaQuery();
			setState(432);
			match(LBRACE);
			setState(434); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(433);
				cssRule();
				}
				}
				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 67108921L) != 0) );
			setState(438);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaQueryContext extends ParserRuleContext {
		public CssMediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaQuery; }
	 
		public CssMediaQueryContext() { }
		public void copyFrom(CssMediaQueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryContext extends CssMediaQueryContext {
		public TerminalNode CSS_LPAREN() { return getToken(ProjectParser.CSS_LPAREN, 0); }
		public CssMediaExprContext cssMediaExpr() {
			return getRuleContext(CssMediaExprContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(ProjectParser.CSS_RPAREN, 0); }
		public MediaQueryContext(CssMediaQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaQueryContext cssMediaQuery() throws RecognitionException {
		CssMediaQueryContext _localctx = new CssMediaQueryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cssMediaQuery);
		try {
			_localctx = new MediaQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(CSS_LPAREN);
			setState(441);
			cssMediaExpr();
			setState(442);
			match(CSS_RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssMediaExprContext extends ParserRuleContext {
		public CssMediaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaExpr; }
	 
		public CssMediaExprContext() { }
		public void copyFrom(CssMediaExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MediaExprContext extends CssMediaExprContext {
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public MediaExprContext(CssMediaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterMediaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitMediaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitMediaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaExprContext cssMediaExpr() throws RecognitionException {
		CssMediaExprContext _localctx = new CssMediaExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cssMediaExpr);
		try {
			_localctx = new MediaExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IDENTIFIER_CSS);
			setState(445);
			match(COLON);
			setState(446);
			cssValue();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return jinjaExpression_sempred((JinjaExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jinjaExpression_sempred(JinjaExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001R\u01c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003o\b\u0003\n\u0003\f\u0003r\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004~\b\u0004\n\u0004\f\u0004"+
		"\u0081\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005"+
		"\u0087\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008c\b"+
		"\u0005\u0001\u0005\u0003\u0005\u008f\b\u0005\u0005\u0005\u0091\b\u0005"+
		"\n\u0005\f\u0005\u0094\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0099\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007"+
		"\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00ac\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00b8\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00cf\b\u000f\n\u000f\f\u000f\u00d2\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00d7\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00dd\b\u0010\n\u0010\f\u0010\u00e0\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00ed\b\u0011\n\u0011\f\u0011\u00f0\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00f6\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fe\b\u0013\n"+
		"\u0013\f\u0013\u0101\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u010b"+
		"\b\u0014\n\u0014\f\u0014\u010e\t\u0014\u0001\u0014\u0005\u0014\u0111\b"+
		"\u0014\n\u0014\f\u0014\u0114\t\u0014\u0001\u0014\u0003\u0014\u0117\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0122\b\u0015\n\u0015"+
		"\f\u0015\u0125\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u012b\b\u0016\n\u0016\f\u0016\u012e\t\u0016\u0001\u0017\u0005"+
		"\u0017\u0131\b\u0017\n\u0017\f\u0017\u0134\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0138\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u013d\b\u0019\n\u0019\f\u0019\u0140\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0149"+
		"\b\u001b\n\u001b\f\u001b\u014c\t\u001b\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0150\b\u001c\n\u001c\f\u001c\u0153\t\u001c\u0001\u001d\u0004\u001d\u0156"+
		"\b\u001d\u000b\u001d\f\u001d\u0157\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u015e\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0162\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0166\b\u001e\u0003"+
		"\u001e\u0168\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u017f\b#\u0001$\u0001$\u0001"+
		"$\u0003$\u0184\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u018b\b%\n"+
		"%\f%\u018e\t%\u0001&\u0001&\u0001&\u0004&\u0193\b&\u000b&\f&\u0194\u0001"+
		"&\u0003&\u0198\b&\u0001\'\u0001\'\u0003\'\u019c\b\'\u0001\'\u0001\'\u0003"+
		"\'\u01a0\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u01ab\b\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0004)\u01b3\b)\u000b)\f)\u01b4\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0000\u0001\u001e,\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0001\u0001\u0000\u000f\u0010\u01db\u0000"+
		"[\u0001\u0000\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004i\u0001"+
		"\u0000\u0000\u0000\u0006k\u0001\u0000\u0000\u0000\bz\u0001\u0000\u0000"+
		"\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u0095\u0001\u0000\u0000\u0000"+
		"\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000\u0000"+
		"\u0012\u00a2\u0001\u0000\u0000\u0000\u0014\u00a5\u0001\u0000\u0000\u0000"+
		"\u0016\u00ab\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000"+
		"\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000"+
		"\u001e\u00b9\u0001\u0000\u0000\u0000 \u00e7\u0001\u0000\u0000\u0000\""+
		"\u00e9\u0001\u0000\u0000\u0000$\u00f5\u0001\u0000\u0000\u0000&\u00f7\u0001"+
		"\u0000\u0000\u0000(\u0106\u0001\u0000\u0000\u0000*\u011c\u0001\u0000\u0000"+
		"\u0000,\u0126\u0001\u0000\u0000\u0000.\u0132\u0001\u0000\u0000\u00000"+
		"\u0137\u0001\u0000\u0000\u00002\u0139\u0001\u0000\u0000\u00004\u0143\u0001"+
		"\u0000\u0000\u00006\u0145\u0001\u0000\u0000\u00008\u014d\u0001\u0000\u0000"+
		"\u0000:\u0155\u0001\u0000\u0000\u0000<\u0167\u0001\u0000\u0000\u0000>"+
		"\u0169\u0001\u0000\u0000\u0000@\u016b\u0001\u0000\u0000\u0000B\u016e\u0001"+
		"\u0000\u0000\u0000D\u0171\u0001\u0000\u0000\u0000F\u017e\u0001\u0000\u0000"+
		"\u0000H\u0180\u0001\u0000\u0000\u0000J\u0187\u0001\u0000\u0000\u0000L"+
		"\u0197\u0001\u0000\u0000\u0000N\u01aa\u0001\u0000\u0000\u0000P\u01ac\u0001"+
		"\u0000\u0000\u0000R\u01ae\u0001\u0000\u0000\u0000T\u01b8\u0001\u0000\u0000"+
		"\u0000V\u01bc\u0001\u0000\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0000\u0000\u0001_\u0001\u0001\u0000\u0000\u0000`d\u0003"+
		"\u0004\u0002\u0000ad\u0003\u0016\u000b\u0000bd\u0005\b\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"d\u0003\u0001\u0000\u0000\u0000ej\u0003\u0006\u0003\u0000fj\u0003\b\u0004"+
		"\u0000gj\u0003\u0012\t\u0000hj\u0003\u0014\n\u0000ie\u0001\u0000\u0000"+
		"\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000j\u0005\u0001\u0000\u0000\u0000kl\u0005\u0005\u0000\u0000"+
		"lp\u0005\r\u0000\u0000mo\u0003\f\u0006\u0000nm\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\n\u0000"+
		"\u0000tu\u0003\n\u0005\u0000uv\u0005\u0005\u0000\u0000vw\u0005\u000b\u0000"+
		"\u0000wx\u0005\r\u0000\u0000xy\u0005\n\u0000\u0000y\u0007\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0005\u0000\u0000{\u007f\u0005\r\u0000\u0000|~\u0003"+
		"\f\u0006\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u000b\u0000\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084\t"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u000e\u0007\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0092"+
		"\u0001\u0000\u0000\u0000\u0088\u008c\u0003\u0004\u0002\u0000\u0089\u008c"+
		"\u0003\u0016\u000b\u0000\u008a\u008c\u0005\u0001\u0000\u0000\u008b\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0003\u000e\u0007\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008b"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u000b"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0005\r\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097\u0099\u0005"+
		"\u0011\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009d\u0005\b"+
		"\u0000\u0000\u009b\u009d\u0005R\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0005\u0001\u0000\u0000\u009f\u00a1\u0005R\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000"+
		"\u00a3\u00a4\u0007\u0000\u0000\u0000\u00a4\u0013\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a7\u0003.\u0017\u0000\u00a7"+
		"\u00a8\u0005=\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00ac"+
		"\u0003\u0018\f\u0000\u00aa\u00ac\u0003\u001a\r\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u0017\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005\u0006\u0000\u0000\u00ae\u00af\u0003"+
		"\u001e\u000f\u0000\u00af\u00b0\u0005\u0013\u0000\u0000\u00b0\u0019\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00b3\u0003"+
		"\u001c\u000e\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b8\u0003"+
		"&\u0013\u0000\u00b5\u00b8\u0003(\u0014\u0000\u00b6\u00b8\u0003\u001e\u000f"+
		"\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0006\u000f\uffff\uffff\u0000\u00ba\u00bb\u0003 \u0010"+
		"\u0000\u00bb\u00d0\u0001\u0000\u0000\u0000\u00bc\u00bd\n\u0006\u0000\u0000"+
		"\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00cf\u0003\u001e\u000f\u0007"+
		"\u00bf\u00c0\n\u0005\u0000\u0000\u00c0\u00c1\u0005\u0018\u0000\u0000\u00c1"+
		"\u00cf\u0003\u001e\u000f\u0006\u00c2\u00c3\n\u0004\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0019\u0000\u0000\u00c4\u00cf\u0003\u001e\u000f\u0005\u00c5\u00c6"+
		"\n\u0003\u0000\u0000\u00c6\u00c7\u0005\u001d\u0000\u0000\u00c7\u00cf\u0003"+
		"\u001e\u000f\u0004\u00c8\u00c9\n\u0002\u0000\u0000\u00c9\u00ca\u0005\u001f"+
		"\u0000\u0000\u00ca\u00cf\u0003\u001e\u000f\u0003\u00cb\u00cc\n\u0001\u0000"+
		"\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd\u00cf\u0005)\u0000\u0000\u00ce"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ce\u00bf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c2\u0001\u0000\u0000\u0000\u00ce\u00c5\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u001f\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005)\u0000\u0000\u00d4\u00d6"+
		"\u0005+\u0000\u0000\u00d5\u00d7\u0003\"\u0011\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00e8\u0005,\u0000\u0000\u00d9\u00de\u0005)\u0000"+
		"\u0000\u00da\u00db\u0005\u001c\u0000\u0000\u00db\u00dd\u0005)\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e8\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e8\u0005\u0015\u0000\u0000\u00e2\u00e8\u0005.\u0000\u0000\u00e3"+
		"\u00e4\u0005+\u0000\u0000\u00e4\u00e5\u0003\u001e\u000f\u0000\u00e5\u00e6"+
		"\u0005,\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00d3\u0001"+
		"\u0000\u0000\u0000\u00e7\u00d9\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e8!\u0001\u0000\u0000\u0000\u00e9\u00ee\u0003$\u0012"+
		"\u0000\u00ea\u00eb\u0005-\u0000\u0000\u00eb\u00ed\u0003$\u0012\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"#\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005)\u0000\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f6\u0003"+
		"\u001e\u000f\u0000\u00f4\u00f6\u0003\u001e\u000f\u0000\u00f5\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6%\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005#\u0000\u0000\u00f8\u00f9\u0005)\u0000\u0000"+
		"\u00f9\u00fa\u0005\"\u0000\u0000\u00fa\u00fb\u0003\u001e\u000f\u0000\u00fb"+
		"\u00ff\u0005\u0014\u0000\u0000\u00fc\u00fe\u0003\u0002\u0001\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\u0007\u0000\u0000\u0103\u0104\u0005$\u0000\u0000\u0104\u0105"+
		"\u0005\u0014\u0000\u0000\u0105\'\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"%\u0000\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108\u010c\u0005\u0014"+
		"\u0000\u0000\u0109\u010b\u0003\u0002\u0001\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0112\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111\u0003*\u0015"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0003,\u0016\u0000\u0116\u0115\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0005\u0007\u0000\u0000\u0119\u011a\u0005(\u0000\u0000\u011a"+
		"\u011b\u0005\u0014\u0000\u0000\u011b)\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005\u0007\u0000\u0000\u011d\u011e\u0005\'\u0000\u0000\u011e\u011f\u0003"+
		"\u001e\u000f\u0000\u011f\u0123\u0005\u0014\u0000\u0000\u0120\u0122\u0003"+
		"\u0002\u0001\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124+\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005\u0007\u0000\u0000\u0127\u0128\u0005&\u0000"+
		"\u0000\u0128\u012c\u0005\u0014\u0000\u0000\u0129\u012b\u0003\u0002\u0001"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d-\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012f\u0131\u00030\u0018\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133/\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0135\u0138\u00032\u0019\u0000\u0136\u0138\u0003"+
		"P(\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u01381\u0001\u0000\u0000\u0000\u0139\u013a\u00034\u001a\u0000\u013a"+
		"\u013e\u00051\u0000\u0000\u013b\u013d\u0003F#\u0000\u013c\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"2\u0000\u0000\u01423\u0001\u0000\u0000\u0000\u0143\u0144\u00036\u001b"+
		"\u0000\u01445\u0001\u0000\u0000\u0000\u0145\u014a\u00038\u001c\u0000\u0146"+
		"\u0147\u00058\u0000\u0000\u0147\u0149\u00038\u001c\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b7\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0151\u0003:\u001d"+
		"\u0000\u014e\u0150\u0003:\u001d\u0000\u014f\u014e\u0001\u0000\u0000\u0000"+
		"\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u01529\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u0003<\u001e\u0000\u0155\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158;\u0001"+
		"\u0000\u0000\u0000\u0159\u0168\u0005:\u0000\u0000\u015a\u0168\u0003D\""+
		"\u0000\u015b\u015d\u0003>\u001f\u0000\u015c\u015e\u0003D\"\u0000\u015d"+
		"\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0168\u0001\u0000\u0000\u0000\u015f\u0161\u0003@ \u0000\u0160\u0162\u0003"+
		"D\"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0168\u0001\u0000\u0000\u0000\u0163\u0165\u0003B!\u0000"+
		"\u0164\u0166\u0003D\"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167"+
		"\u0159\u0001\u0000\u0000\u0000\u0167\u015a\u0001\u0000\u0000\u0000\u0167"+
		"\u015b\u0001\u0000\u0000\u0000\u0167\u015f\u0001\u0000\u0000\u0000\u0167"+
		"\u0163\u0001\u0000\u0000\u0000\u0168=\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0005P\u0000\u0000\u016a?\u0001\u0000\u0000\u0000\u016b\u016c\u00059"+
		"\u0000\u0000\u016c\u016d\u0005P\u0000\u0000\u016dA\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0005;\u0000\u0000\u016f\u0170\u0005P\u0000\u0000\u0170C"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u00056\u0000\u0000\u0172\u0173\u0005"+
		"P\u0000\u0000\u0173E\u0001\u0000\u0000\u0000\u0174\u0175\u0005P\u0000"+
		"\u0000\u0175\u0176\u00056\u0000\u0000\u0176\u0177\u0003L&\u0000\u0177"+
		"\u0178\u00057\u0000\u0000\u0178\u017f\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0005J\u0000\u0000\u017a\u017b\u00056\u0000\u0000\u017b\u017c\u0003L"+
		"&\u0000\u017c\u017d\u00057\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000"+
		"\u017e\u0174\u0001\u0000\u0000\u0000\u017e\u0179\u0001\u0000\u0000\u0000"+
		"\u017fG\u0001\u0000\u0000\u0000\u0180\u0181\u0005P\u0000\u0000\u0181\u0183"+
		"\u00053\u0000\u0000\u0182\u0184\u0003J%\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u00054\u0000\u0000\u0186I\u0001\u0000\u0000\u0000"+
		"\u0187\u018c\u0003L&\u0000\u0188\u0189\u00058\u0000\u0000\u0189\u018b"+
		"\u0003L&\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000"+
		"\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018dK\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u0192\u0003N\'\u0000\u0190\u0193\u0003N\'\u0000\u0191\u0193"+
		"\u00058\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0198\u0001"+
		"\u0000\u0000\u0000\u0196\u0198\u0003N\'\u0000\u0197\u018f\u0001\u0000"+
		"\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198M\u0001\u0000\u0000"+
		"\u0000\u0199\u01ab\u0003H$\u0000\u019a\u019c\u00055\u0000\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u00050\u0000\u0000\u019e\u01a0"+
		"\u0005>\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01ab\u0001\u0000\u0000\u0000\u01a1\u01ab\u0005"+
		"?\u0000\u0000\u01a2\u01ab\u0005@\u0000\u0000\u01a3\u01ab\u0005A\u0000"+
		"\u0000\u01a4\u01ab\u0005B\u0000\u0000\u01a5\u01ab\u0005C\u0000\u0000\u01a6"+
		"\u01ab\u0005Q\u0000\u0000\u01a7\u01ab\u0005P\u0000\u0000\u01a8\u01ab\u0005"+
		"M\u0000\u0000\u01a9\u01ab\u0005L\u0000\u0000\u01aa\u0199\u0001\u0000\u0000"+
		"\u0000\u01aa\u019b\u0001\u0000\u0000\u0000\u01aa\u01a1\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a2\u0001\u0000\u0000\u0000\u01aa\u01a3\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a4\u0001\u0000\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a6\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000"+
		"\u0000\u01abO\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003R)\u0000\u01ad"+
		"Q\u0001\u0000\u0000\u0000\u01ae\u01af\u0005E\u0000\u0000\u01af\u01b0\u0003"+
		"T*\u0000\u01b0\u01b2\u00051\u0000\u0000\u01b1\u01b3\u00032\u0019\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u00052\u0000\u0000\u01b7"+
		"S\u0001\u0000\u0000\u0000\u01b8\u01b9\u00053\u0000\u0000\u01b9\u01ba\u0003"+
		"V+\u0000\u01ba\u01bb\u00054\u0000\u0000\u01bbU\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005P\u0000\u0000\u01bd\u01be\u00056\u0000\u0000\u01be\u01bf"+
		"\u0003L&\u0000\u01bfW\u0001\u0000\u0000\u0000/[cip\u007f\u0086\u008b\u008e"+
		"\u0092\u0098\u009c\u00a0\u00ab\u00b7\u00ce\u00d0\u00d6\u00de\u00e7\u00ee"+
		"\u00f5\u00ff\u010c\u0112\u0116\u0123\u012c\u0132\u0137\u013e\u014a\u0151"+
		"\u0157\u015d\u0161\u0165\u0167\u017e\u0183\u018c\u0192\u0194\u0197\u019b"+
		"\u019f\u01aa\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}