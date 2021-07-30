package com.threading.waitandnotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {

    private static int counter=0;
    private static Lock lock = new ReentrantLock();
    public static  void increment(){
        lock.lock();
        for (int i=0; i<5000; i++)
        counter++;
        lock.unlock();
    }
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               increment();
           }
       });

       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {
               increment();
           }
       });
       t1.start();
       t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);

    }
}
/*
 Student student = new Student();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    student.addUser();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    student.removeUser();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
 */
/*
        Student student = new Student();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                student.setName("Ahmed");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                student.setAge(25);
            }
        });
        t2.start();
        t1.start();
    }
 */
