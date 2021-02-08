package com.marsaint.arshiva;

import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();


    static Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };


    public Theatre(String theatreName, int numRow, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRow - 1);
        System.out.println(lastRow);

        for (char row = 'A'; row <= lastRow; row++) {
            System.out.println("row: " + row);
            for (int seatNum=1; seatNum <= seatsPerRow; seatNum++) {
//                System.out.println("seat number: " + seatNum);
//                String seat = row + " " + seatNum;

                //add price
                double price = 5;
                if ((row < 'C') && (seatNum >= 3 && seatNum <= 4)) {
                    price = 8;
                } else if (row > 'D') {
                    price = 3;
                }

                String seatString = row + (String.format("%02d", seatNum));
                Seat seat = new Seat(seatString, price);
                seats.add(seat);
                System.out.println(seatString + " , price: " + price);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0); //create new Seat use for search only

        System.out.println("searching...");
        int foundSeat = Collections.binarySearch(seats, requestedSeat);

        if (foundSeat >= 0) {
            System.out.println("seat found");
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("there is no seat: " + seatNumber);
            return false;
        }


//        System.out.println("reserve seat: ");
//        for (Seat seat : seats) {
//            System.out.println("searching...");
//            if (seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                System.out.println(seatNumber + " exist");
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println(seatNumber + " not available for select");
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public boolean cancelSeat(String seatNumber) {
        Seat seatToCancel = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                seatToCancel = seat;
                break;
            }
        }
        if (seatToCancel == null) {
            System.out.println(seatNumber + " not available for select");
            return false;
        }
        return seatToCancel.cancel();
    }

    public void printSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}
