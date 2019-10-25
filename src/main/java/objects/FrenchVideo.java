package objects;

import objectsinterfaces.VideoInterface;

public class FrenchVideo implements VideoInterface {
    @Override
    public void playVideo() {
        System.out.println("Playing video in French. OUI!");
    }
}
