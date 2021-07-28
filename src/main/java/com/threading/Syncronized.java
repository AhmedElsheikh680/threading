package com.threading;

public class Syncronized {

    Object ob = new Object();

    public void print(Object object) {
        synchronized (ob) {
            for (int i = 0; i < 5; i++) {
                System.out.println(object);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
