package my.refactoring.rental;

/**
 * User: andrey.osipov
 * Date: 11/23/11
 * Time: 4:44 PM
 */
public class MovieRentalPriceRegular extends MovieRentalPriceDefault {

    @Override
    public Double getPrice(Integer daysRented) {
        if (daysRented > 2) {
            return Double.valueOf(2) + (daysRented - 2) * 1.5;
        } else {
            return Double.valueOf(2);
        }
    }
}