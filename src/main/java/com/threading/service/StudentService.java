package com.threading.service;

import com.threading.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();
    public Student editStudent(Student student);
}
