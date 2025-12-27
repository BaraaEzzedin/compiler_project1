// Generated from C:/Users/ASUSD/IdeaProjects/compiler_project1/src/grammer/lexer/ProjectParser.g4 by ANTLR 4.13.2
package grammer.lexer;
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
		JINJA_END_IF=40, IDENTIFIER_JINJA=41, PIPE=42, LPAREN=43, RPAREN=44, STRING_JINJA=45, 
		JINJA_WS=46, NUMBER_CSS=47, LBRACE=48, RBRACE=49, CSS_LPAREN=50, CSS_RPAREN=51, 
		DASH=52, COLON=53, SEMI=54, COMMA=55, DOT=56, STAR=57, HASH=58, TILDE=59, 
		STYLE_CLOSE=60, UNIT=61, COLOR=62, COLOR_RGB=63, COLOR_RGBA=64, COLOR_HSL=65, 
		COLOR_HSLA=66, CSS_IMPORT=67, CSS_MEDIA=68, CSS_FONT_FACE=69, CSS_KEYFRAMES=70, 
		IMPORTANT=71, CSS_KEYWORD=72, CSS_CUSTOM_PROP=73, CSS_URL=74, CSS_CALC=75, 
		CSS_VAR=76, CSS_WS=77, CSS_COMMENT=78, IDENTIFIER_CSS=79, STRING_CSS=80, 
		SEA_WS=81;
	public static final int
		RULE_document = 0, RULE_node = 1, RULE_htmlElement = 2, RULE_normalElement = 3, 
		RULE_selfClosingElement = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, 
		RULE_htmlChardata = 7, RULE_htmlMisc = 8, RULE_script = 9, RULE_style = 10, 
		RULE_jinjaElement = 11, RULE_jinjaVariable = 12, RULE_jinjaBlock = 13, 
		RULE_jinjaBody = 14, RULE_jinjaExpression = 15, RULE_jinjaPrimary = 16, 
		RULE_forStatement = 17, RULE_ifStatement = 18, RULE_elifBlock = 19, RULE_elseBlock = 20, 
		RULE_cssStyle = 21, RULE_cssStatement = 22, RULE_cssRule = 23, RULE_cssSelector = 24, 
		RULE_selectorGroup = 25, RULE_selector = 26, RULE_compoundSelector = 27, 
		RULE_simpleSelector = 28, RULE_typeSelector = 29, RULE_classSelector = 30, 
		RULE_idSelector = 31, RULE_pseudoSelector = 32, RULE_cssDeclaration = 33, 
		RULE_cssFunction = 34, RULE_cssValueList = 35, RULE_cssValue = 36, RULE_cssTerm = 37, 
		RULE_cssAtRule = 38, RULE_cssMedia = 39, RULE_cssMediaQuery = 40, RULE_cssMediaExpr = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "node", "htmlElement", "normalElement", "selfClosingElement", 
			"htmlContent", "htmlAttribute", "htmlChardata", "htmlMisc", "script", 
			"style", "jinjaElement", "jinjaVariable", "jinjaBlock", "jinjaBody", 
			"jinjaExpression", "jinjaPrimary", "forStatement", "ifStatement", "elifBlock", 
			"elseBlock", "cssStyle", "cssStatement", "cssRule", "cssSelector", "selectorGroup", 
			"selector", "compoundSelector", "simpleSelector", "typeSelector", "classSelector", 
			"idSelector", "pseudoSelector", "cssDeclaration", "cssFunction", "cssValueList", 
			"cssValue", "cssTerm", "cssAtRule", "cssMedia", "cssMediaQuery", "cssMediaExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", "'{{'", "'{%'", null, null, "'>'", 
			null, null, null, null, null, null, null, null, "'}}'", "'%}'", null, 
			null, "'+'", null, null, null, "'%'", null, "'=='", null, "'!='", "'&&'", 
			"'||'", "'in'", "'for'", "'endfor'", "'if'", "'else'", "'elif'", "'endif'", 
			null, "'|'", null, null, null, null, null, "'{'", "'}'", null, null, 
			null, "':'", "';'", "','", null, null, "'#'", "'~'", "'</style>'", null, 
			null, null, null, null, null, "'@import'", "'@media'", "'@font-face'", 
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
			"JINJA_END_IF", "IDENTIFIER_JINJA", "PIPE", "LPAREN", "RPAREN", "STRING_JINJA", 
			"JINJA_WS", "NUMBER_CSS", "LBRACE", "RBRACE", "CSS_LPAREN", "CSS_RPAREN", 
			"DASH", "COLON", "SEMI", "COMMA", "DOT", "STAR", "HASH", "TILDE", "STYLE_CLOSE", 
			"UNIT", "COLOR", "COLOR_RGB", "COLOR_RGBA", "COLOR_HSL", "COLOR_HSLA", 
			"CSS_IMPORT", "CSS_MEDIA", "CSS_FONT_FACE", "CSS_KEYFRAMES", "IMPORTANT", 
			"CSS_KEYWORD", "CSS_CUSTOM_PROP", "CSS_URL", "CSS_CALC", "CSS_VAR", "CSS_WS", 
			"CSS_COMMENT", "IDENTIFIER_CSS", "STRING_CSS", "SEA_WS"
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
	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	 
		public DocumentContext() { }
		public void copyFrom(DocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends DocumentContext {
		public TerminalNode EOF() { return getToken(ProjectParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ProgramContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) {
				{
				{
				setState(84);
				node();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
				_localctx = new HtmlNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				htmlElement();
				}
				break;
			case JINJA_VAR_OPEN:
			case JINJA_BLOCK_OPEN:
				_localctx = new JinjaNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				jinjaElement();
				}
				break;
			case HTML_TEXT:
				_localctx = new TextNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new HtmlNormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				normalElement();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				selfClosingElement();
				}
				break;
			case 3:
				_localctx = new HtmlScriptElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				script();
				}
				break;
			case 4:
				_localctx = new HtmlStyleElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
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
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(TAG_OPEN);
			setState(104);
			match(TAG_NAME);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(105);
				htmlAttribute();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(TAG_CLOSE);
			setState(112);
			htmlContent();
			setState(113);
			match(TAG_OPEN);
			setState(114);
			match(TAG_SLASH);
			setState(115);
			match(TAG_NAME);
			setState(116);
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
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(TAG_OPEN);
			setState(119);
			match(TAG_NAME);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(120);
				htmlAttribute();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(TAG_SLASH);
			setState(127);
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
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HTML_TEXT || _la==SEA_WS) {
				{
				setState(129);
				htmlChardata();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(132);
						htmlElement();
						}
						break;
					case JINJA_VAR_OPEN:
					case JINJA_BLOCK_OPEN:
						{
						setState(133);
						jinjaElement();
						}
						break;
					case HTML_COMMENT:
						{
						setState(134);
						match(HTML_COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HTML_TEXT || _la==SEA_WS) {
						{
						setState(137);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(144);
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
		public TerminalNode TAG_NAME() { return getToken(ProjectParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ProjectParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ProjectParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(TAG_NAME);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(146);
				match(TAG_EQUALS);
				setState(147);
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
		public TerminalNode HTML_TEXT() { return getToken(ProjectParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(ProjectParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==HTML_TEXT || _la==SEA_WS) ) {
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(ProjectParser.HTML_COMMENT, 0); }
		public TerminalNode SEA_WS() { return getToken(ProjectParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlMisc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==SEA_WS) ) {
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
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(ProjectParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(ProjectParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(ProjectParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(SCRIPT_OPEN);
			setState(155);
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
		public TerminalNode STYLE_OPEN() { return getToken(ProjectParser.STYLE_OPEN, 0); }
		public CssStyleContext cssStyle() {
			return getRuleContext(CssStyleContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(ProjectParser.STYLE_CLOSE, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(STYLE_OPEN);
			setState(158);
			cssStyle();
			setState(159);
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
		public JinjaVariableContext jinjaVariable() {
			return getRuleContext(JinjaVariableContext.class,0);
		}
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaElementContext jinjaElement() throws RecognitionException {
		JinjaElementContext _localctx = new JinjaElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaElement);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				jinjaVariable();
				}
				break;
			case JINJA_BLOCK_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		public TerminalNode JINJA_VAR_OPEN() { return getToken(ProjectParser.JINJA_VAR_OPEN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode JINJA_VAR_CLOSE() { return getToken(ProjectParser.JINJA_VAR_CLOSE, 0); }
		public JinjaVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaVariableContext jinjaVariable() throws RecognitionException {
		JinjaVariableContext _localctx = new JinjaVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(JINJA_VAR_OPEN);
			setState(166);
			jinjaExpression(0);
			setState(167);
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
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public JinjaBodyContext jinjaBody() {
			return getRuleContext(JinjaBodyContext.class,0);
		}
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(JINJA_BLOCK_OPEN);
			setState(170);
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
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBodyContext jinjaBody() throws RecognitionException {
		JinjaBodyContext _localctx = new JinjaBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinjaBody);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				forStatement();
				}
				break;
			case JINJA_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				ifStatement();
				}
				break;
			case NUMBER_JINJA:
			case IDENTIFIER_JINJA:
			case LPAREN:
			case STRING_JINJA:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
		public JinjaPrimaryContext jinjaPrimary() {
			return getRuleContext(JinjaPrimaryContext.class,0);
		}
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public TerminalNode PLUS_JINJA() { return getToken(ProjectParser.PLUS_JINJA, 0); }
		public TerminalNode MINUS_JINJA() { return getToken(ProjectParser.MINUS_JINJA, 0); }
		public TerminalNode MULTI_JINJA() { return getToken(ProjectParser.MULTI_JINJA, 0); }
		public TerminalNode EQUALS_EQUALS_JINJA() { return getToken(ProjectParser.EQUALS_EQUALS_JINJA, 0); }
		public TerminalNode NOT_EQUALS_JINJA() { return getToken(ProjectParser.NOT_EQUALS_JINJA, 0); }
		public TerminalNode PIPE() { return getToken(ProjectParser.PIPE, 0); }
		public TerminalNode IDENTIFIER_JINJA() { return getToken(ProjectParser.IDENTIFIER_JINJA, 0); }
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
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
			setState(178);
			jinjaPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new JinjaExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
						match(PLUS_JINJA);
						setState(182);
						jinjaExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new JinjaExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(184);
						match(MINUS_JINJA);
						setState(185);
						jinjaExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new JinjaExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						match(MULTI_JINJA);
						setState(188);
						jinjaExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new JinjaExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(190);
						match(EQUALS_EQUALS_JINJA);
						setState(191);
						jinjaExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new JinjaExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						match(NOT_EQUALS_JINJA);
						setState(194);
						jinjaExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new JinjaExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jinjaExpression);
						setState(195);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(196);
						match(PIPE);
						setState(197);
						match(IDENTIFIER_JINJA);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public List<TerminalNode> IDENTIFIER_JINJA() { return getTokens(ProjectParser.IDENTIFIER_JINJA); }
		public TerminalNode IDENTIFIER_JINJA(int i) {
			return getToken(ProjectParser.IDENTIFIER_JINJA, i);
		}
		public List<TerminalNode> DOT_JINJA() { return getTokens(ProjectParser.DOT_JINJA); }
		public TerminalNode DOT_JINJA(int i) {
			return getToken(ProjectParser.DOT_JINJA, i);
		}
		public TerminalNode NUMBER_JINJA() { return getToken(ProjectParser.NUMBER_JINJA, 0); }
		public TerminalNode STRING_JINJA() { return getToken(ProjectParser.STRING_JINJA, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectParser.LPAREN, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectParser.RPAREN, 0); }
		public JinjaPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterJinjaPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitJinjaPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitJinjaPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPrimaryContext jinjaPrimary() throws RecognitionException {
		JinjaPrimaryContext _localctx = new JinjaPrimaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaPrimary);
		try {
			int _alt;
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_JINJA:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IDENTIFIER_JINJA);
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						match(DOT_JINJA);
						setState(205);
						match(IDENTIFIER_JINJA);
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case NUMBER_JINJA:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(NUMBER_JINJA);
				}
				break;
			case STRING_JINJA:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(STRING_JINJA);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(LPAREN);
				setState(214);
				jinjaExpression(0);
				setState(215);
				match(RPAREN);
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
	public static class ForStatementContext extends ParserRuleContext {
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
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(JINJA_FOR);
			setState(220);
			match(IDENTIFIER_JINJA);
			setState(221);
			match(JINJA_IN);
			setState(222);
			jinjaExpression(0);
			setState(223);
			match(JINJA_BLOCK_CLOSE);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					node();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(230);
			match(JINJA_BLOCK_OPEN);
			setState(231);
			match(JINJA_END_FOR);
			setState(232);
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(JINJA_IF);
			setState(235);
			jinjaExpression(0);
			setState(236);
			match(JINJA_BLOCK_CLOSE);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					node();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					elifBlock();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(249);
				elseBlock();
				}
				break;
			}
			setState(252);
			match(JINJA_BLOCK_OPEN);
			setState(253);
			match(JINJA_END_IF);
			setState(254);
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
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(JINJA_BLOCK_OPEN);
			setState(257);
			match(JINJA_ELIF);
			setState(258);
			jinjaExpression(0);
			setState(259);
			match(JINJA_BLOCK_CLOSE);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					node();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode JINJA_BLOCK_OPEN() { return getToken(ProjectParser.JINJA_BLOCK_OPEN, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(ProjectParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_BLOCK_CLOSE() { return getToken(ProjectParser.JINJA_BLOCK_CLOSE, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(JINJA_BLOCK_OPEN);
			setState(267);
			match(JINJA_ELSE);
			setState(268);
			match(JINJA_BLOCK_CLOSE);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					node();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public List<CssStatementContext> cssStatement() {
			return getRuleContexts(CssStatementContext.class);
		}
		public CssStatementContext cssStatement(int i) {
			return getRuleContext(CssStatementContext.class,i);
		}
		public CssStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStyleContext cssStyle() throws RecognitionException {
		CssStyleContext _localctx = new CssStyleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 67141689L) != 0)) {
				{
				{
				setState(275);
				cssStatement();
				}
				}
				setState(280);
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
		public CssRuleContext cssRule() {
			return getRuleContext(CssRuleContext.class,0);
		}
		public CssAtRuleContext cssAtRule() {
			return getRuleContext(CssAtRuleContext.class,0);
		}
		public CssStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStatementContext cssStatement() throws RecognitionException {
		CssStatementContext _localctx = new CssStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cssStatement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
			case DOT:
			case STAR:
			case HASH:
			case IDENTIFIER_CSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				cssRule();
				}
				break;
			case CSS_MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			cssSelector();
			setState(286);
			match(LBRACE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_CUSTOM_PROP || _la==IDENTIFIER_CSS) {
				{
				{
				setState(287);
				cssDeclaration();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cssSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			selector();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(298);
				match(COMMA);
				setState(299);
				selector();
				}
				}
				setState(304);
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
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			compoundSelector();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 67108921L) != 0)) {
				{
				{
				setState(306);
				compoundSelector();
				}
				}
				setState(311);
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
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCompoundSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCompoundSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCompoundSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compoundSelector);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(312);
					simpleSelector();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode STAR() { return getToken(ProjectParser.STAR, 0); }
		public PseudoSelectorContext pseudoSelector() {
			return getRuleContext(PseudoSelectorContext.class,0);
		}
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public IdSelectorContext idSelector() {
			return getRuleContext(IdSelectorContext.class,0);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_simpleSelector);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(STAR);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				pseudoSelector();
				}
				break;
			case IDENTIFIER_CSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				typeSelector();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(320);
					pseudoSelector();
					}
					break;
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				classSelector();
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(324);
					pseudoSelector();
					}
					break;
				}
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				idSelector();
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(328);
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
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		public TerminalNode DOT() { return getToken(ProjectParser.DOT, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(DOT);
			setState(336);
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
		public TerminalNode HASH() { return getToken(ProjectParser.HASH, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_idSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(HASH);
			setState(339);
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
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public PseudoSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitPseudoSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitPseudoSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoSelectorContext pseudoSelector() throws RecognitionException {
		PseudoSelectorContext _localctx = new PseudoSelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pseudoSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(COLON);
			setState(342);
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
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectParser.SEMI, 0); }
		public TerminalNode CSS_CUSTOM_PROP() { return getToken(ProjectParser.CSS_CUSTOM_PROP, 0); }
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cssDeclaration);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_CSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(IDENTIFIER_CSS);
				setState(345);
				match(COLON);
				setState(346);
				cssValue();
				setState(347);
				match(SEMI);
				}
				break;
			case CSS_CUSTOM_PROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(CSS_CUSTOM_PROP);
				setState(350);
				match(COLON);
				setState(351);
				cssValue();
				setState(352);
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
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(ProjectParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(ProjectParser.CSS_RPAREN, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cssFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IDENTIFIER_CSS);
			setState(357);
			match(CSS_LPAREN);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 13691224097L) != 0)) {
				{
				setState(358);
				cssValueList();
				}
			}

			setState(361);
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
		public CssValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListContext cssValueList() throws RecognitionException {
		CssValueListContext _localctx = new CssValueListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cssValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			cssValue();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				cssValue();
				}
				}
				setState(370);
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
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cssValue);
		try {
			int _alt;
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				cssTerm();
				setState(374); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(374);
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
							setState(372);
							cssTerm();
							}
							break;
						case COMMA:
							{
							setState(373);
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
					setState(376); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
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
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public TerminalNode NUMBER_CSS() { return getToken(ProjectParser.NUMBER_CSS, 0); }
		public TerminalNode DASH() { return getToken(ProjectParser.DASH, 0); }
		public TerminalNode UNIT() { return getToken(ProjectParser.UNIT, 0); }
		public TerminalNode COLOR() { return getToken(ProjectParser.COLOR, 0); }
		public TerminalNode COLOR_RGB() { return getToken(ProjectParser.COLOR_RGB, 0); }
		public TerminalNode COLOR_RGBA() { return getToken(ProjectParser.COLOR_RGBA, 0); }
		public TerminalNode COLOR_HSL() { return getToken(ProjectParser.COLOR_HSL, 0); }
		public TerminalNode COLOR_HSLA() { return getToken(ProjectParser.COLOR_HSLA, 0); }
		public TerminalNode STRING_CSS() { return getToken(ProjectParser.STRING_CSS, 0); }
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode CSS_VAR() { return getToken(ProjectParser.CSS_VAR, 0); }
		public TerminalNode CSS_CALC() { return getToken(ProjectParser.CSS_CALC, 0); }
		public CssTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssTermContext cssTerm() throws RecognitionException {
		CssTermContext _localctx = new CssTermContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cssTerm);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				cssFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DASH) {
					{
					setState(382);
					match(DASH);
					}
				}

				setState(385);
				match(NUMBER_CSS);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(386);
					match(UNIT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(COLOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(COLOR_RGB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				match(COLOR_RGBA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				match(COLOR_HSL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
				match(COLOR_HSLA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(394);
				match(STRING_CSS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(395);
				match(IDENTIFIER_CSS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(396);
				match(CSS_VAR);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(397);
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
		public CssMediaContext cssMedia() {
			return getRuleContext(CssMediaContext.class,0);
		}
		public CssAtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAtRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAtRuleContext cssAtRule() throws RecognitionException {
		CssAtRuleContext _localctx = new CssAtRuleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cssAtRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		public CssMediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMedia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaContext cssMedia() throws RecognitionException {
		CssMediaContext _localctx = new CssMediaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cssMedia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(CSS_MEDIA);
			setState(403);
			cssMediaQuery();
			setState(404);
			match(LBRACE);
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				cssRule();
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 67108921L) != 0) );
			setState(410);
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
		public TerminalNode CSS_LPAREN() { return getToken(ProjectParser.CSS_LPAREN, 0); }
		public CssMediaExprContext cssMediaExpr() {
			return getRuleContext(CssMediaExprContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(ProjectParser.CSS_RPAREN, 0); }
		public CssMediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaQueryContext cssMediaQuery() throws RecognitionException {
		CssMediaQueryContext _localctx = new CssMediaQueryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cssMediaQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(CSS_LPAREN);
			setState(413);
			cssMediaExpr();
			setState(414);
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
		public TerminalNode IDENTIFIER_CSS() { return getToken(ProjectParser.IDENTIFIER_CSS, 0); }
		public TerminalNode COLON() { return getToken(ProjectParser.COLON, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public CssMediaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssMediaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).enterCssMediaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjectParserListener ) ((ProjectParserListener)listener).exitCssMediaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectParserVisitor ) return ((ProjectParserVisitor<? extends T>)visitor).visitCssMediaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssMediaExprContext cssMediaExpr() throws RecognitionException {
		CssMediaExprContext _localctx = new CssMediaExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cssMediaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(IDENTIFIER_CSS);
			setState(417);
			match(COLON);
			setState(418);
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
		"\u0004\u0001Q\u01a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000"+
		"Y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001`\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002f\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"k\b\u0003\n\u0003\f\u0003n\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004z\b\u0004\n\u0004\f\u0004}\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0088\b\u0005\u0001\u0005\u0003\u0005"+
		"\u008b\b\u0005\u0005\u0005\u008d\b\u0005\n\u0005\f\u0005\u0090\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0095\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00a4\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00b0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00c7\b\u000f\n\u000f\f\u000f\u00ca\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00cf\b\u0010\n\u0010\f\u0010\u00d2\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00da\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00e2\b\u0011\n\u0011\f\u0011\u00e5\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00ef\b\u0012\n\u0012\f\u0012\u00f2"+
		"\t\u0012\u0001\u0012\u0005\u0012\u00f5\b\u0012\n\u0012\f\u0012\u00f8\t"+
		"\u0012\u0001\u0012\u0003\u0012\u00fb\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0106\b\u0013\n\u0013\f\u0013\u0109\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u010f\b\u0014\n\u0014"+
		"\f\u0014\u0112\t\u0014\u0001\u0015\u0005\u0015\u0115\b\u0015\n\u0015\f"+
		"\u0015\u0118\t\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u011c\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0121\b\u0017\n\u0017"+
		"\f\u0017\u0124\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u012d\b\u0019\n\u0019"+
		"\f\u0019\u0130\t\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0134\b\u001a"+
		"\n\u001a\f\u001a\u0137\t\u001a\u0001\u001b\u0004\u001b\u013a\b\u001b\u000b"+
		"\u001b\f\u001b\u013b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0142\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0146\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u014a\b\u001c\u0003\u001c\u014c\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0163\b!\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0168\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0005#\u016f\b#\n#\f#\u0172\t#\u0001$\u0001$\u0001$\u0004$\u0177\b$"+
		"\u000b$\f$\u0178\u0001$\u0003$\u017c\b$\u0001%\u0001%\u0003%\u0180\b%"+
		"\u0001%\u0001%\u0003%\u0184\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u018f\b%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0004\'\u0197\b\'\u000b\'\f\'\u0198\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0000\u0001\u001e"+
		"*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0003\u0002\u0000\b\bQQ"+
		"\u0002\u0000\u0001\u0001QQ\u0001\u0000\u000f\u0010\u01bb\u0000W\u0001"+
		"\u0000\u0000\u0000\u0002_\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000"+
		"\u0000\u0006g\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\n\u0082"+
		"\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u0096\u0001"+
		"\u0000\u0000\u0000\u0010\u0098\u0001\u0000\u0000\u0000\u0012\u009a\u0001"+
		"\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u00a3\u0001"+
		"\u0000\u0000\u0000\u0018\u00a5\u0001\u0000\u0000\u0000\u001a\u00a9\u0001"+
		"\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b1\u0001"+
		"\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\"\u00db\u0001\u0000"+
		"\u0000\u0000$\u00ea\u0001\u0000\u0000\u0000&\u0100\u0001\u0000\u0000\u0000"+
		"(\u010a\u0001\u0000\u0000\u0000*\u0116\u0001\u0000\u0000\u0000,\u011b"+
		"\u0001\u0000\u0000\u0000.\u011d\u0001\u0000\u0000\u00000\u0127\u0001\u0000"+
		"\u0000\u00002\u0129\u0001\u0000\u0000\u00004\u0131\u0001\u0000\u0000\u0000"+
		"6\u0139\u0001\u0000\u0000\u00008\u014b\u0001\u0000\u0000\u0000:\u014d"+
		"\u0001\u0000\u0000\u0000<\u014f\u0001\u0000\u0000\u0000>\u0152\u0001\u0000"+
		"\u0000\u0000@\u0155\u0001\u0000\u0000\u0000B\u0162\u0001\u0000\u0000\u0000"+
		"D\u0164\u0001\u0000\u0000\u0000F\u016b\u0001\u0000\u0000\u0000H\u017b"+
		"\u0001\u0000\u0000\u0000J\u018e\u0001\u0000\u0000\u0000L\u0190\u0001\u0000"+
		"\u0000\u0000N\u0192\u0001\u0000\u0000\u0000P\u019c\u0001\u0000\u0000\u0000"+
		"R\u01a0\u0001\u0000\u0000\u0000TV\u0003\u0002\u0001\u0000UT\u0001\u0000"+
		"\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0000\u0000\u0001[\u0001\u0001\u0000\u0000\u0000\\`\u0003\u0004"+
		"\u0002\u0000]`\u0003\u0016\u000b\u0000^`\u0005\b\u0000\u0000_\\\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`\u0003\u0001\u0000\u0000\u0000af\u0003\u0006\u0003\u0000bf\u0003\b\u0004"+
		"\u0000cf\u0003\u0012\t\u0000df\u0003\u0014\n\u0000ea\u0001\u0000\u0000"+
		"\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000f\u0005\u0001\u0000\u0000\u0000gh\u0005\u0005\u0000\u0000"+
		"hl\u0005\r\u0000\u0000ik\u0003\f\u0006\u0000ji\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\n\u0000"+
		"\u0000pq\u0003\n\u0005\u0000qr\u0005\u0005\u0000\u0000rs\u0005\u000b\u0000"+
		"\u0000st\u0005\r\u0000\u0000tu\u0005\n\u0000\u0000u\u0007\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0005\u0000\u0000w{\u0005\r\u0000\u0000xz\u0003\f"+
		"\u0006\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u0080"+
		"\u0005\n\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000\u0081\u0083\u0003"+
		"\u000e\u0007\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u008e\u0001\u0000\u0000\u0000\u0084\u0088\u0003"+
		"\u0004\u0002\u0000\u0085\u0088\u0003\u0016\u000b\u0000\u0086\u0088\u0005"+
		"\u0001\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u000b\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0094\u0005\r\u0000\u0000\u0092\u0093\u0005\f"+
		"\u0000\u0000\u0093\u0095\u0005\u0011\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\r\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u000f\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0007\u0001\u0000\u0000\u0099\u0011\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u009c\u0007\u0002\u0000"+
		"\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0004\u0000"+
		"\u0000\u009e\u009f\u0003*\u0015\u0000\u009f\u00a0\u0005<\u0000\u0000\u00a0"+
		"\u0015\u0001\u0000\u0000\u0000\u00a1\u00a4\u0003\u0018\f\u0000\u00a2\u00a4"+
		"\u0003\u001a\r\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u0017\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0006\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f\u0000\u00a7\u00a8\u0005"+
		"\u0013\u0000\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0007\u0000\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u001b\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b0\u0003\"\u0011\u0000\u00ad\u00b0\u0003$"+
		"\u0012\u0000\u00ae\u00b0\u0003\u001e\u000f\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u000f"+
		"\uffff\uffff\u0000\u00b2\u00b3\u0003 \u0010\u0000\u00b3\u00c8\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\n\u0006\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000"+
		"\u0000\u00b6\u00c7\u0003\u001e\u000f\u0007\u00b7\u00b8\n\u0005\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0018\u0000\u0000\u00b9\u00c7\u0003\u001e\u000f\u0006"+
		"\u00ba\u00bb\n\u0004\u0000\u0000\u00bb\u00bc\u0005\u0019\u0000\u0000\u00bc"+
		"\u00c7\u0003\u001e\u000f\u0005\u00bd\u00be\n\u0003\u0000\u0000\u00be\u00bf"+
		"\u0005\u001d\u0000\u0000\u00bf\u00c7\u0003\u001e\u000f\u0004\u00c0\u00c1"+
		"\n\u0002\u0000\u0000\u00c1\u00c2\u0005\u001f\u0000\u0000\u00c2\u00c7\u0003"+
		"\u001e\u000f\u0003\u00c3\u00c4\n\u0001\u0000\u0000\u00c4\u00c5\u0005*"+
		"\u0000\u0000\u00c5\u00c7\u0005)\u0000\u0000\u00c6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00b7\u0001\u0000\u0000\u0000\u00c6\u00ba\u0001\u0000\u0000"+
		"\u0000\u00c6\u00bd\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00d0\u0005)\u0000\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000"+
		"\u00cd\u00cf\u0005)\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00da\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00da\u0005\u0015\u0000\u0000\u00d4"+
		"\u00da\u0005-\u0000\u0000\u00d5\u00d6\u0005+\u0000\u0000\u00d6\u00d7\u0003"+
		"\u001e\u000f\u0000\u00d7\u00d8\u0005,\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00cb\u0001\u0000\u0000\u0000\u00d9\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000"+
		"\u0000\u0000\u00da!\u0001\u0000\u0000\u0000\u00db\u00dc\u0005#\u0000\u0000"+
		"\u00dc\u00dd\u0005)\u0000\u0000\u00dd\u00de\u0005\"\u0000\u0000\u00de"+
		"\u00df\u0003\u001e\u000f\u0000\u00df\u00e3\u0005\u0014\u0000\u0000\u00e0"+
		"\u00e2\u0003\u0002\u0001\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0007\u0000\u0000\u00e7"+
		"\u00e8\u0005$\u0000\u0000\u00e8\u00e9\u0005\u0014\u0000\u0000\u00e9#\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0005%\u0000\u0000\u00eb\u00ec\u0003\u001e"+
		"\u000f\u0000\u00ec\u00f0\u0005\u0014\u0000\u0000\u00ed\u00ef\u0003\u0002"+
		"\u0001\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f6\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0003&\u0013\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003(\u0014\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0007\u0000\u0000"+
		"\u00fd\u00fe\u0005(\u0000\u0000\u00fe\u00ff\u0005\u0014\u0000\u0000\u00ff"+
		"%\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0007\u0000\u0000\u0101\u0102"+
		"\u0005\'\u0000\u0000\u0102\u0103\u0003\u001e\u000f\u0000\u0103\u0107\u0005"+
		"\u0014\u0000\u0000\u0104\u0106\u0003\u0002\u0001\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\'\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0007"+
		"\u0000\u0000\u010b\u010c\u0005&\u0000\u0000\u010c\u0110\u0005\u0014\u0000"+
		"\u0000\u010d\u010f\u0003\u0002\u0001\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111)\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115\u0003,\u0016\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"+\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011c"+
		"\u0003.\u0017\u0000\u011a\u011c\u0003L&\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c-\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u00030\u0018\u0000\u011e\u0122\u00050\u0000\u0000\u011f"+
		"\u0121\u0003B!\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u00051\u0000\u0000\u0126/\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u00032\u0019\u0000\u01281\u0001\u0000\u0000\u0000\u0129"+
		"\u012e\u00034\u001a\u0000\u012a\u012b\u00057\u0000\u0000\u012b\u012d\u0003"+
		"4\u001a\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f3\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0135\u00036\u001b\u0000\u0132\u0134\u00036\u001b\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"5\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013a"+
		"\u00038\u001c\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c7\u0001\u0000\u0000\u0000\u013d\u014c\u00059\u0000"+
		"\u0000\u013e\u014c\u0003@ \u0000\u013f\u0141\u0003:\u001d\u0000\u0140"+
		"\u0142\u0003@ \u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u014c\u0001\u0000\u0000\u0000\u0143\u0145\u0003"+
		"<\u001e\u0000\u0144\u0146\u0003@ \u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u014c\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0003>\u001f\u0000\u0148\u014a\u0003@ \u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u0001\u0000\u0000\u0000\u014b\u013d\u0001\u0000\u0000\u0000\u014b"+
		"\u013e\u0001\u0000\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014b"+
		"\u0143\u0001\u0000\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014c"+
		"9\u0001\u0000\u0000\u0000\u014d\u014e\u0005O\u0000\u0000\u014e;\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u00058\u0000\u0000\u0150\u0151\u0005O\u0000"+
		"\u0000\u0151=\u0001\u0000\u0000\u0000\u0152\u0153\u0005:\u0000\u0000\u0153"+
		"\u0154\u0005O\u0000\u0000\u0154?\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"5\u0000\u0000\u0156\u0157\u0005O\u0000\u0000\u0157A\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005O\u0000\u0000\u0159\u015a\u00055\u0000\u0000\u015a"+
		"\u015b\u0003H$\u0000\u015b\u015c\u00056\u0000\u0000\u015c\u0163\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0005I\u0000\u0000\u015e\u015f\u00055\u0000"+
		"\u0000\u015f\u0160\u0003H$\u0000\u0160\u0161\u00056\u0000\u0000\u0161"+
		"\u0163\u0001\u0000\u0000\u0000\u0162\u0158\u0001\u0000\u0000\u0000\u0162"+
		"\u015d\u0001\u0000\u0000\u0000\u0163C\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0005O\u0000\u0000\u0165\u0167\u00052\u0000\u0000\u0166\u0168\u0003F"+
		"#\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u00053\u0000\u0000"+
		"\u016aE\u0001\u0000\u0000\u0000\u016b\u0170\u0003H$\u0000\u016c\u016d"+
		"\u00057\u0000\u0000\u016d\u016f\u0003H$\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171G\u0001\u0000\u0000"+
		"\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0176\u0003J%\u0000\u0174"+
		"\u0177\u0003J%\u0000\u0175\u0177\u00057\u0000\u0000\u0176\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u017c\u0003"+
		"J%\u0000\u017b\u0173\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017cI\u0001\u0000\u0000\u0000\u017d\u018f\u0003D\"\u0000\u017e"+
		"\u0180\u00054\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183"+
		"\u0005/\u0000\u0000\u0182\u0184\u0005=\u0000\u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u018f\u0001\u0000"+
		"\u0000\u0000\u0185\u018f\u0005>\u0000\u0000\u0186\u018f\u0005?\u0000\u0000"+
		"\u0187\u018f\u0005@\u0000\u0000\u0188\u018f\u0005A\u0000\u0000\u0189\u018f"+
		"\u0005B\u0000\u0000\u018a\u018f\u0005P\u0000\u0000\u018b\u018f\u0005O"+
		"\u0000\u0000\u018c\u018f\u0005L\u0000\u0000\u018d\u018f\u0005K\u0000\u0000"+
		"\u018e\u017d\u0001\u0000\u0000\u0000\u018e\u017f\u0001\u0000\u0000\u0000"+
		"\u018e\u0185\u0001\u0000\u0000\u0000\u018e\u0186\u0001\u0000\u0000\u0000"+
		"\u018e\u0187\u0001\u0000\u0000\u0000\u018e\u0188\u0001\u0000\u0000\u0000"+
		"\u018e\u0189\u0001\u0000\u0000\u0000\u018e\u018a\u0001\u0000\u0000\u0000"+
		"\u018e\u018b\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000"+
		"\u018e\u018d\u0001\u0000\u0000\u0000\u018fK\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0003N\'\u0000\u0191M\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		"D\u0000\u0000\u0193\u0194\u0003P(\u0000\u0194\u0196\u00050\u0000\u0000"+
		"\u0195\u0197\u0003.\u0017\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u00051\u0000\u0000\u019bO\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"2\u0000\u0000\u019d\u019e\u0003R)\u0000\u019e\u019f\u00053\u0000\u0000"+
		"\u019fQ\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005O\u0000\u0000\u01a1\u01a2"+
		"\u00055\u0000\u0000\u01a2\u01a3\u0003H$\u0000\u01a3S\u0001\u0000\u0000"+
		"\u0000*W_el{\u0082\u0087\u008a\u008e\u0094\u00a3\u00af\u00c6\u00c8\u00d0"+
		"\u00d9\u00e3\u00f0\u00f6\u00fa\u0107\u0110\u0116\u011b\u0122\u012e\u0135"+
		"\u013b\u0141\u0145\u0149\u014b\u0162\u0167\u0170\u0176\u0178\u017b\u017f"+
		"\u0183\u018e\u0198";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}