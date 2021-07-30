package com.threading.awaitandsignal;

public class Test3 {
    public static void main(String[] args) {
        User user = new User();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.user1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.user2();
            }
        });
        t1.start();
        t2.start();
    }
}
