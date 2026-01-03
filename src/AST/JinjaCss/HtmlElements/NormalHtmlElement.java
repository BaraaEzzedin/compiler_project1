package AST.JinjaCss.HtmlElements;

import AST.JinjaCss.HtmlElement;
import AST.Statement;

import java.util.List;

public class NormalHtmlElement extends HtmlElement {
    String tagName;
    public List<HtmlAttribute> attributes;
    public List<Statement> content;
    public NormalHtmlElement(int line, String tagName, List<HtmlAttribute> attributes, List<Statement> content) {
        super(line, "NormalHtmlElement");
        this.tagName=tagName;
        this.attributes=attributes;
        this.content=content;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);

        for (HtmlAttribute attr : attributes) {
            sb.append(" ").append(attr.toString());
        }

        sb.append(">");

        for (Statement stmt : content) {
            if (stmt != null) {
                sb.append(stmt.toString());
            }
        }

        sb.append("</").append(tagName).append(">");

        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(tagName)
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (!attributes.isEmpty()) {
            sb.append(indent(level + 1)).append("Attributes:\n");
            for (HtmlAttribute attr : attributes) {
                if (attr != null) {
                    sb.append(attr.prettyPrint(level + 2));
                }
            }
        }

        if (!content.isEmpty()) {
            sb.append(indent(level + 1)).append("Content:\n");
            for (Statement stmt : content) {
                if (stmt != null) {
                    sb.append(stmt.prettyPrint(level + 2));
                }
            }
        }

        return sb.toString();
    }
}
