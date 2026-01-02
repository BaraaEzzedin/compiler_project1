package AST.HtmlElements;

import AST.CSSStatement;
import AST.HtmlElement;

import java.util.List;

public class StyleElement extends HtmlElement {
    public List<CSSStatement> cssStatements;
    public StyleElement(int line, List<CSSStatement>cssStatements) {
        super(line, "StyleElement");
        this.cssStatements =cssStatements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CSSStatement stmt : cssStatements) {
            if (stmt != null) {
                sb.append(stmt.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        if (!cssStatements.isEmpty()) {
            sb.append(indent(level + 1)).append("CSS Statements:\n");
            for (CSSStatement stmt : cssStatements) {
                if (stmt != null) {
                    sb.append(stmt.prettyPrint(level + 2));
                }
            }
        }

        return sb.toString();
    }
}
