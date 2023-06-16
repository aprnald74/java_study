package Varivale4.thread;

public class SafeBox {

    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.amount = amount;
    }

}
