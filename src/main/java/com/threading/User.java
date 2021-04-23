package com.threading;

public class User implements Runnable {

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
}
