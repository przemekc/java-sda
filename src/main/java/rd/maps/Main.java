package rd.maps;

import rd.collections.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("K1", new Person("Kowalski", "Jan"));

        System.out.println(personMap.containsKey("K1"));
        System.out.println(personMap.containsValue(new Person("Kowalski", "Jan")));

        personMap.put("K1", new Person("Kowalski2222222", "Jan"));

        personMap.put("N1", new Person("Nowak", "Piotr"));

        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

//        for (String s : personMap.keySet()) {
//            System.out.println(s);
//        }
//        Collection<Person> values = personMap.values();
//        for (Person value : values) {
//            System.out.println(value);
//        }
    }
}
