package com.threading.revision;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("User 1");
        user1.start();

        User user2 = new User("User 2");
        user2.start();

        User user3 = new User("User 3");
        user3.start();
    }
}
