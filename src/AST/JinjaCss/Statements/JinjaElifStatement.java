package AST.JinjaCss.Statements;

import AST.ASTNode;
import AST.JinjaCss.JinjaExpression;
import AST.Statement;

import java.util.List;

public class JinjaElifStatement extends Statement {
    public JinjaExpression condition;
    public List<Statement> body;

    public JinjaElifStatement(int line, JinjaExpression condition, List<Statement> body) {
        super(line, "JinjaElifStatement");
        this.body=body;
        this.condition=condition;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        sb.append(indent(level + 1)).append("Condition:\n");
        sb.append(condition.prettyPrint(level + 2));

        sb.append(indent(level + 1)).append("Body:\n");
        for (ASTNode stmt : body) {
            sb.append(stmt.prettyPrint(level + 2));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "{% elif " + condition + " %}";
    }
}
