package rd.maps;

import rd.collections.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapComparationMain {

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        map.put(new Person("Kowalski", "Jan"), "1");
        map.put(new Person("Nowak", "Piotr"), "2");
        map.put(new Person("Osiecka", "Agnieszka"), "3");

        for (Map.Entry<Person, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("==================================");

        SortedMap<Person, String> treeMap = new TreeMap<>();

        treeMap.put(new Person("Kowalski", "Jan"), "1");
        treeMap.put(new Person("Nowak", "Piotr"), "2");
        treeMap.put(new Person("Osiecka", "Agnieszka"), "3");

        for (Map.Entry<Person, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
