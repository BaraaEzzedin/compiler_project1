package AST.JinjaCss.CSSStatements;

import AST.JinjaCss.CSSSelectors.CSSSelector;
import AST.JinjaCss.CSSDeclarations.CSSDeclaration;
import AST.JinjaCss.CSSStatement;

import java.util.ArrayList;
import java.util.List;

public class CSSRule extends CSSStatement {
    public CSSSelector selector;
    public List<CSSDeclaration> declarations;

    public CSSRule(int line, CSSSelector selector, List<CSSDeclaration> declarations) {
        super(line, "CSSRule");
        this.selector = selector;
        this.declarations = declarations != null ? declarations : new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(selector.toString()).append(" {\n");

        for (CSSDeclaration decl : declarations) {
            if (decl != null) {
                sb.append("  ").append(decl.toString()).append("\n");
            }
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        sb.append(indent(level + 1)).append("Selector:\n");
        if (selector != null) {
            sb.append(selector.prettyPrint(level + 2));
        }

        if (!declarations.isEmpty()) {
            sb.append(indent(level + 1)).append("Declarations:\n");
            for (CSSDeclaration decl : declarations) {
                if (decl != null) {
                    sb.append(decl.prettyPrint(level + 2));
                }
            }
        }

        return sb.toString();
    }
}