package AST.PyFlask.Expressions;

import AST.PyFlask.Expression;

import java.util.List;

public class DictLiteral extends Expression {
    public List<KeyValue> entries;

    public DictLiteral(int line, List<KeyValue> entries) {
        super(line, "DictLiteral");
        this.entries = entries;
    }

    @Override
    public String toString() {
        return entries.toString();
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        for (KeyValue kv : entries) {
            sb.append(kv.prettyPrint(level + 1));
        }
        return sb.toString();
    }
}