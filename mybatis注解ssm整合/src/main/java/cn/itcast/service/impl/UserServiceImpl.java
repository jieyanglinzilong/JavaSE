package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserDao {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUser() {
        System.out.println("查询用户信息成功");
        return null;
    }

    @Override
    public void saveUser() {

    }

    @Override
    public void deleteUser() {

    }
}
