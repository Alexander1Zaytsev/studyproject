package com.brainacad.studyproject.service;

import com.brainacad.studyproject.data.domain.Role;

/**
 * Created by Alexander on 11/3/2016.
 */
public interface LoginService {

    Role login(String username, String password);
    int getUserId(String username, String password);
}
