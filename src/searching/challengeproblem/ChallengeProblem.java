package searching.challengeproblem;
import java.util.Arrays;

public class ChallengeProblem {
    // Function to find the first missing positive number
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number at its correct index if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Binary Search to find target index
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); // Ensure array is sorted before performing binary search
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Finding First Missing Positive
        int[] nums = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + firstMissingPositive(nums));

        // Test Binary Search
        int[] arr = {5, 7, 2, 9, 1};
        int target = 7;
        System.out.println("Index of Target: " + binarySearch(arr, target));
    }
}