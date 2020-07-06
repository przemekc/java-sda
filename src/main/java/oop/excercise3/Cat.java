package oop.excercise3;

import static java.lang.System.*;

public class Cat extends Animal {

  public Cat(String name, int age, String race) {
    super(name, age, race);
  }

  @Override
  public void voice() {
    out.println("Miua");
  }

  @Override
  public String toString() {
    return getName() + ", " + getRace() + "," + getAge();
  }
}
