package szachy;

public interface Porusza {

    void przesun(Punkt punkt) throws TenSamPunktException;

    void zbij(Punkt punkt) throws TenSamPunktException;
}
