package com.threading.daemon;

public class User implements Runnable {
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("User");
        }
    }
}
