package publishers;

import subscribers.PublishNewsInterface;

import java.util.ArrayList;
import java.util.List;

public class NewsSupplier {
    private List<PublishNewsInterface> subscribers = new ArrayList<>();

    public void subscribe(PublishNewsInterface publisher) {
        subscribers.add(publisher);
    }

    public void unSubscribe(PublishNewsInterface publisher) {
        subscribers.remove(publisher);
    }

    public void notifySubscribers(String content) {
        subscribers.forEach(publisher -> publisher.publish(content));
    }
}
