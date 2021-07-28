package com.threading.revision;

public class User extends Thread{

    private String value;

    public User(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        this.print();
    }

    public void print(){
        for(int i=0; i<5; i++){
            System.out.println(value);
        }
    }
}
