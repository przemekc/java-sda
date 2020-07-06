package collections.excercise1;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class Main {

  public static void main(String[] args) {
    List<Integer> ints = generateInts();

    out.println("List of ints");
    printList(ints);

    out.println("List of odd ints");
    printList(getOds(ints));
  }

  private static List<Integer> generateInts() {
    List<Integer> ints = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      ints.add(RandomUtils.nextInt(0, 10));
    }
    return ints;
  }

  private static List<Integer> getOds(List<Integer> ints) {
    // imperative way
//    List<Integer> ods = new ArrayList<>();
//    for (Integer anInt : ints) {
//      if (anInt != 0 && anInt % 2 == 0) {
//        ods.add(anInt);
//      }
//    }
//    return ods;

    // declarative way using stream API
    return ints.stream()
        .filter(p -> p != 0)
        .filter(p -> p % 2 == 0)
        .collect(toList());
  }

  private static void printList(List<Integer> ints) {
    for (Integer anInt : ints) {
      out.println(anInt);
    }
  }
}
