package streams;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MainParaller {

    public static final int COUNT = 1000000;

    public static void main(String[] args) {

        List<Integer> random = random(COUNT);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long count;

//        count = countEven(random);
        count = streamInteger(COUNT)
                .parallel()
//        count = random.parallelStream()
//                .peek(n -> System.out.println(n))
                .filter(integer -> integer % 2 == 0)
                .count();

        stopWatch.stop();
        System.out.println(count);
        System.out.println("Took: " + stopWatch.getTime(TimeUnit.MILLISECONDS));
    }

    private static long countEven(List<Integer> random) {
        long i = 0;
        for (Integer integer : random) {
//            System.out.println(integer);
            if (integer % 2 == 0) {
                i++;
            }
        }
        return i;
    }

    private static List<Integer> random(int count) {
        List<Integer> number = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            number.add(RandomUtils.nextInt());
        }
        return number;
    }

    private static Stream<Integer> streamInteger(int count) {
        return Stream.generate(() -> RandomUtils.nextInt())
                .limit(count);
    }
}
