package AST.JinjaCss.Statements;

import AST.ASTNode;
import AST.JinjaCss.JinjaExpression;
import AST.Statement;

import java.util.List;

public class JinjaForStatement extends Statement {
    public String variable;
    public JinjaExpression iterable;
    public List<Statement> body;

    public JinjaForStatement(int line, String variable,JinjaExpression iterable,List<Statement> body) {
        super(line, "JinjaForStatement");
        this.body=body;
        this.iterable=iterable;
        this.variable=variable;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(variable)
                .append("' (line ")
                .append(line)
                .append(")\n");

        sb.append(indent(level + 1)).append("Iterable:\n");
        sb.append(iterable.prettyPrint(level + 2));

        sb.append(indent(level + 1)).append("Body:\n");
        for (ASTNode stmt : body) {
            sb.append(stmt.prettyPrint(level + 2));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "{% for " + variable + " in " + iterable + " %}";
    }

}
