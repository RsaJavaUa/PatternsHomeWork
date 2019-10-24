package subscribers;

public class FirstJournal implements PublishNewsInterface {

    @Override
    public void publish(String news) {
        System.out.println("First journal is publishing hot news: "+ news +" ! WOW !");
    }
}
