package searching.binarysearch.firstandlastoccurence;

public class FirstAndLastOccurence {

    public static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1; // Search left for first occurrence
                } else {
                    low = mid + 1; // Search right for last occurrence
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findOccurrence(nums, target, true);
        int last = findOccurrence(nums, target, false);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 8, 9, 13, 14, 15};

        int[] occurences = searchRange(arr, 8);

        System.out.println("First appearance : " + occurences[0]);
        System.out.println("Last occurence : " + occurences[1]);
    }
}