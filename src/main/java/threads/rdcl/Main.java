package threads.rdcl;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(10);
        ExecutorService service = Executors.newFixedThreadPool(2);
        IntStream.range(0, 10)
                .mapToObj(i -> new MyOperation(latch, "name"+i))
                .forEach(service::execute);

        System.out.println("przed await");

        try {
            // Thread.sleep() czekaj az wszystkie sie zakoncza
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("po await");

        service.shutdown();
    }
}

class MyOperation implements Runnable {

    private final CountDownLatch latch;
    private final String name;

    public MyOperation(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(RandomUtils.nextInt(500, 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("name " + Thread.currentThread().getName());
        System.out.println("countLatch " + latch.getCount());
        latch.countDown();
    }
}