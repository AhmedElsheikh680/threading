package com.threading.revision;

import java.util.concurrent.locks.ReentrantLock;

public class RenntrantLock {

    ReentrantLock r = new ReentrantLock();

    public void print(Object ob){
        r.lock();
        for(int i=0; i<5; i++){
            System.out.println(ob);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        r.unlock();
    }
}
