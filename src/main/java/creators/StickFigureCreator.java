package temp.creators;

import products.StickForm;
import products.TetrisFigureInterface;

public class StickFigureCreator implements FigureCreator {
    public TetrisFigureInterface createFigure() {
        return new StickForm();
    }
}
