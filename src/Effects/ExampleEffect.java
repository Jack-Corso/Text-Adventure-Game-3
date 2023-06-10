package Effects;

import Foundation.EffectBase;
import Foundation.EntityBase;
import Foundation.ItemBase;

public class ExampleEffect extends EffectBase {
    public ExampleEffect(ItemBase ItemUsing) {
        //How Many Turns Before Effect Is Removed
        Length = 3;
        //Name Of The Effect
        Name = "Example Effect";
        //Sets the used item inputted by constructor
        SetUsedItem(ItemUsing);
    }
    @Override
    public void OnUsage(EntityBase Target) {
        //This Will Print On Use (Supports things other than print statements)
        System.out.println("This Effect Was Used on " + Target);
    }
    //Damage / Healing Done To The target Every Turn (3 dmg)
    @Override
    public int HealthChange() {
        return -3;
    }
    //Damage Multiplier Applied To The Target (Example 3 dmg (input of 2) + Initial 1x = 9 damage dealt)
    @Override
    public int DamageChange() {
        return 0;
    }
}
