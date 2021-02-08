package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(135));

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // extract one-digits
            int oneDigit = number % 10;
            System.out.println("the one digit is " + oneDigit);

            sum += oneDigit;

            // delete last one-digits
            number /= 10;
            System.out.println("the ten digit is " + number);
        }

        return sum;
    }

}
