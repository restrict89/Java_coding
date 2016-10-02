package ru.techcoll.swords.game.units;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 1 on 28.09.2016.
 */
public class UnitTest {
    @Test
    public void isCloseTo() throws Exception {
        int MAX_X = 14;
        int MAX_Y = 8;
        int MIN_X = 0;
        int MIN_Y = 0;
        Unit archer = new Archer(MIN_X, MIN_Y);
        Unit neighbor = new Archer(MIN_X, MIN_Y);
        for (int x = MIN_X; x < MAX_X; x++)
            for (int y = MIN_Y; y < MAX_Y; y++) {

                archer.setPosition(x, y);
                for (int xi = MIN_X; xi < MAX_X; xi++) {
                    for (int yi = MIN_Y; yi < MAX_Y; yi++) {
                        neighbor.setPosition(xi, yi);
                        if (((xi == x - 1) && ((yi == y + 1) || (yi == y) || (yi == y - 1))) ||
                                ((xi == x + 1) && ((yi == y + 1) || (yi == y) || (yi == y - 1))) ||
                                ((xi == x) && ((yi == y + 1) || (yi == y - 1))))
                            assertEquals(neighbor.toString() + " is neighbor", true, archer.isCloseTo(neighbor));
                        else
                            assertEquals(neighbor.toString() + " isn't neighbor", false, archer.isCloseTo(neighbor));
                    }
                }
            }
    }
}
