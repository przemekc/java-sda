package threads.septex3;

import org.apache.commons.lang3.RandomUtils;

public class ThreadPlaygroundRunnable implements Runnable {

    private final String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(RandomUtils.nextInt(200, 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " index: " + i + " " + Thread.currentThread().getName());
        }
    }
}
