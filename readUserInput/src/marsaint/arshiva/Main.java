package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();
        int birthYear = 0;
        if (hasNextInt) {
            birthYear = scanner.nextInt(); //input DOB
            scanner.nextLine();
        } else {
            System.out.println("invalid year of birth");
        }

        System.out.println("enter your name: ");
        String name = scanner.nextLine(); // input name

        //calculate age
        int age = 2020 - birthYear;

        if (age >0 && age <=120) {
            System.out.println("your name is: " + name + ", you are " + age + " years old");
        } else {
            System.out.println("invalid birth year");
        }

        //close scanner
        scanner.close();
    }
}
