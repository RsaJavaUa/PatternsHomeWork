package objects;

import interfaces.Flyable;
import interfaces.Movable;

public class GameHero {
    private String name;
    private Movable movable;
    private Flyable flyable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    protected Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
}
