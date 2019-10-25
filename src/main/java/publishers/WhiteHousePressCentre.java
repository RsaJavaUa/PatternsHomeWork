package publishers;

import subscribers.PublishNewsInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhiteHousePressCentre  {
   private Map<String, NewsSupplier> newsSuppliers = new HashMap<>();
    private String news;

    public String getNews() {
        return news;
    }

    public void addSubscribersToEvent(String event, PublishNewsInterface publisher){
        if (newsSuppliers.get(event) == null){
                newsSuppliers.put(event, new NewsSupplier());
        }
        newsSuppliers.get(event).subscribe(publisher);
    }

    public void removeSubscribersFromEvent(String event, PublishNewsInterface publisher){
        if (newsSuppliers.get(event) != null){
            newsSuppliers.get(event).unSubscribe(publisher);
        }

    }

    public void setNews(String news) {
        this.news = news;
    }


    public void notifyByEvent (String event, String content){
        newsSuppliers.get(event).notifySubscribers(content);

    }
}
