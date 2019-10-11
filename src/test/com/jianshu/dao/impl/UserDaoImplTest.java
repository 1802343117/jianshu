package com.jianshu.dao.impl;

import cn.hutool.db.Entity;
import com.jianshu.dao.UserDao;
import com.jianshu.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImplTest {
private UserDao userDao = DaoFactory.getUserDaoInstance();
    @Test
    public void findAll() {

            List<Entity> entityList = null;
            try {
    entityList = userDao.findAll();
} catch (SQLException e) {
        System.err.println("查询用户数据出现异常");
        }
        if (entityList != null) {
        entityList.forEach(entity -> System.out.println(entity.get("nickname")));
        } else {
        System.out.println("没有数据");
        }
        }



    }
