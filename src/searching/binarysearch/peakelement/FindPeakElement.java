package searching.binarysearch.peakelement;

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int arraySize = arr.length; // Size of the array

        if (arraySize == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[arraySize - 1] > arr[arraySize - 2]) return arraySize - 1;

        int low = 1, high = arraySize - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the peak:
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                return mid;

            // If we are in the left increasing sequence:
            if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            }
            // If we are in the right decreasing sequence or at a plateau:
            else {
                high = mid - 1;
            }
        }

        // if no peak element found
        return -1;
    }

    // main method
    public static void main(String[] args) {
        int[] arr = {1,2,10,8,9,12,6,7};

        // storing peak element
        int peakElement = findPeakElement(arr);

        // displaying peak element
        if(peakElement != -1) {
            System.out.println("Peak element : " + peakElement);
        } else{
            System.out.println("No peak element not found");
        }
    }
}
