package AST.JinjaCss.CSSTerms;

import AST.JinjaCss.CSSTerm;

public class CSSNumberTerm extends CSSTerm {
    public Boolean negative;
    public double number;
    public String unit;
    public CSSNumberTerm(int line, Boolean negative, double number, String unit) {
        super(line, "CSSNumberTerm");
        this.negative=negative;
        this.number=number;
        this.unit=unit;
    }
    @Override
    public String toString(){
        String sign = (negative != null && negative) ? "-" : "";
        String numberStr = (number == (int) number) ? String.valueOf((int) number) : String.valueOf(number);
        String unitStr = (unit != null && !unit.isEmpty()) ? unit : "";
        return sign + numberStr + unitStr;
    }
    @Override
    public String prettyPrint(int level) {
        String sign = (negative != null && negative) ? "-" : "";
        String numberStr = (number == (int) number) ? String.valueOf((int) number) : String.valueOf(number);
        String unitStr = (unit != null && !unit.isEmpty()) ? unit : "";
        return indent(level) + nodeName + " (line " + line + ") " + sign + numberStr + unitStr + "\n";
    }
}
