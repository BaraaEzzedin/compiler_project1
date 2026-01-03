package AST.PyFlask.Statements;

import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.Statement;

public class ForStmt extends Statement {
    public Expression loopVariable;  // The loop variable (e.g., "product" in "for product in products")
    public Expression iterable;      // The iterable expression (e.g., "products")
    public Block body;

    public ForStmt(int line, Expression loopVariable, Expression iterable, Block body) {
        super(line, "For");
        this.loopVariable = loopVariable;
        this.iterable = iterable;
        this.body = body;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("For (line ").append(line).append(")\n");
        sb.append(indent(indent + 1)).append("Loop Variable:\n");
        sb.append(loopVariable.prettyPrint(indent + 2));
        sb.append(indent(indent + 1)).append("Iterable:\n");
        sb.append(iterable.prettyPrint(indent + 2));
        sb.append(indent(indent + 1)).append("Body:\n");
        sb.append(body.prettyPrint(indent + 2));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "For(" + loopVariable + " in " + iterable + ", " + body + ")";
    }
}