package AST.JinjaCss.JinjaExpressions;

import AST.JinjaCss.JinjaExpression;

public class JinjaBooleanExpression extends JinjaExpression {
    public Boolean value;
    public JinjaBooleanExpression(int line, Boolean value) {
        super(line, "JinjaBooleanExpression");
        this.value=value;
    }
    @Override
    public String toString(){
        if (value == null) return "null";
        return value.toString();
    }
    @Override
    public String prettyPrint(int level) {
        String val = (value == null) ? "null" : value.toString();
        return indent(level) + nodeName + " (line " + line + ") " + val + "\n";
    }
}
