package pl.edu.wszib.lab1.zad1;

public class KoktajlTruskawkowy extends KoktajSmakowy {
    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl o smaku " +
                smak() + ", która cechuje się " + rodzajTruskawki.cecha()
        );
        String message = String.format(
                "Pije koktajl %s, %s",
                rodzajSmaku,
                rodzajTruskawki
        );
        System.out.println(message);
    }
}
