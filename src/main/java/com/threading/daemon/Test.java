package com.threading.daemon;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Student());
        t1.start();

        Thread t2 = new Thread(new User());
        t2.setDaemon(true);
        t2.start();
    }
}
