import publishers.WhiteHousePressCentre;
import subscribers.CentralWebNewsPaper;
import subscribers.FirstJournal;

public class ApplicationStarter {
    public static void main(String[] args) {
        WhiteHousePressCentre whiteHousePressCentre = new WhiteHousePressCentre();

        CentralWebNewsPaper webNewsPaper = new CentralWebNewsPaper();
        FirstJournal journal = new FirstJournal();

        whiteHousePressCentre.addSubscribersToEvent("Election", webNewsPaper);
        whiteHousePressCentre.addSubscribersToEvent("Election", journal);

        whiteHousePressCentre.addSubscribersToEvent("Impeachment", webNewsPaper);
        whiteHousePressCentre.addSubscribersToEvent("Impeachment", journal);

        whiteHousePressCentre.setNews("We elected new president of the Mars");
        whiteHousePressCentre.notifyByEvent("Election", whiteHousePressCentre.getNews());
        System.out.println();

        whiteHousePressCentre.setNews("Our president is no longer a president");
        whiteHousePressCentre.notifyByEvent("Impeachment", whiteHousePressCentre.getNews());
    }
}
