package com.threading.revision;

public class Person implements Runnable{

    private RenntrantLock renntrantLock;

    public Person(RenntrantLock renntrantLock) {
        this.renntrantLock = renntrantLock;
    }

    public void run() {
        this.renntrantLock.print("Person");
    }
}
/*
   private Syncronized syncronized;

    public Person(Syncronized syncronized) {
        this.syncronized = syncronized;
    }
        public void run() {
        this.syncronized.print("Person");
    }
 */