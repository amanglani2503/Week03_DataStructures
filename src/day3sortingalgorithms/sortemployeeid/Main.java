package day3sortingalgorithms.sortemployeeid;

public class Main {
    public static void main(String[] args) {
        int[] employeeIds = {105, 103, 108, 110, 116, 113, 111, 119};

        InsertionSort obj = new InsertionSort();
        int[] sortedEmployeeIds = obj.insertionSort(employeeIds);

        for(int id : employeeIds){
            System.out.print(id + "  ");
        }
    }
}
