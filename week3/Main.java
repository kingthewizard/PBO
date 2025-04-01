package week3;

import java.util.Random;
import java.util.Scanner;

class Generator {
    private Random random;

    public Generator() {
        this.random = new Random();
    }

    public int generateAngka() {
        return random.nextInt(100);
    }
}

class Game{
    public void start(){
        Generator generator= new Generator();
        int angka = generator.generateAngka();
        Scanner scanner = new Scanner(System.in);
 
        int tebakan = 0; 
        int kesempatan = 5;
        int score = 100;
        
        while (kesempatan > 0) {
            System.out.print("Masukkan angka : ");
           
            if (scanner.hasNextInt()) {
                tebakan = scanner.nextInt();

                if (tebakan == angka) {
                    System.out.println("Selamat! Tebakan kamu benar.");
                    System.out.println("Skor kamu adalah: " + score);
                    break; 
                } else if (tebakan < angka) {
                    System.out.println("Tebakan terlalu kecil! Coba lagi.");
                } else {
                    System.out.println("Tebakan terlalu besar! Coba lagi.");
                }

                kesempatan--;
                score -= 20; 
                if (kesempatan > 0) {
                    System.out.println();
                } else {
                    System.out.println("Kesempatan kamu sudah habis! Jawaban yang benar adalah : " + angka);
                }
            } else {
                System.out.println("Masukkan angka yang valid!");
                scanner.next(); 
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}