package com.example;

/**
 * Created by tkosen  on 12/03/2015.
 */
abstract  class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);

    public int getFrequentRenderPoints(int dayRented) {
        return  dayRented > 1 ? 2: 1;
    }
}
