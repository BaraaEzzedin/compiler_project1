package AST.JinjaCss.CSSSelectors;

import AST.JinjaCss.CSSSimpleSelector;

public class CSSUniversalSelector extends CSSSimpleSelector {

    public CSSUniversalSelector(int line) {
        super(line, "CSSUniversalSelector");
    }

    @Override
    public String toString() {
        return "*";
    }

    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") '*'\n";
    }
}
