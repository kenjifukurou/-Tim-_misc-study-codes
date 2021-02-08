package marsaint.arshiva;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutralGear = new Gear(0, 0.0);
        this.gears.add(neutralGear);
    }




    public class Gear {

        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double drivingSpeed(int revs) {
            return revs * (this.ratio);
        }

    }

}
