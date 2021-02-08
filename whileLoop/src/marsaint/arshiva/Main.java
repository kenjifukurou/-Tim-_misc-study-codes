package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(12));

        // loop list of numbers and filter out even numbers
        int runNumber = 0;
        int endNumber = 100;
        while (runNumber <= endNumber) {
            runNumber++;
            if (!isEvenNumber(runNumber)) {
                continue; // means skip
            }
            System.out.println("even number is: " + runNumber);
        }
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("is even number");
            return true;
        }
        return false;
    }
}
