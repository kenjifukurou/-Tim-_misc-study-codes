package com.marsaint.arshiva;

import marsaint.arshiva.packagesExample.Series;

public class Main {

    public static void main(String[] args) {

        for (int i=0; i<=10; i++) {
            long value = Series.nSum(i);
            System.out.println(value);
        }

        for (int i=0; i<=10; i++) {
            System.out.println(Series.factorials(i));
        }

        for (int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }

    }
}
