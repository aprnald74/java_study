package Varivale4.java.operation;

public class OperationStudy {

    void studyArithmetic() {
        int op1 = 5;
        int op2 = 3;

        int plus = op1 + op2;
        int minus = op1 - op2;
        int multiply = op1 * op2;
        int divide = op1 / op2;
        int modulus = op1 % op2;

        op2 = 0;
        //divide = op1 /op2;
        //modulus = op1 % op2;
    }

    void studyRelational() {
        int op1 = 3;
        int op2 = 5;

        boolean result;

        result = op1 == op2;
        result = op1 > op2;
        result = op1 < op2;
        result = op1 != op2;
        result = op1 >= op2;
        result = op1 <= op2;
    }

    void studyLogical() {
        boolean op1 = true;
        boolean op2 = false;

        boolean result;
        result = op1 && op2;
        result = op1 || op2;
        //result = !op1;

        result = op1 && op2 || op1 && op2;
        result = op1 || op2 && op1 || op2;
    }

    void studyTernary() {
        boolean condition = true;
        int result = condition ? 5 : 2;
    }

    public static String toBinary (int value) {
        return Integer.toBinaryString(value);
    }

    String ToBinary(int value){
        if (value == 0) return "0";
        else if(value == 1) return "1";
        return toBinary(value / 2) + toBinary(value % 2);
    }

    public static void main(String[] args) {
        OperationStudy operationStudy = new OperationStudy();

        System.out.printf("%s, \n하드웨어 꺼지는 카운트\n", operationStudy.toBinary(-1));


        for(int i = 3; i > 0; i--) {
            try {
                Thread.sleep(1000); // 단위 ms
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            System.out.printf("%d\n", i);
        }


    }
}
