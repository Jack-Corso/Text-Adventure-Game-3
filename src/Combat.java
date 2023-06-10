import Foundation.EntityBase;
import Foundation.PlayerBase;

import java.util.List;


public class Combat {

    public void StartFight(List<EntityBase> Opponents, PlayerBase Player) {
        Player.OnCombatStart();
        for (int i = 0; i < Opponents.size(); i++) {
            Opponents.get(i).OnCombatStart();
        }
    }

    public void PlayerTurn(PlayerBase Player, List<EntityBase> Opponents) {

    }
    public void EnemyTurn(PlayerBase Player, List<EntityBase> Opponents) {
        for (int i = 0; i < Opponents.size(); i++) {
            Opponents.get(i).DoTurn();
        }
    }

}
