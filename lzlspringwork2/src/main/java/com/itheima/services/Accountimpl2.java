package com.itheima.services;

import com.itheima.dao.AccountDao;
import com.itheima.domin.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class Accountimpl2 implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Account> add(Account account) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void tranfer(String outUser, String inUser, int num) {
        this.jdbcTemplate.update("update account left join user  on user.id=account.uid  set account.money=account.money+? "
                +"where user.name = ?",num,inUser );
        this.jdbcTemplate.update("update account left join user on user.id=account.uid  set account.money=account.money-? "
                +"where user.name =?",num,outUser );
        System.out.println("转账成功");

    }
}
