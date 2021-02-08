package marsaint.arshiva;

public class getDurationMine {

    public static String getDuration(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "invalid value";
        }
        // if minutes more than 60, make it hour
        int hours;
        if (minutes >= 60) {
            hours = minutes / 60;
            System.out.println("hours: " + hours);
        } else {
            hours = 0;
        }

        //remaining minutes after calculate hour
        int outputMinutes;
        int remainingMinutes;
        if (minutes >= 60) {
            remainingMinutes = minutes % 60;
            System.out.println("remaining minutes: " + remainingMinutes);
            outputMinutes = remainingMinutes;
        } else {
            outputMinutes = minutes;
        }

        String duration = hours + "h " + outputMinutes + "m " + seconds + "s";
        System.out.println(duration);
        return duration;
    }
}
