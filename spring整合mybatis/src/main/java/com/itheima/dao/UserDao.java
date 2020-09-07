package com.itheima.dao;


import com.itheima.domin.Account;
import com.itheima.domin.User;

import java.util.List;

public interface UserDao {

    List<User> findUser();
    void saveUser(User user);
    void deleteUser();
    List<User> findbyid(Integer id);
    List<User> findchoose(List<Integer> id);
    List<Double> find(Account account);


}
