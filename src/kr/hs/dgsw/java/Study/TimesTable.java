package kr.hs.dgsw.java.Study;

import java.util.Scanner;

public class TimesTable {

    void gugu() {
        Scanner s = new Scanner(System.in);
        System.out.printf("2~9 사이의 정수를 : ");
        int Num = s.nextInt();
        if (Num < 2 | Num > 9) {
            System.out.println("잘못된 수를 입력했습니다");
            return;
        }
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", Num, i, Num * i);
        }
        s.close();
    }

    public static void main(String[] args) {
        TimesTable timesTable = new TimesTable();
        timesTable.gugu();
    }

}
