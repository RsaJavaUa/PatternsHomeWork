import enums.BacteriaCoreType;
import objects.Colony;

public class ApplicationStarter {
    public static void main(String[] args) {
        Colony bacteriaColony = new Colony();
        bacteriaColony.createBacteriaAndPutInColony(BacteriaCoreType.CIRCLE, true, "Green", 10);
        bacteriaColony.createBacteriaAndPutInColony(BacteriaCoreType.ELIPSE, false, "Red", 11);
        bacteriaColony.consumeByEachBacteriaInColonty();
    }


}
