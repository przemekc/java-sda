package rd.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainSortedSet {

    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>();
        persons.add(new Person("Osiecka", "Agnieszka"));
        persons.add(new Person("Kowalski", "Jan"));
        persons.add(new Person("Nowak", "Piotr"));
        persons.add(new Person("Chmielewski", "Piotr"));

        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

