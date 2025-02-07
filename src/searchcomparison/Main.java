package searchcomparison;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void fillArrayWithUniqueRandomNumbers(int[] array) {
        Random random = new Random();
        Set<Integer> sortedSet = new TreeSet<>();

        // Generate unique random numbers
        while (sortedSet.size() < array.length) {
            sortedSet.add(random.nextInt(array.length * 10)); // Larger range to ensure uniqueness
        }

        // Copy sorted values into the given array
        int index = 0;
        for (int num : sortedSet) {
            array[index++] = num;
        }
    }

    public static void main(String[] args) {
        SearchingAlgorithms search = new SearchingAlgorithms();

        int[] smallArray = new int[1000];
        int[] mediumArray = new int[10000];
        int[] largeArray = new int[1000000];

        fillArrayWithUniqueRandomNumbers(smallArray);
        fillArrayWithUniqueRandomNumbers(mediumArray);
        fillArrayWithUniqueRandomNumbers(largeArray);

        // comparing times for linear search and binary search for array of size 1000
        double smallArrayLinear = search.linearSearch(smallArray, 650);
        double smallArrayBinary = search.binarySearch(smallArray, 650);

        // comparing times for linear search and binary search for array of size 10000
        double mediumArrayLinear = search.linearSearch(mediumArray, 6231);
        double mediumArrayBinary = search.binarySearch(mediumArray, 6231);

        // comparing times for linear search and binary search for array of size 1,000,000
        double largeArrayLinear = search.linearSearch(largeArray, 547684);
        double largeArrayBinary = search.binarySearch(largeArray, 547684);

        // Comparing times for linear and binary search for various dataset sizes
        System.out.println("Linear Search Times in milliSeconds :- ");
        System.out.println("    Small Size Array : " + smallArrayLinear);
        System.out.println("    Medium Size Array : " + mediumArrayLinear);
        System.out.println("    Large Size Array : " + largeArrayLinear);

        System.out.println("Binary Search Times in milliSeconds :- ");
        System.out.println("    Small Size Array : " + smallArrayBinary);
        System.out.println("    Medium Size Array : " + mediumArrayBinary);
        System.out.println("    Large Size Array : " + largeArrayBinary);
    }
}
