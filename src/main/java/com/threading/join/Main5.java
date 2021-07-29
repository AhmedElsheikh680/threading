package com.threading.join;

public class Main5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Student());
        t1.start();

        Thread t2 = new Thread(new User());
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH");
    }
}
