package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        checkMinMaxNumbers();
    }

    public static void checkMinMaxNumbers() {
        // read numbers entered by users, check how big is the number,
        // and find out which one is max and min

        Scanner scanner = new Scanner(System.in);

        int min = 2147483640; //600
        int max = -2147483640; //500
        int count = 1;

        while (count <= 10) {
            System.out.println("please enter number: " + count);

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                System.out.println("number is: " + number);

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                System.out.println("max number is " + max);
                System.out.println("min number is " + min);
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine(); // fix \n bug

            System.out.println("the highest number is " + max);
            System.out.println("the lowest number is " + min);
            count++;
        }
    }
}
