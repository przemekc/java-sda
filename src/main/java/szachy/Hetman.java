package szachy;

public class Hetman extends Figura {

    public Hetman(Kolor kolor, Punkt punkt) {
        super("Hetman", kolor, punkt);
    }

    @Override
    public void przesun(Punkt punkt) {
        System.out.println("Przesum hetmana z " + this.punkt + " na " + punkt);
        this.punkt = punkt;
    }

    @Override
    public void zbij(Punkt punkt) throws TenSamPunktException {
        super.zbij(punkt);
        System.out.println("Jestem hetmanem");
    }
}
