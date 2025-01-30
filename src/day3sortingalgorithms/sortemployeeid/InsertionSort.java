package day3sortingalgorithms.sortemployeeid;

public class InsertionSort {
    public int[] insertionSort(int[] employeeIds){

        int arrayLength = employeeIds.length;

        for (int i = 0; i < arrayLength ; i++) {
            int currentId = employeeIds[i];
            int j = i - 1;

            while(j >= 0 && employeeIds[j] > currentId){
                employeeIds[j+1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = currentId;
        }

        return employeeIds;
    }
}
