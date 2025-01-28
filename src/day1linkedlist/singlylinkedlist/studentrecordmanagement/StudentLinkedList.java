package day1linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentLinkedList {
    private StudentNode head;

    // Add a student record at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add a student record at the end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add a student record at a specific position
    public void addAtPosition(int rollNumber, String name, int age, char grade, int position) {
        if (position < 1) {
            System.out.println("Position must be greater than or equal to 1.");
            return;
        }

        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        StudentNode current = head;
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

    // Delete a student record by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty. No records to delete.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
            return;
        }

        StudentNode current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
        }
    }

    // Search for a student record by Roll Number
    public void searchByRollNumber(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll Number: " + current.rollNumber + ", Name: " + current.name +
                        ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Update a student's grade by Roll Number
    public void updateGrade(int rollNumber, char newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Display all student records
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode current = head;
        System.out.println("Student Records:");
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name +
                    ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
}
