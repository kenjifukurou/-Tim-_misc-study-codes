package marsaint.arshiva;

import java.util.ArrayList;

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGearNumber = 0;
    private boolean clutchIn;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;

        //create array slots for gears, then add neutral gear to it
        this.gears = new ArrayList<Gear>();
        Gear neutralGear = new Gear(0, 0.0);
        gears.add(neutralGear);

        //auto create gears for gearbox base on maxGear entered:
        double gearRatioPerLevel = 3.166;
        for (int i=0; i<maxGear; i++) {
            //add gear (use method)
            addGear(i, i * gearRatioPerLevel);
        }
    }

    public void changeClutch(boolean inOrOut) {
        this.clutchIn = inOrOut;
    }

    private void addGear(int gearNumber, double gearRatio) {
        if ((gearNumber >= 0) && (gearNumber <= maxGear)) {
            gears.add(new Gear(gearNumber, gearRatio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear <= maxGear) && (clutchIn)) {
            currentGearNumber = newGear;
            System.out.println("gear changed to: " + newGear);
        } else {
            System.out.println("grrrind!!!");
        }
    }

    public double wheelSpeed(double accelerateAmount) {
        if ((accelerateAmount > 0) && (accelerateAmount <=10) && (!clutchIn)) {
            double wheelSpinSpeed = gears.get(currentGearNumber).getGearRatio() * 3000 * accelerateAmount;
            return wheelSpinSpeed;
        }
        System.out.println("Scream!!!");
        return 0.0;
    }


    private class Gear {

        private int gearNumber;
        private double gearRatio;

        public Gear(int gearNumber, double gearRatio) {
            this.gearNumber = gearNumber;
            this.gearRatio = gearRatio;
        }

        public double getGearRatio() {
            return gearRatio;
        }

        public double driveSpeed(int revs) {
            return gearRatio * revs;
        }

    }
}
