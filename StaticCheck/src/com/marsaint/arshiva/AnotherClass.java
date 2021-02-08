package com.marsaint.arshiva;

public class AnotherClass {

    private static int staticInt = 0;
    private String name;

    public AnotherClass() {
        this.name = "AnotherClass";
        this.staticInt++;
    }

    public static int getStaticInt() {
        return staticInt;
    }
}
