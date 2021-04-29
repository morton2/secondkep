package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private int health = 100;
    private int damage = 10;
    private boolean armor;
    private int sufferNum = 1;
    private int shield = 1;


    public Swordsman(boolean b) {
        this.armor = b;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if (sufferNum == 1 && shield == 1) {
            sufferNum++;
            shield = 0;
        } else if (armor) {
            health = (int) (health - damage*0.5);
        } else {
            health = health - damage;
            sufferNum++;
        }
    }

    @Override
    public int getHitPoints() {
        return this.health;
    }
}