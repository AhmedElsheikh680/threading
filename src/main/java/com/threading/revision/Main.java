package com.threading.revision;

public class Main {
    public static void main(String[] args) {

        Syncronized syncronized = new Syncronized();
        User user1 = new User(syncronized);
        Thread t1 = new Thread(user1);
        t1.start();

        Person person = new Person(syncronized);
        Thread t2 = new Thread(person);
        t2.start();

    }
}

/*
        User user1 = new User("User 1");
        Thread thread1 = new Thread(user1);
        thread1.start();

        User user2 = new User("User 2");
        Thread thread2 = new Thread(user2);
        thread2.start();

        User user3 = new User("User 3");
        Thread thread3 = new Thread(user3);
        thread3.start();
 */
