package threads.rd;

public class MyRichThread extends Thread {

    public MyRichThread(Runnable target) {
        super(target);
    }

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("Thread has been started " + getName());
    }


}
