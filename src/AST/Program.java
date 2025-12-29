package AST;

import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode {
    public final List<ASTNode> nodes;
    
    public Program(int line, List<ASTNode> nodes) {
        super(line, "Program");
        this.nodes = nodes != null ? nodes : new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Program (line " + line + "):\n");
        for (ASTNode node : nodes) {
            if (node != null) {
                sb.append(indent(1)).append(node.toString()).append("\n");
            }
        }
        return sb.toString();
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        for (ASTNode node : nodes) {
            if (node != null) {
                sb.append(node.prettyPrint(level + 1));
            }
        }
        return sb.toString();
    }

}

