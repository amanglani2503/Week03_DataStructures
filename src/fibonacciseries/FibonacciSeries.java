package fibonacciseries;

public class FibonacciSeries {
    // recursive approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

//    Iterative approach :-:
    public static int fibonacciIterative(int n) {
        int secodLast = 0, last = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = secodLast + last;
            secodLast = last;
            last = sum;
        }
        return last;
    }

}
