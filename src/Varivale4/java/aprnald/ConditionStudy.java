package Varivale4.java.aprnald;
import java.util.Scanner;
public class ConditionStudy {

    void studyIf() {
        boolean flag1 = false;
        boolean flag2 = true;

        if (flag1) {
            System.out.println("좋아요");
        } else if (flag2) {
            System.out.println("그저그래요");
        } else {
            System.out.println("싫어요");
        }

    }

    public void studyDoWhile() {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        do {
            str = scanner.next();
            System.out.println(str);
        } while (!str.equals("그만"));

        scanner.close();
    }

    public void studyWhile() {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        while (!str.equals("그만")) {
            str = scanner.next();
            System.out.println(str);
        }

        scanner.close();
    }

    void studyFor() {
        int sum = 0;

        for(int i = 2; i <= 100; i += 2) {
                sum += i;
        }
        System.out.println(sum);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

    void studyForEach() {
        String[] colors = new String[] {"red", "yellow", "blue", "pink"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

    }

    void studySwitch() {
        int value = 1;

        switch (value) {
            case 1:
                System.out.println("아주 좋아요");
                break;
            case 2:
                System.out.println("잘 했어요");
                break;
            case 3:
            case 4:
                System.out.println("그저 그렇군요");
                break;
            case 5:
                System.out.println("좀 더 노력했어요");
                break;
            default:
                System.out.println("왜 살아?");
                break;
        }

        String name = "홍길동";

        switch (name) {
            case "홍길동":
                System.out.println("의적");
                break;
            case "아인슈타인":
                System.out.println("과학자");
                break;
        }

    }


    public static void main(String[] args) {
        ConditionStudy conditionStudy = new ConditionStudy();
        conditionStudy.studySwitch();
    }
}
