package oop.excercise3;

import static java.lang.System.*;

public class Main {

  public static void main(String[] args) {
    Animal[] pets = {
        new Cat("Filemon", 5, "Dachowiec"),
        new Dog("Reksio", 3, "Wielorasowy", "Biały"),
        new Cat("Bonifacy", 10, "Dachowiec"),
        new Dog("Plut", 3, "Bloodhound", " Żółty pies z czarnymi uszami "),
    };

    for (Animal pet : pets) {
      out.println(pet);
      pet.voice();
    }
  }
}
