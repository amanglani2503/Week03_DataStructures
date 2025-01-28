package day1linkedlist.singlylinkedlist.socialmediafriendsconnection;

public class FriendListManagement {
    public static void main(String[] args) {
        FriendList friendList = new FriendList();

        // Add users
        friendList.addUser(1, "Alice", 25);
        friendList.addUser(2, "Bob", 30);
        friendList.addUser(3, "Charlie", 22);

        // Add friend connections
        friendList.addFriendConnection(1, 2);
        friendList.addFriendConnection(1, 3);

        // Display friends
        friendList.displayFriends(1);

        // Find mutual friends
        friendList.findMutualFriends(2, 3);

        // Search for a user
        friendList.searchUser("Alice", -1); // Search by name
        friendList.searchUser("", 3); // Search by ID

        // Remove a friend connection
        friendList.removeFriendConnection(1, 2);

        // Display all friends of Alice
        friendList.displayFriends(1);

        // Count friends for each user
        friendList.countFriends();
    }
}
