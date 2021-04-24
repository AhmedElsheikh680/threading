package com.threading;

public class Main {

    public static void main(String[] args) {

        Syncronized syncronized = new Syncronized();
        User user1 = new User(syncronized);
        Thread thread1 = new Thread(user1);
        thread1.start();

        Person person = new Person(syncronized);
        Thread thread2 = new Thread(person);
        thread2.start();
    }
}
