package searchcomparison;

import java.util.Arrays;

public class SearchingAlgorithms {
    // method to perform linear search
    public double linearSearch(int[] elements, int target){
        double nanoToSec = 1000000;
        double startTime = System.nanoTime();

        for(int element : elements) {
            if(element == target){
                break;
            }
        }
        double endTime = System.nanoTime();
        return (endTime - startTime)/nanoToSec;
    }

    // method to perform binary search
    public double binarySearch(int[] elements, int target){
        double nanoToSec = 1000000;
        int low = 0 , high = elements.length - 1;
        int mid = 0;

        Arrays.sort(elements);
        double startTime = System.nanoTime();

        while(low < high){
            mid = (low + high) / 2;

            if(elements[mid] == target){
                break;
            } else if (elements[mid] > elements[low]) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }

        double endTime = System.nanoTime();
        return (endTime - startTime)/nanoToSec;
    }
}
