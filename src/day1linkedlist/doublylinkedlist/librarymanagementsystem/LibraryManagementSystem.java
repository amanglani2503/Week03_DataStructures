package day1linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookList library = new BookList();

        // Adding books
        library.addAtEnd("Harry Potter", "J.K. Rowling", "Fantasy", 1, true);
        library.addAtBeginning("The Hobbit", "J.R.R. Tolkien", "Fantasy", 2, true);
        library.addAtPosition("1984", "George Orwell", "Dystopian", 3, true, 2);

        // Display books
        library.displayForward();

        // Search for a book
        library.searchBook("The Hobbit");

        // Update availability
        library.updateAvailability(3, false);

        // Display in reverse
        library.displayReverse();

        // Count books
        System.out.println("Total books in library: " + library.countBooks());

        // Remove a book
        library.removeByBookId(2);
        library.displayForward();
    }
}
