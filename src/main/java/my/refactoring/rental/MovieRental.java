package my.refactoring.rental;

import my.refactoring.Movie;
import my.refactoring.MovieType;

/**
 * User: andrey.osipov
 * Date: 11/21/11
 * Time: 3:20 PM
 */
public class MovieRental {

    private Movie movie;
    private Integer daysRented;

    private MovieRentalPrice movieRentalPrice;

    public MovieRental(Movie movie, Integer daysRented, MovieType movieType) {
        this.movie = movie;
        this.daysRented = daysRented;
        movieRentalPrice = RentalPriceByMovieTypeCatalog.getMovieRentalPrice(movieType);
    }

    public Integer getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public Double getCharge() {
        return movieRentalPrice.getPrice(daysRented);
    }

    public Integer getFrequentRenterPoints() {
        return movieRentalPrice.getFrequentRenterPoints(daysRented);
    }
}