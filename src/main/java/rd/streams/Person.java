package rd.streams;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String pesel;
    private String surname;
    private String name;

    public Person(String pesel, String name, String surname) {
        this.pesel = pesel;
        this.surname = surname;
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pesel, person.pesel) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel, surname, name);
    }

    @Override
    public int compareTo(Person o) {
        return surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel='" + pesel + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
