package com.example;

/**
 * Created by tkosen on 12/03/2015.
 */
public class ChildrensPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double result = 0.0;
        result += 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;

        return  result;
    }
}
