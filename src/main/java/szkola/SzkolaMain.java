package szkola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class SzkolaMain {

  public static void main(String[] args) {

    Sala sala1 = przygotujSale1();

    Sala sala2 = przygotujSale2();

    out.println("================");
    out.println("Prezentacja sal");

    for (Sala sala : Arrays.asList(sala1, sala2)) {
      out.println("Sala " + sala.getNumer() + " posiada miejsc " + sala.getLiczbaMiejsc());

      out.println("Wyposazenie");

      // pobranie wyposazenia i posortowanie listy
      List<ElementWyposazenia> wyposazenie = new ArrayList<>(sala.getWyposazenie());
      Collections.sort(wyposazenie);

      for (ElementWyposazenia elementWyposazenia : wyposazenie) {
        out.println(elementWyposazenia);
      }
      out.println();
    }
  }

  private static Sala przygotujSale1() {
    Sala sala = new Sala("1", 4);
    sala.add(
        new Krzeslo("krzesło 1", "K101"),
        new Krzeslo("krzesło 2", "K101"),
        new Krzeslo("krzesło 3", "K103")
    );

    sala.add(
        new Stol("stol 1", "S101"),
        new Stol("stol 2", "S102"),
        new Stol("stol 3", "S103"),
        new Stol("stol 4", "S104")
    );

    sala.ustawTablice(new Tablica("tablica 1", "T001"));

    return sala;
  }

  private static Sala przygotujSale2() {
    Sala sala1 = new Sala("2", 4);
    sala1.add(
        new Krzeslo("krzesło 1", "K111"),
        new Krzeslo("krzesło 2", "K112"),
        new Krzeslo("krzesło 3", "K113"),
        new Krzeslo("krzesło 3", "K114")
    );

    sala1.add(
        new Stol("stol 1", "S111"),
        new Stol("stol 2", "S112"),
        new Stol("stol 3", "S113"),
        new Stol("stol 4", "S114")
    );

    return sala1;
  }
}
