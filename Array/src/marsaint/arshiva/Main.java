package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // to read user input one by one, and store in array, call and read result
        int[] a_Numbers;

        a_Numbers = getScannerNumber(5);
        readIntArray(a_Numbers);

        System.out.println("average of total sum is:" + calcArrayAverage(a_Numbers));
    }

    public static int[] getScannerNumber(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            System.out.println("please enter your " + (i+1) + " number");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // read array
    public static void readIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array elements: " + i + ": " + array[i]);
        }
    }

    // average of int[] array
    public static int calcArrayAverage(int[] array) {
        int totalSum = 0;
        for (int i = 0; i < array.length; i ++) {
            totalSum += array[i];
            System.out.println("sum is:" + totalSum);
        }
        int averageTotalSum = totalSum / array.length;
        return averageTotalSum;
    }
}
