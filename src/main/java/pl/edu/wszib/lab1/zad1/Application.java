package pl.edu.wszib.lab1.zad1;

public class Application {

    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();
        /**
         * Zadanie:
         * Utwórz enum RodzajSmaku zawierający wartości:
         * Truskawkowy
         * Bananowy
         * Szpinakowy
         * Ciasteczkowy
         * Jabłkowy
         * enum powinien przechowywać dodatkowo informację o poziomie słodkości
         * (int (albo enum jak ktoś bardzo chce),
         * poziomy do ustalenia według indywidualnych preferencji)
         *
         * A następnie zmodyfikować interfejs Smakowy
         * tak aby zwracał rodzaj smaku i dostosować resztę programu
         *
         */
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
