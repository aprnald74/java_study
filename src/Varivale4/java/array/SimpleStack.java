package Varivale4.java.array;

import java.util.Scanner;

public class SimpleStack {
    private static final int SIZE = 10;
    private String[] array = new String[SIZE];

    private int top = 0;

    public void push(String value) {
        array[top++] = value;
        // TODO
    }

    public String pop() {
        return array[--top];
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= SIZE;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleStack stack = new SimpleStack();

        String word = null;
        String command = null;
        while (true) {
            command = scanner.next();
            if ("push".equals(command)) {
                if (stack.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                }
                word = scanner.next();
                stack.push(word);
            } else if ("pop".equals(command)) {
                if (stack.isEmpty()) {
                    System.out.println("Stack Empty");
                    continue;
                }
                System.out.println(stack.pop());
            } else if ("size".equals(command)) {
                System.out.println(stack.size());
            } else if ("quit".equals(command)) {
                break;
            } else {
                System.out.println("Unknown Command");
            }
        }

        scanner.close();
    }

}
