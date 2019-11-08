package temp.creators;

import products.ElFormFigure;
import products.TetrisFigureInterface;

public class ElFigureCreator implements FigureCreator {
    public TetrisFigureInterface createFigure() {
        return new ElFormFigure();
    }
}
