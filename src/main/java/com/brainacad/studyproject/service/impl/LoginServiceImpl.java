package com.brainacad.studyproject.service.impl;

import com.brainacad.studyproject.data.dao.DaoFactory;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.service.LoginService;

/**
 * Created by Alexander on 11/3/2016.
 */
public class LoginServiceImpl implements LoginService{

   private UserDao userDao = DaoFactory.getDaoFactory().getUserDao();
//    private UserDao userDao = new JdbcUserDao();

    @Override
    public boolean login(String username, String password) {

        User user = userDao.getUserByName(username);
        return user != null && password.equals(user.getPassword());
    }
}
