package kr.hs.dgsw.java.Study;

import java.util.Scanner;

public class LeastCommonMultiple {




    void leastCommonMultiple() {
        Scanner s = new Scanner(System.in);
        System.out.printf("2개의 정수를 : ");
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = a; i <= a * b; i++) {
            System.out.println(i);
            if (i / b == 0) {
                System.out.println("최소 공배수는 : " + i);
                break;
            }
        }


        s.close();
    }


    public static void main(String[] args) {
        LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();
        leastCommonMultiple.leastCommonMultiple();
    }

}
