package com.brainacad.studyproject.service.impl;

import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.domain.Role;
import com.brainacad.studyproject.data.domain.User;
import com.brainacad.studyproject.service.impl.LoginServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static com.brainacad.studyproject.data.domain.Role.ADMIN;
import static com.brainacad.studyproject.data.domain.Role.USER;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;

/**
 * Created by Alexander on 11/25/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginServiceImplTest {

    private User user;

    @Mock
    private UserDao mockUserDao;

    @Before
    public void setUp(){
        user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRole(ADMIN);
        //mockUserDao = Mockito.mock(UserDao.class);
    }

    @Test
    public void testSuccessLogin(){
        //arrange
        doReturn(user).when(mockUserDao).getUserByName("admin");
        LoginServiceImpl loginService = new LoginServiceImpl(mockUserDao);
        //act
        Role login = loginService.login("admin", "admin");
        //assert
        assertEquals("Wrong login or password", ADMIN, login);
    }
}
