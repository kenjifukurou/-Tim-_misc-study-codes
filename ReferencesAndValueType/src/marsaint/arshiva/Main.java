package marsaint.arshiva;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[5];
        int[] intArrayDuplicate = intArray;

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArrayDuplicate));

        int[] intArrayCopy = new int[5];
        intArrayCopy = Arrays.copyOf(intArray, 5);

        intArray[0] = 5;
        intArrayCopy[0] = 10;
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArrayCopy));
    }
}
