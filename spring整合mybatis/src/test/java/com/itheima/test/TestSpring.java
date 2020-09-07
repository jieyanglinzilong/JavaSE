package com.itheima.test;

import com.itheima.Services.AccountService;
import com.itheima.domin.Account;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    @Test
    public  void run1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as=( AccountService) ac.getBean("accountService");
        List<Account> accounts=as.findall();
        for(Account account:accounts){
            System.out.println(account);
        }





    }
    @Test
    public void run2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as=( AccountService) ac.getBean("accountService");
        Account account=new Account();
        account.setMoney(6540);
        account.setUid(1013);
        as.saveAccount(account);
        System.out.println("插入成功");
    }


    @Test
    public void run3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as=( AccountService) ac.getBean("accountService");
        as.findMoney();
    }
    @Test
    public void run4(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService=ac.getBean(AccountService.class);
        accountService.findMoney();
    }
    //配置开发
    @Test
    public void run5(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService=ac.getBean(AccountService.class);
        Account account=new Account();
        account.setAid(3);
        account.setMoney(700);
        accountService.update(account);


    }


}
