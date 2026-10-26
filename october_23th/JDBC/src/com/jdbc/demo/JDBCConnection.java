package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/PMIS";
        String username = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(
                url, username, password)) {

            System.out.println("MySQL connected successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
