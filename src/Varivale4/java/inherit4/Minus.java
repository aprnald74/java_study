package Varivale4.java.inherit4;

public class Minus extends Adder {

    @Override
    public int calculate() {
        return op1 - op2;
    }

    public static void main(String[] args) {
        Adder adder = new Minus();

        adder.setOp1(7);
        adder.setOp2(4);

        System.out.println(adder.calculate());
    }
}
