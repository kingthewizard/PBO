package bangundatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        int sisi;
        int panjang;
        int lebar;
        double alas;
        double tinggi;
        double radius;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Program Penghitung Luas Bangun Datar");
            System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan sisi: ");
                    sisi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar(sisi);
                    persegi.hitungLuas();
                    System.out.println("Luas: " + persegi.getLuas());
                    break;
                case 2:
                    System.out.print("Masukan panjang: ");
                    panjang = scanner.nextInt();
                    System.out.print("Masukan lebar: ");
                    lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                    persegiPanjang.hitungLuas();
                    System.out.println("Luas: " + persegiPanjang.getLuas());
                    break;
                case 3:
                    System.out.print("Masukan alas: ");
                    alas = scanner.nextDouble();
                    System.out.print("Masukan tinggi: ");
                    tinggi = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar(alas, tinggi);
                    segitiga.hitungLuas2();
                    System.out.println("Luas: " + segitiga.getLuas2());
                    break;
                case 4:
                    System.out.print("Masukan radius: ");
                    radius = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(radius);
                    lingkaran.hitungLuas2();
                    System.out.println("Luas " + lingkaran.getLuas2());
                    break;
                case 5:
                    ulang = false;
                    break;
            }
        }
    }
}