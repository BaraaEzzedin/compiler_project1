package AST.PyFlask.Statements;

import AST.PyFlask.Block;
import AST.PyFlask.Expression;
import AST.Statement;

public class IfStmt extends Statement {
    public Expression condition;
    public Block thenBlock;
    public Block elseBlock; // may be null

    public IfStmt(int line ,Expression condition, Block thenBlock, Block elseBlock) {
        super(line,"If");
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("If (line ").append(line).append(")\n");
        sb.append(indent(indent + 1)).append("Condition:\n");
        sb.append(condition.prettyPrint(indent + 2));
        sb.append(indent(indent + 1)).append("Then:\n");
        sb.append(thenBlock.prettyPrint(indent + 2));

        if (elseBlock != null) {
            sb.append(indent(indent + 1)).append("Else:\n");
            sb.append(elseBlock.prettyPrint(indent + 2));
        }
        return sb.toString();
    }

    @Override public String toString() { return "If(" + condition + ", then=" + thenBlock + ", else=" + elseBlock + ")"; }
}
