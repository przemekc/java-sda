package oop.excercise3;

import static java.lang.System.out;

public class Dog extends Animal {

  private String color;

  public Dog(String name, int age, String race, String color) {
    super(name, age, race);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void voice() {
    out.println("Hau");
  }

  @Override
  public String toString() {
    return getName() + ", " + getRace() + "," + getAge() + "," + color;
  }
}
