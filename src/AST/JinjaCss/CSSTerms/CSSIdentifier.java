package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSIdentifier extends CSSTerm {
    public String name;
    public CSSIdentifier(int line, String Name) {
        super(line, "CSSIdentifier");
        this.name=Name;
    }
    @Override
    public String toString(){
        if (name == null) return "";
        return name;
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") '" + (name != null ? name : "") + "'\n";
    }
}
