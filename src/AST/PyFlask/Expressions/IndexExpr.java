package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

public class IndexExpr extends Expression {
    public Expression array;
    public Expression index;

    public IndexExpr(int line, Expression array, Expression index) {
        super(line, "IndexExpr");
        this.array = array;
        this.index = index;
    }

    @Override
    public String toString() {
        return array + "[" + index + "]";
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append("Array:\n");
        sb.append(array.prettyPrint(level + 2));
        sb.append(indent(level + 1)).append("Index:\n");
        sb.append(index.prettyPrint(level + 2));
        return sb.toString();
    }
}