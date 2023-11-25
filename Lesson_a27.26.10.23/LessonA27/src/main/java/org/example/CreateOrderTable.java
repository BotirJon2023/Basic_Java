package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateOrderTable {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password")) {
            Statement statement = connection.createStatement();

            String sql = "CREATE TABLE tblorders (id int(11) NOT NULL AUTO_INCREMENT, order_no int(11) DEFAULT NULL, " +
                    "customer_name varchar(200) DEFAULT NULL, mobile_number varchar(100) DEFAULT NULL, " +
                    "email_id varchar(100) DEFAULT NULL, address varchar(400) DEFAULT NULL, address_type varchar(100) DEFAULT NULL, " +
                    "pincode varchar(100) DEFAULT NULL, image varchar(200) DEFAULT NULL, product_name varchar(400) DEFAULT NULL, " +
                    "quantity int(11) DEFAULT NULL, product_price varchar(100) DEFAULT NULL, product_selling_price varchar(100) DEFAULT NULL, " +
                    "product_total_price varchar(100) DEFAULT NULL, order_status varchar(100) DEFAULT NULL, " +
                    "order_date timestamp NULL DEFAULT CURRENT_TIMESTAMP, payment_mode varchar(100) DEFAULT NULL, " +
                    "payment_id int(11) DEFAULT NULL, PRIMARY KEY (id))";

            statement.executeUpdate(sql);

            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
}
