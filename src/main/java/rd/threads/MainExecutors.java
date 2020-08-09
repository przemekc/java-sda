package rd.threads;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.*;

public class MainExecutors {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> submit = executorService.submit(new MyJob2(101));

        System.out.println("main after submit");
        System.out.println("main after submit");
        System.out.println("main after submit");
        System.out.println("main after submit");

        try {
            String s = submit.get();
            System.out.println("value from my job " + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("the end");

        executorService.shutdown();

//        List<Future<String>> collect = IntStream.range(1, 100)
//                .mapToObj(i -> new MyJob2(i))
//                .map(job -> executorService.submit(job))
//                .collect(toList());

    }
}

class MyJob2 implements Callable<String> {

    private int i;

    public MyJob2(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        System.out.println("doing " + i);
        Thread.sleep(3000);
        System.out.println("done " + i);
        return Thread.currentThread().getName();
    }
}