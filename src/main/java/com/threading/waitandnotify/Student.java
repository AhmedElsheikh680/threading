package com.threading.waitandnotify;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<String> users = new ArrayList<>();
    private int counter=0;

    public synchronized void addUser() throws InterruptedException {
        while (true){
            if(users.size() != 5){
                users.add("User "+ ++counter);
                System.out.println("Add User "+ counter);
                notify();
            }else {
                System.out.println("Waiting For Removing");
                wait();
            }
            Thread.sleep(500);
        }
    }

    public synchronized void removeUser() throws InterruptedException {
        while (true){
            if(users.isEmpty()){
                System.out.println("Waiting For Add");
                wait();
            }else{
                System.out.println("Remove User "+ users.remove(--counter));
                notify();
            }
            Thread.sleep(500);
        }
    }

}
/*

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
 */
