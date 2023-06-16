package Varivale4.java.array;
import java.util.Scanner;


public class CircleQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private static final int SIZEI = 10;

    public CircleQueue() {
        queue = new String[SIZEI];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean enQueue(String value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        return true;
    }

    public String deQueue() {
        if (isEmpty()) {
            return null;
        }
        String removedValue = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
        size--;
        return removedValue;
    }

    public String Front() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    public String Rear() {
        if (isEmpty()) {
            return null;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleQueue cq = new CircleQueue();
        while (true) {
            System.out.println("1. enQueue  2. deQueue   3. Size   4. quit");
            System.out.print("메뉴를 선택하세요: ");
            String choice = sc.next();
            if (choice.equals("enQueue")) {
                System.out.print("큐에 넣을 값을 입력하세요: ");
                String value = sc.next();
                boolean success = cq.enQueue(value);
                if (success) {
                    System.out.println(value + "이(가) 큐에 추가되었습니다.");
                } else {
                    System.out.println("큐가 가득 찼습니다.");
                }
            } else if (choice.equals("deQueue")) {
                String removedValue = cq.deQueue();
                if (removedValue != null) {
                    System.out.println(removedValue + "이(가) 큐에서 제거되었습니다.");
                } else {
                    System.out.println("큐가 비어있습니다.");
                }
            } else if (choice.equals("Size")) {
                System.out.println("큐에 저장된 값의 개수는 " + cq.size + "개 입니다.");
            } else if (choice.equals("quit")) {
                sc.close();
                System.exit(0);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
