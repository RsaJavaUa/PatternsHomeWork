package moviebuilders;

import objects.GermanSubTitle;
import objects.GermanVideo;
import objects.Movie;

public class GermanMovieBuilder implements AbstractMovieBuilder {

    private Movie movie;

    @Override
    public Movie createMovie() {
        movie = new Movie();
        movie.setSubTitle(new GermanSubTitle());
        movie.setVideo(new GermanVideo());
        return movie;
    }
}
