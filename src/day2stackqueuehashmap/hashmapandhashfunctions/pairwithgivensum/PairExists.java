package day2stackqueuehashmap.hashmapandhashfunctions.pairwithgivensum;

import java.util.HashMap;

public class PairExists {
    public boolean hasPair(int[] arr, int target){
        HashMap<Integer, Boolean> elementsFound = new HashMap<>();

        for (int j : arr) {
            if (elementsFound.containsKey(target - j)) {
                return true;
            }
            elementsFound.put(j, true);
        }
        return false;
    }
}
