package com.threading.controller;

import com.threading.model.Student;
import com.threading.service.StudentServiceimpl;

import java.util.List;

public class StudentController implements  Runnable{

    private StudentServiceimpl studentServiceimpl = new StudentServiceimpl();

    @Override
    public void run(){
        System.out.println("1111111111111111111");
        List<Student> students = this.studentServiceimpl.getStudents();
        System.out.println("222222222222222222222222222222");
        for(int i=0; i<students.size(); i++){
            System.out.println("333333333333333333333333");
            this.studentServiceimpl.editStudent(students.get(i));
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
