package org.example;

import java.sql.*;

public class InsertingValueForAdmin {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/database_name"; // Replace "database_name" with your actual database name
        String username = "your_username"; // Replace with your actual database username
        String password = "your_password"; // Replace with your actual database password

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO tbladmin (email, password, name) VALUES (?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(query)) {
                statement.setString(1, "admin@gmail.com");
                statement.setString(2, "admin");
                statement.setString(3, "DataFlair");

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new row has been inserted into tbladmin.");
                } else {
                    System.out.println("Failed to insert a new row into tbladmin.");
                }
            }
        }
    }
}
