package kg.geeks.game.players;

public class Magic extends Hero {
    private int increaseDamage;
    public Magic(int health, int damage, String name, int increaseDamage) {
        super(health, damage, SuperAbility.BOOST, name);
        this.increaseDamage = increaseDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes)
            hero.setDamage(hero.getDamage(Integer.MAX_VALUE) + increaseDamage);
            System.out.println("Magic " + this.getName()
                    + " increased the damage of each hero");
        }

}
