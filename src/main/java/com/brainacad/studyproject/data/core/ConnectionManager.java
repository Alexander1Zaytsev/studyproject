package com.brainacad.studyproject.data.core;

import java.sql.*;

/**
 * Created by User on 05/11/2016.
 */
public class ConnectionManager {

    private static ConnectionManager instance;

    private ConnectionManager() {

    }

    public static ConnectionManager getInstance() {

        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/brain?useUnicode\\\\=true&characterEncoding\\\\=UTF-8", "root", "root56");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");

            ResultSet resultSet = statement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("user_id") + " " + resultSet.getString("username"));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
