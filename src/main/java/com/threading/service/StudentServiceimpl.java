package com.threading.service;


import com.threading.model.Student;
import com.threading.repo.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceimpl implements StudentService{

    private PreparedStatement preparedstatement = null;
    private String instraction = null;
    //    private int result = 0;
    private Connection connection;
    @Override
    public List<Student> getStudents() {
        try {
            connection = DBConnection.getConnection();
            instraction = "select * from student";
            preparedstatement = connection.prepareStatement(instraction);
            ResultSet rs = preparedstatement.executeQuery();
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                students.add(new Student(rs.getInt(1),rs.getString(2),rs.getTime(3)));
            }
            return students;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public Student editStudent(Student student) {
        try {
            connection = DBConnection.getConnection();
            instraction = "update student set date=? where id=?";
            preparedstatement = connection.prepareStatement(instraction);
            preparedstatement.setString(1,this.getTime());
            preparedstatement.setInt(2,student.getId());
            preparedstatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    public String getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
