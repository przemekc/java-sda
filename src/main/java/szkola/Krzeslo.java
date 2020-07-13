package szkola;

public class Krzeslo extends ElementWyposazenia {

  public Krzeslo(String nazwa, String numerSeryjny) {
    super(nazwa, numerSeryjny);
  }

  @Override
  public String toString() {
    return "Krzeslo {" +
        "nazwa='" + getNazwa() + '\'' +
        ", numerSeryjny='" + getNumerEwidencyjny() + '\'' +
        '}';
  }


}
