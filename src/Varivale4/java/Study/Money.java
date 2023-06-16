package Varivale4.java.Study;

import java.util.Scanner;

public class Money {

    void money() {
        Scanner s = new Scanner(System.in);
        System.out.printf("금액을 입력 해주세요: ");
        int money = s.nextInt();

        System.out.println(money + "원은");

        if (money % 50000 >= 0 & money / 50000 != 0) {
            System.out.println("오만원권 " + (money / 50000) + "장,");
            money %= 50000;
        } if (money % 10000 >= 0 & money / 10000 != 0) {
            System.out.println("일만원권 " + (money / 10000) + "장,");
            money %= 10000;
        } if (money % 5000 >= 0 & money / 5000 != 0) {
            System.out.println("오천원권 " + (money / 5000) + "장,");
            money %= 5000;
        } if (money % 1000 >= 0 & money / 1000 != 0) {
            System.out.println("일천원권 " + (money / 1000) + "장,");
            money %= 1000;
        } if (money % 500 >= 0 & money / 500 != 0) {
            System.out.println("오백원권 " + (money / 500) + "장,");
            money %= 500;
        } if (money % 100 >= 0 & money / 100 != 0) {
            System.out.println("일백원권 " + (money / 100) + "장,");
            money %= 100;
        } if (money % 10 >= 0 & money / 10 != 0) {
            System.out.println("일십원권 " + (money / 10) + "장,");
            money %= 10;
        }

        s.close();
    }

    public static void main(String[] args) {
        Money money = new Money();
        money.money();
    }

}
