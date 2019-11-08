package temp.creators;

import products.Cube;
import products.TetrisFigureInterface;

public class CubeCreator implements FigureCreator {

    public TetrisFigureInterface createFigure() {
        return new Cube();
    }
}
