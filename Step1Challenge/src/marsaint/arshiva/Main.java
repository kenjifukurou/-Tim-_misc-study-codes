package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double xValue = 20.0d;
        double yValue = 80.0d;
        double sumXY = (xValue + yValue) * 100.00d;
        System.out.println(sumXY);

        double remainderZ = sumXY % 40.0d;

        boolean isRemainderZero = (remainderZ == 0) ? true : false;
        if (isRemainderZero) {
            System.out.println("remainder of Z is Zero" + "remainder: " + remainderZ);
        } else {
            System.out.println("remainder of Z is not Zero, " + "remainder: " + remainderZ);
        }
    }
}
