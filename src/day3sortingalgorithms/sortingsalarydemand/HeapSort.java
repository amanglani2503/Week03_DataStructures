package day3sortingalgorithms.sortingsalarydemand;

public class HeapSort {
    public void heapSort(double[] salaryDemands){
        int heapSize = salaryDemands.length;

        // building max heap
        for (int i = heapSize/2 - 1; i >= 0; i--) {
            heapify(salaryDemands, heapSize, i);
        }

        // extracting elements one by one and swapping with root node and heapifying the reduced heap
        for(int i = heapSize - 1 ; i > 0 ; i--){
            // swapping element with root
            double temp = salaryDemands[0];
            salaryDemands[0] = salaryDemands[i];
            salaryDemands[i] = temp;

            // heapifying reduced heap
            heapify(salaryDemands, i, 0);
        }
    }

    public void heapify(double[] salaryDemands, int heapSize, int rootIndex){
        int largestIndex = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;

        // checking if left child is greater than root
        if(leftChildIndex < heapSize && salaryDemands[leftChildIndex] > salaryDemands[largestIndex]){
            largestIndex = leftChildIndex;
        }

        // checking if right child is greater than root
        if(rightChildIndex < heapSize && salaryDemands[rightChildIndex] > salaryDemands[largestIndex]){
            largestIndex = rightChildIndex;
        }

        // if largest element is not at root, heapify
        if(largestIndex != rootIndex){

            // swapping elements at largest index and root index
            double temp = salaryDemands[largestIndex];
            salaryDemands[largestIndex] = salaryDemands[rootIndex];
            salaryDemands[rootIndex] = temp;

            // heapify the heap
            heapify(salaryDemands, heapSize, largestIndex);
        }
    }
}
