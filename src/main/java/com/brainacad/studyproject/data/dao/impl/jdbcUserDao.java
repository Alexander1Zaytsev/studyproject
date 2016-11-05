package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.core.ConnectionManager;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.domain.User;

/**
 * Created by User on 05/11/2016.
 */
public class jdbcUserDao implements UserDao {

    private ConnectionManager connectionManager;

    @Override
    public User getUserByName(String username) {
        return null;
    }
}
