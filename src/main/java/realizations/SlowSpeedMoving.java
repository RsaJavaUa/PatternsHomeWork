package realizations;

import interfaces.Movable;

public class SlowSpeedMoving implements Movable {
    public void move(Integer positionA, Integer positionB) {
        System.out.println("Slowly moving from " + positionA + " to " + positionB);
    }
}
