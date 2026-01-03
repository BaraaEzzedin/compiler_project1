package AST.JinjaCss.CSSSelectors;

import AST.JinjaCss.CSSStatement;

import java.util.List;

public class CSSSelectorSequence extends CSSStatement {
    public List<CSSCompoundSelector> compoundSelectors;
    public CSSSelectorSequence(int line, List<CSSCompoundSelector> compoundSelectors) {
        super(line, "CSSSelectorSequence");
        this.compoundSelectors=compoundSelectors;
    }

    @Override
    public String toString() {
        if (compoundSelectors == null || compoundSelectors.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < compoundSelectors.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(compoundSelectors.get(i).toString());
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

        if (!compoundSelectors.isEmpty()) {
            for (CSSCompoundSelector cs : compoundSelectors) {
                if (cs != null) {
                    sb.append(cs.prettyPrint(level + 1));
                }
            }
        }

        return sb.toString();
    }
}
