package moviebuilders;

import objects.EnglishSubTitle;
import objects.EnglishVideo;
import objects.Movie;

public class EnglishMovieBulder implements AbstractMovieBuilder {

    private Movie movie;

    @Override
    public Movie createMovie() {
        movie = new Movie();
        movie.setSubTitle(new EnglishSubTitle());
        movie.setVideo(new EnglishVideo());
        return movie;
    }
}
