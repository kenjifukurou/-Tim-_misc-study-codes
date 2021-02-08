package com.marsaint.arshiva;

public class Seat implements Comparable<Seat> {

    private final String seatNumber;
    private boolean reserved = false;
    private double price;

    public Seat(String seatString, double price) {
        this.seatNumber = seatString;
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Seat seat) {
//        System.out.println("implements comparable");
        int comparedResult = this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
//        System.out.println(this.seatNumber);
//        System.out.println(seat.getSeatNumber());
//        System.out.println("compareTo found: " + comparedResult);
        return comparedResult;
    }

    public boolean reserve() {
        if (reserved == false) {
            reserved = true;
            System.out.println("payment: " + price);
            System.out.println("seat " + seatNumber + " has booked, thank you");
            return true;
        } else {
            System.out.println("seat already reserved by other, please select another seat");
            return false;
        }
    }

    public boolean cancel() {
        if (reserved == true) {
            reserved = false;
            System.out.println("booking " + this.seatNumber + " has cancelled");
            return true;
        }  else {
            System.out.println(this.seatNumber + " is available, error cancellation");
            return false;
        }
    }


}
