package AST.JinjaCss.Statements;

import AST.JinjaCss.JinjaExpression;
import AST.Statement;

public class JinjaVariableStatement extends Statement {
    public JinjaExpression expression;
    public JinjaVariableStatement(int line, JinjaExpression expression) {
        super(line, "JinjaVariableStatement");
        this.expression=expression;
    }
    @Override
    public String toString() {
        return "{{ " + expression.toString() + " }}";
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        sb.append(indent(level + 1))
                .append("Expression:\n");

        sb.append(expression.prettyPrint(level + 2));

        return sb.toString();
    }
}
