package marsaint.arshiva;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("enter your input: ");
        getInput();
        printArray(baseData);

        resizeArray();
        printArray(baseData);
    }

    public static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void resizeArray() {
        int[] originalData = baseData;
        baseData = new int[12];
        for (int i=0; i<originalData.length; i++) {
            baseData[i] = originalData[i];
        }
    }
}
