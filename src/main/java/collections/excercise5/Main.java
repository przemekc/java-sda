package collections.excercise5;

import java.util.*;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class Main {

  public static void main(String[] args) {
    List<String> strings = List.of("ala", "kot", "dom", "kot", "ala", "komin", "ogródek");

    out.println("base list: " + strings);
    out.println("removed duplicates: " + removeDuplicates(strings));
    out.println("removed duplicates Stream API: " + removeDuplicatesStream(strings));
  }


  public static List<String> removeDuplicates(List<String> strings) {
    Set<String> result = new TreeSet<>();
    for (String string : strings) {
      result.add(string);
    }
    return new ArrayList<>(result);
  }

  private static List<String> removeDuplicatesStream(List<String> strings) {
    return strings.stream()
        .distinct()
        .sorted()
        .collect(toList());
  }
}
