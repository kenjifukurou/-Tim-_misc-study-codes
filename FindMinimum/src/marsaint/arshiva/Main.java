package marsaint.arshiva;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // find minimum:
        // scanner for user enter array of numbers (method)
        // sort the array (method)
        // find and print minimum number (method)

        int[] myArray = getNumbers(5);

//        sortArray(myArray);
//        findArrayMinimum(myArray);
//        System.out.println(Arrays.toString(myArray));
        System.out.println("the final minimum number is " + findMin(myArray));
    }

    public static int[] getNumbers(int arraySize) {
        int[] array = new int[arraySize];
        System.out.println("enter you numbers");
        for (int i = 0; i < array.length; i++) {
            int x = scanner.nextInt();
            array[i] = x;
            System.out.println("array index " + i + " is " + array[i]);
        }
        return array;
    }

    public static void sortArray(int[] array) {
        // from low to high
        boolean check = true;
        while (check) {
            check = false;
            int x;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    System.out.println(array[i] + " >> " + array[i+1]);
                    x = array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                    check = true;
                } else {
                    System.out.println(array[i] + " is lower than " + array[i+1] + " , swapping cancel");
                }
            }
        }
    }

    public static void findArrayMinimum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("the smallest number in this array is: " + array[0]);
    }

    public static int findMin(int[] array) {
        int mv = Integer.MAX_VALUE; // all possible int number
        for (int i = 0; i < array.length; i++) {
            int arrayValue = array[i];
            if (arrayValue < mv) {
                mv = arrayValue;
                System.out.println("current min value is: " + mv);
            }
        }
        return mv;
    }
}
