package ru.techcoll.swords.game.actions;

import org.junit.Test;
import ru.techcoll.swords.game.Battlefield;
import ru.techcoll.swords.game.units.Archer;
import ru.techcoll.swords.game.units.Griffin;
import ru.techcoll.swords.game.units.Knight;
import ru.techcoll.swords.game.units.Unit;
import ru.techcoll.swords.game.units.Mage;
import ru.techcoll.swords.game.units.Pikeman;

import static org.junit.Assert.*;

/**
 * Created by 1 on 28.09.2016.
 */
public class MoveActionTest {
    @Test
    public void execute() throws Exception {

        Battlefield battlefield = new Battlefield();
        Unit griffin = new Griffin(1,5);
        Unit archer = new Archer(4,3);
        Unit knight = new Knight(8,5);
        Unit mage = new Mage(13,1);
        Unit pikeman = new Pikeman(12,6);

        battlefield.addUnit(griffin);
        battlefield.addUnit(archer);
        battlefield.addUnit(knight);
        battlefield.addUnit(mage);
        battlefield.addUnit(pikeman);

        // Test Griffin
        MoveAction moveGriffin = new MoveAction(battlefield, griffin, 2, 5);
        moveGriffin.execute();
        assertTrue(String.format("Griffin move %s", griffin.toString()), griffin.getX() == 2 && griffin.getY() == 5);

        // Test Knight
        MoveAction moveKnight1 = new MoveAction(battlefield, knight, 4, 3);
        moveKnight1.execute();
        assertTrue(String.format("Knight don't move %s to (4;3)", knight.toString()), !(knight.getX() == 4 && knight.getY() == 3 ));

        MoveAction moveKnight2 = new MoveAction(battlefield, knight, 4, 2);
        moveKnight2.execute();
        assertTrue(String.format("Knight move %s to (4;2)", knight.toString()), knight.getX() == 4 && knight.getY() == 2);

       // Test Archer
        MoveAction moveArcher1 = new MoveAction(battlefield, archer, 7, 7) ;
        moveKnight1.execute();
        assertTrue(String.format("Archer don't move %s to (7;7)", archer.toString()), !(archer.getX() == 7 && archer.getY() == 7));

        MoveAction moveArcher2 = new MoveAction(battlefield, archer, 3, 3);
        moveArcher2.execute();
        assertTrue(String.format("Archer move %s to (3;3)", archer.toString()), archer.getX() == 3 && archer.getY() == 3);

        // Test Pikeman
        MoveAction movePikeman1 = new MoveAction(battlefield,pikeman , 13, 1) ;
        movePikeman1.execute();
        assertTrue(String.format("Pikeman don't move %s to (13;1)", pikeman.toString()), !(pikeman.getX() == 13 && pikeman.getY() == 1));

        MoveAction movePikeman2 = new MoveAction(battlefield, pikeman, 12, 1);
        movePikeman2.execute();
        assertTrue(String.format("Pikeman move %s to (12;1)", pikeman.toString()), pikeman.getX() == 12 && pikeman.getY() == 1);

        // Test Mage
        MoveAction moveMage1 = new MoveAction(battlefield,mage, 13,3);
        moveMage1.execute();
        assertTrue(String.format("Mage move %s to (13;3)", mage.toString()), mage.getX() == 13 && mage.getY() == 3);

        MoveAction moveMage2 = new MoveAction(battlefield,mage, 11,5);
        moveMage1.execute();
        assertTrue(String.format("Mage don't move %s to (11;5)", mage.toString()), !(mage.getX() == 11 && mage.getY() == 5));
    }

}