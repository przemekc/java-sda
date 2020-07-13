package szkola;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sala {

  private final String numer;
  private final int liczbaMiejsc;

  private final Set<Krzeslo> krzesla = new HashSet<>();
  private final Set<Stol> stoly;
  private Tablica tablica;

  public Sala(String numer, int liczbaMiejsc) {
    this.numer = numer;
    this.liczbaMiejsc = liczbaMiejsc;
    this.stoly = new HashSet<>();
  }

  public int getLiczbaMiejsc() {
    return liczbaMiejsc;
  }

  public String getNumer() {
    return numer;
  }

  public Set<ElementWyposazenia> getWyposazenie() {
    Set<ElementWyposazenia> elementWyposazenia = new HashSet<>();
    elementWyposazenia.addAll(krzesla);
    elementWyposazenia.addAll(stoly);

    if (tablica != null) {
      elementWyposazenia.add(tablica);
    }

    return elementWyposazenia;
  }

  public void add(Krzeslo... krzesla) {
    for (Krzeslo krzeslo : krzesla) {
      this.krzesla.add(krzeslo);
    }
  }

  public void add(Stol... stoly) {
    // zamiast petli mozna uzyc metody addAll
    this.stoly.addAll(Arrays.asList(stoly));
  }

  public  void ustawTablice(Tablica tablica) {
    this.tablica = tablica;
  }

  @Override
  public String toString() {
    return "Sale{" +
        "numer='" + numer + '\'' +
        ", liczbaMiejsc=" + liczbaMiejsc +
        ", krzesla=" + krzesla +
        ", stoly=" + stoly +
        ", tablica=" + tablica +
        '}';
  }


}
