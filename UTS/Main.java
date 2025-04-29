import character.player.Player;
import character.enemy.Enemy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        final String BLUE = "\u001B[34m";
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";

        while (playAgain) {
            Player player = new Player(100, 15, 5);
            Enemy enemy = new Enemy(150, 15, 3);

            System.out.println("Selamat datang di Text RPG!");

            while (player.getHp() > 0 && enemy.getHp() > 0) {
                System.out.println();
                System.out.println(BLUE + "HP Character: " + player.getHp() + RED + "\nHP Enemy: " + enemy.getHp() + RESET);
                System.out.println();
                System.out.println(GREEN + "Pilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + player.getRamuan() + ")");
                System.out.println("4. Ultimate (Cooldown: " + (player.getCooldown() == 0 ? "Siap digunakan" : player.getCooldown() + " turn tersisa") + ")");
                System.out.println("5. Keluar");
                System.out.print("> ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        int damage = player.attack();
                        int finalDamage = enemy.defend(damage);
                        enemy.doDamage(finalDamage);
                        System.out.println("Character menyerang Enemy! Damage: " + finalDamage);
                        break;

                    case 2:
                        int enemyAttack = enemy.attack();
                        int reduced = player.defend(enemyAttack);
                        player.doDamage(reduced);
                        System.out.println("Enemy menyerang! Damage dikurangi: " + reduced);
                        break;

                    case 3:
                        player.drinkPotion();
                        break;

                    case 4:
                        player.useUltimate(enemy);
                        break;

                    case 5:
                        System.out.println("Keluar dari permainan...");
                        return;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }

                player.reduceCooldown();


                if (enemy.getHp() > 0 && choice >= 1 && choice <=4) {
                    int enemyDamage = enemy.attack();
                    int damageReceived = player.defend(enemyDamage);
                    player.doDamage(damageReceived);
                    System.out.println("Enemy menyerang balik! Damage: " + damageReceived);
                }
            }

            if (player.getHp() <= 0) {
                System.out.print("Game Over, mulai lagi? (y/n): ");
                String again = input.next();
                playAgain = again.equalsIgnoreCase("y");
            } else {
                System.out.println("Selamat! Kamu menang melawan musuh!");
                playAgain = false;
            }
        }
        input.close();
    }
}


