package day2stackqueuehashmap.hashmapandhashfunctions.longestconsecutivesequence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 1, 200, 3, 5, 2, 4, 101};

        FindLongestConsecutiveSequence obj = new FindLongestConsecutiveSequence();
        int longest = obj.longestConsecutiveSequence(arr);

        System.out.println("Length of longest consecutive sequence : " + longest);
    }
}
