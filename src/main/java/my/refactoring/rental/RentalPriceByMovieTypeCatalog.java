package my.refactoring.rental;

import my.refactoring.MovieType;

import java.util.HashMap;
import java.util.Map;

/**
 * User: andrey.osipov
 * Date: 11/23/11
 * Time: 5:23 PM
 */
public class RentalPriceByMovieTypeCatalog {

    private static Map<MovieType, MovieRentalPrice> movieTypeMovieRentalPriceMap = new HashMap<MovieType, MovieRentalPrice>();

    static {
        movieTypeMovieRentalPriceMap.put(MovieType.REGULAR, new MovieRentalPriceRegular());
        movieTypeMovieRentalPriceMap.put(MovieType.NEW_RELEASE, new MovieRentalPriceNewRelease());
        movieTypeMovieRentalPriceMap.put(MovieType.CHILDRENS, new MovieRentalPriceChildren());
        movieTypeMovieRentalPriceMap.put(MovieType.NONE, new MovieRentalPriceDefault());
    }

    public static MovieRentalPrice getMovieRentalPrice(MovieType movieType) {
        return movieTypeMovieRentalPriceMap.get(movieType);
    }
}