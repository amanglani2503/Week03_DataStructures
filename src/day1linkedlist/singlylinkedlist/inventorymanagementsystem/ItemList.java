package day1linkedlist.singlylinkedlist.inventorymanagementsystem;

public class ItemList {
    private ItemNode head;

    // Add an item record at the beginning
    public void addAtBeginning(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add an item record at the end
    public void addAtEnd(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add an item record at a specific position
    public void addAtPosition(String name, int id, int quantity, double price, int position) {
        if (position < 1) {
            System.out.println("Position must be greater than or equal to 1.");
            return;
        }

        ItemNode newNode = new ItemNode(name, id, quantity, price);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ItemNode current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position exceeds the list size.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Update an item's price using id
    public void updatePrice(int id, double newPrice) {
        ItemNode current = head;
        while (current != null) {
            if (current.id == id) {
                current.price = newPrice;
                System.out.println("Price updated for Item Id " + id + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Item with Item Id  " + id + " not found.");
    }

    // Delete an item by Id
    public void removeById(int id) {
        if (head == null) {
            System.out.println("List is empty. No records to delete.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Item with item Id " + id + " deleted.");
            return;
        }

        ItemNode current = head;
        while (current.next != null && current.next.id != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Item with item Id " + id + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Item with item Id " + id + " deleted.");
        }
    }

    public double totalValue() {
        if (head == null) {
            System.out.println("No items found !!. Total Value is 0.0");
        }

        double total = 0;
        ItemNode current = head;
        while (current != null) {
            total += (current.quantity * current.price);
            current = current.next;
        }

        return total;
    }

    // Merge Sort - Main function to sort the list
    public void sortByNameAscending() {
        head = mergeSort(head);
        System.out.println("List sorted by item name in ascending order.");
    }

    // Merge sort implementation
    private ItemNode mergeSort(ItemNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;

        middle.next = null; // Break the list into two parts

        // Recursively sort the two halves
        ItemNode left = mergeSort(head);
        ItemNode right = mergeSort(nextOfMiddle);

        // Merge the sorted halves
        return sortedMerge(left, right);
    }

    // Get the middle node of the list
    private ItemNode getMiddle(ItemNode head) {
        if (head == null) {
            return null;
        }

        ItemNode slow = head;
        ItemNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge two sorted lists
    private ItemNode sortedMerge(ItemNode left, ItemNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        ItemNode result;

        if (left.name.compareToIgnoreCase(right.name) <= 0) {
            result = left;
            result.next = sortedMerge(left.next, right);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }

        return result;
    }

    // Display all item records
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        ItemNode current = head;
        System.out.println("Item Records");
        while (current != null) {
            System.out.println("Item Name : " + current.name);
            System.out.println("Item Id : " + current.id);
            System.out.println("Quantity : " + current.quantity);
            System.out.println("Price : " + current.price);
            System.out.println();
            current = current.next;
        }
    }
}
