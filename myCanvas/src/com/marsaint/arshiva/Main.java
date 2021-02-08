package com.marsaint.arshiva;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        myCanvas canvas = new myCanvas();
        Shape r = new Rectangle();
        Shape c = new Circle();
        System.out.println("drawing...");
        canvas.draw(r);
        canvas.draw(c);

        System.out.println("========================");

        List<Shape> allShapes = new ArrayList<>();
        allShapes.add(r);
        allShapes.add(c);

        drawAll(allShapes);

        System.out.println("========================");

        List<Circle> circleShapes = new ArrayList<>();
        List<Rectangle> rectShapes = new ArrayList<>();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circleShapes.add(circle);
        rectShapes.add(rectangle);

        System.out.println("draw: circle shape");
        drawAnyShape(circleShapes);
        System.out.println("draw: rectangle shape");
        drawAnyShape(rectShapes);

        System.out.println("========================");

        drawAnyShape(allShapes);

    }

    public static void drawAll(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
        Rectangle rectangle = new Rectangle();
        shapes.add(rectangle);
        System.out.println("drawing rect in drawAll");
        shapes.get(0).draw();

    }

    public static void drawAnyShape(List<? extends Shape> anyShape) {
        for (Shape shape : anyShape) {
            shape.draw();
        }
        Rectangle rectangleAny = new Rectangle();
        anyShape.add(rectangleAny);
        System.out.println("drawing rect in drawAll");
        anyShape.get(0).draw();

    }
}
