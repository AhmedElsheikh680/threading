package com.threading.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements Runnable{

    public synchronized void print(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(
                    new FileReader("D:\\Spring\\intellij\\todo-api-main\\threading\\src\\main\\java\\com\\threading\\files\\history.txt"));
            String line = reader.readLine();
            while (line != null){
                System.out.println(Thread.currentThread().getName() + " " + line);
                line = reader.readLine();
            }
            reader.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.print();
    }
}
