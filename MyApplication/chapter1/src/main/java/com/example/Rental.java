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
       return _movie.getFrequentRenderPoints(_daysRented);
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
