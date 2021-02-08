package com.marsaint.arshiva;

public class StaticCheck {

    private static int staticInt = 0;
    private String name;

    public StaticCheck() {
        this.name = "static check";
        this.staticInt++;
    }

    public String getName() {
        return name;
    }

    public static int getStaticInt() {
        return staticInt;
    }
}
