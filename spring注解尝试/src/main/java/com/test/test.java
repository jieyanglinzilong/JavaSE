package com.test;

import com.Controller.usercontroller;
import com.domin.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void run4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        usercontroller usercontroller=(com.Controller.usercontroller)applicationContext.getBean("Contolltroller");
        usercontroller.findbyid(5);


    }

    @Test
    public void run5(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        usercontroller usercontroller=(com.Controller.usercontroller)applicationContext.getBean("Contolltroller");
        Account account=new Account();
        account.setId(78);
        account.setMoney(980f);
        account.setName("小明");
        usercontroller.save(account);
        System.out.println("插入成功");


    }

}
