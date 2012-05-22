package my.refactoring.rental;

/**
 * User: andrey.osipov
 * Date: 11/23/11
 * Time: 4:46 PM
 */
public class MovieRentalPriceChildren extends MovieRentalPriceDefault {

    @Override
    public Double getPrice(Integer daysRented) {
        if (daysRented > 3) {
            return Double.valueOf(1.5) + (daysRented - 3) * 1.5;
        } else {
            return Double.valueOf(1.5);
        }
    }
}