package com.impl;

import com.dao.IAccountDao;
import com.dao.Userdao;
import com.dao.services;
import com.domin.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userServices")
public class servicesimpl implements services {
    @Resource(name="userdao")
    private Userdao userdao;

    public void findbyid(Integer id) {
        System.out.println(this.accountDao.findAccountById(id));

    }

    //@Resource(name="accountDao")
    @Autowired
    private IAccountDao accountDao;



    public void find() {
       // this.userdao.save();
        System.out.println("服务启动成功");
        List<Account> accountList=this.accountDao.findAllAccount();

        for(Account account:accountList){
           System.out.println(account);
        }

    }
    public void save(Account account){
        System.out.println("服务启动成功");
        this.accountDao.saveAccount(account);

    }
}
