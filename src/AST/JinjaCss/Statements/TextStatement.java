package AST.JinjaCss.Statements;

import AST.Statement;

public class TextStatement extends Statement {
    public String text;
    public TextStatement(int line, String text) {
        super(line, "TextStatement");
        this.text=text;
    }
    @Override
    public String toString() {
        return text;
    }

    @Override
    public String prettyPrint(int level) {
        return indent(level)
                + nodeName
                + " (line "
                + line
                + ") \""
                + text.replace("\n", "\\n")
                + "\"\n";
    }
}
