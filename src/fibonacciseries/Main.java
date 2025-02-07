package fibonacciseries;

public class Main {
    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries();

        double nanoToMilli = 1_000_000.0;
        
        // Terms to be tested
        int small = 10;
        int medium = 30;
        int large = 50;

        // Measuring time for recursive approach
        long startRecursiveSmall = System.nanoTime();
        long endRecursiveSmall = System.nanoTime();

        long startRecursiveMedium = System.nanoTime();
        long endRecursiveMedium = System.nanoTime();

        long startRecursiveLarge = System.nanoTime();
        long endRecursiveLarge = System.nanoTime();

        // Measuring time for iterative approach
        long startIterativeSmall = System.nanoTime();
        long endIterativeSmall = System.nanoTime();

        long startIterativeMedium = System.nanoTime();
        long endIterativeMedium = System.nanoTime();

        long startIterativeLarge = System.nanoTime();
        long endIterativeLarge = System.nanoTime();

        // Calculate execution time in milliseconds
        double timeRecursiveSmall = (endRecursiveSmall - startRecursiveSmall) / nanoToMilli;
        double timeRecursiveMedium = (endRecursiveMedium - startRecursiveMedium) / nanoToMilli;
        double timeRecursiveLarge = (endRecursiveLarge - startRecursiveLarge) / nanoToMilli;

        double timeIterativeSmall = (endIterativeSmall - startIterativeSmall) / nanoToMilli;
        double timeIterativeMedium = (endIterativeMedium - startIterativeMedium) / nanoToMilli;
        double timeIterativeLarge = (endIterativeLarge - startIterativeLarge) / nanoToMilli;

        // Print results
        System.out.println("\nRecursive Fibonacci Calculation:");
        System.out.println("   Time: " + timeRecursiveSmall + " ms");
        System.out.println("   Time: " + timeRecursiveMedium + " ms");
        System.out.println("   Time: " + timeRecursiveLarge + " ms");

        System.out.println("\nIterative Fibonacci Calculation:");
        System.out.println("   Time: " + timeIterativeSmall + " ms");
        System.out.println("   Time: " + timeIterativeMedium + " ms");
        System.out.println("   Time: " + timeIterativeLarge + " ms");
    }
}
