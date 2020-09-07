package com.itheima.services;

import com.itheima.dao.AccountDao;
import com.itheima.domin.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Accountimpl implements AccountDao {
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

    @Override
    public void tranfer(String outUser, String inUser, int num) {
        this.jdbcTemplate.update("update account left join user  on user.id=account.uid  set account.money=account.money+? "
                +"where user.name = ?",num,inUser );
        this.jdbcTemplate.update("update account left join user on user.id=account.uid  set account.money=account.money-? "
                +"where user.name =?",num,outUser );
        System.out.println("转账成功");

    }
}
