package szachy;

public enum Kolor {
    BIALE("białe"),
    CZARNE("czarne");

    private final String nazwa;

    Kolor(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
