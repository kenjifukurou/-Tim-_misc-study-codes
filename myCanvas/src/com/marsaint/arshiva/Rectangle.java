package com.marsaint.arshiva;

public class Rectangle extends Shape {

    private int size;

    @Override
    public void draw() {
        System.out.println("drawing rectangle " + size);
    }
}
