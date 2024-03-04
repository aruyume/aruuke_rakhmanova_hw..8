package kg.geeks.game.players;

import java.util.Arrays;

public class Witcher extends Hero {
    private boolean isWitcherAlive = true;

    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.REVIVING_THE_HERO, name);
    }

    @Override
    public void attack(Boss boss) {
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (isWitcherAlive) {
            for (Hero hero : heroes) {
                if (hero.getHealth() <= 0) {
                    hero.setHealth(this.getHealth());
                    this.setHealth(0);
                    isWitcherAlive = false;
                    System.out.println("Witcher " + this.getName() + " revived " + hero.getName() + " but died himself");
                    break;
                }
            }
        }
    }
}