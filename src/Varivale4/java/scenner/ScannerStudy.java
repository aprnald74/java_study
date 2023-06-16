package Varivale4.java.scenner;

import java.util.Scanner;

public class ScannerStudy {

    public Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void testRead() {
        String str = null;
        String valued = "os";


        do {
            str = this.scanner.next();
            System.out.println("출력 : " + str);
        } while (!"꺼진다".equals((str)));
        hardWare();
        //double value = this.scanner.nextDouble();
        //System.out.println("Int value : " + (value + 5));


    }

    public void hardWare() {
        for(int i = 3; i > 0; i--) {
            try {
                Thread.sleep(1000); // 단위 ms
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.printf("%d\n", i);
        }
    }

    public void closeScanner() {
        this.scanner.close();
    }

    public static void main(String[] args) {
        ScannerStudy sc = new ScannerStudy();
        sc.prepareScanner();
        sc.testRead();
        sc.closeScanner();

    }

}
