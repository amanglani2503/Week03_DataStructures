package datastrucuturesearch;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class DataStructureSearch {
    // Linear search in array (O(N))
    public static double searchInArray(int[] array, int target) {
        long start = System.nanoTime();
        for (int num : array) {
            if (num == target) break;
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0; // Convert to milliseconds
    }

    // Search in HashSet (O(1) average)
    public static double searchInHashSet(HashSet<Integer> set, int target) {
        long start = System.nanoTime();
        set.contains(target);
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0; // Convert to milliseconds
    }

    // Search in TreeSet (O(log N))
    public static double searchInTreeSet(TreeSet<Integer> set, int target) {
        long start = System.nanoTime();
        set.contains(target);
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0; // Convert to milliseconds
    }
}
