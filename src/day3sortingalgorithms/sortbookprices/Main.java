package day3sortingalgorithms.sortbookprices;

public class Main {
    public static void main(String[] args) {
        double[] bookPrices = {4, 2, 10, 3, 7, 9, 1};

        MergeSort obj = new MergeSort();
        double[] sortedPrices = obj.mergeSort(bookPrices);

        for(double price : sortedPrices){
            System.out.print(price + "  ");
        }
    }
}
