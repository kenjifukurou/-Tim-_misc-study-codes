package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        // vehicle base class, extends various Car class
        // extend further from Car class for Special Car class
        // can hand steering, change gear, moving
        // decide where to put state and behaviour (field and method)
        // can change speed
        // add something special to Special Car

        Car car = new Car("Tesla", 6, "V", 2, 300);
        car.stop();
        car.slow();
        car.fast();

        FlyingCar flyingCar = new FlyingCar("Tesla", 6, "X", 200, "Drone", 2, false);
        flyingCar.setFly(true);
    }
}
