package day2stackqueuehashmap.stackandqueueproblems.slidingwindowmaximum;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public int[] findMaximum(int[] arr, int k){
        Deque<Integer> deque = new LinkedList<>();
        int size = arr.length;
        int[] maxWindow = new int[size - k + 1];

        for(int i = 0 ; i < size ; i++){
            // removing elements that are not in current window
            while(!deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }

            // removing smaller elements from current window
            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]){
                deque.pollLast();
            }

            // appending current index to the list
            deque.offerLast(i);

            if(i >= k -1){
                maxWindow[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return maxWindow;
    }
}
