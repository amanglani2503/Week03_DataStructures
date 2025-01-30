package day3sortingalgorithms.sortstudentmarks;

public class Main {
    public static void main(String[] args) {
        int[] studentMarks = {2, 6, 3, 8, 5, 1, 8, 9, 13, 10, 11};

        BubbleSort obj = new BubbleSort();

        int[] sortedMarksArray = obj.bubbleSort(studentMarks);

        for(int element : sortedMarksArray){
            System.out.print(element + "  ");
        }
    }
}
