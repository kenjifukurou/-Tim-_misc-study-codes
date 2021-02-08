package com.marsaint.arshiva;

public class SIB {

    static int[] arrayStore = new int[10];
    static {
        for (int i=0; i<arrayStore.length; i++) {
            int randomNumber = (int) (Math.random() * 100.0);
            System.out.println("random number is " + randomNumber);
            arrayStore[i] = randomNumber;
        }
    }


}
