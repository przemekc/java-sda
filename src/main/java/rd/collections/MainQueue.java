package rd.collections;

import java.util.*;

public class MainQueue {

    public static void main(String[] args) {
//        Set<Person> persons = new HashSet<>();
        Queue<Person> persons = new LinkedList<>();
        persons.add(new Person("Kowalski", "Jan"));
        persons.add(new Person("Nowak", "Piotr"));
        persons.add(new Person("Osiecka", "Agnieszka"));

        for (int i = 0; i < persons.size() - 1; i++) {
            if(i==0) {
                System.out.println(persons.poll());
            } else {
                System.out.println(persons.peek());
            }
        }

        System.out.println("=============================");

        for (Person person : persons) {
            System.out.println(person);
        }

    }

}

