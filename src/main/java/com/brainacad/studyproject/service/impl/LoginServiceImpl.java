package com.brainacad.studyproject.service.impl;

import com.brainacad.studyproject.data.dao.DaoFactory;
import com.brainacad.studyproject.data.dao.JdbcDaoFactory;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;
import com.brainacad.studyproject.data.domain.Role;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.service.LoginService;

import static com.brainacad.studyproject.data.domain.Role.ABSENT;
import static com.brainacad.studyproject.data.domain.Role.ADMIN;
import static com.brainacad.studyproject.data.domain.Role.USER;

/**
 * Created by Alexander on 11/3/2016.
 */
public class LoginServiceImpl implements LoginService{

   private UserDao userDao = DaoFactory.getDaoFactory().getUserDao();


    @Override
    public Role login(String username, String password) {

        User user = userDao.getUserByName(username);
        if (user != null && password.equals(user.getPassword())){
            return user.getRole();
        }
    return ABSENT;
    }

    @Override
    public int getUserId(String username, String password) {
        User user = userDao.getUserByName(username);
        if (user != null && password.equals(user.getPassword())){
            return user.getId();
        }
        return 0;
    }
}
