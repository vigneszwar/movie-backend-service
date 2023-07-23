package com.movies.bookingbackend.model;

public class Theater {
    private String city;
    private double rating;

    public Theater(String city, double rating) {
        this.city = city;
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void displayTheater() {
        System.out.println("City: " + city);
        System.out.println("Rating: " + rating);
    }
}