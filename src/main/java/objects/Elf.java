package objects;

import interfaces.Flyable;
import interfaces.Movable;
import realizations.AverageSpeedMoving;
import realizations.MagicFly;
import realizations.FastMoving;

public class Elf extends GameHero {
    public Elf() {
        setMovable(new FastMoving());
    }

    public void doFlyMagic(Integer positionA, Integer positionB) {
        if (getFlyable() == null) {
            setFlyable(new MagicFly());
        }
        getFlyable().fly(positionA, positionB);
    }

    public void move (Integer positionA, Integer positionB){
        getMovable().move(positionA, positionB);
    }
}
