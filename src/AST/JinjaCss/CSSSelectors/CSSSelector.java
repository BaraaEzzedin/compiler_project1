package AST.JinjaCss.CSSSelectors;

import AST.JinjaCss.CSSStatement;

import java.util.List;

public class CSSSelector extends CSSStatement {
    public List<CSSSelectorSequence> selectorSequences;
    public CSSSelector(int line, List<CSSSelectorSequence> selectorSequences) {
        super(line, "CSSSelector");
        this.selectorSequences=selectorSequences;
    }

    @Override
    public String toString() {
        if (selectorSequences == null || selectorSequences.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < selectorSequences.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(selectorSequences.get(i).toString());
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

        if (!selectorSequences.isEmpty()) {
            for (CSSSelectorSequence seq : selectorSequences) {
                if (seq != null) {
                    sb.append(seq.prettyPrint(level + 1));
                }
            }
        }

        return sb.toString();
    }
}
