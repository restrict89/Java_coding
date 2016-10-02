package ru.techcoll.swords.game.units;

import ru.techcoll.swords.game.AttackType;
import ru.techcoll.swords.game.GameObject;

public abstract class Unit extends GameObject {

    protected int health;

    protected int attack;

    protected AttackType attackType;

    protected int speed;

    protected int x;

    protected int y;

    protected Unit(int health, int attack, AttackType attackType, int speed, int x, int y) {
        this.health = health;
        this.attack = attack;
        this.attackType = attackType;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health > 0 ? health : 0;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack > 0 ? attack : 0;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isDead() {
        return health == 0;
    }

    public boolean isCloseTo(Unit other) {
        return (Math.abs(this.x - other.x) <= 1 && Math.abs(this.y - other.y) <= 1) && !(this.x == other.x && this.y == other.y);

        /** 4-связность
         return Math.abs(this.x - other.x) - Math(this.y - other.y) <= 1
         */
    }

}
