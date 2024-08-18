package BookMyShow_LLD.search;

import BookMyShow_LLD.movie.Movie;

import java.util.Date;
import java.util.List;

public interface Search {

    List<Movie> searchByTitle(String title);


    List<Movie> searchByLanguage(String language);


    List<Movie> searchByGenre(String genre);


    List<Movie> searchByReleaseDate(Date releaseDate);



    public List<Movie> searchByCity(String cityName);
}