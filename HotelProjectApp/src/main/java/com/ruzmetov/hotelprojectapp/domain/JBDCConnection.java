package com.ruzmetov.hotelprojectapp.domain;

import java.sql.*;

public class JBDCConnection {

    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/300523_m_be_hotel", "root", "Welcome!1");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from customer");
            System.out.println(resultSet.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
