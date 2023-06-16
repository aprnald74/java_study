package Varivale4.java;

public class Human {

    String name = "하건록";

    int age = 0;

    double height = 0.0;

    void aged() {
        age++;
        height += 6.2;
    }

    void print() {
        System.out.printf("%s님의 나이는 %d살이고, 키는 %.1f임니다", name, age, height);
    }

    public static void main(String[] args) {
        Human haguonrok = new Human();
        for (int i = 0; i < 15; i++) {
            haguonrok.aged();
        }

        haguonrok.print();
    }
}
//:)