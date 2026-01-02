package AST.CSSStatements;

import AST.CSSStatement;

public abstract class CSSAtRule extends CSSStatement {
    protected CSSAtRule(int line, String nodeName) {
        super(line, nodeName);
    }
}