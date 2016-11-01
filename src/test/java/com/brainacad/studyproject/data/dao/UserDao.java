package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.domain.User;

/**
 * Created by User on 01/11/2016.
 */
public interface UserDao {

    User getUserByName(String username);

}
