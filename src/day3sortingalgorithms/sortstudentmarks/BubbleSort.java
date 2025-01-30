package day3sortingalgorithms.sortstudentmarks;

import java.util.Collections;

public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        boolean swapped;
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength; i++) {
            swapped = false;        // to track swapping occured during this iteration or not

            for (int j = 0; j < arrayLength - 1; j++) {
                if(arr[j] > arr[j+1]){      // comparing adjacent elements and moving smaller elements to left
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){       // if no swapping occured during this iteration, break the loop
                break;
            }
        }

        return arr;
    }
}
