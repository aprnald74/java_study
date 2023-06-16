package Varivale4.thread;

public class Mother {

    public static void main(String[] args) {
        Son son = new Son();
        Thread thread = new Thread(son);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        thread.interrupt();

    }

}
