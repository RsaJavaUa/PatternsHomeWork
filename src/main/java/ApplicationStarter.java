import objects.GameXsOs;

public class ApplicationStarter {

    public static void main(String[] args) {
        GameXsOs gameXsOs = new GameXsOs();
        gameXsOs.makeRandomTurn();
        gameXsOs.saveState();
        gameXsOs.makeRandomTurn();
        gameXsOs.makeRandomTurn();
        System.out.println("*******");
        gameXsOs.restorePreviousState();
        gameXsOs.restorePreviousState();
    }

}
