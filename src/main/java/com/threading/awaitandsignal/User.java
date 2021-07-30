package com.threading.awaitandsignal;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class User {
     Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void user1(){
        lock.lock();
        System.out.println("I am Ahmed");
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ahmed 25 Years");
        lock.unlock();
    }
    public void user2(){
        lock.lock();
        System.out.println("I am Mohamed");
        System.out.println("Mohamed 30 Years");
        condition.signal();
        lock.unlock();
    }
}
