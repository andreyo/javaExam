package my.refactoring;

import my.refactoring.rental.MovieRental;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * User: andrey.osipov
 * Date: 11/21/11
 * Time: 4:01 PM
 */
public class CustomerTest {

    @Test
    public void statement_two_movies() {
        Customer customer = new Customer("Robert");
        customer.addMovieRental(new MovieRental(new Movie("Pirates"), 2, MovieType.REGULAR));
        customer.addMovieRental(new MovieRental(new Movie("Mesto Vstrechi"), 1, MovieType.NEW_RELEASE));

//        System.out.println(customer.getStatementASCII());

        String statement =
                "MovieRental Record for Robert\n" + "\tPirates\t2.0\n" + "\tMesto Vstrechi\t3.0\n" + "Amount owed is 5.0\n"
                        + "You earned 2 frequent renter points";
        assertTrue(statement.equals(customer.getStatementASCII()));
    }

    @Test
    public void statement_no_movies() {
        Customer customer = new Customer("Robert");
//        System.out.println(customer.getStatementASCII());
        String statement =
                "MovieRental Record for Robert\n" + "Amount owed is 0.0\n" + "You earned 0 frequent renter points";
        assertTrue(statement.equals(customer.getStatementASCII()));
    }

    @Test
    public void statement_price_code_out_of_range() {
        Customer customer = new Customer("Robert");
        customer.addMovieRental(new MovieRental(new Movie("Pirates"), 2, MovieType.REGULAR));
        customer.addMovieRental(new MovieRental(new Movie("Mesto Vstrechi"), 1, MovieType.NONE));
        customer.addMovieRental(new MovieRental(new Movie("Gandi"), 1, MovieType.CHILDRENS));

//        System.out.println(customer.getStatementASCII());

        String statement =
                "MovieRental Record for Robert\n" + "\tPirates\t2.0\n" + "\tMesto Vstrechi\t0.0\n" + "\tGandi\t1.5\n"
                        + "Amount owed is 3.5\n" + "You earned 3 frequent renter points";
        assertTrue(statement.equals(customer.getStatementASCII()));
    }

    @Test
    public void statement_bonuses() {
        Customer customer = new Customer("Robert");
        customer.addMovieRental(new MovieRental(new Movie("Pirates"), 3, MovieType.REGULAR));
        customer.addMovieRental(new MovieRental(new Movie("Mesto Vstrechi"), 3, MovieType.NEW_RELEASE));
        customer.addMovieRental(new MovieRental(new Movie("Matrix"), 4, MovieType.CHILDRENS));

//        System.out.println(customer.getStatementASCII());

        String statement =
                "MovieRental Record for Robert\n" + "\tPirates\t3.5\n" + "\tMesto Vstrechi\t9.0\n" + "\tMatrix\t3.0\n"
                        + "Amount owed is 15.5\n" + "You earned 4 frequent renter points";
        assertTrue(statement.equals(customer.getStatementASCII()));
    }
}