package marsaint.arshiva;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //get scanner and classes
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryItems groceryItems = new GroceryItems();

    public static void main(String[] args) {

        printInstruction();

        boolean quit = false;
        while (!quit) {
            //get user input
            System.out.println("please enter your choice: ( 1 ~ 6 )");
            int choice = scanner.nextInt();
            scanner.nextLine(); // for cancelling \n

            // continue loop until user pick quit
            switch (choice) {
                case 1:
                    //add item
                    System.out.println("choice: add item");
                    addGroceryItem();
                    break;
                case 2:
                    //print item
                    System.out.println("choice: print item");
                    groceryItems.printAllItem();
                    break;
                case 3:
                    //modify item
                    System.out.println("choice: modify item");
                    modifyGroceryItemByName();
                    break;
                case 4:
                    //remove item
                    System.out.println("choice: remove item");
                    removeGroceryItemByName();
                    break;
                case 5:
                    //search item
                    System.out.println("choice: search item");
                    searchGroceryItem();
                    break;
                case 6:
                    //quit the program
                    System.out.println("choice: quit");
                    quit = true;
                    break;
                default:
                    //instruction
                    printInstruction();
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("enter your choice: \n" +
                "1 = add item \n" +
                "2 = print all items \n" +
                "3 = modify item \n" +
                "4 = remove item \n" +
                "5 = search item \n" +
                "6 = quit");
    }

    public static void addGroceryItem() {
        System.out.println("enter item name: ");
        String item = scanner.nextLine();
        groceryItems.addItem(item);
    }

    public static void modifyGroceryItem() {
        System.out.println("enter item position number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter name to change: ");
        String item = scanner.nextLine();
        groceryItems.modifyItem(index, item);
    }

    public static void modifyGroceryItemByName() {
        System.out.println("enter current item name:");
        String name = scanner.nextLine();
        System.out.println("enter new item name: ");
        String newName = scanner.nextLine();
        groceryItems.modifyItem(name, newName);
    }

    public static void removeGroceryItem() {
        System.out.println("enter item position number to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        groceryItems.removeItem(index);
    }

    public static void removeGroceryItemByName() {
        System.out.println("enter item name to delete: ");
        String name = scanner.nextLine();
        groceryItems.removeItem(name);
    }

    public static void searchGroceryItem() {
        System.out.println("enter item to search");
        String item = scanner.nextLine();
        if (groceryItems.searchItem(item) != null) {
            System.out.println("item available in grocery");
        } else {
            System.out.println("not available in grocery");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryItems.getGroceryItems());
    }
}
