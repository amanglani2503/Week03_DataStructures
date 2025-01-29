package day2stackqueuehashmap.hashmapandhashfunctions.subarrayswthzerosum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        List<int[]> result = ZeroSumSubarrays.find(arr);

        System.out.println("Zero-Sum Subarrays:");
        for (int[] subarray : result) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}
