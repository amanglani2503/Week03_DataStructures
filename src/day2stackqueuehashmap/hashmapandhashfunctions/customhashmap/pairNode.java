package day2stackqueuehashmap.hashmapandhashfunctions.customhashmap;

public class pairNode<K, V> {
    K key;
    V value;
    pairNode <K, V> next;

    public pairNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}