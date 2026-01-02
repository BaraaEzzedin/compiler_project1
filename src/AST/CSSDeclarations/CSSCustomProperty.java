package AST.CSSDeclarations;

import AST.ASTNode;
import AST.CSSValue;

public class CSSCustomProperty extends ASTNode {
    public String propertyName;
    public CSSValue value;

    public CSSCustomProperty(int line, String propertyName, CSSValue value) {
        super(line, "CSSCustomProperty");
        this.propertyName = propertyName;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (propertyName != null) {
            sb.append(propertyName);
        }
        sb.append(": ");
        if (value != null) {
            sb.append(value.toString());
        }
        sb.append(";");
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(propertyName != null ? propertyName : "")
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (value != null) {
            sb.append(indent(level + 1)).append("Value:\n");
            sb.append(value.prettyPrint(level + 2));
        }

        return sb.toString();
    }
}