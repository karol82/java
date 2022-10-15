package pl.edu.wszib.lab1.zad1;

public class KoktajlTruskawkowy extends Koktaj implements Smakowalne {
    private final RodzajTruskawki rodzajTruskawki;
    private final RodzajSmaku rodzajSmaku;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        this.rodzajSmaku = RodzajSmaku.TRUSKAWKOWY;
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

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}
