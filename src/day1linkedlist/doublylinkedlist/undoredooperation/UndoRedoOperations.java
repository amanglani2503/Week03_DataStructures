package day1linkedlist.StateList.undoredooperation;

import day1linkedlist.doublylinkedlist.undoredooperation.StateList;

import java.util.Scanner;

public class UndoRedoOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the doubly linked list with a max history size of 10
        StateList history = new StateList(10);

        boolean running = true;

        System.out.println("Welcome to the Text Editor!");
        System.out.println("Commands: add <text>, undo, redo, display, exit");

        while (running) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();

            if (input.startsWith("add ")) {
                String newState = input.substring(4);
                history.addState(newState);
                System.out.println("Added: " + newState);
            } else if (input.equals("undo")) {
                System.out.println("Undo: " + history.undo());
            } else if (input.equals("redo")) {
                System.out.println("Redo: " + history.redo());
            } else if (input.equals("display")) {
                System.out.println("Current State: " + history.getCurrentState());
            } else if (input.equals("exit")) {
                running = false;
            } else {
                System.out.println("Invalid command!");
            }
        }

        scanner.close();
        System.out.println("Exiting the Text Editor. Goodbye!");
    }
}
