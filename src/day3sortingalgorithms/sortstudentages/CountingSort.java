package day3sortingalgorithms.sortstudentages;

public class CountingSort {
    public void countingSort(int[] studentAges){
        /* creating 9 size array, because we have range of ages as 10-18
         if this was not given, we would find the largest element and create count array of size (largestElement + 1) */

        int[] count = new int[9];

        // counting frequencies of each element
        for(int age : studentAges){
            count[age - 10]++;
        }


        // Creating the sorted array
        int index = 0;
        for (int i = 0; i < 9; i++) {
            while(count[i] > 0){                // if element occured n times, placing it n times in the array
                studentAges[index++] = i + 10;
                count[i]--;
            }
        }
    }
}
