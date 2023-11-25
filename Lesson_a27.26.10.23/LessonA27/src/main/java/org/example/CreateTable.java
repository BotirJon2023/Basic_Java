package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
    public static void main(String[] args) {

        // Database connection details
        String url = "jdbc:mysql://localhost:3306/database_name";
        String username = "your_username";
        String password = "your_password";

        // SQL statement to create table
        String sql = "CREATE TABLE tbladmin (" +
                "id bigint(20) NOT NULL AUTO_INCREMENT," +
                "added_date datetime NOT NULL," +
                "email varchar(100) NOT NULL," +
                "password varchar(100) NOT NULL," +
                "name varchar(100) NOT NULL," +
                "PRIMARY KEY (id)" +
                ");";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);

            statement.close();
            connection.close();

            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
