package hashcode;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Jan Kowalski", 24);
        Person person2 = new Person("Jan Kowalski", 25);
        Person person3 = new Person("Piotr Nowak", 24);

        System.out.println("Person equals " + person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());
        System.out.println("Name equals" + person1.getName().equals(person2.getName()));
        System.out.println("Age equals " + person1.getAge().equals(person2.getAge()));


        System.out.println("=============");
        System.out.println("person2 person3");
        System.out.println("Person equals " + person2.equals(person3));
        System.out.println("Name equals" + person2.getName().equals(person3.getName()));
        System.out.println("Age equals " + person2.getAge().equals(person3.getAge()));
        System.out.println(person2.hashCode() == person3.hashCode());
    }
}

class Person {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
