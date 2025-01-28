package day1linkedlist.singlylinkedlist.inventorymanagementsystem;

public class ItemNode {
    String name;
    int id;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
