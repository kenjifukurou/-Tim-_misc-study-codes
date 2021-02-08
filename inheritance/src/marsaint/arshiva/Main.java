package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 100, 20, 100, 100);
        System.out.println(animal.getIQ());

        Dog dog = new Dog("Lemon", 120, 150, 2, 4, 0, 20, "Charge");
        System.out.println(dog.getTeeth());
        System.out.println(dog.getSize());

        dog.eat();
        dog.walk();
        dog.run();
        dog.bite();

        System.out.println("---------");

        Fish fish = new Fish("Golden", 20, 10, 6, 2, 6);
        fish.rest();
        fish.swim(2);
    }
}
