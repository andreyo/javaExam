package my.refactoring.rental;

/**
 * User: andrey.osipov
 * Date: 11/23/11
 * Time: 3:54 PM
 */
public abstract class MovieRentalPrice {

    public abstract Double getPrice(Integer daysRented);

    public abstract Integer getFrequentRenterPoints(Integer daysRented);
}