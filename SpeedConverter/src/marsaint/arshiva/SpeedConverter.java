package marsaint.arshiva;

public class SpeedConverter {
    public static long kilometersToMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour * 0.621371);
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid value, please enter positive number");
        } else {
            long milesPerHour = kilometersToMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h = " + milesPerHour + "mile/h");
        }
    }
}
