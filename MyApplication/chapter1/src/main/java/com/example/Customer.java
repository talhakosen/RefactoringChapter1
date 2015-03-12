package com.example;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by tkosen on 12/03/2015.
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public String getName() {
        return _name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenderPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //determine amounts for each line

            //add frequent renter points
            frequentRenderPoints++;

            //add bonus for a two day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELASE && each.getDaysRented() > 1)
                frequentRenderPoints++;

            //show figure for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

            totalAmount += each.getCharge();
        }

        result += "Amount owned is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenderPoints) + " frequent render points";

        return result;
    }
}
