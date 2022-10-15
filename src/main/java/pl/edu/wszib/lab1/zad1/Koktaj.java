package pl.edu.wszib.lab1.zad1;

public abstract class Koktaj implements Jadalne, Pijalne {
    @Override
    public void jedz() {
        pij();
    }
}
