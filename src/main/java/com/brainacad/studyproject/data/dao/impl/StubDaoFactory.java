package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.dao.AdDao;
import com.brainacad.studyproject.data.dao.DaoFactory;
import com.brainacad.studyproject.data.dao.UserDao;

/**
 * Created by Alexander on 11/3/2016.
 */
public class StubDaoFactory extends DaoFactory {

    @Override
    public UserDao getUserDao() {
        return new StubUserDao();
    }

    @Override
    public AdDao getAdDao() {
        return new StubAdDao();
    }
}
