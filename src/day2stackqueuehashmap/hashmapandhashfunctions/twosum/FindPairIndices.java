package day2stackqueuehashmap.hashmapandhashfunctions.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindPairIndices {
    public List<int[]> findPairIndices(int[] arr, int sum){
        List<int[]> indicesList = new ArrayList<>();  // list to store the indices of
        HashMap<Integer, List<Integer>> elements = new HashMap<>();  // to store elements found

        for(int i = 0 ; i < arr.length ; i++){
            elements.putIfAbsent(arr[i], new ArrayList<>());
            elements.get(arr[i]).add(i);
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(elements.containsKey(sum - arr[i])){
                for(int index : elements.get(sum - arr[i])){
                    if(index != i && !pairExists(indicesList, i, index)){
                        indicesList.add(new int[] {i, index});
                    }
                }
            }
        }

        return indicesList;
    }

    private boolean pairExists(List<int[]> indicesList, int num1, int num2) {
        for (int[] pair : indicesList) {
            if ((pair[0] == num1 && pair[1] == num2) || (pair[0] == num2 && pair[1] == num1)) {
                return true; // Pair already exists in the list
            }
        }
        return false;
    }
}
