package searching.binarysearch.findrotationpoint;

public class FindRotationPoint {

    public static int binarySearch(int[] array, int low, int high){
        int mid;

        while(low != high){
            mid = (low + high) / 2;

            /* if element at right-most position of current subpart is greater
            than current element, smallest is towards left part */
            if(array[mid] < array[high]){
                high = mid;
            } else if (array[mid] > array[high]) {
                /* if element at left-most position of current subpart is greater
            than current element, smallest is towards right part */
                low = mid + 1;
            }
        }
        return low;
    }

    // main method
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 11, 19, 21, 2, 3};

        // index of rotation point
        int rotationPoint = binarySearch(array, 0, array.length-1);

        System.out.println("Smallest element is at index : " + rotationPoint);
    }
}
