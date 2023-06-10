package Foundation;

import EnemyAI.BaseAI;
import EnemyAI.ExampleAI;

import java.util.List;

public abstract class EnemyBase extends EntityBase {
    BaseAI enemyAI;
        public EnemyBase() {
          enemyAI = new ExampleAI();

        }
        public final void SetAI(BaseAI AI) {
            enemyAI = AI;
        }

    @Override
    public void DoTurn() {
        enemyAI.Decide();
    }

    @Override
    public void OnCombatStart() {

    }
}
