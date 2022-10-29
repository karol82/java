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

//    public ZrodloSmaku zrodloSmaku() {
//        switch (rodzajSmaku) {
//            case TRUSKAWKOWY:
//            case BANANOWY:
//            case JABLKOWY:
//                return ZrodloSmaku.OWOCOWY;
//            case SZPINAKOWY:
//                return ZrodloSmaku.WARZYWNY;
//            case CIASTECZKOWY:
//                return ZrodloSmaku.INNY;
//            default:
//                throw new IllegalStateException("Unexpected value: " + rodzajSmaku);
//        }
//    }

    public ZrodloSmaku zrodloSmaku() {
        return switch (rodzajSmaku) {
            case TRUSKAWKOWY, JABLKOWY, BANANOWY -> ZrodloSmaku.OWOCOWY;
            case SZPINAKOWY -> ZrodloSmaku.WARZYWNY;
            case CIASTECZKOWY -> ZrodloSmaku.INNY;
        };
    }
}
