package com.brainacad.studyproject.gui.view;

import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.service.UserService;
import com.brainacad.studyproject.service.impl.UserServiceImpl;

import javax.swing.*;

import static com.brainacad.studyproject.gui.view.View.EDIT_USER;

/**
 * Created by User on 12/11/2016.
 */
public class EditUserView extends RefreshableView {

    private JButton updateButton;
    private JButton deleteButton;

    private JTextField usernameField;
    private JTextField passwordField;
    private JLabel userIdLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    private UserService userService;


    public EditUserView(){

        userService = new UserServiceImpl();


        userIdLabel = new JLabel("ID");
        userIdLabel.setBounds(70, 54, 86, 14);
        content.add(userIdLabel);

        usernameLabel = new JLabel("Name");
        usernameLabel.setBounds(70, 54, 86, 14);
        content.add(usernameLabel);
        usernameField = new JTextField();
        usernameField.setColumns(10);
        content.add(usernameField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(70, 54, 86, 14);
        content.add(passwordLabel);
        passwordField = new JTextField();
        passwordField.setColumns(10);
        content.add(passwordField);


        updateButton = new JButton("UPDATE");
        createButton.setBounds(131, 165, 89, 23);
        content.add(createButton);
    }


    @Override
    public View getName() {
        return EDIT_USER;
    }

    @Override
    public void refresh(Object... params) {
        User user = userService.getUserById((Integer) params[0]);
        testLabel.setText(user.getId() + ":" + user.getUsername());
    }
}
