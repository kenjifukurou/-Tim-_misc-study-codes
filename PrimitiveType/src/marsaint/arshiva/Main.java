package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        int valueX = 10000;
        int minValueY = Integer.MIN_VALUE;
        int maxValueY = Integer.MAX_VALUE;
        System.out.println("min value of int is: " + minValueY);
        System.out.println("max value of int is: " + maxValueY);

        Short minShort = Short.MIN_VALUE;
        Short maxShort = Short.MAX_VALUE;
        System.out.println("min Short value = " + minShort);
        System.out.println("max Short value = " + maxShort);

        //casting
        int intOutput = (maxValueY / 2);
        System.out.println(intOutput);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minByte);
        System.out.println(maxByte);
        byte halfByte = (byte) (maxByte / 2);
        System.out.println(halfByte);
    }
}
