package rd.streams;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainGroupingBy {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Maciej", "Jerzy", "Bolewsław",
                "Agnieszka", "Katarzyna", "Basia", "Anna"
        );

//        Map<Gender, List<String>> nameMap = new HashMap<>();
//
//        for (String name : list) {
//            if(name.endsWith("a")) {
//                if(!nameMap.containsKey(Gender.FEMALE)) {
//                    nameMap.put(Gender.FEMALE, new ArrayList<>());
//                }
//
//                nameMap.get(Gender.FEMALE).add(name);
//            } else {
//                if(!nameMap.containsKey(Gender.MALE)) {
//                    nameMap.put(Gender.MALE, new ArrayList<>());
//                }
//
//                nameMap.get(Gender.MALE).add(name);
//            }
//        }

        Map<Gender, List<String>> nameMap = list.stream()
                .collect(Collectors.groupingBy(name -> name.endsWith("a") ? Gender.FEMALE : Gender.MALE));

        System.out.println(nameMap);

        for (Map.Entry<Gender, List<String>> entry : nameMap.entrySet()) {
            System.out.println("iteracja");
            if (!entry.getValue().isEmpty()) {
                System.out.println(entry.getValue());
            }
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
