package AST.HtmlElements;

import AST.HtmlElement;

public class ScriptElement extends HtmlElement {
    public String scriptBody;

    public ScriptElement(int line, String scriptBody) {
        super(line, "ScriptElement");
        this.scriptBody=scriptBody;
    }
    @Override
    public String toString() {
        return scriptBody;
    }

    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level))
                .append(nodeName)
                .append(" (line ")
                .append(line)
                .append(")\n");

        if (scriptBody != null && !scriptBody.isEmpty()) {
            sb.append(indent(level + 1))
                    .append("Body: \"")
                    .append(scriptBody.replace("\n", "\\n"))
                    .append("\"\n");
        }

        return sb.toString();
    }
}
