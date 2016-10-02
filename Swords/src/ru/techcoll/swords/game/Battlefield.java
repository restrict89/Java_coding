package ru.techcoll.swords.game;

import ru.techcoll.swords.game.units.Unit;

import java.util.ArrayList;
import java.util.List;

public class Battlefield {

    /**
     * Ширина поля боя
     */
    public final static int WIDTH = 14;

    /**
     * Высота поля боя
     */
    public final static int HEIGHT = 8;

    private List<Unit> units = new ArrayList<>();

    public Battlefield() {}

    public Unit addUnit(Unit unit) {
        units.add(unit);
        return unit;
    }

    public Unit removeUnit(Unit unit) {
        units.remove(unit);
        return unit;
    }

    public void printUnits() {
        for (Unit unit : units)
            System.out.println(unit);
    }

    public boolean canAttack(Unit attacker, Unit defender) {
        boolean result = false;

        switch (attacker.getAttackType()) {
            case MELEE:
                result = attacker.isCloseTo(defender);
                break;

            case RANGED:
                result = true;
                break;

            case MAGIC:
                result = false;
                break;
        }

        return result;
    }

    public boolean canMoveTo(Unit unit, int x, int y) {
        int map[][] = new int[WIDTH][HEIGHT];

        // инициализация
        for (int ix = 0; ix < WIDTH; ++ix) {
            for (int iy = 0; iy < HEIGHT; ++iy)
                map[ix][iy] = -1;  // еще не проходили здесь
        }

        // расставим юниты
        for (Unit u : units)
            map[u.getX()][u.getY()] = -2; // сюда ходить нельзя

        // начальная точка
        map[unit.getX()][unit.getY()] = 0;

        // обход
        int step = 0;
        while (step < unit.getSpeed()) {
            // распространение волны
            for (int ix = 0; ix < WIDTH; ++ix) {
                for (int iy = 0; iy < HEIGHT; ++iy) {
                    if (map[ix][iy] == step) {
                        if (ix - 1 >= 0 && map[ix - 1][iy] == -1)
                            map[ix - 1][iy] = step + 1;
                        if (iy - 1 >= 0 && map[ix][iy - 1] == -1)
                            map[ix][iy - 1] = step + 1;
                        if (ix + 1 < WIDTH && map[ix + 1][iy] == -1)
                            map[ix + 1][iy] = step + 1;
                        if (iy + 1 < HEIGHT && map[ix][iy + 1] == -1)
                            map[ix][iy + 1] = step + 1;

                    }
                }
            }
            // следующий шаг
            step += 1;
        }

        // если в целевой клетке указан номер шага, значит туда можно прийти
        return ((map[x][y] > 0) || ((unit.getSpeed() == 0) && (map[x][y] == -1)));
    }


}
