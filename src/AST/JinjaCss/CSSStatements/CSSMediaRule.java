package AST.JinjaCss.CSSStatements;

import java.util.ArrayList;
import java.util.List;

public class CSSMediaRule extends CSSAtRule {
    public CSSMediaQuery mediaQuery;
    public List<CSSRule> rules;

    public CSSMediaRule(int line, CSSMediaQuery mediaQuery, List<CSSRule> rules) {
        super(line, "CSSMediaRule");
        this.mediaQuery = mediaQuery;
        this.rules = rules != null ? rules : new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@media ");
        if (mediaQuery != null) {
            sb.append(mediaQuery.toString());
        }
        sb.append(" {\n");

        for (CSSRule rule : rules) {
            if (rule != null) {
                sb.append("  ").append(rule.toString().replace("\n", "\n  ")).append("\n");
            }
        }

        sb.append("}");
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

        if (mediaQuery != null) {
            sb.append(indent(level + 1)).append("Query:\n");
            sb.append(mediaQuery.prettyPrint(level + 2));
        }

        if (!rules.isEmpty()) {
            sb.append(indent(level + 1)).append("Rules:\n");
            for (CSSRule rule : rules) {
                if (rule != null) {
                    sb.append(rule.prettyPrint(level + 2));
                }
            }
        }

        return sb.toString();
    }
}