package Varivale4.thread;

public class MathThread {


    public static void main(String[] args) {
        DownThread2 mathThread = new DownThread2();
        Thread thread = new Thread(mathThread);
        thread.start();
    }
}
