package Varivale4.caluculator;

public class Multiplication extends SimpleCalculator {

    public int calculate() {
        return op1 * op2;
    }

    public String getOperator() {
        return "*";
    }

    public static void main(String[] args) {
        SimpleCalculator adder = new Adder();

        adder.execute();
    }
}
