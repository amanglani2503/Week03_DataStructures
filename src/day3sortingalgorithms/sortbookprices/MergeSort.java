package day3sortingalgorithms.sortbookprices;

public class MergeSort {
    public double[] mergeSort(double[] bookPrices) {
        if (bookPrices.length <= 1) {
            return bookPrices;
        }

        int mid = bookPrices.length / 2;  // determining splitting point

        // storing left and right arrays after splitting
        double[] left = new double[mid];
        double[] right = new double[bookPrices.length - mid];

        // filling left and right arrays
        System.arraycopy(bookPrices, 0, left, 0, mid);
        System.arraycopy(bookPrices, mid, right, 0, bookPrices.length - mid);

        // sorting left and right subarrays
        mergeSort(left);
        mergeSort(right);

        // merging sorted left and right arrays
        merge(bookPrices, left, right);

        return bookPrices;
    }

    public void merge(double bookPrices[], double[] left, double[] right){
        int i = 0 , j = 0, k = 0;

        while (i < left.length && j < right.length){
            if(left[i] > right[j]){
                bookPrices[k++] = right[j++];
            }
            else {
                bookPrices[k++] = left[i++];
            }
        }

        while(i < left.length){
            bookPrices[k++] = left[i++];
        }

        while (j < right.length){
            bookPrices[k++] = right[j++];
        }
    }
}