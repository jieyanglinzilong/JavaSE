package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.po.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserDao {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findchoose(List<Integer> id) {
        return null;
    }

    @Override
    public List<cn.itcast.po.User> lianhe() {
        return null;
    }

    @Override
    public List<Users> con() {
        return null;
    }

    @Override
    public List<User> findUser() {
        System.out.println("查询用户信息成功");
        return null;
    }

    @Override
    public List<User> findbyid(Integer id) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteUser() {

    }
}
