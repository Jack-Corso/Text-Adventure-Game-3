package Foundation;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public abstract class ConsumableBase extends ItemBase{
    /**Applies to all other targeted enemies */
    public abstract int TargetHealthEffect();

    /**Applies to User of the consumable*/
    public abstract int HealthEffect();
    /**Applies to all other targeted enemies */
    public List<EffectBase> TargetEffects;
    /**Applies to all other targeted enemies */
    public final List<EffectBase> GetTargetEffects() {
        return TargetEffects;
    }

    @Override
    public UsageType getUsageType() {
        return UsageType.Usable;
    }
    @Override
    public void Use(EntityBase User) {
        User.AddEffectList(this.GetEffects());
        User.ChangeHealth(HealthEffect());
        for (int i = 0; i <  Targets.size(); i++) {
            EntityBase CurrentTarget = Targets.get(i);
            CurrentTarget.AddEffectList(GetTargetEffects());
            CurrentTarget.ChangeHealth(TargetHealthEffect());
        }
    }
}
