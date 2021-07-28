package com.threading;

public class Person implements Runnable {

    private Syncronized syncronized;

    public Person(Syncronized syncronized) {
        this.syncronized = syncronized;
    }

    public void run() {
        this.syncronized.print("Person");
    }
}
