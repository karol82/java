package pl.edu.wszib.lab1.zad1;

public class Application {

    public static void main(String[] args) {
        KoktajlTroskawkowy koktajlTroskawkowy = new KoktajlTroskawkowy(
                300,
                RodzajTroskawki.ANANASOWA
        );
        koktajlTroskawkowy.jedz();
        koktajlTroskawkowy.pij();

        int myVar = 5;
        int myNewVar = test(myVar);
        System.out.println(myNewVar);

        RodzajTroskawki rodzaj = RodzajTroskawki.KENT;
        switch (rodzaj) {
            case ANANASOWA:
                break;
            case KENT:
                break;
        }
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
