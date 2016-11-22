package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.Ad;

/**
 * Created by Alexander on 11/20/2016.
 */
public interface AdDao extends CrudDao<Ad> {

    Ad getAddByShort(String shortDescript);
}
