package character.enemy;

import character.player.Player;
import java.util.Random;

public class Enemy extends Player{
    protected Random random = new Random();

    public Enemy(int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    @Override
    public int attack(){
        return attack + random.nextInt(1,7);
    }

    @Override
    public int defend(int damage){
        return damage - random.nextInt(1, defense);
    }
}
