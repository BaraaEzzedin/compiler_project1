package CodeGeneration;

import AST.JinjaCss.*;
import AST.JinjaCss.HtmlElements.*;
import AST.JinjaCss.JinjaExpressions.JinjaBooleanExpression;
import AST.JinjaCss.JinjaExpressions.JinjaIdentifier;
import AST.JinjaCss.JinjaExpressions.JinjaNumber;
import AST.JinjaCss.JinjaExpressions.JinjaString;
import AST.JinjaCss.Statements.*;

import java.util.List;

public class JinjaCodeGenerator {
    private final StringBuilder out = new StringBuilder();
    private final GenerationContext context;
    private final JinjaExpressionEvaluator evaluator;
    private int indent;

    public JinjaCodeGenerator(GenerationContext context, RouteTable routes) {
        this.context = context;
        this.evaluator = new JinjaExpressionEvaluator(context, routes);
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
            emitIndent();
            out.append(value).append("\n");
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
        String text = node.text.trim();

        if (text.isEmpty()) {
            return;
        }

        emitIndent();
        out.append(text).append("\n");
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

        out.append(CssSerializer.serialize(node));

        emitIndent();
        out.append("</style>\n");
    }

    private void visitSelfClosingHtmlElement(SelfClosingHtmlElement node) {
        emitIndent();

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

        outdent();
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
                    .append(resolveAttributeValue(node))
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

    /**
     * The value was already split into text and expressions while parsing, so each
     * expression only has to be evaluated against the snapshot context.
     */
    private String resolveAttributeValue(HtmlAttribute attribute) {

        StringBuilder result = new StringBuilder();

        for (Object part : attribute.parts) {

            if (part instanceof JinjaExpression expr) {
                result.append(formatValue(evaluator.evaluate(expr)));
            } else {
                result.append(part);
            }
        }

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
}
