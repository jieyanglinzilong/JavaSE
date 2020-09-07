package com.itheima.Services;


import com.itheima.domin.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountService {

    List<Account> findall();
    void saveAccount(Account account);
    void delete(String name);
    public  void findMoney();
    public void update(Account account);
}
