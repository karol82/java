package pl.edu.wszib.lab1.zad1;

public abstract class KoktajSmakowy extends Koktaj implements Smakowalne {
    protected final RodzajSmaku rodzajSmaku;

    protected KoktajSmakowy(int kcal,
                            RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}
