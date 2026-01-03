package AST.JinjaCss.CSSStatements;

import AST.ASTNode;
import AST.JinjaCss.CSSValue;

public class CSSMediaExpression extends ASTNode {
    public String feature;
    public CSSValue value;

    public CSSMediaExpression(int line, String feature, CSSValue value) {
        super(line, "CSSMediaExpression");
        this.feature = feature;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (feature != null) {
            sb.append(feature);
        }
        sb.append(": ");
        if (value != null) {
            sb.append(value.toString());
        }
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(feature != null ? feature : "")
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