package rd.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c");
        Stream<String> stream = strings.stream();

        Stream<String> stringStream = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();
//        long count = stringStream.map(s -> s.toUpperCase())
//                .count();
//        System.out.println(count);

//        List<String> collect = stringStream
////                .skip(2)
//                .peek(s -> System.out.println(s))
//                .map(s -> s.toUpperCase())
//                .peek(s -> System.out.println(s))
//                .limit(2)
//                .collect(Collectors.toList());

//        System.out.println("Kolekcja: " + collect);

        List<String> collect = stringStream.filter(s -> s.equals("b"))
                .peek(s-> System.out.println(s))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
