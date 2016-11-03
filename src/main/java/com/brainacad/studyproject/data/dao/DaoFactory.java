package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.dao.impl.StubDaoFactory;

/**
 * Created by Alexander on 11/3/2016.
 */
public abstract class DaoFactory {

    public abstract UserDao getUserDao();
    public static DaoFactory getDaoFactory(){
        return new StubDaoFactory();
    }
}
