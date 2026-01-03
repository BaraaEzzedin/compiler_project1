package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSColor extends CSSTerm {
    public String value;
    public CSSColor(int line, String value) {
        super(line, "CSSColor");
        this.value=value;
    }
    @Override
    public String toString() {
        if (value == null) return "";
        return value;
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") \"" + value + "\"\n";
    }
}
