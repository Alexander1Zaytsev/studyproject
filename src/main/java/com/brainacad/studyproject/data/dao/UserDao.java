package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.User;

/**
 * Created by Alexander on 11/3/2016.
 */
public interface UserDao extends CrudDao<User> {

    User getUserByName(String username);

}
