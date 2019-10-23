package realizations;

import interfaces.Movable;

public class FastMoving implements Movable {
    public void move(Integer positionA, Integer positionB) {
        System.out.println("Running from " + positionA + " to " + positionB);
    }
}
