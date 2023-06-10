import EnemyAI.BaseAI;
import EnemyAI.ExampleAI;
import Entities.ExampleEnemy;
import Foundation.PlayerBase;
import Items.ExampleConsumable;
import PlayerInfo.ExamplePlayer;

import javax.swing.*;
import java.util.List;

public class Main {
    public static ExamplePlayer examplePlayer = new ExamplePlayer();
    public static ExampleAI exampleAI = new ExampleAI();
    public static ExampleEnemy exampleEnemy = new ExampleEnemy();
    public static ExampleConsumable exampleConsumable = new ExampleConsumable();
    public static void main(String[] args) {
        System.out.println("Running Command test");
        exampleAI.SetEnemy(exampleEnemy);
        exampleEnemy.SetAI(exampleAI);
        Combat combat = new Combat();
        combat.StartFight(List.of(exampleEnemy),examplePlayer );
    }
}