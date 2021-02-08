package marsaint.arshiva;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    void draw() {
        System.out.println("drawing rectangle");
        System.out.println("the area size is " + (this.width * this.length));
    }

}
