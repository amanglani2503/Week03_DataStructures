package day2stackqueuehashmap.hashmapandhashfunctions.subarrayswthzerosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubarrays {
    public static List<int[]> find(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumIndices = new HashMap<>();
        int sum = 0;

        // Initialize with sum = 0 at index -1
        List<Integer> initialList = new ArrayList<>();
        initialList.add(-1);
        sumIndices.put(0, initialList);sumIndices.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exists in map, subarrays from those indices to current index sum to zero
            if (sumIndices.containsKey(sum)) {
                for (int start : sumIndices.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Store the current sum in the map
            sumIndices.putIfAbsent(sum, new ArrayList<>());
            sumIndices.get(sum).add(i);
        }

        return result;
    }
}