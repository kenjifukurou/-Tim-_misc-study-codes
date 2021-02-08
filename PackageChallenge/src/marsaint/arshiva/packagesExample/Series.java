package marsaint.arshiva.packagesExample;

public class Series {

    public static long nSum(int n) {
        long fa = (n * (n+1)) / 2;
        return fa;
    }

    public static long factorials(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i=1; i<n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long nA = 0;
        long nB = 1;
        long fib = 0;
        for (int i=1; i<n; i++) {
            fib = (nA + nB);
            nA = nB;
            nB = fib;
        }
        return fib;

    }

}
