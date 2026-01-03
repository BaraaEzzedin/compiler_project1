package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSCalc extends CSSTerm {
    public String expression;
    public CSSCalc(int line, String expression) {
        super(line, "CSSCalc");
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "calc(" + expression + ")";
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") calc(" + expression + ")\n";
    }
}
