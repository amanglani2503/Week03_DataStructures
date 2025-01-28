package day1linkedlist.circularlinkedlist.TaskScheduler;

public class TaskLinkedList {
    private TaskNode head;

    public void addAtBeginning(int taskId, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, name, priority, dueDate);
        if (head == null) {
            newNode.next = head = newNode;
            return;
        }

        TaskNode current = head;

        while (current.next != head) {
            current = current.next;
        }

        newNode.next = head;
        current.next = newNode;
        head = newNode;
    }

    public void addAtEnd(int taskId, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, name, priority, dueDate);

        if (head == null) {
            this.addAtBeginning(taskId, name, priority, dueDate);
            return;
        }

        TaskNode current = head;

        while (current.next != head) {
            current = current.next;
        }

        newNode.next = head;
        current.next = newNode;
    }

    public void addAtPosition(int taskId, String name, int priority, String dueDate, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            this.addAtBeginning(taskId, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(taskId, name, priority, dueDate);

        TaskNode current = head;
        while (current.next != head && position > 2) {
            current = current.next;
            position--;
        }

        if (current.next == head && position > 2) {
            System.out.println("Position exceeds list size");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeFirstNode() {
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        TaskNode current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = head.next;
        head = head.next;
    }


    public void removeById(int taskId){
        if(head == null){
            System.out.println("Empty list. No tasks found");
            return;
        }

        if(head.taskId == taskId){
            this.removeFirstNode();
            return;
        }

        TaskNode current = head;
        TaskNode previousToCurrent = head;
        do{
            if(current.taskId == taskId){
                System.out.println("Task Found. Removing !!");
                previousToCurrent.next= current.next;
                return;
            }

            previousToCurrent = current;
            current = current.next;
        } while(current != head);
    }

    public void searchByPriority(int priority){
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        TaskNode current = head;
        while (current.next != head) {
            if(current.priority == priority){
                System.out.println("Task with priority : " + current.priority + " found !");
                System.out.println("Task Name: " + current.name);
                System.out.println("Priority: " + current.priority);
                System.out.println("Due Date: " + current.dueDate);
                System.out.println();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found !!");
    }

    public void display(){
        if(head == null){
            System.out.println("Nothing to display");
            return;
        }

        TaskNode current = head;

        do{
            System.out.println("Task Id :" + current.taskId);
            System.out.println("Task Name: " + current.name);
            System.out.println("Priority: " + current.priority);
            System.out.println("Due Date: " + current.dueDate);
            System.out.println();
            current = current.next;
        } while(current != head);
    }
}
