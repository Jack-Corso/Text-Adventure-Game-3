package EnemyAI;

import Foundation.EnemyBase;
import Items.ExampleConsumable;

public class ExampleAI extends BaseAI{
    /**
     * @param enemy The Enemy Using The AI
     */
    public ExampleAI(EnemyBase enemy) {

        super(enemy);
    }
    public ExampleAI(){}

    @Override
    public void Decide() {
        if (GetEnemyHealthPercent() <  20 && SearchInvFor(new ExampleConsumable()) > 0) {
            UseItemInInv(new ExampleConsumable().getClass());
        }

    }
}
