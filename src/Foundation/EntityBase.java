package Foundation;

import java.util.List;

public abstract class EntityBase {
    List<EffectBase> Effects = null;
    List<ItemBase> Inventory = null;
    int level = 0;
    int Health = 0;
    String Name = "No Name Input";
    public final String getName() {
        return Name;
    }
    public final void AddEffect(EffectBase Effect) {
        Effects.add(Effect);
    }
    public final void AddEffectList(List<EffectBase> Effects) {
        Effects.addAll(Effects);
    }
    public final void RemoveEffect(EffectBase Effect) {
        Effects.remove(Effect);
    }
    public final void ChangeHealth(int Amount) {
        Health += Amount;
    }
    public final void SetHealth(int Amount) {Health = Amount;}
    public final int GetHealth() {
        return Health;
    }
    public abstract int GetMaxHealth();
    public final void ClearInventory(){Inventory.clear();}
    public final void AddToInventory(List<ItemBase> Items) {Inventory.addAll(Items);}
    public final List<ItemBase> GetInventory() {
        return Inventory;
    }
    public abstract void DoTurn();
    public abstract void OnCombatStart();
}
