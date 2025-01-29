package day2stackqueuehashmap.stackandqueueproblems.queueusingstacks;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public QueueUsingStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.println("Empty Queue !!");
                return 0;
            }

            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack1.isEmpty();
    }

    public void display(){
        System.out.println("\nDisplaying Stack :");
        for (int i = stack2.size() - 1 ; i >= 0 ; i--){
            System.out.print(stack2.get(i) + "  ");
        }

        for(int i = 0 ; i < stack1.size() ; i++){
            System.out.print(stack1.get(i) + "  ");
        }
        System.out.println();
    }
}
