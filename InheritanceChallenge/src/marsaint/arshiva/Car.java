package marsaint.arshiva;

public class Car extends Vehicle {

    private String modelName;
    private int doors;
    private double maxSpeed;

    public Car(String manufacturerName, int maxGear, String modelName, int doors, double maxSpeed) {
        super(manufacturerName, 1, 1, maxGear);
        this.modelName = modelName;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
    }

    public void stop() {
        move(0);
        System.out.println("Car has stopped");
    }

    public void fast() {
        move(20);
        System.out.println("Car is moving fast");
    }

    public void slow() {
        move(5);
        System.out.println("Car is moving slow");
    }
}
