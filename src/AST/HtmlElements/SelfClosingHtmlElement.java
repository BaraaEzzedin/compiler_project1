package AST.HtmlElements;

import AST.HtmlElement;

import java.util.List;

public class SelfClosingHtmlElement extends HtmlElement {
    public String tagName;
    public List<HtmlAttribute>attributes;
    public SelfClosingHtmlElement(int line, String tagName, List<HtmlAttribute> attributes) {
        super(line, "SelfClosingHtmlElement");
        this.tagName=tagName;
        this.attributes=attributes;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        for (HtmlAttribute attr : attributes) {
            sb.append(" ").append(attr.toString());
        }
        sb.append(" />");

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

        return sb.toString();
    }
}
