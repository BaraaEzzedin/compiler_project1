package AST.JinjaCss.CSSStatements;

import AST.JinjaCss.CSSStatement;

public abstract class CSSAtRule extends CSSStatement {
    protected CSSAtRule(int line, String nodeName) {
        super(line, nodeName);
    }
}