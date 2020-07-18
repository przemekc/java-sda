package threads.excercise1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<Client> cliens = new ArrayList<>();
    String anwser = null;
    do {
      System.out.println("Podaj imie");
      String firstname = scanner.next();

      System.out.println("Podaj nazwisko");
      String lastname = scanner.next();

      System.out.println("Podaj plec");
      String gender = scanner.next();

      cliens.add(new Client(firstname, lastname, gender));

      System.out.println("Utworzyc nastepnego? t/n - (tak, przerwij)");
      anwser = scanner.next();

    } while (anwser.equals("t"));

    System.out.println("Lista klientow");
    cliens.forEach(System.out::println);
  }
}

@AllArgsConstructor
@ToString
class Client {
  private String firstName;
  private String lastName;
  private String gender;
}
