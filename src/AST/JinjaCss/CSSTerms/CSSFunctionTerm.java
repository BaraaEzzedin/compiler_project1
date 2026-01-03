package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSFunctionTerm extends CSSTerm {
    public String functionName;
    public CSSValueList arguments;
    public CSSFunctionTerm(int line, String functionName, CSSValueList arguments) {
        super(line, "CSSFunctionTerm");
        this.functionName=functionName;
        this.arguments=arguments;
    }

    @Override
    public String toString() {
        if (arguments == null) {
            return functionName + "()";
        }
        return functionName + "(" + arguments.toString() + ")";
    }
    @Override
    public String prettyPrint(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(level)).append(nodeName).append(" '").append(functionName).append("' (line ").append(line).append(")\n");
        if (arguments != null) {
            sb.append(indent(level + 1)).append("Arguments:\n");
            sb.append(arguments.prettyPrint(level + 2));
        }
        return sb.toString();
    }
}
