package rd.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainToMap {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("70062894677", "Adam", "Mickiewicz"),
                new Person("66072785139", "Agnieszka", "Osiecka"),
                new Person("63041916147", "Julisz", "Słowacki"),
                new Person("55032812989", "Katarzyna", "Grochola"),
                new Person("83090224747", "Henryk", "Sienkiwicz"),
                new Person("87041951263", "Wisława", "Szymborska"),
                new Person("54111813947", "Bolesław", "Prus"),
                new Person("59012738256", "Jan", "Kochanowski")
        );

//        Map<String, Person> personMap = new HashMap<>();
//
//        for (Person person : persons) {
//            personMap.put(person.getPesel(), person);
//        }

        Map<String, Person> personMap = persons.stream()
                .collect(Collectors.toMap(Person::getPesel, Function.identity()));

        System.out.println(personMap);
    }
}
