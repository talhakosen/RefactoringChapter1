package com.example;

/**
 * Created by tkosen on 12/03/2015.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public int getFrequentRenderPoints() {
        if (getMovie().getPriceCode() == Movie.NEW_RELASE && getDaysRented() > 1)
            return 2;
        else
            return  1;
    }


    public double getCharge(){
        return _movie.getCharge(_daysRented);
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
}
