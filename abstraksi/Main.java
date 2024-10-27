package abstraksi;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("merah");
        Perahu perahu = new Perahu("biru");

        mobil.info();
        mobil.bergerak();

        perahu.info();
        perahu.bergerak();

    }
}
