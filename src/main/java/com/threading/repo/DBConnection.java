package com.threading.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/threads?zeroDateTimeBehavior=convertToNull";
    private static Connection connection = null;

    public DBConnection() {
    }
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            connection = (Connection) DriverManager.getConnection(
                    URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            connection.rollback();
        }
        return connection;
    }
}
