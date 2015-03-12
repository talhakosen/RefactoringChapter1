package com.example;

/**
 * Created by tkosen on 12/03/2015.
 */
public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELASE;
    }

    public double getCharge(int daysRented) {
        return  daysRented * 3;
    }

    public int getFrequentRenderPoints(int dayRented) {
       return  dayRented > 1 ? 2: 1;
    }
}

