package pl.edu.wszib.lab1.zad1;

public class KoktajlTroskawkowy extends Koktaj implements Smakowalne {
    private final RodzajTroskawki rodzajTroskawki;

    public KoktajlTroskawkowy(
            final int kcal,
            final RodzajTroskawki rodzajTroskawki) {
        super(kcal);
        this.rodzajTroskawki = rodzajTroskawki;
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl o smaku " +
                smak() + ", która cechuje się " + rodzajTroskawki.cecha()
        );
        String message = String.format(
                "Pije koktajl o smaku %s, która cechuje się %s",
                smak(),
                rodzajTroskawki.cecha()
        );
        System.out.println(message);
    }

    @Override
    public String smak() {
        return "Troskawkowy";
    }
}
