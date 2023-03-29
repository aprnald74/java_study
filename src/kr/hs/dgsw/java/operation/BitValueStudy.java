package kr.hs.dgsw.java.operation;

public class BitValueStudy {

    void studyAnd() {
        int op1 = 5;
        int op2 = 2;

        int result = op1 & op2;

        System.out.printf("%d & %d = %d\n", op1, op2, result);
    }

    void studyOr() {
        int op1 = 0b101;
        //int op2 = 0x1A;
        int op2 = 017;

        int result = op1 | op2;

        System.out.printf("%d | %d = %d", op1, op2, result);
    }

    void studyXor() {
        int op1 = 0b1010;
        int op2 = 0b0011;

        int result = op1 ^ op2;
        System.out.printf("%d ^ %d = %d", op1, op2, result);
    }

    public static void main(String[] args) {
        BitValueStudy bitValueStudy = new BitValueStudy();
        //bitValueStudy.studyAnd();
        //bitValueStudy.studyOr();
        bitValueStudy.studyXor();


    }

}
