package day2stackqueuehashmap.stackandqueueproblems.sortingstack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        StackSorter.sort(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}