package datastrucuturesearch;

import java.util.Random;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    // Method to generate a random array of size N
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size * 10); // Generate numbers within a range
        }
        return array;
    }


    // Method to fill HashSet and TreeSet
    public static void fillSets(int[] array, HashSet<Integer> hashSet, TreeSet<Integer> treeSet) {
        for (int num : array) {
            hashSet.add(num);
            treeSet.add(num);
        }
    }

    public static void main(String[] args) {
        int smallSize = 1000;
        int mediumSize = 100000;
        int largeSize = 1000000;

        // Generate random datasets
        int[] smallArray = generateRandomArray(smallSize);
        int[] mediumArray = generateRandomArray(mediumSize);
        int[] largeArray = generateRandomArray(largeSize);

        HashSet<Integer> smallHashSet = new HashSet<>();
        HashSet<Integer> mediumHashSet = new HashSet<>();
        HashSet<Integer> largeHashSet = new HashSet<>();

        TreeSet<Integer> smallTreeSet = new TreeSet<>();
        TreeSet<Integer> mediumTreeSet = new TreeSet<>();
        TreeSet<Integer> largeTreeSet = new TreeSet<>();

        // Fill HashSet and TreeSet
        fillSets(smallArray, smallHashSet, smallTreeSet);
        fillSets(mediumArray, mediumHashSet, mediumTreeSet);
        fillSets(largeArray, largeHashSet, largeTreeSet);

        // Choose random elements to search
        int smallSearch = smallArray[new Random().nextInt(smallSize)];
        int mediumSearch = mediumArray[new Random().nextInt(mediumSize)];
        int largeSearch = largeArray[new Random().nextInt(largeSize)];

        // Measure search times (separate variables, no loop)
        double smallArrayTime = DataStructureSearch.searchInArray(smallArray, smallSearch);
        double mediumArrayTime = DataStructureSearch.searchInArray(mediumArray, mediumSearch);
        double largeArrayTime = DataStructureSearch.searchInArray(largeArray, largeSearch);

        double smallHashSetTime = DataStructureSearch.searchInHashSet(smallHashSet, smallSearch);
        double mediumHashSetTime = DataStructureSearch.searchInHashSet(mediumHashSet, mediumSearch);
        double largeHashSetTime = DataStructureSearch.searchInHashSet(largeHashSet, largeSearch);

        double smallTreeSetTime = DataStructureSearch.searchInTreeSet(smallTreeSet, smallSearch);
        double mediumTreeSetTime = DataStructureSearch.searchInTreeSet(mediumTreeSet, mediumSearch);
        double largeTreeSetTime = DataStructureSearch.searchInTreeSet(largeTreeSet, largeSearch);

        // Print results normally
        System.out.println("Results:");
        System.out.println("For dataset size 1,000:");
        System.out.println(" - Array : " + smallArrayTime + " ms");
        System.out.println(" - HashSet : " + smallHashSetTime + " ms");
        System.out.println(" - TreeSet : " + smallTreeSetTime + " ms");

        System.out.println("\nFor dataset size 100,000:");
        System.out.println(" - Array : " + mediumArrayTime + " ms");
        System.out.println(" - HashSet : " + mediumHashSetTime + " ms");
        System.out.println(" - TreeSet : " + mediumTreeSetTime + " ms");

        System.out.println("\nFor dataset size 1,000,000:");
        System.out.println(" - Array : " + largeArrayTime + " ms");
        System.out.println(" - HashSet : " + largeHashSetTime + " ms");
        System.out.println(" - TreeSet : " + largeTreeSetTime + " ms");

    }
}
