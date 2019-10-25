package objects;

import objectsinterfaces.SubTitleInterface;

public class EnglishSubTitle implements SubTitleInterface {
    @Override
    public void playSubTitles() {
        System.out.println("Playing sub titles in English.");
    }
}
