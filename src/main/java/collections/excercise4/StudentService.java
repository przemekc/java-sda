package collections.excercise4;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.*;

public class StudentService {

  public double calculateAverage(List<Integer> grades) {

    double sum = 0;
    for (Integer grade : grades) {
      sum += grade;
    }

    return sum / grades.size();

    // stream api
//    return grades.stream()
//        .mapToDouble(a -> a)
//        .average()
//        .orElse(0.0);
  }

  public double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades) {
//    double avg = 0.0;
//    for (Map.Entry<Student, List<Integer>> studentListEntry : studentToGrades.entrySet()) {
//      avg = calculateAverage(studentListEntry.getValue());
//    }
//    return avg / studentToGrades.entrySet().size();

    // stream api
    return studentToGrades.values().stream()
        .flatMapToDouble(integers -> integers.stream().mapToDouble(a -> a))
        .average()
        .orElse(0.0);
  }

  public Student findBestStudent(Map<Student, List<Integer>> studentToGrades) {
    Map<Student, Double> stats = new HashMap<>();
    for (Map.Entry<Student, List<Integer>> studentListEntry : studentToGrades.entrySet()) {
      double avg = calculateAverage(studentListEntry.getValue());
      stats.put(studentListEntry.getKey(), avg);
    }

    Iterator<Student> iterator = studentToGrades.keySet().iterator();
    Student bestStudent = iterator.hasNext() ? iterator.next() : null;
    for (Map.Entry<Student, Double> studentDoubleEntry : stats.entrySet()) {
      if (studentDoubleEntry.getValue() > stats.get(bestStudent)) {
        bestStudent = studentDoubleEntry.getKey();
      }
    }

    return bestStudent;
  }

  public Student findBestStudentStream(Map<Student, List<Integer>> studentToGrades) {
    return studentToGrades.entrySet().stream()
        .map(e -> new ImmutablePair<>(e.getKey(), calculateAverage(e.getValue())))
        .max(Comparator.comparing(p -> p.right))
        .map(p -> p.left)
        .orElseThrow(() -> new IllegalStateException("Student not found"));
  }
}