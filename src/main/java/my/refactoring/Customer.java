package my.refactoring;

import my.refactoring.rental.MovieRental;

import java.util.ArrayList;
import java.util.List;

class Customer {

    private String name;
    private List<MovieRental> movieRentals = new ArrayList<MovieRental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addMovieRental(MovieRental arg) {
        movieRentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public Double getTotalAmount() {
        Double result = Double.valueOf(0);
        for (MovieRental rental : movieRentals) {
            result += rental.getCharge();
        }
        return result;
    }

    public Integer getFrequentRenterPoints() {
        Integer result = Integer.valueOf(0);
        for (MovieRental rental : movieRentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    public String getStatementASCII() {
        String result = "MovieRental Record for " + getName() + "\n";
        for (MovieRental rental : movieRentals) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
        }
        //add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";
        return result;
    }
}