package threads.rd;

public class MySuperThread extends Thread {



    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Run from " +
                getClass() + " " +
                getName());
        System.out.println("Current: " + Thread.currentThread().getName());
    }
}
