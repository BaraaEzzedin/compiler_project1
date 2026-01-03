// Generated from /home/mohee/compiler_project1/src/JinjaCssGrammar/ProjectParser.g4 by ANTLR 4.13.2
package JinjaCssGrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramDef}
	 * labeled alternative in {@link ProjectParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDef(ProjectParser.ProgramDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNode(ProjectParser.HtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaNode(ProjectParser.JinjaNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextNode}
	 * labeled alternative in {@link ProjectParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(ProjectParser.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNormalElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNormalElement(ProjectParser.HtmlNormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosingElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingElement(ProjectParser.HtmlSelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlScriptElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlScriptElement(ProjectParser.HtmlScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlStyleElement}
	 * labeled alternative in {@link ProjectParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyleElement(ProjectParser.HtmlStyleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link ProjectParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTag(ProjectParser.NormalTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfCloseTag}
	 * labeled alternative in {@link ProjectParser#selfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfCloseTag(ProjectParser.SelfCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Content}
	 * labeled alternative in {@link ProjectParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ProjectParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link ProjectParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ProjectParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlText}
	 * labeled alternative in {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlText(ProjectParser.HtmlTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSpace}
	 * labeled alternative in {@link ProjectParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSpace(ProjectParser.HtmlSpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(ProjectParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlWhiteSpace}
	 * labeled alternative in {@link ProjectParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlWhiteSpace(ProjectParser.HtmlWhiteSpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlScript}
	 * labeled alternative in {@link ProjectParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlScript(ProjectParser.HtmlScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlStyle}
	 * labeled alternative in {@link ProjectParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStyle(ProjectParser.HtmlStyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVariableElement}
	 * labeled alternative in {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVariableElement(ProjectParser.JinjaVariableElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockElement}
	 * labeled alternative in {@link ProjectParser#jinjaElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockElement(ProjectParser.JinjaBlockElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProjectParser#jinjaVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ProjectParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bloc}
	 * labeled alternative in {@link ProjectParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloc(ProjectParser.BlocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForBody(ProjectParser.JinjaForBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfBody(ProjectParser.JinjaIfBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExpressionBody}
	 * labeled alternative in {@link ProjectParser#jinjaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpressionBody(ProjectParser.JinjaExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaPrimaryExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPrimaryExpr(ProjectParser.JinjaPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaFilterExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilterExpr(ProjectParser.JinjaFilterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaMulExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMulExpr(ProjectParser.JinjaMulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaEqExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaEqExpr(ProjectParser.JinjaEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaAddExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAddExpr(ProjectParser.JinjaAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaSubExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSubExpr(ProjectParser.JinjaSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaNeqExpr}
	 * labeled alternative in {@link ProjectParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaNeqExpr(ProjectParser.JinjaNeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIdentifier}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIdentifier(ProjectParser.JinjaIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaNumber}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaNumber(ProjectParser.JinjaNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaString}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaString(ProjectParser.JinjaStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaParenExpr}
	 * labeled alternative in {@link ProjectParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaParenExpr(ProjectParser.JinjaParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForStatement}
	 * labeled alternative in {@link ProjectParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForStatement(ProjectParser.JinjaForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfStatement}
	 * labeled alternative in {@link ProjectParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfStatement(ProjectParser.JinjaIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaElifBlock}
	 * labeled alternative in {@link ProjectParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElifBlock(ProjectParser.JinjaElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaElseBlock}
	 * labeled alternative in {@link ProjectParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElseBlock(ProjectParser.JinjaElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStyleDef}
	 * labeled alternative in {@link ProjectParser#cssStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStyleDef(ProjectParser.CssStyleDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRuleStatement}
	 * labeled alternative in {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRuleStatement(ProjectParser.CssRuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAtRuleStatement}
	 * labeled alternative in {@link ProjectParser#cssStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRuleStatement(ProjectParser.CssAtRuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRuleDef}
	 * labeled alternative in {@link ProjectParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRuleDef(ProjectParser.CssRuleDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorDef}
	 * labeled alternative in {@link ProjectParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorDef(ProjectParser.CssSelectorDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorGroup}
	 * labeled alternative in {@link ProjectParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorGroup(ProjectParser.CssSelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorDescendant}
	 * labeled alternative in {@link ProjectParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorDescendant(ProjectParser.CssSelectorDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCompoundSelector}
	 * labeled alternative in {@link ProjectParser#compoundSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCompoundSelector(ProjectParser.CssCompoundSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUniversalSelector(ProjectParser.CssUniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPseudoSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPseudoSelector(ProjectParser.CssPseudoSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssTypeSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTypeSelector(ProjectParser.CssTypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassSelector(ProjectParser.CssClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdSelector}
	 * labeled alternative in {@link ProjectParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdSelector(ProjectParser.CssIdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssType}
	 * labeled alternative in {@link ProjectParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssType(ProjectParser.CssTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClass}
	 * labeled alternative in {@link ProjectParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClass(ProjectParser.CssClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssId}
	 * labeled alternative in {@link ProjectParser#idSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssId(ProjectParser.CssIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPseudo}
	 * labeled alternative in {@link ProjectParser#pseudoSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPseudo(ProjectParser.CssPseudoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ProjectParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCustomProperty}
	 * labeled alternative in {@link ProjectParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCustomProperty(ProjectParser.CssCustomPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ProjectParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ProjectParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueList}
	 * labeled alternative in {@link ProjectParser#cssValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(ProjectParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMultipleValues}
	 * labeled alternative in {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMultipleValues(ProjectParser.CssMultipleValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSingleValue}
	 * labeled alternative in {@link ProjectParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSingleValue(ProjectParser.CssSingleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFunctionTerm}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionTerm(ProjectParser.CssFunctionTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberTerm}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberTerm(ProjectParser.CssNumberTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColor(ProjectParser.CssColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRgbColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRgbColor(ProjectParser.CssRgbColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRgbaColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRgbaColor(ProjectParser.CssRgbaColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHslColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHslColor(ProjectParser.CssHslColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHslaColor}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHslaColor(ProjectParser.CssHslaColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssString}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssString(ProjectParser.CssStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdentifier}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentifier(ProjectParser.CssIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVariable}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVariable(ProjectParser.CssVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCalc}
	 * labeled alternative in {@link ProjectParser#cssTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCalc(ProjectParser.CssCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaRule}
	 * labeled alternative in {@link ProjectParser#cssAtRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaRule(ProjectParser.CssMediaRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Media}
	 * labeled alternative in {@link ProjectParser#cssMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia(ProjectParser.MediaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaQuery}
	 * labeled alternative in {@link ProjectParser#cssMediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(ProjectParser.MediaQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaExpr}
	 * labeled alternative in {@link ProjectParser#cssMediaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaExpr(ProjectParser.MediaExprContext ctx);
}