package realizations;

import interfaces.Movable;

public class AverageSpeedMoving implements Movable {
    public void move(Integer positionA, Integer positionB) {
        System.out.println("Moving with normal speed from " + positionA + " to " + positionB);
    }
}
