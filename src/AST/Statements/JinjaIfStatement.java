package AST.Statements;

import AST.ASTNode;
import AST.JinjaExpression;
import AST.Statement;

import java.util.List;

public class JinjaIfStatement extends Statement {
    public JinjaExpression condition;
    public List<Statement> thenBody;
    public List<JinjaElifStatement> elifStatements;
    public JinjaElseStatement elseStatement;
    public JinjaIfStatement(int line, JinjaElseStatement elseStatement, List<JinjaElifStatement> elifStatements, List<Statement> thenBody, JinjaExpression condition) {
        super(line, "JinjaIfStatement");
        this.condition=condition;
        this.elifStatements=elifStatements;
        this.elseStatement=elseStatement;
        this.thenBody=thenBody;
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

        sb.append(indent(level + 1)).append("Then:\n");
        for (ASTNode stmt : thenBody) {
            sb.append(stmt.prettyPrint(level + 2));
        }

        for (JinjaElifStatement elif : elifStatements) {
            sb.append(elif.prettyPrint(level + 1));
        }

        if (elseStatement != null) {
            sb.append(elseStatement.prettyPrint(level + 1));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "{% if " + condition + " %}";
    }
}
