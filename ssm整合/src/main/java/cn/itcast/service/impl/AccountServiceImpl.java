package cn.itcast.service.impl;


import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
   private AccountDao accountDao;

    @Override
    public List<Account> findall() {
        System.out.println("业务层查找所有信息");
        return accountDao.findall();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存信息");
        accountDao.saveAccount(account);

    }

    @Override
    public void delete(String name) {
        System.out.println("删除信息成功");
        accountDao.delete(name);
    }

}
