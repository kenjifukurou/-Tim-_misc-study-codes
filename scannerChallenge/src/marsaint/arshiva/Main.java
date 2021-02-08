package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //user can enter 10 numbers, into scanner
        //check if the user entered is int, print err message if entered is not int
        //use nextInt() to get input, before user input, print: "enter number #1:, #2..."
        //use while loop

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sumTotal = 0;

        while(count <= 10) {
            //System.out.println(count);

            System.out.println("please enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int sumNumber = scanner.nextInt();
                System.out.println("number #" + count + " is " + sumNumber);
                sumTotal += sumNumber;
                System.out.println("sum until number #" + count + " is " + sumTotal);
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();

            count++;
        }

        System.out.println("total sum is: " + sumTotal);
    }
}
