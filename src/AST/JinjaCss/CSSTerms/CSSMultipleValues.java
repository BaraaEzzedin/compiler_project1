package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;
import AST.JinjaCss.CSSValue;

import java.util.ArrayList;
import java.util.List;

public class CSSMultipleValues extends CSSValue {
    public List<CSSTerm> terms;
    public CSSMultipleValues(int line, List<CSSTerm> terms) {
        super(line, "CSSMultipleValues");
        this.terms=new ArrayList<>(terms);
    }

    @Override
    public String toString() {
        if (terms == null || terms.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < terms.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(terms.get(i).toString());
        }
        return sb.toString();
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        if (terms != null && !terms.isEmpty()) {
            for (CSSTerm term : terms) {
                if (term != null) {
                    sb.append(term.prettyPrint(level + 1));
                }
            }
        }
        return sb.toString();
    }
}
