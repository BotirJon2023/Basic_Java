package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCustomerTableExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        String sql = "CREATE TABLE tblcustomer ("
                + "id INT(11) NOT NULL AUTO_INCREMENT,"
                + "address VARCHAR(255) NOT NULL,"
                + "added_date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,"
                + "email VARCHAR(100) NOT NULL,"
                + "gender VARCHAR(6) NOT NULL,"
                + "name VARCHAR(50) NOT NULL,"
                + "password VARCHAR(60) NOT NULL,"
                + "phone VARCHAR(200) NOT NULL,"
                + "pin_code VARCHAR(255) NOT NULL,"
                + "PRIMARY KEY (id)"
                + ")";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
}
