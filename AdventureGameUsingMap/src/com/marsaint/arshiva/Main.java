package com.marsaint.arshiva;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> lanjiaoGame = new HashMap <Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Location location = new Location(123, "xyz map");
//        location.addExit("west", 3);
//        location.addExit("north", 0);
//        location.addExit("south", 2);
//
//        System.out.println(location.getExits());

        System.out.println("=================================");

        lanjiaoGame.put(0, new Location(0, "you are at lobby"));
        lanjiaoGame.put(1, new Location(1, "at room 1. 4 exit available"));
        lanjiaoGame.put(2, new Location(2, "...room 2"));
        lanjiaoGame.put(3, new Location(3, "...room 3"));
        lanjiaoGame.put(4, new Location(4, "...room 4"));
        lanjiaoGame.put(5, new Location(5, "...room 5"));

        System.out.println(lanjiaoGame.get(1).getExits());


        System.out.println("=================================");
        System.out.println("creating exits...");

        Map<String, Integer> tempExit = new HashMap<String, Integer>();

        tempExit.put("E", 3);

        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("W", 2);
        tempExit.put("N", 5);
        tempExit.put("Quit", 0);

        tempExit.put("N", 5);
        tempExit.put("S", 4);
        tempExit.put("Quit", 0);

        tempExit.put("W", 1);
        tempExit.put("Quit", 0);

        tempExit.put("N", 1);
        tempExit.put("W", 2);
        tempExit.put("Quit", 0);

        tempExit.put("S", 1);
        tempExit.put("W", 2);
        tempExit.put("Quit", 0);

        System.out.println("=================================");

        System.out.println("building vocabulary to check words...");
        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");


        int currentLoc = 1;
        while (true) {
            System.out.println(lanjiaoGame.get(currentLoc).getDescription());
            if (currentLoc == 0) {
                System.out.println("exit game, break the loop");
                break;
            }

            //check room exit
            Map<String, Integer> lanjiaoGameExits = lanjiaoGame.get(currentLoc).getExits();

            System.out.println("available exits in this room are: ");
            for (String exit : lanjiaoGameExits.keySet()) {
                System.out.println(exit);
            }

            //enter first entry
            System.out.println("enter room you wish to enter");

            String direction = scanner.next().toUpperCase(); //convert text to uppercase

            if (direction.length() > 1) {
                String[] splitWords = direction.split(" ");
                for (String word : splitWords) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (lanjiaoGameExits.containsKey(direction)) { //if input was correct
                currentLoc = lanjiaoGameExits.get(direction); //go to "direction" room
            } else if (!lanjiaoGameExits.containsKey(direction)) {
                System.out.println("room not exist");
            }

            //game repeat
//            System.out.println("enter location you wish to go:");
//            currentLoc = scanner.nextInt();
//            if (!lanjiaoGame.containsKey(currentLoc)) {
//                System.out.println("location not exist");
////                break;
//            }
        }

    }

}
