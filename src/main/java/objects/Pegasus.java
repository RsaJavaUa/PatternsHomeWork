package objects;

import realizations.FastMoving;
import realizations.WingsFly;

public class Pegasus extends GameHero {
    public Pegasus() {
        setMovable(new FastMoving());
        setFlyable(new WingsFly());
    }

    public void move(Integer positionA, Integer positionB) {
        getMovable().move(positionA, positionB);
    }

    public void fly(Integer positionA, Integer positionB) {
        getFlyable().fly(positionA, positionB);
    }
}
