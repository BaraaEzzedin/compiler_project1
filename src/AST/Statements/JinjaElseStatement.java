package AST.Statements;

import AST.ASTNode;
import AST.Statement;

import java.util.List;

public class JinjaElseStatement extends Statement {
    public List<Statement> body;
    public JinjaElseStatement(int line, List<Statement> body) {
        super(line, "JinjaElseStatement");
        this.body =body;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        sb.append(indent(level + 1)).append("Body:\n");
        for (ASTNode stmt : body) {
            sb.append(stmt.prettyPrint(level + 2));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "{% else %}";
    }
}
