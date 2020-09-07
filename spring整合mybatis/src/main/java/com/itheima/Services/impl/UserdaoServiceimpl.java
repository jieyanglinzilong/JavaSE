package com.itheima.Services.impl;

import com.itheima.Services.UserdaoService;
import com.itheima.dao.UserDao;
import com.itheima.domin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserdaoServiceimpl implements UserdaoService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> find() {




        return null;
    }
}
