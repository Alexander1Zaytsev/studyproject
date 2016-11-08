package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.core.ConnectionManager;
import com.brainacad.studyproject.data.dao.UserDao;
import static com.brainacad.studyproject.data.domain.Role.*;
import com.brainacad.studyproject.data.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 05/11/2016.
 */
public class jdbcUserDao implements UserDao {

    private ConnectionManager connectionManager = ConnectionManager.getInstance();

    @Override
    public User getUserByName(String username) {

        Connection connection = connectionManager.getConnection();
        User user = null;

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username like ?");
            statement.setString(1,username);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet != null){
                user = new User();
                while (resultSet.next()){
                    user.setId(resultSet.getInt("user_id"));
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                    user.setRole(resultSet.getInt("role_id") == 1 ? ADMIN : USER);
                }
            }
            connectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
