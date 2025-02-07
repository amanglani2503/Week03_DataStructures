package sortingcomparison;

public class SortingAlgorithms {
    // QuickSort method
    public void quickSort(int[] elements, int low, int high){
        if(low < high){     // checking base condition
            int partitionIndex = partition(elements, low, high);

            quickSort(elements, low, partitionIndex - 1);
            quickSort(elements, partitionIndex + 1, high);
        }
    }

    public double measureQuickSort(int[] elements) {
        long startTime = System.nanoTime();
        quickSort(elements, 0, elements.length - 1);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000.0; // Convert to ms
    }

    // Method to partition elementsays for quick Sort
    public int partition(int[] elements, int low, int high){
        double pivot = elements[high];
        int j = low - 1;

        for(int i = low ; i < high ; i++){
            if(pivot >= elements[i]){
                j++;
                int temp = elements[j];
                elements[j] = elements[i];
                elements[i] = temp;
            }
        }

        int temp = elements[j+1];
        elements[j+1] = elements[high];
        elements[high] = temp;

        return j+1;
    }

    // method to perform bubble sort
    public double bubbleSort(int[] elements){
        boolean swapped;
        int elementsayLength = elements.length;

        double nanoToMilli = 1000000;
        double startTime = System.nanoTime();

        for (int i = 0; i < elementsayLength; i++) {
            swapped = false;        // to track swapping occured during this iteration or not

            for (int j = 0; j < elementsayLength - 1; j++) {
                if(elements[j] > elements[j+1]){      // comparing adjacent elements and moving smaller elements to left
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){       // if no swapping occured during this iteration, break the loop
                break;
            }
        }

        // capturing time when arrays got finally merged
        double endTime = System.nanoTime();
        return (endTime - startTime) / nanoToMilli;
    }

    // method to perform merge sort
    public double mergeSort(int[] elements) {

        double nanoToMilli = 1000000;
        double startTime = System.nanoTime();

        if (elements.length <= 1) {
            double endTime = System.nanoTime();
            return (endTime - startTime) / nanoToMilli;
        }
        int mid = elements.length / 2;  // determining splitting point
        // storing left and right elementsays after splitting
        int[] left = new int[mid];
        int[] right = new int[elements.length - mid];
        // filling left and right elementsays
        System.arraycopy(elements, 0, left, 0, mid);
        System.arraycopy(elements, mid, right, 0, elements.length - mid);
        // sorting left and right subelementsays
        mergeSort(left);
        mergeSort(right);
        // merging sorted left and right elementsays
        merge(elements, left, right);

        // capturing time when arrays got finally merged
        double endTime = System.nanoTime();
        return (endTime - startTime) / nanoToMilli;
    }

    public void merge(int elements[], int[] left, int[] right){
        int i = 0 , j = 0, k = 0;
        while (i < left.length && j < right.length){
            if(left[i] > right[j]){
                elements[k++] = right[j++];
            }
            else {
                elements[k++] = left[i++];
            }
        }
        while(i < left.length){
            elements[k++] = left[i++];
        }
        while (j < right.length){
            elements[k++] = right[j++];
        }
    }
}
