// Generated from C:/Users/ASUSD/IdeaProjects/compiler_project1/src/grammer/lexer/ProjectParser.g4 by ANTLR 4.13.2
package grammer.lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ProjectParser#document}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ProjectParser#document}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProjectParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link ProjectParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(ProjectParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(ProjectParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(ProjectParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(ProjectParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ProjectParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ProjectParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ProjectParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ProjectParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(ProjectParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(ProjectParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(ProjectParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(ProjectParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ProjectParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ProjectParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(ProjectParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(ProjectParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElement(ProjectParser.JinjaElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElement(ProjectParser.JinjaElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVariable(ProjectParser.JinjaVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#jinjaVariable}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVariable(ProjectParser.JinjaVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(ProjectParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(ProjectParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBody(ProjectParser.JinjaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBody(ProjectParser.JinjaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(ProjectParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(ProjectParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPrimary(ProjectParser.JinjaPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPrimary(ProjectParser.JinjaPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ProjectParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ProjectParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ProjectParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ProjectParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(ProjectParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(ProjectParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(ProjectParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(ProjectParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssStyle}.
	 * @param ctx the parse tree
	 */
	void enterCssStyle(ProjectParser.CssStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssStyle}.
	 * @param ctx the parse tree
	 */
	void exitCssStyle(ProjectParser.CssStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void enterCssStatement(ProjectParser.CssStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 */
	void exitCssStatement(ProjectParser.CssStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(ProjectParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(ProjectParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(ProjectParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(ProjectParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(ProjectParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(ProjectParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ProjectParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ProjectParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void enterCompoundSelector(ProjectParser.CompoundSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void exitCompoundSelector(ProjectParser.CompoundSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(ProjectParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(ProjectParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(ProjectParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(ProjectParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(ProjectParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(ProjectParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(ProjectParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(ProjectParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoSelector(ProjectParser.PseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoSelector(ProjectParser.PseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(ProjectParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(ProjectParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssFunction(ProjectParser.CssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssFunction(ProjectParser.CssFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void enterCssValueList(ProjectParser.CssValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void exitCssValueList(ProjectParser.CssValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(ProjectParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(ProjectParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void enterCssTerm(ProjectParser.CssTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 */
	void exitCssTerm(ProjectParser.CssTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void enterCssAtRule(ProjectParser.CssAtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssAtRule}.
	 * @param ctx the parse tree
	 */
	void exitCssAtRule(ProjectParser.CssAtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssMedia}.
	 * @param ctx the parse tree
	 */
	void enterCssMedia(ProjectParser.CssMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssMedia}.
	 * @param ctx the parse tree
	 */
	void exitCssMedia(ProjectParser.CssMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaQuery(ProjectParser.CssMediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaQuery(ProjectParser.CssMediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#cssMediaExpr}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaExpr(ProjectParser.CssMediaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#cssMediaExpr}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaExpr(ProjectParser.CssMediaExprContext ctx);
}