package moviebuilders;

import objects.FrenchSubTitle;
import objects.FrenchVideo;
import objects.Movie;

public class FrenchMovieBuilder implements AbstractMovieBuilder {

    private Movie movie;

    @Override
    public Movie createMovie() {
        movie = new Movie();
        movie.setSubTitle(new FrenchSubTitle());
        movie.setVideo(new FrenchVideo());
        return movie;
    }
}
