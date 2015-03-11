package com.example;

public class Main {

    public Main() {
    }

    public static void main(final String[] args)
    {
        Customer customer = new Customer("Talha Kosen");
        Movie movieHulk = new Movie("Hulk", Movie.CHILDRENS);
        Movie movieBatman = new Movie("Batman", Movie.REGULAR);
        Movie movieInception = new Movie("Inception", Movie.NEW_RELASE);

        Rental rental1 = new Rental(movieHulk, 3);
        Rental rental2 = new Rental(movieInception, 3);
        Rental rental3 = new Rental(movieBatman, 3);

        customer.addRental(rental3);
        customer.addRental(rental1);
        customer.addRental(rental2);


        System.out.println(customer.statement());
    }
}
