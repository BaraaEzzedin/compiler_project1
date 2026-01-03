package AST.JinjaCss.CSSDeclarations;

import AST.ASTNode;
import AST.JinjaCss.CSSValue;

public class CSSDeclaration extends ASTNode {
    public String property;
    public CSSValue value;

    public CSSDeclaration(int line, String property, CSSValue value) {
        super(line, "CSSDeclaration");
        this.property = property;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (property != null) {
            sb.append(property);
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
                .append(property != null ? property : "")
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