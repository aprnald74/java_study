package Varivale4.java.operation;

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

    void studyNot() {
        byte value = (byte)0b11110101;
        byte value2 = (byte)~value;

        System.out.printf("~%d = %02X", value, value2);
    }

    void studyLeftShift() {
        byte value = 64;
        byte result;
        int count = 1;

        result = (byte)(value << count);

        System.out.printf("%02X << %d = %02x\n", value, count, result);
    }

    void studyRightShift() {
        byte value = -128;
        int count = 1;

        System.out.printf("%02X >> %d = %02x\n", value, count, value >> count);
        System.out.printf("%02X >>> %d = %02x\n", value, count, value >>> count);
    }

    public static void main(String[] args) {
        BitValueStudy study = new BitValueStudy();
        //study.studyAnd();
        //study.studyOr();
        //study.studyXor();
        //study.studyNot();
        //study.studyLeftShift();
        //study.studyRightShift();

    }

}
