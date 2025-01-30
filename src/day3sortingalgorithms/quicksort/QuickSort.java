package day3sortingalgorithms.quicksort;

public class QuickSort {
    public double[] quickSort(double[] productPrices, int low, int high){
        if(low < high){     // checking base condition
            int partitionIndex = partition(productPrices, low, high);

            quickSort(productPrices, low, partitionIndex - 1);
            quickSort(productPrices, partitionIndex + 1, high);
        }

        return productPrices;
    }

    public int partition(double[] productPrices, int low, int high){
        double pivot = productPrices[high];
        int j = low - 1;

        for(int i = low ; i < high ; i++){
            if(pivot >= productPrices[i]){
                j++;
                double temp = productPrices[j];
                productPrices[j] = productPrices[i];
                productPrices[i] = temp;

            }
        }

        double temp = productPrices[j+1];
        productPrices[j+1] = productPrices[high];
        productPrices[high] = temp;

        return j+1;
    }
}
