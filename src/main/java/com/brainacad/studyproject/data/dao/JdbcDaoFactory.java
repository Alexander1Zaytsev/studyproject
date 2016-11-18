package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;

/**
 * Created by Alexander on 11/18/2016.
 */
public class JdbcDaoFactory extends DaoFactory {
    @Override
    public UserDao getUserDao() {
        return new JdbcUserDao();
    }
}
