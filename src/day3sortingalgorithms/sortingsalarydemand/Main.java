package day3sortingalgorithms.sortingsalarydemand;

public class Main {
    public static void main(String[] args) {
        double[] salaryDemands = {30000, 25000, 100000, 76000, 54000, 43200, 47000};

        HeapSort obj = new HeapSort();

        System.out.println("Displaying original array : ");
        // displaying original array
        for(double salary : salaryDemands) {
            System.out.print(salary + "  ");
        }
        System.out.println("\nDisplaying sorted array : ");

        // sorting the salaries
        obj.heapSort(salaryDemands);

        // displaying sorted salaries
        for(double salary : salaryDemands) {
            System.out.print(salary + "  ");
        }
    }
}
