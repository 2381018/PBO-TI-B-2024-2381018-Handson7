package polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(5);
        System.out.println("Luas persegi: " + bangunDatar.luas());
        System.out.println("Keliling persegi: " + bangunDatar.keliling());

        bangunDatar = new Lingkaran(7);
        System.out.println("Luas lingkaran: " + bangunDatar.luas());
        System.out.println("Keliling lingkaran: " + bangunDatar.luas());

        bangunDatar = new SegitigaSamaSisi(5, 8);
        System.out.println("Luas Segitiga Sama Sisi: " + bangunDatar.luas());
        System.out.println("Keliling Segitiga Sama Sisi: " + bangunDatar.luas());
    }
}
