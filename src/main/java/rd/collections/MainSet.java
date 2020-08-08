package rd.collections;

import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Kowalski", "Jan"));
        persons.add(new Person("Nowak", "Piotr"));
        persons.add(new Person("Osiecka", "Agnieszka"));

        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

