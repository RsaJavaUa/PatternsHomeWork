package objects;

import objectsinterfaces.VideoInterface;

public class GermanVideo implements VideoInterface {
    @Override
    public void playVideo() {
        System.out.println("Playing video in German. YA-YA!");
    }
}
