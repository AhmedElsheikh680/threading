package com.threading.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Thread t1 = new Thread(user);
        Thread t2 = new Thread(user);
        Thread t3 = new Thread(user);
        Thread t4 = new Thread(user);
        Thread t5 = new Thread(user);

        List<Thread> threads = new ArrayList<Thread>();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
        ExecutorService ex = Executors.newFixedThreadPool(2);
        for(Thread t: threads){
            ex.submit(t);
        }

    }
}
/*
     RenntrantLock r = new RenntrantLock();
        User user = new User(r);
        Thread t1 = new Thread(user);
        t1.start();

        Person person = new Person(r);
        Thread t2 = new Thread(person);
        t2.start();
 */
/*

        Syncronized syncronized = new Syncronized();
        User user1 = new User(syncronized);
        Thread t1 = new Thread(user1);
        t1.start();

        Person person = new Person(syncronized);
        Thread t2 = new Thread(person);
        t2.start();
 */

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
