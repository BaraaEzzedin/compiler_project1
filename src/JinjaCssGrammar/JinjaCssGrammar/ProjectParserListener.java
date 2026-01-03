// Generated from /home/mohee/compiler_project1/src/JinjaCssGrammar/ProjectParser.g4 by ANTLR 4.13.2
package JinjaCssGrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramDef}
	 * labeled alternative in {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramDef(ProjectParser.ProgramDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramDef}
	 * labeled alternative in {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramDef(ProjectParser.ProgramDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNode(ProjectParser.HtmlNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNode(ProjectParser.HtmlNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 */
	void enterJinjaNode(ProjectParser.JinjaNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 */
	void exitJinjaNode(ProjectParser.JinjaNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(ProjectParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(ProjectParser.TextNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNormalElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNormalElement(ProjectParser.HtmlNormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNormalElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNormalElement(ProjectParser.HtmlNormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfClosingElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingElement(ProjectParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfClosingElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingElement(ProjectParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlScriptElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlScriptElement(ProjectParser.HtmlScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlScriptElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlScriptElement(ProjectParser.HtmlScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlStyleElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyleElement(ProjectParser.HtmlStyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlStyleElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyleElement(ProjectParser.HtmlStyleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link ProjectParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalTag(ProjectParser.NormalTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link ProjectParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalTag(ProjectParser.NormalTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfCloseTag}
	 * labeled alternative in {@link ProjectParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfCloseTag(ProjectParser.SelfCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfCloseTag}
	 * labeled alternative in {@link ProjectParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfCloseTag(ProjectParser.SelfCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Content}
	 * labeled alternative in {@link ProjectParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterContent(ProjectParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Content}
	 * labeled alternative in {@link ProjectParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitContent(ProjectParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link ProjectParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ProjectParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link ProjectParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ProjectParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlText}
	 * labeled alternative in {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlText(ProjectParser.HtmlTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlText}
	 * labeled alternative in {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlText(ProjectParser.HtmlTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSpace}
	 * labeled alternative in {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSpace(ProjectParser.HtmlSpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSpace}
	 * labeled alternative in {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSpace(ProjectParser.HtmlSpaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(ProjectParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(ProjectParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlWhiteSpace}
	 * labeled alternative in {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlWhiteSpace(ProjectParser.HtmlWhiteSpaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlWhiteSpace}
	 * labeled alternative in {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlWhiteSpace(ProjectParser.HtmlWhiteSpaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlScript}
	 * labeled alternative in {@link ProjectParser#script}.
	 * @param ctx the parse tree
	 */
	void enterHtmlScript(ProjectParser.HtmlScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlScript}
	 * labeled alternative in {@link ProjectParser#script}.
	 * @param ctx the parse tree
	 */
	void exitHtmlScript(ProjectParser.HtmlScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlStyle}
	 * labeled alternative in {@link ProjectParser#style}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStyle(ProjectParser.HtmlStyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlStyle}
	 * labeled alternative in {@link ProjectParser#style}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStyle(ProjectParser.HtmlStyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVariableElement}
	 * labeled alternative in {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVariableElement(ProjectParser.JinjaVariableElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVariableElement}
	 * labeled alternative in {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVariableElement(ProjectParser.JinjaVariableElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockElement}
	 * labeled alternative in {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockElement(ProjectParser.JinjaBlockElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockElement}
	 * labeled alternative in {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockElement(ProjectParser.JinjaBlockElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProjectParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ProjectParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProjectParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ProjectParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bloc}
	 * labeled alternative in {@link ProjectParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterBloc(ProjectParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bloc}
	 * labeled alternative in {@link ProjectParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitBloc(ProjectParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForBody(ProjectParser.JinjaForBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForBody(ProjectParser.JinjaForBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfBody(ProjectParser.JinjaIfBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfBody(ProjectParser.JinjaIfBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionBody(ProjectParser.JinjaExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionBody(ProjectParser.JinjaExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaPrimaryExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPrimaryExpr(ProjectParser.JinjaPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaPrimaryExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPrimaryExpr(ProjectParser.JinjaPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaFilterExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilterExpr(ProjectParser.JinjaFilterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaFilterExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilterExpr(ProjectParser.JinjaFilterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaMulExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMulExpr(ProjectParser.JinjaMulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaMulExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMulExpr(ProjectParser.JinjaMulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaEqExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaEqExpr(ProjectParser.JinjaEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaEqExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaEqExpr(ProjectParser.JinjaEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaAddExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAddExpr(ProjectParser.JinjaAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaAddExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAddExpr(ProjectParser.JinjaAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaSubExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSubExpr(ProjectParser.JinjaSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaSubExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSubExpr(ProjectParser.JinjaSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaNeqExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaNeqExpr(ProjectParser.JinjaNeqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaNeqExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaNeqExpr(ProjectParser.JinjaNeqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIdentifier}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIdentifier(ProjectParser.JinjaIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIdentifier}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIdentifier(ProjectParser.JinjaIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaNumber}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJinjaNumber(ProjectParser.JinjaNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaNumber}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJinjaNumber(ProjectParser.JinjaNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaString}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJinjaString(ProjectParser.JinjaStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaString}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJinjaString(ProjectParser.JinjaStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaParenExpr}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJinjaParenExpr(ProjectParser.JinjaParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaParenExpr}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJinjaParenExpr(ProjectParser.JinjaParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForStatement}
	 * labeled alternative in {@link ProjectParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForStatement(ProjectParser.JinjaForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForStatement}
	 * labeled alternative in {@link ProjectParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForStatement(ProjectParser.JinjaForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfStatement}
	 * labeled alternative in {@link ProjectParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfStatement(ProjectParser.JinjaIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfStatement}
	 * labeled alternative in {@link ProjectParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfStatement(ProjectParser.JinjaIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaElifBlock}
	 * labeled alternative in {@link ProjectParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElifBlock(ProjectParser.JinjaElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaElifBlock}
	 * labeled alternative in {@link ProjectParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElifBlock(ProjectParser.JinjaElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaElseBlock}
	 * labeled alternative in {@link ProjectParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElseBlock(ProjectParser.JinjaElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaElseBlock}
	 * labeled alternative in {@link ProjectParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElseBlock(ProjectParser.JinjaElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStyleDef}
	 * labeled alternative in {@link ProjectParser#cssStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssStyleDef(ProjectParser.CssStyleDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStyleDef}
	 * labeled alternative in {@link ProjectParser#cssStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssStyleDef(ProjectParser.CssStyleDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRuleStatement}
	 * labeled alternative in {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssRuleStatement(ProjectParser.CssRuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRuleStatement}
	 * labeled alternative in {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssRuleStatement(ProjectParser.CssRuleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssAtRuleStatement}
	 * labeled alternative in {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssAtRuleStatement(ProjectParser.CssAtRuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssAtRuleStatement}
	 * labeled alternative in {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssAtRuleStatement(ProjectParser.CssAtRuleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRuleDef}
	 * labeled alternative in {@link ProjectParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRuleDef(ProjectParser.CssRuleDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRuleDef}
	 * labeled alternative in {@link ProjectParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRuleDef(ProjectParser.CssRuleDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorDef}
	 * labeled alternative in {@link ProjectParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorDef(ProjectParser.CssSelectorDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorDef}
	 * labeled alternative in {@link ProjectParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorDef(ProjectParser.CssSelectorDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorGroup}
	 * labeled alternative in {@link ProjectParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorGroup(ProjectParser.CssSelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorGroup}
	 * labeled alternative in {@link ProjectParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorGroup(ProjectParser.CssSelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorDescendant}
	 * labeled alternative in {@link ProjectParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorDescendant(ProjectParser.CssSelectorDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorDescendant}
	 * labeled alternative in {@link ProjectParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorDescendant(ProjectParser.CssSelectorDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCompoundSelector}
	 * labeled alternative in {@link ProjectParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssCompoundSelector(ProjectParser.CssCompoundSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCompoundSelector}
	 * labeled alternative in {@link ProjectParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssCompoundSelector(ProjectParser.CssCompoundSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssUniversalSelector(ProjectParser.CssUniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssUniversalSelector(ProjectParser.CssUniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPseudoSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssPseudoSelector(ProjectParser.CssPseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPseudoSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssPseudoSelector(ProjectParser.CssPseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssTypeSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssTypeSelector(ProjectParser.CssTypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssTypeSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssTypeSelector(ProjectParser.CssTypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssClassSelector(ProjectParser.CssClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssClassSelector(ProjectParser.CssClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssIdSelector(ProjectParser.CssIdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssIdSelector(ProjectParser.CssIdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssType}
	 * labeled alternative in {@link ProjectParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssType(ProjectParser.CssTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssType}
	 * labeled alternative in {@link ProjectParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssType(ProjectParser.CssTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClass}
	 * labeled alternative in {@link ProjectParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssClass(ProjectParser.CssClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClass}
	 * labeled alternative in {@link ProjectParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssClass(ProjectParser.CssClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssId}
	 * labeled alternative in {@link ProjectParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssId(ProjectParser.CssIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssId}
	 * labeled alternative in {@link ProjectParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssId(ProjectParser.CssIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPseudo}
	 * labeled alternative in {@link ProjectParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssPseudo(ProjectParser.CssPseudoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPseudo}
	 * labeled alternative in {@link ProjectParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssPseudo(ProjectParser.CssPseudoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ProjectParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ProjectParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCustomProperty}
	 * labeled alternative in {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssCustomProperty(ProjectParser.CssCustomPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCustomProperty}
	 * labeled alternative in {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssCustomProperty(ProjectParser.CssCustomPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ProjectParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ProjectParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ProjectParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ProjectParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link ProjectParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(ProjectParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link ProjectParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(ProjectParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMultipleValues}
	 * labeled alternative in {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssMultipleValues(ProjectParser.CssMultipleValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMultipleValues}
	 * labeled alternative in {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssMultipleValues(ProjectParser.CssMultipleValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSingleValue}
	 * labeled alternative in {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssSingleValue(ProjectParser.CssSingleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSingleValue}
	 * labeled alternative in {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssSingleValue(ProjectParser.CssSingleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssFunctionTerm}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionTerm(ProjectParser.CssFunctionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssFunctionTerm}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionTerm(ProjectParser.CssFunctionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberTerm}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberTerm(ProjectParser.CssNumberTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberTerm}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberTerm(ProjectParser.CssNumberTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssColor(ProjectParser.CssColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssColor(ProjectParser.CssColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRgbColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssRgbColor(ProjectParser.CssRgbColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRgbColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssRgbColor(ProjectParser.CssRgbColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRgbaColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssRgbaColor(ProjectParser.CssRgbaColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRgbaColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssRgbaColor(ProjectParser.CssRgbaColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssHslColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssHslColor(ProjectParser.CssHslColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssHslColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssHslColor(ProjectParser.CssHslColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssHslaColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssHslaColor(ProjectParser.CssHslaColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssHslaColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssHslaColor(ProjectParser.CssHslaColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssString}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssString(ProjectParser.CssStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssString}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssString(ProjectParser.CssStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentifier(ProjectParser.CssIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentifier(ProjectParser.CssIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVariable}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssVariable(ProjectParser.CssVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVariable}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssVariable(ProjectParser.CssVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCalc}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssCalc(ProjectParser.CssCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCalc}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssCalc(ProjectParser.CssCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaRule}
	 * labeled alternative in {@link ProjectParser#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaRule(ProjectParser.CssMediaRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaRule}
	 * labeled alternative in {@link ProjectParser#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaRule(ProjectParser.CssMediaRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Media}
	 * labeled alternative in {@link ProjectParser#cssMedia}.
	 * @param ctx the parse tree
	 */
	void enterMedia(ProjectParser.MediaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Media}
	 * labeled alternative in {@link ProjectParser#cssMedia}.
	 * @param ctx the parse tree
	 */
	void exitMedia(ProjectParser.MediaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaQuery}
	 * labeled alternative in {@link ProjectParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(ProjectParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaQuery}
	 * labeled alternative in {@link ProjectParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(ProjectParser.MediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaExpr}
	 * labeled alternative in {@link ProjectParser#cssMediaExpr}.
	 * @param ctx the parse tree
	 */
	void enterMediaExpr(ProjectParser.MediaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaExpr}
	 * labeled alternative in {@link ProjectParser#cssMediaExpr}.
	 * @param ctx the parse tree
	 */
	void exitMediaExpr(ProjectParser.MediaExprContext ctx);
}