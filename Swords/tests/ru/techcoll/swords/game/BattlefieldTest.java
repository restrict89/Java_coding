package ru.techcoll.swords.game;

import org.junit.Test;
import ru.techcoll.swords.game.units.*;
import static org.junit.Assert.*;

/**
 * Created by 1 on 28.09.2016.
 */
public class BattlefieldTest {
    @Test
    public void canMoveTo() throws Exception {

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
        assertEquals(String.format("Griffin move to %s", griffin.toString()), true, battlefield.canMoveTo(griffin,2,5));

        // Test Knight
        assertEquals(String.format("Knight don't move %s to (4;3)", knight.toString()), false, battlefield.canMoveTo(knight,4,3));
        assertEquals(String.format("Knight move %s to (4;2)", knight.toString()), true, battlefield.canMoveTo(knight,4,2));

        // Test Archer
       assertEquals(String.format("Archer don't move %s to (7;7)",archer.toString()),  false, battlefield.canMoveTo(archer,7,7));
       assertEquals(String.format("Archer move %s to (3;3)", archer.toString()), true, battlefield.canMoveTo(archer, 3,3));

        // Test Pikeman
        assertEquals(String.format("Pikeman don't move %s to (13;1)", pikeman.toString()), false, battlefield.canMoveTo(pikeman, 13,1));
        assertEquals(String.format("Pikeman move %s to (12;1)",pikeman.toString()), true, battlefield.canMoveTo(pikeman,12,1));

        // Test Mage
        assertEquals(String.format("Mage move %s to (13;3)", mage.toString()), true, battlefield.canMoveTo(mage, 13,3));
        assertEquals(String.format("Mage don't move %s to (11;5)", mage.toString()), false, battlefield.canMoveTo(mage,11,5));

      }

}