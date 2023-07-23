package com.movies.bookingbackend.model;

public class User {
    private String amount;

    /**
     * @return String return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount;
    }

}
