package io.excercise1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    List<String> capitals = List.of("Warsaw", "Berlin", "Amsterdam", "Lisbona",
        "Paris", "Rome", "London");

    File file = new File("capitals.txt");

    try(PrintWriter printWriter = new PrintWriter(file)) {
      for (String capital : capitals) {
        printWriter.println(capital);
      }
    } catch (IOException e) {
      out.println(e.getMessage());
    }
  }
}
