package EnemyAI;

import Foundation.EnemyBase;
import Foundation.EntityBase;
import Foundation.ItemBase;

/** The basic structure used, as well as some useful methods for making decisions*/
public abstract class BaseAI {
    static EnemyBase enemy;
    /** @param enemy The Enemy Using The AI
     *
     * */
    public BaseAI(EnemyBase enemy) {
        this.enemy = enemy;
    }
    public BaseAI() {}
    public final void SetEnemy(EnemyBase enemy) {
        this.enemy = enemy;
    }
    /**  The body of the AI, runs to make the decision (PUT CODE HERE FOR AI)*/
    public abstract void Decide();
    /**Searches for and returns the amount of the passed in item
     * @param item item searched for
     * */
    public final static int SearchInvFor(ItemBase item) {
        int Amount = 0;
        for (int i = 0; i < enemy.GetInventory().size(); i++) {
             if (enemy.GetInventory().get(i).equals(item.getClass())) {
                 Amount++;
             }
        }
        return Amount;
    }
    public static final void UseItemInInv(Class Item) {
        for (int i = 0; i < enemy.GetInventory().size(); i++) {
            if (enemy.GetInventory().get(i).getClass() == Item) {
                enemy.GetInventory().get(i).Use(enemy);
                return;
            }
        }
    }
    public static final double GetEnemyHealthPercent() {
        double Percent = (enemy.GetHealth() / enemy.GetMaxHealth()) * 100;
        return Percent;
    }


}
