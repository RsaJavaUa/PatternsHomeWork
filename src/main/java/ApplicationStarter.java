import filmStudios.FoxStudio;
import moviebuilders.EnglishMovieBulder;
import moviebuilders.GermanMovieBuilder;
import objects.Movie;

public class ApplicationStarter {
    public static void main(String[] args) {
        FoxStudio studio = new FoxStudio(new EnglishMovieBulder());
        Movie movieEnglish = studio.releaseNewMovie();
        movieEnglish.playMovie();

        System.out.println("***********");

        studio.setMovieBuilder(new GermanMovieBuilder());
        Movie movieGerman = studio.releaseNewMovie();
        movieGerman.playMovie();
    }
}
