package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSRgbColor extends CSSTerm {
    public String value;
    public CSSRgbColor(int line, String value) {
        super(line, "CSSRgbColor");
        this.value=value;
    }
    @Override
    public String toString() {
        return "rgb(" + value + ")";
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") rgb(" + value + ")\n";
    }
}
