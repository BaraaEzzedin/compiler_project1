package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSVariable extends CSSTerm {
    public String name;
    public CSSVariable(int line, String name) {
        super(line, "CSSVariable");
        this.name=name;
    }
    @Override
    public String toString(){
        if (name == null) return "var(--)";
        return "var(--" + name + ")";
    }
    @Override
    public String prettyPrint(int level) {
        String varName = (name == null) ? "" : name;
        return indent(level) + nodeName + " (line " + line + ") var(--" + varName + ")\n";
    }
}
