package com.brainacad.studyproject;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.service.impl.LoginServiceImpl;

/**
 * Created by User on 27/10/2016.
 */
public class Application {

    public static void main(String[] args) {

//        System.out.println("Hello!");

        StubDataHolder.createData();

        LoginServiceImpl loginService = new LoginServiceImpl();

        if (loginService.login("qweqw","qweqweqwe")) {
            System.out.println("Success");
        } else {
            System.out.println("Login failed");
        }
    }
}
