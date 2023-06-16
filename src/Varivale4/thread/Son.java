package Varivale4.thread;

import Varivale4.polygon.Triangle;

import java.util.Random;
import java.util.Scanner;

public class Son implements Runnable{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Son son = new Son();
    @Override
    public void run() {
        try {

            son.Math();

            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("5초가 지났습니다.");
    }

    void Math() {
        int A = random.nextInt(100);
        int B = random.nextInt(100);

        System.out.println(A + " + " + B + " = ? ");

        int usSum = scanner.nextInt();

        if (A + B == usSum) {
            son.Math();
        }
    }
}
