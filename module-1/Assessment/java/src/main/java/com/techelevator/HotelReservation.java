package com.techelevator;

public class HotelReservation {
    public String name;
    public int numberOfNights;


    public HotelReservation(String name, int numberOfNights) {
        this.name = name;
        this.numberOfNights = numberOfNights;


    }

    public double getEstimatedTotal() {
        return 59.99 * numberOfNights;
    }


    public double actualTotal(boolean requireCleaning, boolean usedMiniBar) {
        double subTotal = getEstimatedTotal();

        if (requireCleaning && usedMiniBar) {
            return subTotal + (34.99 * 2) + 12.99;
        } else if (requireCleaning) {
            return subTotal + 34.99;
        } else if (usedMiniBar) {
            return subTotal + 12.99;
        } else {
            return subTotal;
        }



    }
    @Override
    public String toString() {

        return ("RESERVATION - " + getName() + " - "+ getEstimatedTotal());

    }

    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }











}

