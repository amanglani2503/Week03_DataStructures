package day1linkedlist.singlylinkedlist.socialmediafriendsconnection;

import java.util.ArrayList;

public class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds; // List of friend IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
