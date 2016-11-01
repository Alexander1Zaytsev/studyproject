package com.brainacad.studyproject.data.cor;

import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;
import java.util.HashSet;

import static com.brainacad.studyproject.data.domain.Role.ADMIN;
import static com.brainacad.studyproject.data.domain.Role.USER;

/**
 * Created by User on 01/11/2016.
 */
public class StabDataHolder {

    private static Collection<User> users;
    private static boolean created = false;


    public static void createData(){

        if (!created) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setRole(ADMIN);

            User user = new User();
            user.setUsername("user");
            user.setPassword("user");
            user.setRole(USER);

            users = new HashSet<>();
            users.add(admin);
            users.add(user);

            created = true;
        }
    }

    public static Collection<User> getUsers(){
        return users;
    }

}
