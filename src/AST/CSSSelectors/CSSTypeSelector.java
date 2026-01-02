package AST.CSSSelectors;

import AST.CSSSimpleSelector;

public class CSSTypeSelector extends CSSSimpleSelector {
    String elementName;
    CSSPseudoSelector pseudoSelector;
    public CSSTypeSelector(int line, String elementName, CSSPseudoSelector pseudoSelector ) {
        super(line, "CSSTypeSelector");
        this.elementName=elementName;
        this.pseudoSelector=pseudoSelector;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (elementName != null) {
            sb.append(elementName);
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
                .append(" '")
                .append(elementName != null ? elementName : "")
                .append("' (line ")
                .append(line)
                .append(")\n");

        if (pseudoSelector != null) {
            sb.append(pseudoSelector.prettyPrint(level + 1));
        }

        return sb.toString();
    }
}
