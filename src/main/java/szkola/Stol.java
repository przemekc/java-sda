package szkola;

public class Stol extends ElementWyposazenia {

  public Stol(String nazwa, String numerSeryjny) {
    super(nazwa, numerSeryjny);
  }

  @Override
  public String toString() {
    return "Stol {" +
        "nazwa='" + getNazwa() + '\'' +
        ", numerSeryjny='" + getNumerEwidencyjny() + '\'' +
        '}';
  }
}
