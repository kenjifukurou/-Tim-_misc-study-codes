package marsaint.arshiva;

public class Animal {
    private String name;
    private int IQ;
    private int str;
    private double size;
    private double weight;

    public Animal(String name, int IQ, int str, double size, double weight) {
        this.name = name;
        this.IQ = IQ;
        this.str = str;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("animal eating");
    }

    public void move(int speed) {
        System.out.println("animal moving speed: " + speed);
    }

    public void attack(int damage) {
        double baseDamageOutput = damage * str;
        System.out.println("animal base damage output is: " + baseDamageOutput);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
