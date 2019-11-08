package objects;

import interfaces.Mementable;

import java.util.Objects;
import java.util.Random;
import java.util.Stack;

public class GameXsOs implements Mementable {
    private int turnNumber = 0;
    private int positionsX;
    private int positionsO;
    private Stack<GameXOMemento> backUps;

    private Random random = new Random();

    public GameXsOs() {
        System.out.println("Current turn is 0, position of X is 0  and position of O is 0 as well");
        backUps = new Stack<>();
    }

    public GameXsOs(int turnNumber, int positionsX, int getPositionsO) {
        this.turnNumber = turnNumber;
        this.positionsX = positionsX;
        this.positionsO = getPositionsO;
    }

    @Override
    public void saveState() {
        GameXOMemento currentState = new GameXOMemento(turnNumber, positionsX, positionsO);
        if (backUps.empty() || !backUps.peek().equals(currentState)) {
            backUps.push(new GameXOMemento(turnNumber, positionsX, positionsO));
        }
    }

    @Override
    public void restorePreviousState() {
        GameXOMemento gameXOMemento = backUps.pop();
        positionsX = gameXOMemento.positionsX;
        positionsO = gameXOMemento.getPositionsO;
        turnNumber = gameXOMemento.turnNumber;
        System.out.println("Current turn is " + turnNumber + " , position of X is " + positionsX +
                "  and position of O is " + positionsO);
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public void makeTurn(int positionsX, int positionsO) {
        saveState();
        turnNumber++;
        this.positionsX = positionsX;
        this.positionsO = positionsO;
        System.out.println("Current turn is " + turnNumber + " , position of X is " + positionsX +
                "  and position of O is " + positionsO);
    }

    public void makeRandomTurn() {
        saveState();
        turnNumber++;
        changePositionsRandomly();
        System.out.println("Current turn is " + turnNumber + " , position of X is " + positionsX +
                " and position of O is " + positionsO);
    }

    private void changePositionsRandomly() {
        positionsX += random.nextInt(2) + 1;
        positionsO += random.nextInt(2) + 1;
    }

    class GameXOMemento {

        private int turnNumber;
        private int positionsX;
        private int getPositionsO;

        public GameXOMemento(int turnNumber, int positionsX, int getPositionsO) {
            this.turnNumber = turnNumber;
            this.positionsX = positionsX;
            this.getPositionsO = getPositionsO;
        }

        public int getTurnNumber() {
            return turnNumber;
        }

        public int getPositionsX() {
            return positionsX;
        }


        public int getGetPositionsO() {
            return getPositionsO;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GameXOMemento that = (GameXOMemento) o;
            return turnNumber == that.turnNumber &&
                    positionsX == that.positionsX &&
                    getPositionsO == that.getPositionsO;
        }

        @Override
        public int hashCode() {
            return Objects.hash(turnNumber, positionsX, getPositionsO);
        }
    }
}
