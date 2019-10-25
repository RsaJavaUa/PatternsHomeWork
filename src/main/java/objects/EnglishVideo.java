package objects;

import objectsinterfaces.VideoInterface;

public class EnglishVideo implements VideoInterface {
    @Override
    public void playVideo() {
        System.out.println("Playing video in English. YES!");
    }
}
