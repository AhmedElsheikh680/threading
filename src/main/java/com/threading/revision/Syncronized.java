package com.threading.revision;

public class Syncronized {
    Object o = new Object();
    public void print(Object ob){
        synchronized (o){
            for(int i=0; i<3; i++){
                System.out.println(ob);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

//    public synchronized void print(Object o){
//        for(int i=0; i<5; i++){
//            System.out.println(o);
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
