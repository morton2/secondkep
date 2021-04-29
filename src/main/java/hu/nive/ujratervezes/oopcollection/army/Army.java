package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> armyWhole = new ArrayList<>();

    public int getArmySize() {
        return armyWhole.size();
    }


    public void addUnit(MilitaryUnit unit) {
        armyWhole.add(unit);
    }

    public int getArmyDamage() {
        int damageAll = 0;
        for (int in = 0; in < getArmySize(); in++) {
           damageAll = damageAll +  armyWhole.get(in).doDamage();
            }
        return damageAll;
        }

    public void damageAll(int i) {
        for (int in = 0; in < getArmySize(); in++) {
            armyWhole.get(in).sufferDamage(i);
            if (armyWhole.get(in).getHitPoints() < 25) {
                armyWhole.remove(armyWhole.get(in));
            }
        }

    }
}