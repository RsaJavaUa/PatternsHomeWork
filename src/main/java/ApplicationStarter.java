import objects.Human;
import objects.Pegasus;
import realizations.FastMoving;

public class ApplicationStarter {
    public static void main(String[] args) {
        Human human = new Human();
        Pegasus pegasus = new Pegasus();

        human.move(1, 5);
        human.setMovable(new FastMoving());
        human.move(5, 1);
        human.doFlyMagic(1, 10);

        pegasus.fly(1, 5);
        pegasus.move(5, 1);


    }
}
