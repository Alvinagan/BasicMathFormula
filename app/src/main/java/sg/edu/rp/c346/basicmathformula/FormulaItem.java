package sg.edu.rp.c346.basicmathformula;

public class FormulaItem {

    private String calculate;
    private String formula;
    private String type;

    public FormulaItem(String calculate, String formula, String type) {
        this.calculate = calculate;
        this.formula = formula;
        this.type = type;
    }

    public String getCalculate() {
        return calculate;
    }

    public void setCalculate(String calculate) {
        this.calculate = calculate;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FormulaItem{" +
                "calculate='" + calculate + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}



