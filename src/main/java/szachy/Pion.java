package szachy;

public class Pion extends Figura {

    public Pion(Kolor kolor, Punkt punkt) {
        super("Pion", kolor, punkt);
    }

    @Override
    public void przesun(Punkt punkt) throws TenSamPunktException {
        if(this.punkt.equals(punkt)) {
            throw new TenSamPunktException("Figura znajduje sie juz na tym polu");
        }
        System.out.println("Przesum pion z " + this.punkt + " na " + punkt);
        this.punkt = punkt;
    }
}
