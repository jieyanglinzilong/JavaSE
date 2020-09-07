package cn.itcast.dao;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountIDao {
    List<Account> find();
}
