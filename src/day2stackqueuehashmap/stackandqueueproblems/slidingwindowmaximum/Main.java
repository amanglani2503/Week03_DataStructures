package day2stackqueuehashmap.stackandqueueproblems.slidingwindowmaximum;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // creating an array
        int[] arr = {2, 6, 3, 1, 7, 12, 8, 10, 15, 4};
        int k = 3;

        SlidingWindow obj = new SlidingWindow();
        int[] maxWindow = obj.findMaximum(arr, k);

        System.out.println("Maximum elements in every window of size k :");
        for(int max : maxWindow){
            System.out.print(max + "  ");
        }
    }
}
