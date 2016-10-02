package ru.techcoll.swords.game.units;

import ru.techcoll.swords.game.AttackType;

/**
 * Летающий юнит - грифон
 */
public class Griffin extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 35;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 2;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 0;


    public Griffin(int x, int y) {
        super(HEALTH, ATTACK, AttackType.MELEE, SPEED, x, y);
    }

    public String toString() {
        return String.format("Griffin @(%d, %d) %d/%d", x, y, attack, health);
    }

}
