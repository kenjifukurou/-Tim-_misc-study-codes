package marsaint.arshiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Arshiva", "Knight", 9999, 99, 50);
        System.out.println(player.toString());
        System.out.println(player.getClass());

        saveTheGame(player);
        xTheGame(player);

        Monster monster = new Monster(99);
        saveTheGame(monster);

    }

    //read values method
    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("1 to enter String, 0 to quit");

        while (!quit) {
            System.out.println("choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("enter the String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput); // 1st loop add to index 0
                    index = index + 1; // index + 1 = 1, 2nd loop will add to index 1
                    break;
            }
        }
        return values;
    }

    public static void saveTheGame(ISaveGame objectToSave) {
        for (int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving: " + objectToSave.write().get(i) + " to storage");
        }
    }

    public static void xTheGame(Player playerToSave) {
        for (int i=0; i<playerToSave.write().size(); i++) {
            System.out.println(playerToSave.write().get(i));
        }
    }
}
