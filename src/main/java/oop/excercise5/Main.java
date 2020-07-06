package oop.excercise5;

import static java.lang.System.*;

public class Main {

  public static void main(String[] args) {
    Computer computer = new ComputerFactory().createComputer("Intel Core i7", "Nvidia GeForce 200mx", "Pro power 2000W");

    out.println(computer.description());
  }
}
