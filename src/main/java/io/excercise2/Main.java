package io.excercise2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    File file = new File("villages.txt");

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        out.println(line);
      }
    } catch (IOException e) {
      out.println(e.getMessage());
    }
  }
}
