package Varivale4.java.Study;

import java.util.Scanner;

public class PerfectNumber {

    void perfectNumber() {
        Scanner s = new Scanner(System.in);
        System.out.printf("정수를 입력하세요 ");

        int cnt = 0;
        int[] sum = new int[1000000000];
        int sumall = 0;
        int num = s.nextInt();

        for (int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum[cnt++] = i;
            }
        }
        for (int i = 0; i < cnt; i++) {
            sumall += sum[i];
        }

        if (num == sumall) {
            System.out.println("완전수임");
        } else {
            System.out.println("완전수 아님");
        }

        s.close();
    }









    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.perfectNumber();
    }

}
