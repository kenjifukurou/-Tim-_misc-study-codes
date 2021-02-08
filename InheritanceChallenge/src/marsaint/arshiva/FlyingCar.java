package marsaint.arshiva;

public class FlyingCar extends Car {

    private String specialName;
    private int wings;
    private boolean isFlying;

    public FlyingCar(String manufacturerName, int maxGear, String modelName, double maxSpeed, String specialName, int wings, boolean isFlying) {
        super(manufacturerName, maxGear, modelName, 2, maxSpeed);
        this.specialName = specialName;
        this.wings = wings;
        this.isFlying = isFlying;
    }

    public void setFly(boolean isFlying) {
        this.isFlying = isFlying;
        System.out.println("flying car flying is: " + isFlying);
    }
}
