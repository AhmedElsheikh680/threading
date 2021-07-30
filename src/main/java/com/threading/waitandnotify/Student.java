package com.threading.waitandnotify;

public class Student {

    private String name;

    private int age;

    public synchronized void setName(String name) {
        this.name = name;
        notify();

        System.out.println("Name: "+ name);
    }

    public synchronized void setAge(int age) {
        this.age = age;
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Age: "+ age);
    }
}
