package day3sortingalgorithms.sortstudentages;

public class Main {
    public static void main(String[] args) {
        int[] studentAges = {13, 17, 11, 18, 17, 11, 12, 11, 13, 12, 16, 16, 18};

        System.out.println("Original Array : ");
        // displaing original array
        for (int age : studentAges){
            System.out.print(age + "  ");
        }

        CountingSort obj = new CountingSort();
        obj.countingSort(studentAges);

        System.out.println("\nSorted Array : ");
        // displaying sorted array
        for (int age : studentAges){
            System.out.print(age + "  ");
        }
    }
}
