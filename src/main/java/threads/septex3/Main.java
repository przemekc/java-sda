package threads.septex3;

public class Main {

    private static Thread t1 = new Thread(new ThreadPlaygroundRunnable("foo"));
    private static Thread t2 = new Thread(new ThreadPlaygroundRunnable("bar"));

    public static void main(String[] args) {
        t1.start();
        t2.start();
    }
}
