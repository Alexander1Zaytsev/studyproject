package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.dao.AdDao;
import com.brainacad.studyproject.data.domain.Ad;

import java.util.Collection;

/**
 * Created by Alexander on 11/22/2016.
 */
public class JdbcAdDao implements AdDao {

    @Override
    public Ad getAddByShort(String shortDescript) {
        return null;
    }

    @Override
    public Ad get(int id) {
        return null;
    }

    @Override
    public int add(Ad entity) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Ad entity) {
        return false;
    }

    @Override
    public Collection<Ad> getAll() {
        return null;
    }
}
