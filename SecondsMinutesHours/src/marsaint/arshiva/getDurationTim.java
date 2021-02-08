package marsaint.arshiva;

public class getDurationTim {

    public static String getDuration(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }

    public static String getDuration(long seconds) {
        if (seconds < 0) {
            return "invalid value";
        }
        long secondsToMinutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDuration(secondsToMinutes, remainingSeconds);
    }
}
