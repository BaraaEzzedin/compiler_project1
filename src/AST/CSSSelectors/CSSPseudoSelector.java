package AST.CSSSelectors;

import AST.CSSSimpleSelector;

public class CSSPseudoSelector extends CSSSimpleSelector {
    public String pseudoName;

    public CSSPseudoSelector(int line, String pseudoName) {
        super(line, "CSSPseudoSelector");
        this.pseudoName = pseudoName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(":");
        if (pseudoName != null) {
            sb.append(pseudoName);
        }
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        return indent(level)
                + nodeName
                + " ':"
                + (pseudoName != null ? pseudoName : "")
                + "' (line "
                + line
                + ")\n";
    }
}