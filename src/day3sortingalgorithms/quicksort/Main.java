package day3sortingalgorithms.quicksort;

public class Main {
    public static void main(String[] args) {
        double[] productPrices = {6, 3, 1, 8, 7, 10, 13, 11};

        QuickSort obj = new QuickSort();
        double[] sortedPriceList = obj.quickSort(productPrices, 0, productPrices.length-1);

        for(double price : sortedPriceList){
            System.out.print(price + "  ");
        }

    }
}
