package com.jianshu.dao;

import cn.hutool.db.Entity;
import com.jianshu.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    /**
     * 查询所有用户
     * @return List<Entity>
     * @throws SQLException
     */
    List<Entity> findAll() throws SQLException;

    int insertUser(User user) throws SQLException;

    /**
     * 根据id删除用户，返回受影响的行数
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteUserById(int id) throws SQLException;

    /**
     * 根据id查找用户
     * @param id
     * @return
     * @throws SQLException
     */
    Entity getUser(int id) throws SQLException;

    /**
     * 更新用户信息
     * @param id
     * @return
     * @throws SQLException
     */
    int updateUser(User user)throws SQLException;
}