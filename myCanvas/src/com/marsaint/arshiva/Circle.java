package com.marsaint.arshiva;

public class Circle extends Shape {

    private int size;

    @Override
    public void draw() {
        System.out.println("drawing circle " + size);
    }
}
