/* Running whole code at once will either run too long due to bubble sort in large dataset or will result in StackOverFlowError in quickSort
 Run specific piece of code to test*/

package sortingcomparison;

import java.util.Random;

public class Main {
    public static void fillArrayWithUniqueRandomNumbers(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Generate numbers in range [min, max]
        }
    }

    public static void main(String[] args) {
        SortingAlgorithms sort = new SortingAlgorithms();

        int[] smallArray = new int[1000];
        int[] mediumArray = new int[10000];
        int[] largeArray = new int[1000000];

        fillArrayWithUniqueRandomNumbers(smallArray, 1, 1000);
        fillArrayWithUniqueRandomNumbers(mediumArray,1, 10000);
        fillArrayWithUniqueRandomNumbers(largeArray, 1, 1000000);


        // Comparing sorting times
        double smallBubble = sort.bubbleSort(smallArray);
        double mediumBubble = sort.bubbleSort(mediumArray);
        double largeBubble = sort.bubbleSort(largeArray);

        double smallMerge = sort.mergeSort(smallArray);
        double mediumMerge = sort.mergeSort(mediumArray);
        double largeMerge = sort.mergeSort(largeArray);

        double smallQuick = sort.measureQuickSort(smallArray);
        double mediumQuick = sort.measureQuickSort(mediumArray);
        double largeQuick = sort.measureQuickSort(largeArray);


//         Printing results
        System.out.println("Bubble Sort Times in milliseconds:");
        System.out.println("    Small Array: " + smallBubble);
        System.out.println("    Medium Array: " + mediumBubble);
        System.out.println("    Large Array: " + largeBubble);

        System.out.println("Merge Sort Times in milliseconds:");
        System.out.println("    Small Array: " + smallMerge);
        System.out.println("    Medium Array: " + mediumMerge);
        System.out.println("    Large Array: " + largeMerge);

        System.out.println("Quick Sort Times in milliseconds:");
        System.out.println("    Small Array: " + smallQuick);
        System.out.println("    Medium Array: " + mediumQuick);
        System.out.println("    Large Array: " + largeQuick);
    }
}