package Items;

import Effects.ExampleEffect;
import Foundation.WeaponBase;

import java.util.List;

public class ExampleWeapon extends WeaponBase {
    //Constructor used to define effects
    public ExampleWeapon() {
        //Defines the effect this Weapon is using
        ExampleEffect exampleEffect = new ExampleEffect(this);
        //Adds the previously defined effect to this weapon (Supports Multiple Effects)
        SetEffects(List.of(exampleEffect));
    }
    //The damage that the sword will do on attack (5)
    @Override
    public int Damage() {
        return 5;
    }

}
