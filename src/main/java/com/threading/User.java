package com.threading;

public class User implements Runnable {

    private Syncronized syncronized;

    public User(Syncronized syncronized) {
        this.syncronized = syncronized;
    }

    public void run() {
        this.syncronized.print("User");
    }
}
