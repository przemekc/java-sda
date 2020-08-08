package rd.streams;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFlatMap {

    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("a", "b", "z"),
                List.of("f", "x", "c"),
                List.of("e", "w", "h"),
                List.of("a", "x", "e")
        );

//        List<String> myList = new ArrayList<>();
//        for (List<String> strings : list) {
//            for (String string : strings) {
//                myList.addAll(string.toUpperCase());
//            }
//        }

        List<String> collect = list.stream()
                .peek(l -> System.out.println(l))
                .flatMap(strings -> strings.stream())
//                .map(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.toUpperCase();
//                    }
//                })
//                .map(s -> s.toUpperCase());
                .distinct()
                .map(s-> {
                    System.out.println("Mapping " + s);
                    return s.toUpperCase();
                })
                .peek(s -> System.out.println(s))
                .sorted()
                .peek(s -> System.out.println(s))
                .peek(s -> System.out.println(s))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Kolekcja " + collect);
    }
}
