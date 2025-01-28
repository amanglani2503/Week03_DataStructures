package day1linkedlist.doublylinkedlist.undoredooperation;

public class StateNode {
    String state;  // Represents the state of the text
    StateNode prev, next;  // Pointers to the previous and next nodes

    public StateNode(String state) {
        this.state = state;
        this.prev = null;
        this.next = null;
    }
}
