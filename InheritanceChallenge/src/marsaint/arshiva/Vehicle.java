package marsaint.arshiva;

public class Vehicle {

    private String manufacturerName;
    private int steerLeft;
    private int steerRight;
    private int maxGear;

    public Vehicle(String manufacturerName, int steerLeft, int steerRight, int maxGear) {
        this.manufacturerName = manufacturerName;
        this.steerLeft = steerLeft;
        this.steerRight = steerRight;
        this.maxGear = maxGear;
    }

    public void move(int speed) {
        System.out.println("car is moving in speed: " + speed);
    }
}
