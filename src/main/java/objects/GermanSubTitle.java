package objects;

import objectsinterfaces.SubTitleInterface;

public class GermanSubTitle implements SubTitleInterface {
    @Override
    public void playSubTitles() {
        System.out.println("Playing sub titles in German.");
    }
}
