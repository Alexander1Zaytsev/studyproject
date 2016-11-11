package com.brainacad.studyproject;

import com.brainacad.studyproject.data.core.StubDataHolder;
import com.brainacad.studyproject.data.dao.impl.JdbcUserDao;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.gui.view.ViewRouter;

import java.awt.*;

/**
 * Created by User on 27/10/2016.
 */
public class Application {

//    public static void main(String[] args) {
//
////        System.out.println("Hello!");
//
//        StubDataHolder.createData();
//
//        LoginServiceImpl loginService = new LoginServiceImpl();
//
//        if (loginService.login("user","user")) {
//            System.out.println("Success success");
//        } else {
//            System.out.println("Login failed");
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/brain?useUnicode\\\\=true&characterEncoding\\\\=UTF-8","root","root");
//            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
//
//            ResultSet resultSet = statement.executeQuery();
//
//            if (resultSet != null){
//                while (resultSet.next()){
//                    System.out.println(resultSet.getInt("user_id") + " " + resultSet.getString("username"));
//                }
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }

    public static void main(String[] args) {

//        JdbcUserDao dao = new JdbcUserDao();
//        User admin = dao.getUserByName("admin");
//        System.out.println(admin);

        StubDataHolder.createData();

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewRouter viewRouter = ViewRouter.getInstance();
                viewRouter.start();
            }
        });
    }
}
