package AST.CSSTerms;

import AST.CSSTerm;

public class CSSString extends CSSTerm {
    public String value;
    public CSSString(int line, String value) {
        super(line, "CSSString");
        this.value=value;
    }
    @Override
    public String toString(){
        if (value == null) return "\"\"";
        return "\"" + value + "\"";
    }
    @Override
    public String prettyPrint(int level) {
        String val = (value == null) ? "" : value;
        return indent(level) + nodeName + " (line " + line + ") \"" + val + "\"\n";
    }
}
