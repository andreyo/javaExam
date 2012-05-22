package my.refactoring.rental;

/**
 * User: andrey.osipov
 * Date: 11/23/11
 * Time: 4:48 PM
 */
public class MovieRentalPriceDefault extends MovieRentalPrice {

    @Override
    public Double getPrice(Integer daysRented) {
        return Double.valueOf(0);
    }

    @Override
    public Integer getFrequentRenterPoints(Integer daysRented) {
        return Integer.valueOf(1);
    }
}