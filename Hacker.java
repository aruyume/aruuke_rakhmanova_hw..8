package kg.geeks.game.players;

import java.util.Random;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.HACKING, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int random1 = new Random().nextInt(heroes.length);
        int random2 = new Random().nextInt(100);
        boss.setHealth(boss.getHealth() - random2);
        heroes[random1].setHealth(heroes[random1].getHealth() + random2);

    }
}
