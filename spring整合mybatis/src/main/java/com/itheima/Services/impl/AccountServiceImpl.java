package com.itheima.Services.impl;



import com.itheima.Services.AccountService;
import com.itheima.dao.AccountDao;
import com.itheima.domin.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
   private AccountDao accountDao;


    public void update(Account account) {
        System.out.println("转账");

        accountDao.update(account);

    }

    public List<Account> findall() {
        System.out.println("业务层查找所有信息");
        return accountDao.findall();
    }


    public void saveAccount(Account account) {
        System.out.println("业务层保存信息");
        accountDao.saveAccount(account);

    }


    public void delete(String name) {
        System.out.println("删除信息成功");
        accountDao.delete(name);
    }
    public  void findMoney(){
        List<Double> doubles=accountDao.findMoney();

        for(double doubles1:doubles){

            System.out.println(doubles1);
        }
    }

}
