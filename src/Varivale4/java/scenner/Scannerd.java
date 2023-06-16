package Varivale4.java.scenner;

import java.util.Scanner;

public class Scannerd {

    public Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void add() {
        int value1;
        int value2;

        value1 = this.scanner.nextInt();
        value2 = this.scanner.nextInt();
        System.out.printf("%d + %d = %d\n", value1, value2, value1 + value2);
    }

    public void closeScanner() {
        this.scanner.close();
    }

    public static void main(String[] args) {
        Scannerd scanner = new Scannerd();
        scanner.prepareScanner();
        scanner.add();
        scanner.closeScanner();
    }

}
