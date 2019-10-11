package com.jianshu.factory;


import com.jianshu.dao.UserDao;
import com.jianshu.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }
}
