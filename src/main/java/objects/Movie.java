package objects;

import objectsinterfaces.SubTitleInterface;
import objectsinterfaces.VideoInterface;

public class Movie {
    private VideoInterface video;
    private SubTitleInterface subTitle;

    public void playMovie(){
        video.playVideo();
        subTitle.playSubTitles();
    }

    public VideoInterface getVideo() {
        return video;
    }

    public void setVideo(VideoInterface video) {
        this.video = video;
    }

    public SubTitleInterface getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(SubTitleInterface subTitle) {
        this.subTitle = subTitle;
    }
}
