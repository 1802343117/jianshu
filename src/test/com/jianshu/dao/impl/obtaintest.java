package com.jianshu.dao.impl;

import com.jianshu.dao.UserDao;
import com.jianshu.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.time.LocalDate;

public class obtaintest {
    private UserDao userDao = new UserDaoImpl();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void insertUser()throws SQLException{
        User user = new User();
        user.setAccount("test2");
        user.setPassword("111");
        user.setNickname("csyh");
        user.setAvatar("http://img5.imgtn.bdimg.com/it/u=393294895,1959099430&fm=26&gp=0.jpg");
        user.setAddress("江苏南京");
        user.setJoinDate(LocalDate.now());
        int id = userDao.insertUser(user);
        System.out.println(id);
    }
}
