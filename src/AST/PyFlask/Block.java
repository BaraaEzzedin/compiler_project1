package AST.PyFlask;

import AST.ASTNode;
import AST.Statement;

import java.util.List;

public class Block extends ASTNode {
    private final List<Statement> statements;

    public Block(int line, List<Statement> statements) {
        super(line, "Block");
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        for (ASTNode st : statements) {
            if (st != null) {
                sb.append(st.prettyPrint(indent + 1));
            }
        }
        return sb.toString();
    }
}
