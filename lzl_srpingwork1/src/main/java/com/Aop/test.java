package com.Aop;

import com.dao.user;
import com.dao.userdao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public  void run1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
       // userdao user=(userdao) applicationContext.getBean("proxy");
        userdao user=(userdao) applicationContext.getBean("userdao") ;
        user.adduser();
        user.deleteuser();
        System.out.println("2018118130 林梓龙");
    }
}
