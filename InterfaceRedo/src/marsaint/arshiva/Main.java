package marsaint.arshiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ISaveableCharacter playerX = new Player("Kenji", 90, 15);
        String playerXStats = ((Player)playerX).toString();
        System.out.println(playerXStats);

        Player player = new Player("Arshiva", 100, 10);
        loadStats(player);
        System.out.println(player.toString());

        saveStats(player);
        loadStats(player);

        player.setHealthPoint(200);
        player.setStrength(20);
        player.setWeapon("Mana Sword");
        System.out.println(player.toString());

//        saveStats(player);
        loadStats(player);
        System.out.println(player.toString());

        changeValues(player);
        System.out.println(player.toString());

    }

    public static ArrayList<String> readValuesFromInputs() {

        ArrayList<String> inputs = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean quit = false;

        while (!quit) {
            System.out.println("0 = instruction, \n" +
                    "1 = enter character changes (String) \n" +
                    "2 = quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("0 = instruction, \n" +
                            "1 = enter character changes (String) \n" +
                            "2 = quit");
                    break;
                case 1:
                    System.out.println("enter number to edit the character, \n" +
                            "1 = name, \n2 = health point, \n3 = strength, \n4 = weapon");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("enter string to edit index: " + index);
                    String edit = scanner.nextLine();
                    inputs.add(index-1, edit);
                    break;
                case 2:
                    System.out.println("quit editing now");
                    quit = true;
                    break;
            }
        }
        return inputs;
    }

    // method to pass character to save, through interface
    private static void saveStats(ISaveableCharacter characterToSave) {

        List<String> saved = characterToSave.write();
        System.out.println(saved + " values has saved");
        for (int i=0; i<saved.size(); i++) {
            System.out.println(saved.get(i) + " saved");
        }
    }

    private static void loadStats(ISaveableCharacter characterToLoad) {
        characterToLoad.read();
    }

    private static void changeValues(ISaveableCharacter characterToChange) {
        ArrayList<String> changes = readValuesFromInputs();
        characterToChange.modify(changes);
    }
}
