package AST.JinjaCss.JinjaExpressions;

import AST.JinjaCss.JinjaExpression;

public class JinjaString extends JinjaExpression {
    public String value;
    public JinjaString(int line, String value) {
        super(line, "JinjaString" );
        this.value=value;
    }
    @Override
    public String toString() {
        return "\"" + value + "\"";
    }
    @Override
    public String prettyPrint(int level) {
        return indent(level) + nodeName + " (line " + line + ") \"" + value + "\"\n";
    }
}
