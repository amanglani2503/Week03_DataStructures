package day2stackqueuehashmap.hashmapandhashfunctions.twosum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 100, 45, 32, 15, 6, 3};
        int findSum = 9;

        FindPairIndices obj = new FindPairIndices();
        List<int[]> indicesList = obj.findPairIndices(arr, findSum);

        // displaying all pair of indices
        for(int[] subarray : indicesList){
            System.out.println(subarray[0] + "  " + subarray[1]);
        }
    }
}
