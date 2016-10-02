package ru.techcoll.swords.game.units;

import ru.techcoll.swords.game.AttackType;

/**
 * Юнит кастер - маг
 */
public class Mage extends Unit {

    /**
     * Начальное значение здоровья
     */
    public final static int HEALTH = 10;

    /**
     * Начальное значение атаки
     */
    public final static int ATTACK = 0;

    /**
     * Начальное значение скорости
     */
    public final static int SPEED = 3;


    public Mage(int x, int y) {
        super(HEALTH, ATTACK, AttackType.MAGIC, SPEED, x, y);
    }

    public String toString() {
        return String.format("Mage @(%d, %d) %d/%d", x, y, attack, health);
    }

}
