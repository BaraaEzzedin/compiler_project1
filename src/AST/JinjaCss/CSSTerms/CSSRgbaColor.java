package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSRgbaColor extends CSSTerm {
    public String value;
    public CSSRgbaColor(int line, String value) {
        super(line, "CSSRgbaColor");
        this.value=value;
    }
    @Override
    public String toString() {
        return "rgba(" + value + ")";
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") rgba(" + value + ")\n";
    }
}
