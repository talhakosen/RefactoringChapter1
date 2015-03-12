package com.example;

/**
 * Created by tkosen on 12/03/2015.
 */
public class Movie {
    public static final int CHILDRENS =2;
    public static final int REGULAR =0;
    public static final int NEW_RELASE =1;

    private String _title;
    private int _priceCode;
    private Price price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        setPriceCode(_priceCode);
    }


    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenderPoints(int dayRented) {
        if (getPriceCode() == Movie.NEW_RELASE && dayRented > 1)
            return 2;
        else
            return  1;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int _priceCode) {
        switch (_priceCode){
            case  REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELASE:
                price = new NewReleasePrice();
                break;
            case CHILDRENS:
                price=new ChildrensPrice();
                break;
        }
    }
}
