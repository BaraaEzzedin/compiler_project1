package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSHslColor extends CSSTerm {
    public String value;
    public CSSHslColor(int line, String value) {
        super(line, "CSSHslColor");
        this.value=value;
    }
    @Override
    public String toString() {
        return "hsl(" + value + ")";
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") hsl(" + value + ")\n";
    }
}
