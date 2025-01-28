package day1linkedlist.circularlinkedlist.TaskScheduler;

public class TaskNode {
    int taskId;
    String name;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String name, int priority, String dueDate) {
        this.taskId = taskId;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
