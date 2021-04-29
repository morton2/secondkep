package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {
    private int health = 50;
    private int damage = 20;
    private boolean armor = false;

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if (armor == true) {
            health = (int) (health - (damage*0.5));
        } else {
            health = health - damage;
        }
    }

    @Override
    public int getHitPoints() {
        return this.health;
    }
}