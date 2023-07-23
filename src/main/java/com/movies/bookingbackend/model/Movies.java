package com.movies.bookingbackend.model;
import java.util.*;
public class Movies {
    private String Movie_name;
    private Date date;
    private String location;
    private int Movie_duration;
    private double Movie_rating;
    public Movies(String Movie_name,Date date,String Location,int Movie_Duration,double Movie_rating ){
        this.Movie_name=Movie_name;
        this.date=date;
        this.location=location;
        this.Movie_duration=Movie_Duration;
        this.Movie_rating=Movie_rating;
    }
    public  String getMovie_name(){
        return Movie_name;
    }
    public void setMovie_name(String Movie_name){
        this.Movie_name=Movie_name;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String Location){
        this.location=location;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public int getMovie_duration(){
        return Movie_duration;
    }

    public void setMovie_duration(int movie_duration) {
        this.Movie_duration = movie_duration;
    }
    public double getMovie_rating(){
        return Movie_rating;
    }

    public void setMovie_rating(double movie_rating) {
        this.Movie_rating = movie_rating;
    }
    public static void main(String args[]){


    }
}

