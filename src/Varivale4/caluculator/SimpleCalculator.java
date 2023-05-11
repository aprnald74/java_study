package Varivale4.caluculator;
import Varivale4.Score;

import java.util.Scanner;

public abstract class SimpleCalculator {

    protected int op1;

    protected int op2;

    protected final Scanner scanner = new Scanner(System.in);

    public void execute() {
        while (true) {
            // 두 개의 정수를 입력
            inputOperands();

            // 두 정수가 모두 0이라면 종료한다.
            if (op1 == 0 && op2 == 0) {
                break;
            }

            // 계산
            int result = calculate();

            // 결과 출력
            printResult(result);
        }

        scanner.close();
        System.out.println("프로그램 종료합니다");
    }

    public void inputOperands() {
        System.out.println("두 개의 정수를 입력하세요.");
        op1 = scanner.nextInt();
        op2 = scanner.nextInt();

    }

    public abstract int calculate();

    public  void printResult(int result) {
        System.out.printf("%d %s %d = %d\n",
                op1, getOperator(), op2, result);
    }

    public abstract String getOperator();

}
