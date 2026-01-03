package AST.JinjaCss.CSSSelectors;

import AST.JinjaCss.CSSSimpleSelector;

public class CSSClassSelector extends CSSSimpleSelector {
    public String className;
    public CSSPseudoSelector pseudoSelector;

    public CSSClassSelector(int line, String className, CSSPseudoSelector pseudoSelector) {
        super(line, "CSSClassSelector");
        this.className = className;
        this.pseudoSelector = pseudoSelector;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        if (className != null) {
            sb.append(className);
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
                .append(" '.")
                .append(className != null ? className : "")
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (pseudoSelector != null) {
            sb.append(pseudoSelector.prettyPrint(level + 1));
        }

        return sb.toString();
    }
}