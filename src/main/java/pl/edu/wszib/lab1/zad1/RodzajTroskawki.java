package pl.edu.wszib.lab1.zad1;

/**
 * Rodzaje troskawek:
 * Ananasowa
 * Honeoye
 * Polka
 * Kent
 * Christine
 */
public enum RodzajTroskawki {
    ANANASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie");

    private final String cecha;

    RodzajTroskawki(final String cecha) {
        this.cecha = cecha;
    }

    public String cecha() {
        return cecha;
    }
}
