package com.threading.revision;

public class User implements Runnable{

    private RenntrantLock renntrantLock;

    public User(RenntrantLock renntrantLock) {
        this.renntrantLock = renntrantLock;
    }

    public void run() {
        this.renntrantLock.print("User");
    }
}
/*
    private Syncronized syncronized;

    public User(Syncronized syncronized) {
        this.syncronized = syncronized;
    }


    public void run() {
        this..print("User");
    }
 */

/*


    private String value;

    public User(String value) {
        this.value = value;
    }



    public void print(){
        for(int i=0; i<5; i++){
            System.out.println(value);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void run() {
        this.print();
    }
 */
