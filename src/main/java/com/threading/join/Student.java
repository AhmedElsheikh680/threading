package com.threading.join;

public class Student implements Runnable{


    @Override
    public  void run() {
        for(int i=0; i<5; i++){
            System.out.println("YES " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
