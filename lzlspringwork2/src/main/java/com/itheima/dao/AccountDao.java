package com.itheima.dao;

import com.itheima.domin.Account;

import java.util.List;

public interface AccountDao {
    List<Account> add(Account account);
    void tranfer(String outUser ,String inUser,int num);
}
