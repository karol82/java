package pl.edu.wszib.lab1.zad1;

public enum ZrodloSmaku {
    OWOCOWY("Owocowy"),
    WARZYWNY("Warzywny"),
    INNY("Inny"),
    ;

    private String nazwa;

    ZrodloSmaku(final String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "ZrodloSmaku{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
