package ru.techcoll.swords.game.actions;

import ru.techcoll.swords.game.AttackType;
import ru.techcoll.swords.game.Battlefield;
import ru.techcoll.swords.game.units.Unit;

public class AttackAction extends Action {

    private Battlefield battlefield;

    private Unit attacker;

    private Unit defender;

    public AttackAction(Battlefield battlefield, Unit attacker, Unit defender) {
        this.battlefield = battlefield;
        this.attacker = attacker;
        this.defender = defender;
    }

    @Override
    public void execute() {
        if (!battlefield.canAttack(attacker, defender))
            return;

        defender.setHealth(defender.getHealth() - attacker.getAttack());

        if (attacker.getAttackType() == AttackType.MELEE && !defender.isDead())
            attacker.setHealth(attacker.getHealth() - defender.getAttack());
    }

}
