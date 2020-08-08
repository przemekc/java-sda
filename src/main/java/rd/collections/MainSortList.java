package rd.collections;

import java.util.*;

public class MainSortList {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Osiecka", "Agnieszka"));
        persons.add(new Person("Kowalski", "Jan"));
        persons.add(new Person("Nowak", "Piotr"));
        persons.add(new Person("Chmielewski", "Zbigniew"));
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("=========");

        Collections.sort(persons);
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("===== posortowane po name");

        // java before 1.8
//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(persons, (o1, o2) -> o1.getName().compareTo(o2.getName()));

//        Collections.sort(persons, Comparator.comparing(Person::getName));

        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

