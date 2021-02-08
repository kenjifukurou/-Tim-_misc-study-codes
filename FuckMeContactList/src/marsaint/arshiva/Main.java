package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Mobile mobilePhone = new Mobile("011-37663499");

    public static void main(String[] args) {

        startPhoneSimulation();
        printActionList();

        boolean quit = false;
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActionList();
                    break;
                default:
                    printActionList();
                    break;
            }
            if (action != 0) {
                System.out.println("pick your action: ");
            } else {
                System.out.println("bye bye");
            }
        }
    }

    public static void startPhoneSimulation() {
        System.out.println("phone starting...");
    }

    public static void printActionList() {
        System.out.println("Available actions: \n" +
                "0 = shut down \n" +
                "1 = print contact \n" +
                "2 = add contact \n" +
                "3 = update contact \n" +
                "4 = remove contact \n" +
                "5 = query contact \n" +
                "6 = view instruction \n");
    }

    public static void printContact() {
        if (mobilePhone.printContact()) {
            System.out.println(" --- end of contact list ---");
        }
    }

    public static void addContact() {
        System.out.println("add contact name: ");
        String name = scanner.nextLine();
        System.out.println("add contact phone: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addContact(newContact)) {
            System.out.println(newContact.getName() + " has added to contact list");
        } else {
            System.out.println("action cancelled");
        }
    }

    public static void updateContact() {
        System.out.println("enter name to modify: ");
        String oldName = scanner.nextLine();
        // check if the name exist
        Contact oldContact = mobilePhone.queryContactByName(oldName);
        if (oldContact == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("enter new name to update: ");
        String name = scanner.nextLine();
        System.out.println("enter new phone to update: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        mobilePhone.updateContact(oldContact, newContact);
    }

    public static void removeContact() {
        System.out.println("enter name to remove: ");
        String name = scanner.nextLine();
        // check if exist
        Contact existedContact = mobilePhone.queryContactByName(name);
        if (existedContact == null) {
            System.out.println("contact not found");
            return;
        }
        if (mobilePhone.removeContact(existedContact)) {
            System.out.println("successfully deleted from contact list");
        } else {
            System.out.println("error deleting contact");
        }
    }

    public static void queryContact() {
        System.out.println("enter name to query: ");
        String name = scanner.nextLine();
        mobilePhone.queryContactByName(name);
    }
}
