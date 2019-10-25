package subscribers;

public class CentralWebNewsPaper implements PublishNewsInterface {
    @Override
    public void publish(String news) {
        System.out.println("Central newspaper is publishing hot news in web: "+ news +" ! Super !");
    }
}
