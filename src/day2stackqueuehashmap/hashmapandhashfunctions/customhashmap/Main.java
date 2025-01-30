package day2stackqueuehashmap.hashmapandhashfunctions.customhashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer, String> hashMap = new CustomHashMap<>(10);
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(11, "Eleven"); // collision with key 1

        System.out.println("Get key 1: " + hashMap.get(1));
        System.out.println("Get key 2: " + hashMap.get(2));
        System.out.println("Get key 11: " + hashMap.get(11));
        System.out.println("Get key 3: " + hashMap.get(3));

        hashMap.remove(2);
        System.out.println("Get key 2 after removal: " + hashMap.get(2));

        hashMap.printMap();
    }
}
