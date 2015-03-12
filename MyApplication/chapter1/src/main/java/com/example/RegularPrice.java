package com.example;

/**
 * Created by tkosen on 12/03/2015.
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented) {
        double result = 0.0;
        result += 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return  result;
    }
}
