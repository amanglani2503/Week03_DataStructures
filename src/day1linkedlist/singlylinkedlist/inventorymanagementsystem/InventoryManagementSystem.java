package day1linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        ItemList itemList = new ItemList();

        itemList.addAtBeginning("Rice", 101, 20, 30);
        itemList.addAtBeginning("Wheat", 102, 30, 25);
        itemList.addAtEnd("Pulses", 103, 50, 2);
        itemList.addAtPosition("Pickle", 104, 10, 200, 4);


//        itemList.updatePrice(103, 1);
//        itemList.removeById(104);

        itemList.displayAllRecords();
        System.out.println("Total Inventory Value : " + itemList.totalValue());
        System.out.println();

        itemList.sortByNameAscending();
        itemList.displayAllRecords();

    }

}
