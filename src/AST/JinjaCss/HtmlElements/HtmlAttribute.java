package AST.JinjaCss.HtmlElements;

import AST.ASTNode;

public class HtmlAttribute extends ASTNode {
    public String name;
    public String value;
    public HtmlAttribute(int line, String name, String value) {
        super(line, "HtmlAttribute");
        this.name=name;
        this.value=value;
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

        return sb.toString();
    }
}
