package objects;

import objectsinterfaces.SubTitleInterface;

public class FrenchSubTitle implements SubTitleInterface {
    @Override
    public void playSubTitles() {
        System.out.println("Playing sub titles in French.");
    }
}
