package AST;
public abstract class ASTNode {
    public final int line;
    protected final String nodeName;

    protected ASTNode(int line, String nodeName){
        this.line=line;
        this.nodeName=nodeName;
    }

    protected String indent(int level) {
        return "  ".repeat(level);
    }

    public abstract String prettyPrint(int indent);

    @Override
    public abstract String toString();
}
