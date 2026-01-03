package AST.PyFlask.Expressions;

import AST.ASTNode;
import AST.PyFlask.Expression;

public class KeyValue extends ASTNode {
    public final Expression key; // typically StringLiteral
    public final Expression value;

    public KeyValue(int line, Expression key, Expression value) {
        super(line, "KeyValue");
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }

    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" (line ").append(line).append(")\n");
        sb.append(indent(level + 1)).append("Key:\n");
        if (key != null) {
            sb.append(key.prettyPrint(level + 2));
        } else {
            sb.append(indent(level + 2)).append("<null>").append("\n");
        }
        sb.append(indent(level + 1)).append("Value:\n");
        if (value != null) {
            sb.append(value.prettyPrint(level + 2));
        } else {
            sb.append(indent(level + 2)).append("<null>").append("\n");
        }
        return sb.toString();
    }
}