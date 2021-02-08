package marsaint.arshiva;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int wings;
    private int teeth;
    private String ability;

    public Dog(String name, int IQ, int str, double size, double weight) {
        super(name, IQ, str, size, weight);
    }

    public Dog(String name, double size, double weight, int eyes, int legs, int wings, int teeth, String ability) {
        super(name, 80, 20, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.wings = wings;
        this.teeth = teeth;
        this.ability = ability;
    }

    private void chew() {
        System.out.println("dog chew");
    }

    @Override
    public void eat() {
        System.out.println("dog eating");
        super.eat();
        chew();
    }

    public void walk() {
        move(5);
        System.out.println("dog is walking");
    }

    public void run() {
        move(10);
        System.out.println("dog is running");
    }

    public void bite() {
        attack(teeth);
    }



    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getWings() {
        return wings;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getAbility() {
        return ability;
    }
}
