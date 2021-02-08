package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(21));
        System.out.println((long)Math.sqrt(21));
    }

    public static boolean isPrime(int n) {
        if (n==1) return false;

        for (int i=2; i<=(long)Math.sqrt(n); i++) {
            System.out.println("i = " + i);
            System.out.println("n = " + n);
            System.out.println("result: " + (n % i));
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
