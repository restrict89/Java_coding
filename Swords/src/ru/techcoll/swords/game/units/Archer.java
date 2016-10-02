package ru.techcoll.swords.game.units;

import ru.techcoll.swords.game.AttackType;

/**
 * Юнит с дальней атакой - лучник
 */
public class Archer extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 15;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 5;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 5;


    public Archer(int x, int y) {
        super(HEALTH, ATTACK, AttackType.RANGED, SPEED, x, y);
    }

    public String toString() {
        return String.format("Archer @(%d, %d) %d/%d", x, y, attack, health);
    }

}
