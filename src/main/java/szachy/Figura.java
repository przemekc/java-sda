package szachy;

abstract class Figura implements Porusza {

    private final String nazwa;
    private final Kolor kolor;
    protected Punkt punkt;

    protected Figura(String nazwa, Kolor kolor, Punkt punktNaSzachownicy) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.punkt = punktNaSzachownicy;
    }

    @Override
    public void zbij(Punkt punkt) throws TenSamPunktException {
        przesun(punkt);
        System.out.println("Zbijam figure na " + punkt);
    }

    @Override
    public String toString() {
        return "nazwa='" + nazwa + '\'' +
                ", kolor=" + kolor +
                ", punktNaSzachownicy=" + punkt;
    }

    public boolean czyJuzNaTymPunkcie(Punkt punkDoPrzesuniecia) {
        return this.punkt.equals(punkDoPrzesuniecia);
    }
}
