public class Main {

    public static void main(String[] args) {

        double x = Math.sqrt(16);
        System.out.println(x);

        System.out.println(checkPrimeNumber(16));

        int countOfPrime = 0;
        int rangeOfNumbers = 100;
        for (int i=1; i<=rangeOfNumbers; i++) {
            if (checkPrimeNumber(i)) {
                countOfPrime++;
                System.out.println("the prime number is: " + i);
            }
            if (countOfPrime == 10) {
                System.out.println("total prime number: " + countOfPrime + ", exit loop");
                break;
            }
        }
    }

    public static boolean checkPrimeNumber(int n) {
        if (n == 1) return false;

        for (int checkerI=2; checkerI<n; checkerI++) {
            if (n % checkerI == 0) {
                System.out.println(checkerI);
                return false;
            }
        }
        return true;
    }
}
