package rd.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainGroupingByCounting {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Jan", "Maciej", "Jerzy", "Bolewsław",
                "Agnieszka", "Katarzyna", "Basia", "Anna"
        );

//        Map<Gender, Long> nameMap = new HashMap<>();
//
//        for (String name : list) {
//            if (name.endsWith("a")) {
//                if (!nameMap.containsKey(Gender.FEMALE)) {
//                    nameMap.put(Gender.FEMALE, 0L);
//                }
//
//                Long val = nameMap.get(Gender.FEMALE);
//                nameMap.put(Gender.FEMALE, ++val);
//            } else {
//                if (!nameMap.containsKey(Gender.MALE)) {
//                    nameMap.put(Gender.MALE, 0L);
//                }
//
//                Long val = nameMap.get(Gender.MALE);
//                nameMap.put(Gender.MALE, ++val);
//            }
//        }

        Map<Gender, Long> nameMap = list.stream()
                .collect(Collectors.groupingBy(
                        name -> name.endsWith("a") ? Gender.FEMALE : Gender.MALE,
                        Collectors.counting()
                ));

        System.out.println(nameMap);
    }

    enum Gender {
        MALE, FEMALE;
    }
}
