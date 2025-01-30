package day3sortingalgorithms.sortexamscores;

public class SelectionSort {
    public int[] selectionSort(int[] marks){
        int numberOfMarks = marks.length;

        for (int i = 0; i < numberOfMarks; i++) {
            int minIndex = i;

            // finding minimum elemnt in the unsorted part
            for(int j = i + 1 ; j < numberOfMarks ; j++){
                if(marks[j] < marks[minIndex]){
                    minIndex = j;
                }
            }

            // swapping minimum element with at its correct position
            int temp = marks[minIndex];
            marks[minIndex] = marks[i];
            marks[i] = temp;
        }
        return marks;
    }
}
