package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainFind {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Katarzyna", "Maciej", "Jerzy", "Agnieszka",
                "Bolewsław", "Basia", "Anna"
        );

//        String name;
//        for (String s : list) {
//            if(s.substring(0,1).equalsIgnoreCase("K")) {
//                name = s;
//                break;
//            }
//        }

        Optional<String> name = list.stream()
                .peek(a -> System.out.println(a))
                .filter(a -> a.substring(0, 1)
                        .equalsIgnoreCase("A"))
                .findFirst();

        name.ifPresent(a-> System.out.println("Znalezione: " + a));

        Optional<String> name2 = list.stream()
                .peek(a -> System.out.println(a))
                .filter(a -> a.substring(0, 1)
                        .equalsIgnoreCase("A"))
                .findAny();

        name2.ifPresent(a-> System.out.println("Znalezione: " + a));

//        .findAny()
    }
}
