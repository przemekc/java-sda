package collections.excercise3;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    Map<Long, String> names = new HashMap<>();

    names.put(1L, "Anna");
    names.put(2L, "Hanna");
    names.put(3L, "Katarzyna");
    names.put(4L, "Agata");

    // imiona na litere A
    // peetla for
    out.println("Imiona na A");
    for (Map.Entry<Long, String> entry : names.entrySet()) {
      if (entry.getValue().startsWith("A")) {
        out.println(entry.getValue());
      }
    }

    // stream API
    out.println("Imiona na A");
    out.println("Using STream API");
    names.entrySet().stream()
        .filter(p -> p.getValue().startsWith("A"))
        .map(Map.Entry::getValue)
        .forEach(out::println);

    names.put(5L, "Jan");
    names.put(6L, "Jan");
    names.put(7L, "Jan");
    names.put(8L, "Jan");

    // indeksy dla Jan
    out.println("Indeksy imienia Jan");
    for (Map.Entry<Long, String> entry : names.entrySet()) {
      if (entry.getValue().equals("Jan")) {
        out.println(entry.getKey());
      }
    }

    out.println("Indeksy imienia Jan");
    out.println("Using stream API");
    names.entrySet().stream()
        .filter(p -> p.getValue().equals("Jan"))
        .map(Map.Entry::getKey)
        .forEach(out::println);
  }
}
