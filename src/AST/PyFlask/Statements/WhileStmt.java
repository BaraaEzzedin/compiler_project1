package AST.PyFlask.Statements;

import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.Statement;

public class WhileStmt extends Statement {
    public Expression condition;
    public Block body;

    public WhileStmt(int line, Expression condition, Block body) {
        super(line, "While");
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append("Condition:\n");
        sb.append(condition.prettyPrint(level + 2));
        sb.append(indent(level + 1)).append("Body:\n");
        sb.append(body.prettyPrint(level + 2));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "While(" + condition + ", " + body + ")";
    }
}