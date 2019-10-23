package realizations;

import interfaces.Flyable;

public class WingsFly implements Flyable {
    public void fly(Integer positionA, Integer positionB) {
        System.out.println("Flying from " + positionA + " to " + positionB + " using wings");
    }
}
