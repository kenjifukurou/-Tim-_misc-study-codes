package marsaint.arshiva;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // method to receive array as parameter, swap it's elements inside reverse
        int[] myArray = {100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(myArray));
        readArray(myArray);

        reverseArray(myArray);

        System.out.println(Arrays.toString(myArray));
        readArray(myArray);
    }

    public static void reverseArray(int[] array) {
        int step = array.length / 2;
        System.out.println(step);
        for (int i = 0; i < step; i++) {
            int temp;
            temp = array[i];
            array[i] = array[array.length - (i+1)]; // 10 - 1 = 9
            array[array.length - (i+1)] = temp;
            System.out.println("array " + i + " : " + array[i] + " is swap with " +
                    "array " + (array.length - i) + " : " + array[array.length - (i+1)]);
        }
    }

    public static void readArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array: " + i + " = " + array[i]);
        }
    }
}
