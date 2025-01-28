package day1linkedlist.circularlinkedlist.TaskScheduler;

public class TaskManagement {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addAtBeginning(1, "Abc", 2, "28-02-2025");
        taskList.addAtBeginning(2, "Def", 3, "29-01-2025");

        taskList.addAtEnd(3, "Ghi", 3, "28-01-2025");
        taskList.addAtPosition(4, "Jkl", 5, "27-01-2025", 4);

        //taskList.removeById(2);
        taskList.searchByPriority(3);
//        taskList.display();
    }
}
