package day1linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentNode {
    int rollNumber;
    String name;
    int age;
    char grade;
    StudentNode next;

    // Constructor
    public StudentNode(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
