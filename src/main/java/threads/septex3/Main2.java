package threads.septex3;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main2 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        IntStream.range(1, 10)
                .mapToObj(i -> new ThreadPlaygroundRunnable("name" + i))
                .forEach(t -> executor.execute(t)); // t.start();

//        for(int i = 0; i < 10; i++) {
//            executor.execute(new ThreadPlaygroundRunnable("name " + i));
//        }

//        executor.shutdown();
    }
}
