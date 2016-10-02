package ru.techcoll.swords.game.units;

import ru.techcoll.swords.game.AttackType;

/**
 * Юнит ближнего боя - пикинер
 */
public class Pikeman extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 15;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 4;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 5;


    public Pikeman(int x, int y) {
        super(HEALTH, ATTACK, AttackType.MELEE, SPEED, x, y);
    }

    public String toString() {
        return String.format("Pikeman @(%d, %d) %d/%d", x, y, attack, health);
    }

}
