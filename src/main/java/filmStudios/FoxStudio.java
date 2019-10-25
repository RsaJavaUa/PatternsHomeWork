package filmStudios;

import moviebuilders.AbstractMovieBuilder;
import objects.Movie;

public class FoxStudio {
    private AbstractMovieBuilder movieBuilder;

    public Movie releaseNewMovie(){
        return movieBuilder.createMovie();
    }

    public FoxStudio(AbstractMovieBuilder movieBuilder) {
        this.movieBuilder = movieBuilder;
    }

    public AbstractMovieBuilder getMovieBuilder() {
        return movieBuilder;
    }

    public void setMovieBuilder(AbstractMovieBuilder movieBuilder) {
        this.movieBuilder = movieBuilder;
    }
}
