package AST.JinjaCss.JinjaExpressions;

import AST.JinjaCss.JinjaExpression;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JinjaCallExpression extends JinjaExpression {
    public String name;
    public List<JinjaExpression> positional;
    public LinkedHashMap<String, JinjaExpression> keyword;

    public JinjaCallExpression(
            int line,
            String name,
            List<JinjaExpression> positional,
            LinkedHashMap<String, JinjaExpression> keyword) {

        super(line, "JinjaCallExpression");
        this.name = name;
        this.positional = positional;
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("(");

        boolean first = true;
        for (JinjaExpression arg : positional) {
            if (!first) {
                sb.append(", ");
            }
            sb.append(arg);
            first = false;
        }

        for (Map.Entry<String, JinjaExpression> entry : keyword.entrySet()) {
            if (!first) {
                sb.append(", ");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
            first = false;
        }

        sb.append(")");
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '")
                .append(name)
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (!positional.isEmpty()) {
            sb.append(indent(level + 1)).append("Arguments:\n");
            for (JinjaExpression arg : positional) {
                sb.append(arg.prettyPrint(level + 2));
            }
        }

        if (!keyword.isEmpty()) {
            sb.append(indent(level + 1)).append("Keyword Arguments:\n");
            for (Map.Entry<String, JinjaExpression> entry : keyword.entrySet()) {
                sb.append(indent(level + 2))
                        .append(entry.getKey())
                        .append(":\n");
                sb.append(entry.getValue().prettyPrint(level + 3));
            }
        }

        return sb.toString();
    }
}
