package AST.PyFlask.Statements;

import AST.PyFlask.Expression;
import AST.Statement;

public class ExprStmt extends Statement {
    public final Expression expr;

    public ExprStmt(int line, Expression expr) {
        super(line, "ExprStmt");
        this.expr = expr;
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(expr.prettyPrint(level + 1));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ExprStmt(" + expr + ")";
    }
}
