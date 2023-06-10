package Foundation;

import java.util.List;
/** Base for all Weapons*/
public abstract class WeaponBase extends ItemBase{
    /** Max Targets The Weapon Can Have*/
    int TargetCount = 1;
    /** Damage Done*/
    public abstract int Damage();

    /** Applies damage & effects of the weapon + Removes 1 durability */
    @Override
    public  void Use(EntityBase User) {
        for(int i = 0; i < Targets.size(); i++) {
            Targets.get(i).ChangeHealth(-Damage());
            Targets.get(i).AddEffectList(this.GetEffects());
            Durability--;

        }
    }


}
