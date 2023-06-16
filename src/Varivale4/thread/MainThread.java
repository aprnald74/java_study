package Varivale4.thread;

public class MainThread {

    public static void main(String[] args) {

        CownThread thread1 = new CownThread();

        thread1.start();

        DownThread2 thread2 = new DownThread2();
        Thread thread = new Thread(thread2);
        thread.start();



        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);

                System.out.printf("Main - %d\n", i);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
