package com.threading.waitandnotify;

public class Test2 {
    public static void main(String[] args) {
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
}
