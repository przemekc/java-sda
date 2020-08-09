package streams;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.isAllLowerCase;
import static org.apache.commons.lang3.StringUtils.isAllUpperCase;

public class MainAllMatch {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Katarzyna", "przemek", "Maciej", "Jerzy", "Agnieszka",
                "Bolewsław", "Basia", "Anna"
        );

//        boolean match = true;
//        for (String s : list) {
//         System.out.println(s); /// <<<<< peak
//            String firstNameCharacter = s.substring(0, 1);
//            if(!isAllUpperCase(firstNameCharacter)) {
        // lub uzycie sprawdzenia lower case
//            if(isAllLowerCase(firstNameCharacter)) {
//                match = false;
//                break;
//            }
//        }
//        System.out.println(match);

        boolean match = list.stream()
                .peek(s -> System.out.println(s))
                .allMatch(a -> isAllUpperCase(a.substring(0, 1)));
        System.out.println(match);
    }
}
