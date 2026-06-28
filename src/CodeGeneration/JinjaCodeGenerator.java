package CodeGeneration;

import AST.JinjaCss.HtmlElement;
import AST.JinjaCss.HtmlElements.HtmlAttribute;
import AST.JinjaCss.HtmlElements.NormalHtmlElement;
import AST.JinjaCss.HtmlElements.SelfClosingHtmlElement;
import AST.JinjaCss.HtmlElements.StyleElement;
import AST.JinjaCss.JinjaExpressions.JinjaIdentifier;
import AST.JinjaCss.Program;
import AST.JinjaCss.Statement;
import AST.JinjaCss.Statements.JinjaForStatement;
import AST.JinjaCss.Statements.JinjaIfStatement;
import AST.JinjaCss.Statements.JinjaVariableStatement;
import AST.JinjaCss.Statements.TextStatement;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JinjaCodeGenerator {
    private GenerationContext context;
    private JinjaExpressionEvaluator evaluator;
    private StringBuilder html = new StringBuilder();

    public JinjaCodeGenerator(GenerationContext context) {
        this.evaluator =
                new JinjaExpressionEvaluator(context);
        this.context = context;
    }

    public String generate(Program program) {
        visitProgram(program);
        return html.toString();
    }

    public void visitProgram(Program program) {

        for (Statement stmt : program.statements) {
            visitStatement(stmt);
        }
    }

    public void visitStatement(Statement stmt) {
        if (stmt instanceof HtmlElement) {
            visitHtmlElement((HtmlElement) stmt);
        } else if (stmt instanceof JinjaVariableStatement) {
            visitJinjaVariableStatement((JinjaVariableStatement) stmt);
        } else if (stmt instanceof JinjaForStatement) {
            visitJinjaForStatement((JinjaForStatement) stmt);
        } else if (stmt instanceof JinjaIfStatement) {
            visitJinjaIfStatement((JinjaIfStatement) stmt);
        } else if (stmt instanceof TextStatement) {
            visitTextStatement((TextStatement) stmt);
        }
    }

    public void visitStyleElement(StyleElement node) {
        html.append("<style>");
        html.append(node.cssStatements);
        html.append("</style>");
    }

    public void visitJinjaForStatement(JinjaForStatement node) {
        Object iterable = evaluator.evaluate(node.iterable);

        if (!(iterable instanceof List<?> list))
            return;

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

    public void visitJinjaIfStatement(JinjaIfStatement node) {

        Object value =
                evaluator.evaluate(node.condition);

        if (evaluator.isTruthy(value)) {

            for (Statement stmt : node.thenBody) {
                visitStatement(stmt);
            }

        } else {

            if (node.elseStatement != null) {

                for (Statement stmt : node.elseStatement.body) {
                    visitStatement(stmt);
                }

            }
        }
    }

    public void visitHtmlElement(HtmlElement element) {

        if (element instanceof NormalHtmlElement) {
            visitNormalHtmlElement((NormalHtmlElement) element);
        } else if (element instanceof SelfClosingHtmlElement) {
            visitSelfClosingHtmlElement((SelfClosingHtmlElement) element);
        }
    }

    public void visitNormalHtmlElement(
            NormalHtmlElement element) {

        html.append("<")
                .append(element.tagName);

        // attributes
        for (HtmlAttribute attr : element.attributes) {

            html.append(" ")
                    .append(attr.name);

            if (attr.value != null) {

                html.append("=\"")
                        .append(resolveAttributeValue(attr.value))
                        .append("\"");

            }
        }

        html.append(">");

        // children
        for (Statement stmt : element.content) {
            visitStatement(stmt);
        }

        html.append("</")
                .append(element.tagName)
                .append(">");
    }

    public void visitSelfClosingHtmlElement(
            SelfClosingHtmlElement element) {

        html.append("<")
                .append(element.tagName);

        for (HtmlAttribute attr :
                element.attributes) {

            html.append(" ")
                    .append(attr.name);

            if (attr.value != null) {

                html.append("=\"")
                        .append(resolveAttributeValue(attr.value))
                        .append("\"");

            }
        }

        html.append("/>");
    }

    public void visitJinjaVariableStatement(
            JinjaVariableStatement node) {

        Object value =
                this.evaluator.evaluate(node.expression);

        if (value != null) {
            html.append(value);
        }
    }

    public void visitTextStatement(
            TextStatement node) {

        html.append(node.text);

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
                    matcher.group(1);

            List<String> parts =
                    Arrays.asList(
                            expression.split("\\.")
                    );

            Object replacement =
                    evaluator.evaluate(
                            new JinjaIdentifier(
                                    0,
                                    parts
                            )
                    );

            String replacementText =
                    replacement == null
                            ? ""
                            : replacement.toString();

            matcher.appendReplacement(
                    result,
                    Matcher.quoteReplacement(replacementText)
            );
        }

        matcher.appendTail(result);

        return result.toString();
    }


}

