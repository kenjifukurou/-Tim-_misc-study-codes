package marsaint.arshiva;

class Calculator {

    public static void sum(double x, double y) {
        System.out.println("sum result: " + (x + y));
    }
}

public class Main {

    public static void main(String[] args) {
        Calculator.sum(99, 25);
    }
}
