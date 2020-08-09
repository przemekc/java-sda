package streams;

import java.util.List;
import java.util.Optional;

public class MainAnyMatch {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Katarzyna", "Maciej", "Jerzy", "Agnieszka",
                "Bolewsław", "Basia", "Anna"
        );

//        boolean match = false;
//        for (String s : list) {
        // System.out.println(s) /// <<<<< peak
//            if(s.substring(0,1).equalsIgnoreCase("M")) {
//                match = true;
//                break;
//            }
//        }

        boolean match = list.stream()
                .peek(s -> System.out.println(s))
                .anyMatch(a -> a.substring(0, 1)
                        .equalsIgnoreCase("M"));
        System.out.println(match);
    }
}
