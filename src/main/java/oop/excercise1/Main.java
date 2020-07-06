package oop.excercise1;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    Car _911 = new Car("Porche", "911");
    Car diablo = new Car("Lamborghini", "Diablo");
    Car formentor = new Car("Cupra", "Formentor");

    out.println(_911.getBrand() + " " + _911.getModel());
    out.println(diablo.getBrand() + " " + diablo.getModel());
    out.println(formentor.getBrand() + " " + formentor.getModel());

    out.println("===== Display my garage");

    Car[] garage =new Car[]{_911, diablo, formentor};

    for (Car car : garage) {
      out.println(car.description());
    }
  }
}
