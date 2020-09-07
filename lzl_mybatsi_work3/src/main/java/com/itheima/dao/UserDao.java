package com.itheima.dao;

import com.itheima.domin.User;

import java.util.List;

public  interface  UserDao {
    List<User> find();
    void update(int id);
}
