public class feetInchesToCentimeters {

    public static double calcFeetInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || (inches < 0) && (inches >= 12)) {
            System.out.println("value must be positive number and inches must less than 12");
            return -1;
        }
        double centimeters = feet * 30.48;
        centimeters += inches * 2.54;
        System.out.println("centimeters: " + centimeters);
        return centimeters;
    }

    public static double calcFeetInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        //enter as many inches but use previous method to convert it into cm
        //which means, as many inches need convert into feet and >=12inches first

        //calcFeetInchesToCentimeters(double feet, double inches)
        double inchesToFeet = (int) inches / 12;
        double inchesRemainder = (int) inches % 12;
        System.out.println("feet: " + inchesToFeet + " inches remainder: " + inchesRemainder);

        //and finally, reuse previous method to do the calculation
        return calcFeetInchesToCentimeters(inchesToFeet, inchesRemainder);
    }
}
