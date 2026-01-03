package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

public class AttributeExpr extends Expression {
    public final Expression target;
    public final Expression attr;

    public AttributeExpr(int line, Expression target, Expression attr) {
        super(line, "AttributeExpr");
        this.target = target;
        this.attr = attr;
    }

    @Override
    public String toString() {
        return target + "." + attr;
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append("Target:\n");
        sb.append(target.prettyPrint(level + 2));
        sb.append(indent(level + 1)).append("Attribute:\n").append(attr.prettyPrint(level +2));
        return sb.toString();
    }
}
