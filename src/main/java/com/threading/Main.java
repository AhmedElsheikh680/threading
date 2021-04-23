package com.threading;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("User 1");
        Thread thread1 = new Thread(user1);
       thread1.start();


        User user2 = new User("User 2");
        Thread thread2 = new Thread(user2);

    thread2.start();

        User user3 = new User(" User 3");
        Thread thread3 = new Thread(user3);
        thread3.start();
    }
}
