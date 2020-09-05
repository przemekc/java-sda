package threads.rdes;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.Callable;

public class RandomInteger implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("randomInteger on " + Thread.currentThread().getName());
        Thread.sleep(RandomUtils.nextInt(1000, 2000));
        return RandomUtils.nextInt(0, Integer.MAX_VALUE);
    }
}
