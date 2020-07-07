package collections.excercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    Map<Student, List<Integer>> gradebook = new HashMap<>();

    Student anna = new Student("Anna", "Kendrick", "class A");
    Student john = new Student("John", "Wick", "class A");
    Student steven = new Student("Steven", "Seagal", "class A");
    Student paul = new Student("Paul", "Newman", "class A");

    fillGrades(gradebook, anna, john, steven, paul);

    displayGradeBook(gradebook);
  }

  private static void displayGradeBook(Map<Student, List<Integer>> gradebook) {
    // mozna tutaj uzyc petli for, przygotowac wiersz ocen rowniez w petli for ale ponizszy kod jest bardziej czytleny
    gradebook.forEach((student, grades) -> {
      out.println("Student: " + student.getName());
      out.println("Grades: " + prepareCommaSeparatedGrades(grades));
    });
  }

  private static String prepareCommaSeparatedGrades(List<Integer> grades) {
    return grades.stream()
        .map(String::valueOf)
        .collect(Collectors.joining(", "));
  }

  private static void fillGrades(Map<Student, List<Integer>> gradebook, Student anna, Student john, Student steven, Student paul) {
    addGrade(gradebook, anna, 5);
    addGrade(gradebook, john, 5);
    addGrade(gradebook, steven, 4);
    addGrade(gradebook, paul, 3);

    addGrade(gradebook, anna, 4);
    addGrade(gradebook, john, 2);
    addGrade(gradebook, steven, 2);
    addGrade(gradebook, paul, 3);

    addGrade(gradebook, anna, 3);
    addGrade(gradebook, john, 5);
    addGrade(gradebook, steven, 4);
    addGrade(gradebook, paul, 2);

    addGrade(gradebook, anna, 5);
    addGrade(gradebook, john, 5);
    addGrade(gradebook, steven, 4);
    addGrade(gradebook, paul, 3);
  }

  private static void addGrade(Map<Student, List<Integer>> gradebook, Student student, int grade) {
    if (!gradebook.containsKey(student)) {
      gradebook.put(student, new ArrayList<>());
    }

    gradebook.get(student).add(grade);
  }
}
