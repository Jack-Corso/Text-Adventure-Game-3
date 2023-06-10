package Foundation;

public abstract class EffectBase {
    ItemBase UsedItem;

    public void SetUsedItem(ItemBase UsedItem) {
        this.UsedItem = UsedItem;
    }
    String Name = "No Name Input";
    public final String getName() {
        return Name;
    }

    public abstract void OnUsage(EntityBase Target);
    public abstract int HealthChange();
    public abstract int DamageChange();
    public int Length = 1;
    public final void Apply() {
        Length--;
        for(int i = 0; i < UsedItem.GetTargets().size(); i++) {
            EntityBase Target = UsedItem.GetTargets().get(i);
            Target.ChangeHealth(HealthChange());
            OnUsage(Target);
            if (Length <= 0) {
                System.out.println(getName() + " Has Worn Off");
                Target.RemoveEffect(this);
            }

        }
    }
}
