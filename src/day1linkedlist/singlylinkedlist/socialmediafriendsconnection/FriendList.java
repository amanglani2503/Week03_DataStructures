package day1linkedlist.singlylinkedlist.socialmediafriendsconnection;

import java.util.HashSet;

public class FriendList {
    private UserNode head;

    // Add a new user to the list
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
        System.out.println("User " + name + " added successfully.");
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove((Integer) userId2);
        user2.friendIds.remove((Integer) userId1);

        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        HashSet<Integer> mutualFriends = new HashSet<>(user1.friendIds);
        mutualFriends.retainAll(user2.friendIds);

        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends found between " + user1.name + " and " + user2.name);
        } else {
            System.out.println("Mutual friends of " + user1.name + " and " + user2.name + ":");
            for (int friendId : mutualFriends) {
                UserNode friend = findUserById(friendId);
                System.out.println("- " + (friend != null ? friend.name : "Unknown"));
            }
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        if (user.friendIds.isEmpty()) {
            System.out.println("No friends found.");
        } else {
            for (int friendId : user.friendIds) {
                UserNode friend = findUserById(friendId);
                System.out.println("- " + (friend != null ? friend.name : "Unknown"));
            }
        }
    }

    // Search for a user by Name or User ID
    public void searchUser(String name, int userId) {
        UserNode current = head;

        while (current != null) {
            if (current.name.equalsIgnoreCase(name) || current.userId == userId) {
                System.out.println("User found: ID = " + current.userId + ", Name = " + current.name + ", Age = " + current.age);
                return;
            }
            current = current.next;
        }

        System.out.println("User not found.");
    }

    // Count the number of friends for each user
    public void countFriends() {
        UserNode current = head;

        while (current != null) {
            System.out.println(current.name + " has " + current.friendIds.size() + " friend(s).");
            current = current.next;
        }
    }

    // Helper method to find a user by ID
    private UserNode findUserById(int userId) {
        UserNode current = head;

        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }

        return null;
    }
}