package week5;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        boolean playing = true;
        TextGame game = new TextGame();
        Scanner scanner = new Scanner(System.in);
        String kata;

        while (playing) { 
            System.out.print("Masukkan Kata: ");
            kata = scanner.nextLine();
            game.displayResult(kata);
            System.out.println();

            System.out.print("Main lagi? [y/n]: ");
            String jawaban = scanner.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                playing = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }
    }
}
