package streams;

import java.util.List;

public class MainNoneMatch {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Katarzyna", "Maciej", "Jerzy", "Agnieszka",
                "Bolewsław", "Basia", "Anna"
        );

//        boolean match = true;
//        for (String s : list) {
//         System.out.println(s); /// <<<<< peak
//            if(s.substring(0,1).equalsIgnoreCase("Z")) {
//                match = false;
//                break;
//            }
//        }
//        System.out.println(match);

        boolean match = list.stream()
                .peek(s -> System.out.println(s))
                .noneMatch(a -> a.substring(0, 1)
                        .equalsIgnoreCase("A"));
        System.out.println(match);
    }
}
