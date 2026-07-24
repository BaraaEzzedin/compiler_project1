package CodeGeneration;

import AST.JinjaCss.CSSDeclarations.CSSDeclaration;
import AST.JinjaCss.CSSSelectors.*;
import AST.JinjaCss.*;
import AST.JinjaCss.CSSStatements.CSSMediaExpression;
import AST.JinjaCss.CSSStatements.CSSMediaQuery;
import AST.JinjaCss.CSSStatements.CSSMediaRule;
import AST.JinjaCss.CSSStatements.CSSRule;
import AST.JinjaCss.CSSTerms.*;
import AST.JinjaCss.HtmlElements.*;
import AST.JinjaCss.JinjaExpressions.JinjaBooleanExpression;
import AST.JinjaCss.JinjaExpressions.JinjaIdentifier;
import AST.JinjaCss.JinjaExpressions.JinjaNumber;
import AST.JinjaCss.JinjaExpressions.JinjaString;
import AST.JinjaCss.Statements.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JinjaCodeGenerator {
    private final StringBuilder out = new StringBuilder();
    private final GenerationContext context;
    private final JinjaExpressionEvaluator evaluator;
    private int indent;

    public JinjaCodeGenerator(GenerationContext context) {
        this.context = context;
        this.evaluator = new JinjaExpressionEvaluator(context);
    }

    public String generate(Program program) {
        visitProgram(program);

        return out.toString();
    }

    private void visitProgram(Program program) {
        for (Statement stmt : program.getStatements()) {
            visitStatement(stmt);
        }
    }

    private void visitStatement(Statement stmt) {
        if (stmt instanceof HtmlElement node) {
            visitHtmlElement(node);
        } else if (stmt instanceof TextStatement node) {
            visitTextStatement(node);
        } else if (stmt instanceof JinjaVariableStatement node) {
            visitJinjaVariable(node);
        } else if (stmt instanceof JinjaIfStatement node) {
            visitJinjaIf(node);
        } else if (stmt instanceof JinjaForStatement node) {
            visitJinjaFor(node);
        }
    }

    private void visitJinjaVariable(JinjaVariableStatement node) {
//        out.append("{{ ");
//
//        visitExpression(node.expression);
//
//        out.append(" }}");
        Object value =
                evaluator.evaluate(node.expression);

        if (value != null) {
            out.append(value);
        }
    }

    private void visitExpression(
            JinjaExpression expr) {

        if (expr instanceof JinjaIdentifier node) {
            visitIdentifier(node);
        } else if (expr instanceof JinjaString node) {
            visitStringLiteral(node);
        } else if (expr instanceof JinjaNumber node) {
            visitNumberLiteral(node);
        } else if (expr instanceof JinjaBooleanExpression node) {
            visitBooleanLiteral(node);
        }
    }

    private void visitBooleanLiteral(JinjaBooleanExpression node) {
        out.append(node.value);
    }

    private void visitNumberLiteral(JinjaNumber node) {
        out.append(node.value);
    }

    private void visitStringLiteral(JinjaString node) {
        out.append("\"")
                .append(node.value)
                .append("\"");
    }

    private void visitIdentifier(JinjaIdentifier node) {
        for (int i = 0; i < node.parts.size(); i++) {

            out.append(node.parts.get(i));

            if (i < node.parts.size() - 1) {
                out.append(".");
            }
        }
    }

    private void visitTextStatement(TextStatement node) {
        out.append(node.text);
    }

    private void visitHtmlElement(HtmlElement node) {
        if (node instanceof NormalHtmlElement n) {
            visitNormalHtmlElement(n);
        } else if (node instanceof SelfClosingHtmlElement n) {
            visitSelfClosingHtmlElement(n);
        } else if (node instanceof StyleElement n) {
            visitStyleElement(n);
        } else if (node instanceof ScriptElement n) {
            visitScriptElement(n);
        }
    }

    private void visitScriptElement(ScriptElement node) {
    }

    private void visitStyleElement(StyleElement node) {
        emitIndent();
        out.append("<style>\n");
        for (CSSStatement stmt : node.cssStatements) {
            visitCSSStatement(stmt);
        }

        out.append("</style>\n");
        outdent();
    }

    private void visitCSSStatement(CSSStatement stmt) {
        if (stmt instanceof CSSRule node) {
            visitCSSRule(node);
        } else if (stmt instanceof CSSMediaRule node) {
            visitCSSMediaRule(node);
        }
    }

    private void visitCSSMediaRule(CSSMediaRule node) {
        out.append("@media ");

        visitCSSMediaQuery(node.mediaQuery);

        out.append(" {\n");

        for (CSSRule rule : node.rules) {
            visitCSSRule(rule);
        }

        out.append("}\n");
    }

    private void visitCSSMediaQuery(CSSMediaQuery node) {
        visitCSSMediaExpression(node.expression);
    }

    private void visitCSSMediaExpression(CSSMediaExpression node) {
        out.append("(");

        out.append(node.feature);

        if (node.value != null) {

            out.append(": ");

            visitCSSValue(node.value);
        }

        out.append(")");
    }

    private void visitCSSRule(CSSRule node) {
        visitCSSSelector(node.selector);

        out.append(" {\n");

        for (CSSDeclaration decl : node.declarations) {
            visitCSSDeclaration(decl);
        }

        out.append("}\n");
    }

    private void visitCSSDeclaration(CSSDeclaration node) {
        out.append("    ");

        out.append(node.property);

        out.append(": ");

        visitCSSValue(node.value);

        out.append(";\n");
    }

    private void visitCSSValue(CSSValue value) {
        if (value instanceof CSSSingleValue node) {
            visitCSSSingleValue(node);
        } else if (value instanceof CSSMultipleValues node) {
            visitCSSMultipleValues(node);
        } else if (value instanceof CSSValueList node) {
            visitCSSValueList(node);
        }
    }

    private void visitCSSValueList(CSSValueList node) {
        for (int i = 0; i < node.values.size(); i++) {

            visitCSSValue(node.values.get(i));

            if (i < node.values.size() - 1) {
                out.append(", ");
            }
        }
    }

    private void visitCSSMultipleValues(CSSMultipleValues node) {
        for (int i = 0; i < node.terms.size(); i++) {

            visitCSSTerm(node.terms.get(i));

            if (i < node.terms.size() - 1) {
                out.append(" ");
            }
        }
    }

    private void visitCSSSingleValue(CSSSingleValue node) {
        visitCSSTerm(node.term);
    }

    private void visitCSSTerm(CSSTerm node) {
        if (node instanceof CSSIdentifier t) {
            visitCSSIdentifier(t);
        } else if (node instanceof CSSColor t) {
            visitCSSColor(t);
        } else if (node instanceof CSSString t) {
            visitCSSString(t);
        } else if (node instanceof CSSVariable t) {
            visitCSSVariable(t);
        } else if (node instanceof CSSNumberTerm t) {
            visitCSSNumberTerm(t);
        } else if (node instanceof CSSFunctionTerm t) {
            visitCSSFunctionTerm(t);
        }
    }

    private void visitCSSString(CSSString t) {
        out.append(t.value);
    }

    private void visitCSSVariable(CSSVariable t) {
        out.append(t.name);
    }

    private void visitCSSNumberTerm(CSSNumberTerm node) {
        if (node.number == Math.floor(node.number))
            out.append((int) node.number);
        else
            out.append(node.number);
        if (node.unit != null) {
            out.append(node.unit);
        }
    }

    private void visitCSSFunctionTerm(CSSFunctionTerm node) {
        out.append(node.functionName);
        out.append("(");

        if (node.arguments.values.size() == 1 &&
                node.arguments.values.get(0) instanceof CSSMultipleValues multi) {

            for (int i = 0; i < multi.terms.size(); i++) {

                visitCSSTerm(multi.terms.get(i));

                if (i < multi.terms.size() - 1) {
                    out.append(", ");
                }
            }

        } else {

            visitCSSValueList(node.arguments);
        }

        out.append(")");
    }

    private void visitCSSColor(CSSColor t) {
        out.append(t.value);
    }

    private void visitCSSIdentifier(CSSIdentifier node) {
        out.append(node.name);
    }

    private void visitCSSSelector(CSSSelector node) {
        for (int i = 0; i < node.selectorSequences.size(); i++) {

            visitCSSSelectorSequence(
                    node.selectorSequences.get(i));

            if (i < node.selectorSequences.size() - 1) {
                out.append(", ");
            }
        }
    }

    private void visitCSSSelectorSequence(CSSSelectorSequence node) {
        for (int i = 0; i < node.compoundSelectors.size(); i++) {

            visitCSSCompoundSelector(node.compoundSelectors.get(i));

            if (i < node.compoundSelectors.size() - 1) {
                out.append(" ");
            }
        }
    }

    private void visitCSSCompoundSelector(CSSCompoundSelector node) {
        for (CSSSimpleSelector selector :
                node.simpleSelectors) {

            visitCSSSimpleSelector(selector);
        }
    }

    private void visitCSSSimpleSelector(CSSSimpleSelector selector) {

        if (selector instanceof CSSClassSelector node) {
            visitCSSClassSelector(node);
        } else if (selector instanceof CSSTypeSelector node) {
            visitCSSTypeSelector(node);
        } else if (selector instanceof CSSUniversalSelector node) {
            visitCSSUniversalSelector(node);
        } else if (selector instanceof CSSPseudoSelector node) {
            visitCSSPseudoSelector(node);
        }
    }

    private void visitCSSUniversalSelector(CSSUniversalSelector node) {
        out.append("*");
    }

    private void visitCSSPseudoSelector(CSSPseudoSelector node) {
        out.append(":").append(node.pseudoName);
    }

    private void visitCSSTypeSelector(CSSTypeSelector node) {
        out.append(node.elementName);
    }

    private void visitCSSClassSelector(CSSClassSelector node) {
        out.append('.').append(node.className);

        if (node.pseudoSelector != null) {
            visitCSSPseudoSelector(node.pseudoSelector);
        }
    }

    private void visitSelfClosingHtmlElement(SelfClosingHtmlElement node) {
        out.append("<")
                .append(node.tagName);

        if (node.attributes != null) {
            for (HtmlAttribute attr : node.attributes) {
                visitHtmlAttribute(attr);
            }
        }

        out.append("/>");
        out.append("\n");
    }

    private void visitNormalHtmlElement(NormalHtmlElement node) {
        emitIndent();
        out.append("<").append(node.tagName);

        if (node.attributes != null) {
            for (HtmlAttribute attr : node.attributes) {
                visitHtmlAttribute(attr);
            }
        }

        out.append(">");
        out.append("\n");
        indent();

        if (node.content != null) {
            for (Statement child : node.content) {
                visitStatement(child);
            }
        }
        emitIndent();

        out.append("</").append(node.tagName).append(">");
        out.append("\n");
//        newline();
    }

    private void visitHtmlAttribute(HtmlAttribute node) {
        out.append(" ")
                .append(node.name);

        if (node.value != null) {
            out.append("=\"")
                    .append(resolveAttributeValue(node.value))
                    .append("\"");
        }
    }

    private void visitJinjaFor(JinjaForStatement node) {
//        out.append("{% for ")
//                .append(node.variable)
//                .append(" in ");
//
//        visitExpression(node.iterable);
//
//        out.append(" %}");
//
//        emitIndent();
//        out.append("\n");
//
//        for (Statement stmt : node.body) {
//            visitStatement(stmt);
//        }
//
//        out.append("{% endfor %}");
//
//        out.append("\n");

        Object iterable = evaluator.evaluate(node.iterable);

        if (!(iterable instanceof List<?> list)) {
            return;
        }

        Object oldValue = context.get(node.variable);
        boolean existed = context.contains(node.variable);

        for (Object item : list) {

            context.put(node.variable, item);

            for (Statement stmt : node.body) {
                visitStatement(stmt);
            }
        }

        if (existed) {
            context.put(node.variable, oldValue);
        } else {
            context.remove(node.variable);
        }

    }

    private void visitJinjaIf(JinjaIfStatement node) {
//        out.append("{% if ");
//
//        visitExpression(node.condition);
//
//        out.append(" %}");
//        emitIndent();
//        out.append("\n");
//
//        for (Statement stmt : node.thenBody) {
//            visitStatement(stmt);
//        }
//
//        if (node.elifStatements != null) {
//            for (JinjaElifStatement elif : node.elifStatements) {
//                visitJinjaElif(elif);
//            }
//        }
//
//        if (node.elseStatement != null) {
//            visitJinjaElse(node.elseStatement);
//        }
//
//        out.append("{% endif %}");
//        outdent();
//        out.append("\n");
        Object value =
                evaluator.evaluate(node.condition);

        if (evaluator.isTruthy(value)) {

            for (Statement stmt : node.thenBody) {
                visitStatement(stmt);
            }

        } else {
            if (node.elifStatements != null) {
                for (JinjaElifStatement stmt : node.elifStatements) {
                    visitJinjaElif(stmt);
                }
            }

            if (node.elseStatement != null) {
                visitJinjaElse(node.elseStatement);
            }
        }
    }

    private void visitJinjaElif(JinjaElifStatement node) {
//        out.append("{% elif ");
//
//        visitExpression(node.condition);
//
//        out.append(" %}");
//
//        for (Statement stmt : node.body) {
//            visitStatement(stmt);
//        }
        Object value = evaluator.evaluate(node.condition);

        if (evaluator.isTruthy(value)) {
            for (Statement stmt : node.body) {
                visitStatement(stmt);
            }
        }
    }

    private void visitJinjaElse(JinjaElseStatement node) {
//        out.append("{% else %}");

        for (Statement stmt : node.body) {
            visitStatement(stmt);
        }
    }

    private String resolveAttributeValue(String value) {

        Pattern pattern =
                Pattern.compile("\\{\\{\\s*(.*?)\\s*\\}\\}");

        Matcher matcher =
                pattern.matcher(value);

        StringBuffer result =
                new StringBuffer();

        while (matcher.find()) {

            String expression =
                    matcher.group(1).trim();

            List<String> parts =
                    Arrays.asList(expression.split("\\."));

            Object replacement =
                    evaluator.evaluate(
                            new JinjaIdentifier(
                                    0,
                                    parts
                            )
                    );

            String replacementText =
                    formatValue(replacement);

            matcher.appendReplacement(
                    result,
                    Matcher.quoteReplacement(replacementText)
            );
        }

        matcher.appendTail(result);

        return result.toString();
    }

    private String formatValue(Object value) {

        if (value == null)
            return "";

        if (value instanceof Double d) {

            if (d == Math.floor(d)) {
                return String.valueOf(d.intValue());
            }

            return String.valueOf(d);
        }

        return value.toString();
    }

    private void indent() {
        indent++;
    }

    private void outdent() {
        indent--;
    }

    private void emitIndent() {
        out.append("    ".repeat(indent));
    }

    private void emitLine(String text) {
        emitIndent();
        out.append(text).append("\n");
    }

    public void writeToFile(String filename) throws IOException {
        Files.createDirectories(Path.of("/home/abdalrhman/Desktop/generated-compiler/templates"));
        Files.writeString(Path.of("/home/abdalrhman/Desktop/generated-compiler/templates", filename), out.toString());
    }

    public static Set<String> sortedCopy(Set<String> values) {
        return new TreeSet<>(values);
    }
}
