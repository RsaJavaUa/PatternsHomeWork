package objects;

import interfaces.Movable;
import realizations.FastMoving;
import realizations.MagicFly;
import realizations.SlowSpeedMoving;

public class Troll extends GameHero {
    public Troll () {
        setMovable(new SlowSpeedMoving());
    }

    public void move (Integer positionA, Integer positionB){
        getMovable().move(positionA, positionB);
    }
}
