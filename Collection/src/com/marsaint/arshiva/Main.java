package com.marsaint.arshiva;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int intStoreCharA = 'A';
//        int intStoreCharB = 'B';
//        int intStoreCharC = 'C';
//        int intStoreCharD = 'D';
//
        System.out.println(intStoreCharA);
//        System.out.println(intStoreCharB);
//        System.out.println(intStoreCharC);
//        System.out.println(intStoreCharD);

        int number = 65;
        System.out.println("convert int to " + (char)number);

        Theatre theatre = new Theatre("Golden Screen", 6, 6);

        System.out.println("==============================");

        theatre.printSeats();

        System.out.println("==============================");

        theatre.reserveSeat("B20");

        System.out.println("==============================");

        theatre.reserveSeat("A02");
        theatre.reserveSeat("A01");

        System.out.println("==============================");

        theatre.reserveSeat("A01");

        System.out.println("==============================");

        theatre.cancelSeat("A01");

        System.out.println("==============================");

        List<Seat> reversedSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reversedSeats);
        printList(reversedSeats);

        System.out.println("==============================");

        List<Seat> pricedSeats = new ArrayList<>(theatre.getSeats());
        pricedSeats.add(new Seat("A99", 99));
        pricedSeats.add(new Seat("B99", 90));
        Collections.sort(pricedSeats, Theatre.PRICE_ORDER);
        printList(pricedSeats);



        //binary search in java
//        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int num : numList) {
//            System.out.println(num);
//        }

//        searchArray(numList, 10);
//        Collection<Seat> theatreSeatList = theatre.getSeats();
//        printList(theatreSeatList);

        //making seats shallow copy:
//        List<Seat> theatreSeatCopy = new ArrayList<>(theatre.getSeats());
//        System.out.println("below is theatre copy list");
//        printList(theatreSeatCopy);

//        System.out.println("==============================");

//        System.out.println(theatre.getSeats().get(7).reserve());
//        System.out.println(theatre.getSeats().get(1).getSeatNumber());

//        Collections.reverse(theatreSeatCopy);
//        System.out.println("below is reversed theatre seats list");
//        printList(theatreSeatCopy);
//
//        Collections.shuffle(theatreSeatCopy);
//        System.out.println("below is shuffled theatre seats list");
//        printList(theatreSeatCopy);

//        System.out.println("==============================");
//        System.out.println("searching min and max");
//        Seat minSeat = Collections.min(theatreSeatCopy);
//        Seat maxSeat = Collections.max(theatreSeatCopy);
//        System.out.println("min and max seat are: " + minSeat.getSeatNumber() + " + " + maxSeat.getSeatNumber());

//        System.out.println("==============================");

//        System.out.println("swap example");
//
//        List<String> vector = new ArrayList<>();
//        vector.add("A");
//        vector.add("B");
//        vector.add("C");
//        vector.add("D");
//        vector.add("E");

//        System.out.println(vector);

//        Collections.swap(vector, 1, 4);

//        System.out.println(vector);

//        System.out.println("==============================");
//
//        System.out.println("swap tim buchalka's ass");

//        printList(theatreSeatCopy);
//        sortListWildcard(theatreSeatCopy);
//        System.out.println("sorted");
//        printList(theatreSeatCopy);

//        System.out.println("==============================");
//
//        System.out.println("comparable vs comparator");


    }

    public static void printList(List<Seat> seatList) {
        for (Seat seat : seatList) {
            System.out.println("printList(): " + seat.getSeatNumber() + " , " + seat.getPrice());
        }

    }

    public static void sortListWildcard(List<? extends Seat> list) {
        for (int i=0; i<list.size(); i++) {
//            System.out.println(list);
            for (int j=i+1; j<list.size(); j++) {
//                System.out.println("list: j list: ");
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }

//    public static boolean searchArray(int[] array, int toSearch) {
//        int length = array.length;
//        int low = 0;
//        int high = length;
//        while(low <= high) {
//            int mid = (low + high) / 2;
//            System.out.println("mid is: " + mid);
//            //(0 + 10) / 2 = 5
//            //(6+10) / 2 = 8
//            //(0+4) / 2 = 2
//            System.out.println("searching...");
//            int current = array[mid]; //array[5]
//            System.out.println("current number is: " + current);
//            if (current == toSearch) {
//                System.out.println("found");
//                return true;
//
//            //if not found, continue divide
//            } else if (current < toSearch) {
//                low = mid + 1; //low = 5+1
//            } else {
//                high = mid - 1; //high = 5-1
//            }
//        }
//        return false;
//    }
}
