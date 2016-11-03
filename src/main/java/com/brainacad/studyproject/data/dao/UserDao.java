package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.User;

/**
 * Created by Alexander on 11/3/2016.
 */
public interface UserDao {

    User getUserByName(String username);

}
