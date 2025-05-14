package bangundatar;

public class BangunDatar {
    private int sisi;
    private int panjang;
    private int lebar;
    private double alas;
    private double tinggi;
    private double radius;
    private String nama;
    private int luas;
    private double luas2;
    private final double PHI = 3.14;

    public BangunDatar(int sisi) {
        this.sisi = sisi;
        nama = "Persegi";
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        nama = "Persegi Panjang";
    }

    public BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        nama = "Segitiga";
    }

    public BangunDatar(double radius) {
        this.radius = radius;
        nama = "Lingkaran";
    }

    public int hitungLuas() {
        if (nama.equals("Persegi")) {
            luas = sisi * sisi;
            return luas;
        }
        if (nama.equals("Persegi Panjang")) {
            luas = panjang * lebar;
            return luas;
        }
        return 0;
    }

    public double hitungLuas2() {
        if (nama.equals("Segitiga")) {
            luas2 = alas * tinggi / 2;
            return luas2;
        }
        if (nama.equals("Lingkaran")) {
            luas2 = PHI * radius * radius;
            return luas;
        }
        return 0;
    }

    public int getLuas() {
        return luas;
    }

    public double getLuas2() {
        return luas2;
    }
}
