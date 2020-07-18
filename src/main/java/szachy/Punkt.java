package szachy;

import java.util.Objects;

public class Punkt {

    private char kolumna;
    private byte wiersz;

    public Punkt(char kolumna, byte wiersz) {
        this.kolumna = kolumna;
        this.wiersz = wiersz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punkt punkt = (Punkt) o;
        return kolumna == punkt.kolumna &&
                wiersz == punkt.wiersz;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolumna, wiersz);
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "kolumna=" + kolumna +
                ", wiersz=" + wiersz +
                '}';
    }
}
