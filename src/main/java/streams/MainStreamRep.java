package streams;

import java.util.List;
import java.util.Optional;

public class MainStreamRep {

    public static void main(String[] args) {
        List<String> capitals = List.of("Warsaw", "Berlin", "Amsterdam", "Lisbona",
                "Paris", "Rome", "London");

        Optional<String> p = capitals.stream()
                .filter(c -> c.startsWith("P"))
                .findAny();
        p.ifPresent(s-> System.out.println(s));

        p.ifPresentOrElse(s-> System.out.println(s), // System.out::println
                               // println(s)
                () -> System.out.println("Not found"));

        if(p.isPresent()) {
            String s = p.get();
        } else {
            System.out.println("not found");
        }

    }
}
