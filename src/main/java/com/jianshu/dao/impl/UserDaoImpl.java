package com.jianshu.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jianshu.dao.UserDao;
import com.jianshu.entity.User;
import com.jianshu.factory.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * @classname:UserController
 * @description:用户控制层
 * @author:zhuoran
 * @Date: 2019/10/10 10:33
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<Entity> findAll() throws SQLException {
        //查询
        return Db.use().query("select * from t_user ORDER BY id DESC ");

    }

    @Override
    public int insertUser(User user) throws SQLException {
        long id = Db.use().insertForGeneratedKey(
                Entity.create("t_user")
                .set("account", user.getAccount())
                .set("password", user.getPassword())
                .set("nickname", user.getNickname())
                .set("avatar", user.getAvatar())
                .set("address", user.getAddress())
                .set("join_date", user.getJoinDate())
                .set("description", user.getDescription())
        );
        return (int) id;
    }

    @Override
    public int deleteUserById(int id) throws SQLException {
        return Db.use().del(Entity.create("t_user").set("id", id));
    }

    @Override
    public Entity getUser(int id) throws SQLException {
        return Db.use().find(Entity.create("t_user").set("id", id)).get(0);
    }

    @Override
    public int updateUser(User user) throws SQLException {
        return Db.use().update(
                Entity.create().set("nickname", user.getNickname()).set("address", user.getAddress()),
                Entity.create("t_user").set("id", user.getId())
        );
    }
}

