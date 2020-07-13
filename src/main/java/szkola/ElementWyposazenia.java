package szkola;

import java.util.Objects;

public abstract class ElementWyposazenia implements Comparable<ElementWyposazenia> {

  private final String nazwa;
  private final String numerEwidencyjny;

  public ElementWyposazenia(String nazwa, String numerSeryjny) {
    this.nazwa = nazwa;
    this.numerEwidencyjny = numerSeryjny;
  }

  public String getNazwa() {
    return nazwa;
  }

  public String getNumerEwidencyjny() {
    return numerEwidencyjny;
  }

  @Override
  public String toString() {
    return "ElementWyposazenia{" +
        "nazwa='" + nazwa + '\'' +
        ", numerSeryjny='" + numerEwidencyjny + '\'' +
        '}';
  }

  @Override
  public int compareTo(ElementWyposazenia elementWyposazenia) {
    return nazwa.compareTo(elementWyposazenia.nazwa);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ElementWyposazenia that = (ElementWyposazenia) o;
    return Objects.equals(numerEwidencyjny, that.numerEwidencyjny);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numerEwidencyjny);
  }
}
