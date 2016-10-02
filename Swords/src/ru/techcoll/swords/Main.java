package ru.techcoll.swords;

import ru.techcoll.swords.game.Battlefield;
import ru.techcoll.swords.game.actions.AttackAction;
import ru.techcoll.swords.game.units.Archer;
import ru.techcoll.swords.game.units.Knight;
import ru.techcoll.swords.game.units.Unit;

public class Main {

    public static void main(String[] args) {

        Battlefield bf = new Battlefield();
        Unit archer = bf.addUnit(new Archer(2, 4));
        Unit knight = bf.addUnit(new Knight(4, 6));

        System.out.println("Initial state:");
        bf.printUnits();

        AttackAction attack = new AttackAction(bf, archer, knight);
        attack.execute();

        System.out.println("After attack:");
        bf.printUnits();

        if (bf.canMoveTo(archer, 3, 5))
            System.out.printf("Archer can move to @(%d, %d)\n", 3, 5);
        else
            System.out.printf("It's impossible to move to @(%d, %d)\n", 3, 5);

    }

}
