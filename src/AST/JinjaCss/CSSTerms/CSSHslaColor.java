package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSHslaColor extends CSSTerm {
    public String value;
    public CSSHslaColor(int line, String value) {
        super(line, "CSSHslaColor");
        this.value=value;
    }
    @Override
    public String toString() {
        return "hsla(" + value + ")";
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") hsla(" + value + ")\n";
    }
}
