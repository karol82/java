package pl.edu.wszib.lab1.zad1;

public class KoktajlTroskawkowy extends Koktaj implements Smakowalne {
    @Override
    public void pij() {
        System.out.println("Pije koktajl");
    }

    @Override
    public void smak() {
        System.out.println("Troskawkowy");
    }
}
