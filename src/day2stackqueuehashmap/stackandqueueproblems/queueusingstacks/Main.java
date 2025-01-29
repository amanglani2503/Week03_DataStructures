package day2stackqueuehashmap.stackandqueueproblems.queueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();
        System.out.println("Removing element : " + queue.dequeue());
        queue.display();
    }
}
