package character.player;

import character.enemy.Enemy;

public class Player {
    protected int hp;
    protected int attack;
    protected int defense;
    protected int ramuan = 3;
    protected int cooldown = 0;
    public Player(int hp, int attack, int defense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public int attack() {
        return attack;
    }

    public int attack(float multiplier) {
        return Math.round(attack * multiplier);
    }

    public int defend(int damage) {
        return damage - defense;
    }

    public void useUltimate(Enemy enemy) {
        if (cooldown == 0) {
            int damage = attack(2);
            int finalDamage = enemy.defend(damage);
            enemy.doDamage(finalDamage);
            System.out.println("Ultimate digunakan! Damage ke enemy: " + finalDamage);

            cooldown = 3;
        } else {
            System.out.println("Ultimate skill sedang cooldown! (" + cooldown + " turn tersisa)");
        }
    }

    public void reduceCooldown() {
        if (cooldown > 0) {
            cooldown--;
        }
    }

    public void drinkPotion() {
        if (ramuan > 0) {
            hp += 20;
            ramuan--;
            System.out.println("Player meminum ramuan! +20 HP");
        } else {
            System.out.println("Ramuan habis!");
        }
    }

    public int getHp() {
        return hp;
    }

    public void doDamage(int damage) {
        hp -= damage;
    }

    public int getRamuan() {
        return ramuan;
    }

    public int getCooldown() {
        return cooldown;
    }
}

