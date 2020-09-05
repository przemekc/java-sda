package threads.rd;

public class Main {

    public static void main(String[] args) {
//        MySuperThread t1 = new MySuperThread();
//        System.out.println("Current main :" + Thread.currentThread().getName());
//        t1.run();
//        t1.start();
//        System.out.println("End");

//        new Thread(new MyOperation()).start();

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runnable");
        });
        t2.start();
    }
}
