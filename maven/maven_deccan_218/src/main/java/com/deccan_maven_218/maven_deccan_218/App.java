package com.deccan_maven_218.maven_deccan_218;

import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection connect = DBConnection.getConnection()) {
            System.out.println("Connected to DB");

            while (true) {
                System.out.println("\n1. View Employees\n2. Add Employee\n3. Delete Employee\n4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        String viewQuery = "SELECT id, name FROM employees";
                        PreparedStatement viewStmt = connect.prepareStatement(viewQuery);
                        ResultSet result = viewStmt.executeQuery();
                        while (result.next()) {
                            System.out.println("ID: " + result.getInt("id") + ", Name: " + result.getString("name"));
                        }
                        break;

                    case 2:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter Employee Name: ");
                        String name = scanner.nextLine();
                        String insertQuery = "INSERT INTO employees(id, name) VALUES (?, ?)";
                        PreparedStatement insertStmt = connect.prepareStatement(insertQuery);
                        insertStmt.setInt(1, id);
                        insertStmt.setString(2, name);
                        insertStmt.executeUpdate();
                        System.out.println("Employee Added!");
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to delete: ");
                        int delId = scanner.nextInt();
                        String deleteQuery = "DELETE FROM employees WHERE id = ?";
                        PreparedStatement deleteStmt = connect.prepareStatement(deleteQuery);
                        deleteStmt.setInt(1, delId);
                        int rows = deleteStmt.executeUpdate();
                        if (rows > 0) {
                            System.out.println("Employee Deleted!");
                        } else {
                            System.out.println("Employee Not Found!");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        connect.close();
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
