package products;

import java.util.Random;

public class RandomForm extends TetrisFigure {

    private Random random;

    public RandomForm() {
        super(0, "Random form figure");
        setSize(createRandomSize());

    }

    private int createRandomSize() {
        random = new Random();
        return random.nextInt(6) + 1;
    }
}
