package Generator;

import AST.JinjaCss.HtmlElement;
import AST.JinjaCss.HtmlElements.HtmlAttribute;
import AST.JinjaCss.HtmlElements.NormalHtmlElement;
import AST.JinjaCss.HtmlElements.ScriptElement;
import AST.JinjaCss.HtmlElements.SelfClosingHtmlElement;
import AST.JinjaCss.HtmlElements.StyleElement;
import AST.JinjaCss.Program;
import AST.JinjaCss.Statement;
import AST.JinjaCss.Statements.JinjaElifStatement;
import AST.JinjaCss.Statements.JinjaElseStatement;
import AST.JinjaCss.Statements.JinjaForStatement;
import AST.JinjaCss.Statements.JinjaIfStatement;
import AST.JinjaCss.Statements.JinjaVariableStatement;
import AST.JinjaCss.Statements.TextStatement;

import java.util.Set;
import java.util.TreeSet;

public class JinjaCodeGenerator {

    private final CodeGenerationContext context;

    public JinjaCodeGenerator(CodeGenerationContext context) {
        this.context = context;
    }

    public String generate(String templateName, Program jinjaAst, Set<String> missingVariablesOut) {
        StringBuilder out = new StringBuilder();
        for (Statement stmt : jinjaAst.getStatements()) {
            renderStatement(stmt, out);
        }

        CodeGenerationContext.TemplateInfo info = context.getTemplate(templateName);
        if (info != null && missingVariablesOut != null) {
            missingVariablesOut.addAll(info.missingVariables());
        }

        return out.toString();
    }

    private void renderStatement(Statement stmt, StringBuilder out) {
        if (stmt == null) {
            return;
        }
        if (stmt instanceof HtmlElement html) {
            renderHtmlElement(html, out);
        } else if (stmt instanceof JinjaIfStatement ifStmt) {
            renderJinjaIf(ifStmt, out);
        } else if (stmt instanceof JinjaForStatement forStmt) {
            renderJinjaFor(forStmt, out);
        } else if (stmt instanceof JinjaVariableStatement varStmt) {
            out.append(varStmt.toString());
        } else if (stmt instanceof TextStatement text) {
            out.append(text.toString());
        } else {
            out.append(stmt.toString());
        }
    }

    private void renderHtmlElement(HtmlElement element, StringBuilder out) {
        if (element instanceof StyleElement || element instanceof ScriptElement
                || element instanceof SelfClosingHtmlElement) {
            out.append(element.toString());
            return;
        }

        if (element instanceof NormalHtmlElement normal) {
            renderNormalHtmlElement(normal, out);
            return;
        }

        out.append(element.toString());
    }

    private void renderNormalHtmlElement(NormalHtmlElement element, StringBuilder out) {
        out.append("<").append(element.getTagName());
        if (element.attributes != null) {
            for (HtmlAttribute attr : element.attributes) {
                if (attr != null) {
                    out.append(" ").append(attr.toString());
                }
            }
        }
        out.append(">");

        if (element.content != null) {
            for (Statement child : element.content) {
                renderStatement(child, out);
            }
        }

        out.append("</").append(element.getTagName()).append(">");
    }

    private void renderJinjaFor(JinjaForStatement node, StringBuilder out) {
        out.append("{% for ")
                .append(node.variable)
                .append(" in ")
                .append(node.iterable != null ? node.iterable.toString() : "")
                .append(" %}");

        if (node.body != null) {
            for (Statement child : node.body) {
                renderStatement(child, out);
            }
        }

        out.append("{% endfor %}");
    }

    private void renderJinjaIf(JinjaIfStatement node, StringBuilder out) {
        out.append("{% if ")
                .append(node.condition != null ? node.condition.toString() : "")
                .append(" %}");

        if (node.thenBody != null) {
            for (Statement child : node.thenBody) {
                renderStatement(child, out);
            }
        }

        if (node.elifStatements != null) {
            for (JinjaElifStatement elif : node.elifStatements) {
                renderJinjaElif(elif, out);
            }
        }

        if (node.elseStatement != null) {
            renderJinjaElse(node.elseStatement, out);
        }

        out.append("{% endif %}");
    }

    private void renderJinjaElif(JinjaElifStatement node, StringBuilder out) {
        out.append("{% elif ")
                .append(node.condition != null ? node.condition.toString() : "")
                .append(" %}");

        if (node.body != null) {
            for (Statement child : node.body) {
                renderStatement(child, out);
            }
        }
    }

    private void renderJinjaElse(JinjaElseStatement node, StringBuilder out) {
        out.append("{% else %}");
        if (node.body != null) {
            for (Statement child : node.body) {
                renderStatement(child, out);
            }
        }
    }

    public static Set<String> sortedCopy(Set<String> values) {
        return new TreeSet<>(values);
    }
}
