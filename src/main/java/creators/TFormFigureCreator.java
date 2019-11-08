package temp.creators;

import products.TFormFigure;
import products.TetrisFigureInterface;

public class TFormFigureCreator implements FigureCreator {
    public TetrisFigureInterface createFigure() {
        return new TFormFigure();
    }
}
