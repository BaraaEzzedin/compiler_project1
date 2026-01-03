package AST.PyFlask.Statements;

import AST.PyFlask.Expression;
import AST.Statement;

public class AssignStmt extends Statement {
    public Expression name;
    public Expression value;

    public AssignStmt(int line, Expression name, Expression value) {
        super(line, "Assign");
        this.name = name;
        this.value = value;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(indent + 1)).append("Target:\n");
        sb.append(name.prettyPrint(indent + 2));
        sb.append(indent(indent + 1)).append("Value:\n");
        sb.append(value.prettyPrint(indent + 2));
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Assign(" + name + " = " + value + ")";
    }
}
