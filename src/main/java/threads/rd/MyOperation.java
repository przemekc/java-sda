package threads.rd;

public class MyOperation implements Runnable {

    @Override
    public void run() {
        System.out.println("my operation");
    }
}
