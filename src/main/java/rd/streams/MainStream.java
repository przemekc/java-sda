package rd.streams;

import java.util.List;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Katarzyna", "Maciej", "Jerzy", "Agnieszka",
                "Bolewsław", "Basia", "Anna"
        );

        Stream<String> stream = list.stream();

        System.out.println(stream
                .filter(s -> s.substring(0, 1)
                        .equalsIgnoreCase("K"))
                .count());

        // wyjatek konsumowanie tego samego streama
        System.out.println(stream
                .filter(s -> s.substring(0, 1)
                        .equalsIgnoreCase("A"))
                .count());

    }
}
