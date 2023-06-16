package Varivale4.thread;

public class Gang {

    private final Boss boss;

    private final int id;

    SafeBox safeBox = new SafeBox();

    public Gang(Boss boss, int id) {
        this.boss = boss;
        this.id = id;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            boss.offer(1);
        }
        System.out.printf("조직원 %d 임무 완료\n", id);
    }

}
