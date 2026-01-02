package AST.CSSTerms;

import AST.ASTNode;
import AST.CSSValue;

import java.util.ArrayList;
import java.util.List;

public class CSSValueList extends CSSValue {
    public List<CSSValue> values;
    public CSSValueList(int line, List<CSSValue> values) {
        super(line, "CSSValueList");
        this.values=new ArrayList<>(values);
    }

    @Override
    public String toString() {
        if (values == null || values.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(values.get(i).toString());
        }
        return sb.toString();
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        if (values != null && !values.isEmpty()) {
            for (CSSValue value : values) {
                if (value != null) {
                    sb.append(value.prettyPrint(level + 1));
                }
            }
        }
        return sb.toString();
    }
}
