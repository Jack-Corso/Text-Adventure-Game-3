package Foundation;

import java.util.List;

public abstract class ItemBase {
    enum UsageType {
        /**
         * One Time usage
         */
        Usable,
        /**
         * Decreases Quality Over Time
         */
        Durability,
        /**
         * Never Breaks
         */
        Unbreakable
    }
     List<EffectBase> Effects = null;
    List<EntityBase> Targets = null;
     UsageType usageType;
     int Durability = 0;
     String Name = "No Name Input";
    public final String getName() {
        return Name;
    }
    public abstract void Use(EntityBase User);
    public void SetEffects(List<EffectBase> Effects) {
        this.Effects = Effects;
    }
    public void SetTargets(List<EntityBase> Targets) {
        this.Targets = Targets;
    }
    public List<EffectBase> GetEffects() {
        return Effects;
    }
    public List<EntityBase> GetTargets() {
        return Targets;
    }

    public UsageType getUsageType() {
        return UsageType.Unbreakable;
    }
}
