package marsaint.arshiva;

public class Fish extends Animal {

    //extend from Animal, add some unique attributes and methods
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, double size, double weight, int gills, int eyes, int fins) {
        super(name, 60, 10, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    //Fish actions
    public void moveFin(int animSpeed) {
        //animation
        System.out.println("fish move fin animation in speed: " + animSpeed);
    }

    public void moveMuscle(int animSpeed) {
        //animation
        System.out.println("fish move muscle animation in speed: " + animSpeed);
    }

    public void rest() {
        moveFin(0);
        moveMuscle(0);
        System.out.println("fish has stopped");
    }

    public void swim(int speed) {
        moveFin(speed);
        moveMuscle(speed);
        super.move(speed);
        System.out.println("fish is swimming in speed: " + speed);
    }
}
