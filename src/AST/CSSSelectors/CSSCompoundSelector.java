package AST.CSSSelectors;

import AST.ASTNode;
import AST.CSSSimpleSelector;

import java.util.List;

public class CSSCompoundSelector extends ASTNode {
    public List<CSSSimpleSelector>simpleSelectors;
    public CSSCompoundSelector(int line, List<CSSSimpleSelector> simpleSelectors ) {
        super(line, "CSSCompoundSelector");
        this.simpleSelectors=simpleSelectors;
    }

    @Override
    public String toString() {
        if (simpleSelectors == null || simpleSelectors.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (CSSSimpleSelector selector : simpleSelectors) {
            if (selector != null) {
                sb.append(selector.toString());
            }
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

        if (!simpleSelectors.isEmpty()) {
            for (CSSSimpleSelector selector : simpleSelectors) {
                if (selector != null) {
                    sb.append(selector.prettyPrint(level + 1));
                }
            }
        }

        return sb.toString();
    }
}
