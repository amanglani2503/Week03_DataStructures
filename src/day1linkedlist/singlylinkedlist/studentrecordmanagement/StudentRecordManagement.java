package day1linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Add student records
        studentList.addAtBeginning(1, "Alice", 20, 'A');
        studentList.addAtEnd(2, "Bob", 21, 'B');
        studentList.addAtPosition(3, "Charlie", 22, 'C', 2);

        // Display all student records
        studentList.displayAllRecords();

        // Search for a student record by Roll Number
        studentList.searchByRollNumber(2);

        // Update a student's grade
        studentList.updateGrade(2, 'A');
        studentList.displayAllRecords();

        // Delete a student record
        studentList.deleteByRollNumber(3);
        studentList.displayAllRecords();

        // Attempt to delete a non-existent record
        studentList.deleteByRollNumber(5);
    }
}
