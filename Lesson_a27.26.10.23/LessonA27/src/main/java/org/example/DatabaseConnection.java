package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    //database Connection online shopping system
    public static Connection connection;

    //universal method to open connect will mysql database
    public static Connection getConnection() {
        try {
            //Registering
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingsystem", "root", "yourpassword");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (connection);
    }

    //universal method to close connect will mysql database
    public static void CloseConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //universal method to query for retrieving information
    public static ResultSet getResultFromSqlQuery(String SqlQueryString) {
        //Resultset object
        ResultSet rs = null;
        try {
            //Checking the connection
            if (connection == null) {
                getConnection();
            }
            //Querying the query
            rs = connection.createStatement().executeQuery(SqlQueryString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    //universal method to query for inserting or updating information in mysql database
    public static int insertUpdateFromSqlQuery(String SqlQueryString) {
        int i = 2;
        try {
            //Checking the connection
            if (connection == null) {
                getConnection();
            }
            //Querying the query
            i = connection.createStatement().executeUpdate(SqlQueryString);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return i;
    }
}
