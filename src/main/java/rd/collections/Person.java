package rd.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String surname;
    private String name;

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // uzywana przy hashsetach i hashmapach
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) &&
                Objects.equals(name, person.name);
    }

    // uzywana przy hashsetach i hashmapach
    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }

    @Override
    public int compareTo(Person o) {
        return surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
