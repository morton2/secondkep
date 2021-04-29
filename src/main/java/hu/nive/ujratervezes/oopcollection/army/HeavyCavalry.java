package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private int health = 150;
    private static int damage = 20;
    private boolean armor = true;
    private int attackNum = 1;
    private int hitPoints;


    @Override
    public int doDamage() {
        int resultDamage;
        if (attackNum == 1) {
            resultDamage = damage*3;
            attackNum++;
        } else {
            attackNum++;
            resultDamage = damage;
        }
        hitPoints = hitPoints + resultDamage;
        return resultDamage;
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