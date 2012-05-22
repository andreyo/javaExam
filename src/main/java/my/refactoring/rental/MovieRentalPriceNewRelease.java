package my.refactoring.rental;

/**
 * User: andrey.osipov
 * Date: 11/23/11
 * Time: 4:45 PM
 */
public class MovieRentalPriceNewRelease extends MovieRentalPriceDefault {

    @Override
    public Double getPrice(Integer daysRented) {
        return daysRented * Double.valueOf(3);
    }

    @Override
    public Integer getFrequentRenterPoints(Integer daysRented) {
        if (daysRented > 1) {
            return 2;
        }
        return super.getFrequentRenterPoints(daysRented);
    }
}