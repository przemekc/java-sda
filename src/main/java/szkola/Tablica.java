package szkola;

public class Tablica extends ElementWyposazenia {

  public Tablica(String nazwa, String numerSeryjny) {
    super(nazwa, numerSeryjny);
  }

  @Override
  public String toString() {
    return "Tablica {" +
        "nazwa='" + getNazwa() + '\'' +
        ", numerSeryjny='" + getNumerEwidencyjny() + '\'' +
        '}';
  }
}
