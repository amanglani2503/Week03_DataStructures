package day2stackqueuehashmap.hashmapandhashfunctions.pairwithgivensum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        PairExists obj = new PairExists();
        boolean result = obj.hasPair(arr, target);

        if (result) {
            System.out.println("Pair with given sum exists");
        }
        else {
            System.out.println("Pair with given sum not found");
        }
    }
}