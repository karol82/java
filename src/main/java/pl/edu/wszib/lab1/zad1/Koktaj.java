package pl.edu.wszib.lab1.zad1;

public abstract class Koktaj implements Jadalne, Pijalne {

    protected final int kcal;

    protected Koktaj(final int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }
}
