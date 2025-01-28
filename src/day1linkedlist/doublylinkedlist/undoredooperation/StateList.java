package day1linkedlist.doublylinkedlist.undoredooperation;

public class StateList {
    private StateNode head, tail, current;
    private final int maxSize;
    private int size;

    public StateList(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.head = this.tail = this.current = null;
    }

    // Add or append text to the current state
    public void addState(String newText) {
        String combinedText = (current != null) ? current.state + newText : newText; // Append to the current state
        StateNode newNode = new StateNode(combinedText);

        // If adding after undo, clear redo history
        if (current != null && current.next != null) {
            current.next = null;
            tail = current;
        }

        // Add the new node to the end
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        current = tail;
        size++;

        // If exceeding max size, remove the oldest state
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public String undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.state;
        }
        return "Nothing to undo!";
    }

    // Redo operation
    public String redo() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.state;
        }
        return "Nothing to redo!";
    }

    // Get current state
    public String getCurrentState() {
        return (current != null) ? current.state : "No states available!";
    }
}
