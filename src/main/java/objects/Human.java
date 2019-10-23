package objects;

import interfaces.Movable;
import realizations.AverageSpeedMoving;
import realizations.MagicFly;

public class Human extends GameHero {

    public Human() {
        setMovable(new AverageSpeedMoving());
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
