package AST.CSSSelectors;

import AST.CSSSimpleSelector;

public class CSSIdSelector extends CSSSimpleSelector {
    public String idName;
    public CSSPseudoSelector pseudoSelector;

    public CSSIdSelector(int line, String idName, CSSPseudoSelector pseudoSelector) {
        super(line, "CSSIdSelector");
        this.idName = idName;
        this.pseudoSelector = pseudoSelector;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        if (idName != null) {
            sb.append(idName);
        }
        if (pseudoSelector != null) {
            sb.append(pseudoSelector.toString());
        }
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" '#")
                .append(idName != null ? idName : "")
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (pseudoSelector != null) {
            sb.append(pseudoSelector.prettyPrint(level + 1));
        }

        return sb.toString();
    }
}