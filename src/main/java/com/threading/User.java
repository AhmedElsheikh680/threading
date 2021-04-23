package com.threading;

public class User implements Runnable {

    private String value;

    public User(String value) {
        this.value = value;
    }



    public void print(){
        for(int i=0; i<5; i++){
            System.out.println(value);
        }
    }

    public void run() {
        this.print();
    }
}
