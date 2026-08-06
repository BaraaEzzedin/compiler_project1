package AST.JinjaCss.HtmlElements;

import AST.JinjaCss.ASTNode;
import AST.JinjaCss.JinjaExpression;

import java.util.ArrayList;
import java.util.List;


public class HtmlAttribute extends ASTNode {
    public String name;

    /**
     * The attribute value exactly as it was written, Jinja markers included.
     */
    public String value;

    /**
     * The value split into its pieces: every element is either a {@link String}
     * literal or a {@link JinjaExpression} that came from a {{ ... }} segment.
     */
    public List<Object> parts;

    public HtmlAttribute(int line, String name, String value) {
        this(line, name, value, null);
    }

    public HtmlAttribute(int line, String name, String value, List<Object> parts) {
        super(line, "HtmlAttribute");
        this.name = name;
        this.value = value;

        if (parts != null) {
            this.parts = parts;
        } else {
            this.parts = new ArrayList<>();
            if (value != null) {
                this.parts.add(value);
            }
        }
    }

    /**
     * True when the value is plain text that no template variable can change.
     */
    public boolean isStatic() {
        for (Object part : parts) {
            if (!(part instanceof String)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (value == null || value.isEmpty()) {
            return name;
        }
        return name + "=\"" + value + "\"";
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(name)
                .append("'");

        if (value != null && !value.isEmpty()) {
            sb.append(" = \"").append(value).append("\"");
        }

        sb.append(" (line ").append(line).append(")\n");

        if (!isStatic()) {
            sb.append(indent(level + 1)).append("Parts:\n");

            for (Object part : parts) {
                if (part instanceof JinjaExpression expr) {
                    sb.append(expr.prettyPrint(level + 2));
                } else {
                    sb.append(indent(level + 2))
                            .append("Text \"")
                            .append(part)
                            .append("\"\n");
                }
            }
        }

        return sb.toString();
    }
}
