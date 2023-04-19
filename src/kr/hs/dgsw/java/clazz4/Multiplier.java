package kr.hs.dgsw.java.clazz4;

public class Multiplier {

    private int a;
    private int b;

    public void setOperand1(int operand) {
        this.a = operand;
    }

    public void setOperand2(int operand) {
        this.b = operand;
    }

    public void showResult() {

        int result = 0;

        for(int i = 0; i < b; i++) {
            result += a;
        }
        System.out.printf("%d * %d = %d", a, b, calculate());
        // 표줄 출력 장치로도 3 * 4 = 12라고 출력한다.
    }

    private int calculate() {
        int result = 0;
        for(int i = 0; i < b; i++) {
            result += b;
        }
        return result;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        multiplier.setOperand1(5);
        multiplier.setOperand2(3);
        multiplier.showResult();
    }
}
