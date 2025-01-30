package day2stackqueuehashmap.hashmapandhashfunctions.longestconsecutivesequence;

import java.util.HashMap;

public class FindLongestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] arr){
        int maxLength = 0;

        // map to store the elements
        HashMap<Integer, Boolean> elements= new HashMap<>();

        // storing elements in map
        for (int number : arr){
            elements.put(number, true);
        }

        for(int number : arr){
            if(!elements.containsKey(number - 1)){      // checking if current element can be starting of a sequence
                int currentLength = 1;
                while(elements.containsKey(number + 1)){   // iterating and updating length till a sequence continues
                    currentLength++;
                    number++;
                }

                maxLength = Math.max(currentLength, maxLength);
            }
        }

        return maxLength;
    }
}
