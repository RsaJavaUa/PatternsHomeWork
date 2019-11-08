package temp.creators;

import products.RandomForm;
import products.TetrisFigureInterface;

public class RandomFormFigureCreator implements FigureCreator {
    public TetrisFigureInterface createFigure() {
        return new RandomForm();
    }
}
