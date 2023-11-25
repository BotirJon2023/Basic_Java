package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "CREATE TABLE tblcart ("
                    + "id BIGINT(20) NOT NULL AUTO_INCREMENT,"
                    + "discount_price VARCHAR(200) DEFAULT NULL,"
                    + "quantity INT(11) NOT NULL,"
                    + "total_price VARCHAR(200) DEFAULT NULL,"
                    + "customer_id BIGINT(20) NOT NULL,"
                    + "product_id BIGINT(20) NOT NULL,"
                    + "mrp_price VARCHAR(200) DEFAULT NULL,"
                    + "PRIMARY KEY (id)"
                    + ")";

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(query);
                System.out.println("Table tblcart created successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
