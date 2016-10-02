package ru.techcoll.swords.game;

import ru.techcoll.swords.game.units.Unit;

public enum AttackType {

    /**
     * Ближний бой, можно атаковать юниты на соседних клетках
     */
    MELEE,

    /**
     * Дальний бой, можно атаковать юниты на всем поле
     */
    RANGED,

    /**
     * Магическая атака, нельзя атаковать как обычно, но можно кастить заклинания
     */
    MAGIC;


}
