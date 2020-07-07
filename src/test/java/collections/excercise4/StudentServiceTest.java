package collections.excercise4;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentServiceTest {

  @Test
  public void shouldCalculateAvrGrade() {
    // given
    StudentService service = new StudentService();
    List<Integer> grades = List.of(5, 4, 3, 5, 3);

    // when
    double avg = service.calculateAverage(grades);

    // then
    assertThat(avg).isEqualTo(4.0);
  }

  @Test
  public void shouldCalculateStudentsAvrGrade() {
    // given
    StudentService service = new StudentService();

    Student anna = new Student("Anna", "Kendrick", "class A");
    List<Integer> annaGrades = List.of(5, 4, 3, 5, 3);
    Student john = new Student("John", "Wick", "class A");
    List<Integer> johnGrades = List.of(4, 3, 3, 1, 1);

    Map<Student, List<Integer>> grades = Map.of(anna, annaGrades, john, johnGrades);

    // when
    double avg = service.calculateTotalAverage(grades);

    // then
    assertThat(avg).isEqualTo(3.2);
  }

  @Test
  public void shouldFindBestStudent() {
    // given
    StudentService service = new StudentService();

    Student paul = new Student("Paul", "Newman", "class A");
    List<Integer> paulGrades = List.of(4, 3, 3, 1, 1);
    Student anna = new Student("Anna", "Kendrick", "class A");
    List<Integer> annaGrades = List.of(5, 4, 3, 5, 3);
    Student john = new Student("John", "Wick", "class A");
    List<Integer> johnGrades = List.of(4, 3, 3, 1, 1);


    Map<Student, List<Integer>> grades = Map.of(paul, paulGrades, anna, annaGrades, john, johnGrades);

    // when
    Student bestStudent = service.findBestStudent(grades);

    // then
    assertThat(bestStudent).isEqualTo(anna);
  }

  @Test
  public void shouldFindBestStudentStreamAPI() {
    // given
    StudentService service = new StudentService();

    Student paul = new Student("Paul", "Newman", "class A");
    List<Integer> paulGrades = List.of(4, 3, 3, 1, 1);
    Student anna = new Student("Anna", "Kendrick", "class A");
    List<Integer> annaGrades = List.of(5, 4, 3, 5, 3);
    Student john = new Student("John", "Wick", "class A");
    List<Integer> johnGrades = List.of(4, 3, 3, 1, 1);


    Map<Student, List<Integer>> grades = Map.of(paul, paulGrades, anna, annaGrades, john, johnGrades);

    // when
    Student bestStudent = service.findBestStudentStream(grades);

    // then
    assertThat(bestStudent).isEqualTo(anna);
  }
}
