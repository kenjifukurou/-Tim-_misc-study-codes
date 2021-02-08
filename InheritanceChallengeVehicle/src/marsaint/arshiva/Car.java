package marsaint.arshiva;

public class Car extends Vehicle {

    private String bodyStyle;
    private int wheels;
    private int gears;
    private int currentGears;

    public Car(String name, String bodyStyle, int wheels, int gears, int currentGears) {
        super(name);
        this.bodyStyle = bodyStyle;
        this.wheels = wheels;
        this.gears = gears;
        this.currentGears = 1;
    }

    public void changeGear(int setGears) {
        this.currentGears = setGears;
        System.out.println("current gear is: " + currentGears);
    }

    public void changeVelocity(int velocity, int direction) {
        move(velocity, direction);
        System.out.println("velocity now is: " + velocity + ", direction: " + direction);
    }

    @Override
    public void stop() {
        super.stop();
        this.currentGears = 1;
    }
}
