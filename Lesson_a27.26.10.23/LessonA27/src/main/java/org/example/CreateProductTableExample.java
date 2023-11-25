package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateProductTableExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbname";
        String username = "username";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement statement = conn.createStatement()) {
            String sql = "CREATE TABLE tblproduct (" +
                    "id bigint(20) NOT NULL AUTO_INCREMENT," +
                    "active varchar(100) DEFAULT NULL," +
                    "code varchar(5) DEFAULT NULL," +
                    "create_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP," +
                    "description varchar(255) DEFAULT NULL," +
                    "image varchar(100) DEFAULT NULL," +
                    "image_name varchar(400) DEFAULT NULL," +
                    "name varchar(30) DEFAULT NULL," +
                    "price varchar(200) DEFAULT NULL," +
                    "mrp_price varchar(200) DEFAULT NULL," +
                    "product_category varchar(100) DEFAULT NULL," +
                    "PRIMARY KEY (id)" +
                    ")";

            statement.executeUpdate(sql);

            System.out.println("Table tblproduct created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

