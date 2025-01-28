package day1linkedlist.doublylinkedlist.librarymanagementsystem;

public class BookList {
    private BookNode head;
    private BookNode tail;
    private int count;

    // Add a new book at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }

    // Add a new book at the end
    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    // Add a new book at a specific position
    public void addAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position < 1 || position > count + 1) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        if (position == count + 1) {
            addAtEnd(title, author, genre, bookId, isAvailable);
            return;
        }
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        BookNode current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        count++;
    }

    // Remove a book by Book ID
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("No books available to remove.");
            return;
        }
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current == head && current == tail) { // Only one node
                    head = tail = null;
                } else if (current == head) { // Remove head
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) { // Remove tail
                    tail = tail.prev;
                    tail.next = null;
                } else { // Remove from middle
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                count--;
                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Search for a book by Title or Author
    public void searchBook(String query) {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(query) || current.author.equalsIgnoreCase(query)) {
                System.out.println("Book Found:");
                System.out.println("Title: " + current.title);
                System.out.println("Author: " + current.author);
                System.out.println("Genre: " + current.genre);
                System.out.println("ID: " + current.bookId);
                System.out.println("Available: " + current.isAvailable);
                System.out.println();
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No book found with Title or Author: " + query);
        }
    }

    // Update a book's Availability Status
    public void updateAvailability(int bookId, boolean isAvailable) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                System.out.println("Availability status updated for Book ID " + bookId);
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("Books in Forward Order:");
        BookNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Author: " + current.author);
            System.out.println("Genre: " + current.genre);
            System.out.println("ID: " + current.bookId);
            System.out.println("Available: " + current.isAvailable);
            System.out.println();
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("Books in Reverse Order:");
        BookNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Author: " + current.author);
            System.out.println("Genre: " + current.genre);
            System.out.println("ID: " + current.bookId);
            System.out.println("Available: " + current.isAvailable);
            System.out.println();
            current = current.prev;
        }
    }

    // Count the total number of books
    public int countBooks() {
        return count;
    }
}