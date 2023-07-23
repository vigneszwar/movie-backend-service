package com.movies.bookingbackend.model;

public class Reservation
{
    private String customerName;
    private int totalTickets;
    private double price;
    private String timing;
    private int seatsAvailable;

    public Reservation(String customerName, int totalTickets, double price, String timing, int seatsAvailable)
    {
        this.customerName = customerName;
        this.totalTickets = totalTickets;
        this.price = price;
        this.timing = timing;
        this.seatsAvailable = seatsAvailable;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public int getTotalTickets()
    {
        return totalTickets;
    }
    public void setTotalTickets(int totalTickets)
    {
        this.totalTickets = totalTickets;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public String getTiming()
    {
        return timing;
    }
    public void setTiming(String timing)
    {
        this.timing = timing;
    }
    public int getSeatsAvailable()
    {
        return seatsAvailable;
    }
    public void setSeatsAvailable(int seatsAvailable)
    {
        this.seatsAvailable = seatsAvailable;
    }
    public void displayReservation()
    {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Tickets: " + totalTickets);
        System.out.println("Price per Ticket: $" + price);
        System.out.println("Timing: " + timing);
        System.out.println("Seats Available: " + seatsAvailable);
    }

    public static void main(String[] args)
    {
        Reservation reservation = new Reservation("John Doe", 3, 10.5, "10:00 AM", 50);
        reservation.displayReservation();
    }
}
