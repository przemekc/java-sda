package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
//        Files.lines(Path.of("capitals.txt"))
//                .map(s -> {
//                    System.out.println(s);
//                    return s.length();
//                })
//                .filter(getIntegerPredicate())
//                .distinct()
//                .forEach(System.out::println);

//        Files.lines(Path.of("capitals.txt"))
//                .map(String::length)
//                .filter(Predicate.not(getIntegerPredicate()))
//                .filter(integer -> integer < 7)
//                .forEach(System.out::println);

        int sum = Files.lines(Path.of("capitals.txt"))
                .map(s -> {
                    System.out.println(s);
                    return s.length();
                })
                .filter(getIntegerPredicate())
                .distinct()
                .reduce(0, (integer, integer2) -> integer+integer2);
        System.out.println(sum);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return integer -> integer % 2 == 0;
    }
}
