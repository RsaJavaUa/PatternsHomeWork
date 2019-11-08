package temp.figuresenders;

import creators.CubeCreator;
import creators.ElFigureCreator;
import creators.FigureCreator;
import creators.RandomFormFigureCreator;
import creators.StickFigureCreator;
import creators.TFormFigureCreator;
import products.TetrisFigureInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FigureSender {
    private Map<Integer, FigureCreator> creatorMap = new HashMap<>();
    private Random random = new Random();

    public FigureSender() {
        setCreatorsMap();
    }

    private void setCreatorsMap() {
        creatorMap.put(1, new CubeCreator());
        creatorMap.put(2, new ElFigureCreator());
        creatorMap.put(3, new TFormFigureCreator());
        creatorMap.put(4, new StickFigureCreator());
        creatorMap.put(5, new RandomFormFigureCreator());
    }

    public TetrisFigureInterface sendRandomFigure() {
        int randomInt = random.nextInt(5) + 1;
        TetrisFigureInterface figure = creatorMap.get(randomInt).createFigure();
        System.out.println(figure + " was send to users display");
        return figure;
    }

    public void sendTenFigures() {
        for (int i = 0; i < 10; i++) {
            sendRandomFigure();
        }
    }
}
