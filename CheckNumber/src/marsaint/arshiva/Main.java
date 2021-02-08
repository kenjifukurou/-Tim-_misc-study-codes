package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckNumber(99);
        CheckNumber(-5);
        CheckNumber(0);
    }

    public static void CheckNumber(int inputNumber) {
        if (inputNumber == 0) {
            System.out.println("number is equal to zero");
        } else if (inputNumber > 0) {
            System.out.println("the number is positive number");
        } else if (inputNumber < 0) {
            System.out.println("the number is negative number");
        }
    }
}
