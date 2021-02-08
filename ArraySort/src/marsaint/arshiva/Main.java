package marsaint.arshiva;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbersArray = getScannerNumbers(5);
        printArrayElements(numbersArray);

        int[] sortedArray = sortNumbers(numbersArray);
        printArrayElements(sortedArray);

    }

    public static int[] sortNumbers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        //sort numbers
        boolean checkAgain = true;
        while (checkAgain) {
            checkAgain = false;
            int temp;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    System.out.println("sorting " + sortedArray[i] + " ->> " + sortedArray[i+1]);
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    checkAgain = true;
                } else {
                    System.out.println("the number " + sortedArray[i] + " is > than " + sortedArray[i+1]);
                }
            }
            System.out.println("finished first round sorting");
        }
        return sortedArray;
    }

    public static int[] getScannerNumbers(int arraySize) {
        int[] array = new int[arraySize];
        System.out.println("enter your numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("array number " + i + " is: " + array[i]);
        }
        return array;
    }

    public static void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
}
