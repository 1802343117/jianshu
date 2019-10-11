package com.jianshu.dao;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<Entity> findAll() throws SQLException;

}