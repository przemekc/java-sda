package rd.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MainDeQue {

    public static void main(String[] args) {
        Deque<Person> persons = new LinkedList<>();
        persons.addFirst(new Person("Kowalski", "Jan"));
        persons.addFirst(new Person("Nowak", "Piotr"));
        persons.addFirst(new Person("Osiecka", "Agnieszka"));

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("=======================");
        System.out.println(persons.pollLast());

        System.out.println("=======================");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

