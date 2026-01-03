package AST;

import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode {
    public final List<Statement> statements;

    public Program(int line, List<Statement> statements) {
        super(line, "Program");
        this.statements = statements != null ? statements : new ArrayList<>();
    }
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        for (Statement stmt : statements) {
            if (stmt != null) {
                sb.append(stmt.prettyPrint(level + 1));
            }
        }
        return sb.toString();
    }
}
