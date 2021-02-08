package marsaint.arshiva;

public class Vehicle {

    private String name;
    private int currentVelocity;
    private int currentDirection;

    //constructor
    public Vehicle(String name) {
        this.name = name;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // methods
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("current direction is: " + currentDirection + " degree");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction; // add direction in move so vehicle stay in direction after steer
        System.out.println("moving in speed: " + currentVelocity + ", in direction: " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
        System.out.println("vehicle velocity is: 0");
    }

    //getters
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
}
