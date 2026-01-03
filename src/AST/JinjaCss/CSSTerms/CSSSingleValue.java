package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;
import AST.JinjaCss.CSSValue;

public class CSSSingleValue extends CSSValue {
    public CSSTerm term;
    public CSSSingleValue(int line, CSSTerm term) {
        super(line, "CSSSingleValue");
        this.term=term;
    }

    @Override
    public String toString() {
        if (term == null) return "";
        return term.toString();
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        if (term != null) {
            sb.append(term.prettyPrint(level + 1));
        }
        return sb.toString();
    }
}
