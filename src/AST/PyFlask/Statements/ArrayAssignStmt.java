package AST.PyFlask.Statements;

import AST.PyFlask.Expression;
import AST.Statement;

public class ArrayAssignStmt extends Statement {
    public Expression array;
    public Expression index;
    public Expression value;

    public ArrayAssignStmt(int line, Expression array, Expression index, Expression value) {
        super(line, "ArrayAssignStmt");
        this.array = array;
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArrayAssignStmt [array=" + array + ", index=" + index + ", value=" + value + "]";
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append("Array:\n");
        sb.append(array.prettyPrint(level + 2));
        sb.append(indent(level + 1)).append("Index:\n");
        sb.append(index.prettyPrint(level + 2));
        sb.append(indent(level + 1)).append("Value:\n");
        sb.append(value.prettyPrint(level + 2));
        return sb.toString();
    }
}
