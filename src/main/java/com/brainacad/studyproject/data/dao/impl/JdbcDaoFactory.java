package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.dao.AdDao;
import com.brainacad.studyproject.data.dao.DaoFactory;
import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.dao.impl.JdbcAdDao;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;

/**
 * Created by Alexander on 11/18/2016.
 */
public class JdbcDaoFactory extends DaoFactory {
    @Override
    public UserDao getUserDao() {
        return new JdbcUserDao();
    }

    @Override
    public AdDao getAdDao() {
        return new JdbcAdDao();
    }
}
