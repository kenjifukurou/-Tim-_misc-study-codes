package marsaint.arshiva;

public class LandCruiser extends Car {

    private int petrol;

    public LandCruiser(int petrol) {
        super("Land Cruiser", "4WD", 4, 6, 1);
        this.petrol = petrol;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        //set gears
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 20) {
            changeGear(1);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(3);
        } else if (newVelocity > 40) {
            changeGear(4);
        } else if (newVelocity < 0) {
            changeGear(6);
        }
        //set velocity change
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
