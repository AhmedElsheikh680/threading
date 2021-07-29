package com.threading;

//import com.threading.controller.StudentController;
//import com.threading.files.ReadFile;

import com.threading.files.ReadFile;

public class Main {

    public static void main(String[] args) {



//        Thread thread = new Thread(new StudentController());
//        thread.start();
        ReadFile readFile = new ReadFile();
        Thread t1 = new Thread(readFile);
        t1.start();
        Thread t2 = new Thread(readFile);
        t2.start();
        Thread t3 = new Thread(readFile);
        t3.start();
//        StudentController studentController = new StudentController();
//        studentController.editAllStudents();

    }

}
    /*

        Syncronized syncronized = new Syncronized();
        User user1 = new User(syncronized);
        Thread thread1 = new Thread(user1);
        thread1.start();

        Person person = new Person(syncronized);
        Thread thread2 = new Thread(person);
        thread2.start();
     */