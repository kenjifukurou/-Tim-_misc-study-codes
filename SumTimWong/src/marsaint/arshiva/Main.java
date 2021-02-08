package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {


        int countFound = 0;
        int sumResult = 0;

        for (int i=0; i<=1000; i++) {
            // if can be divide by 3 or 5, add the number into count, and sum them up
            if (i % 3 == 0 && i % 5 == 0) {
                countFound++;
                System.out.println("found number: " + i);
                System.out.println("count found: " + countFound);
                sumResult += i;
                System.out.println("current sum result is: " + sumResult);
            }
            if (countFound == 20) {
                break;
            }
        }
    }
}
