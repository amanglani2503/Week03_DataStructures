package day2stackqueuehashmap.hashmapandhashfunctions.customhashmap;

public class CustomHashMap<K, V> {
    private pairNode<K, V>[] map;
    private int size;

    // Constructor to initialize the hash map with a given capacity
    public CustomHashMap(int capacity) {
        map = new pairNode[capacity];
        size = capacity;
    }

    // Hash function to calculate the index
    private int hash(K key) {
        return key.hashCode() % size;
    }

    // Insert key-value pair
    public void put(K key, V value) {
        int index = hash(key);
        pairNode<K, V> newpairNode = new pairNode<>(key, value);

        // If there's no entry at the index, create a new bucket
        if (map[index] == null) {
            map[index] = newpairNode;
        } else {
            pairNode<K, V> current = map[index];
            while (current != null) {
                // If key already exists, update its value
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            // If key doesn't exist, add the new pairNode to the linked list at the index
            newpairNode.next = map[index];
            map[index] = newpairNode;
        }
    }

    // Retrieve value by key
    public V get(K key) {
        int index = hash(key);
        pairNode<K, V> current = map[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        // Return null if key not found
        return null;
    }

    // Delete key-value pair
    public void remove(K key) {
        int index = hash(key);
        pairNode<K, V> current = map[index];
        pairNode<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                // If the key is found, delete it
                if (prev == null) {
                    map[index] = current.next; // Remove the first pairNode
                } else {
                    prev.next = current.next; // Remove the pairNode from the list
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // Printing the entire map for debugging
    public void printMap() {
        for (int i = 0; i < size; i++) {
            pairNode<K, V> current = map[i];
            if (current != null) {
                System.out.print("Index " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + " = " + current.value + "] ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }
}