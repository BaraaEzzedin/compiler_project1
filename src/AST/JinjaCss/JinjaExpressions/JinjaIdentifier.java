package AST.JinjaCss.JinjaExpressions;

import AST.JinjaCss.JinjaExpression;

import java.util.List;

public class JinjaIdentifier extends JinjaExpression {
    public List<String> parts;

    public JinjaIdentifier(int line, List<String> parts) {
        super(line, "JinjaIdentifier");
        this.parts = parts;
    }

    public String getFullName() {
        return String.join(".", parts);
    }

    public String getRootName() {
        return parts.get(0);
    }

    public boolean isSimple() {
        return parts.size() == 1;
    }

    @Override
    public String toString() {
        if (parts == null || parts.isEmpty()) {
            return "";
        }
        return String.join(".", parts);
    }

    @Override
    public String prettyPrint(int level) {
        String identifier = (parts == null || parts.isEmpty()) ? "" : String.join(".", parts);
        return indent(level) + nodeName + " (line " + line + ") '" + identifier + "'\n";
    }

}
