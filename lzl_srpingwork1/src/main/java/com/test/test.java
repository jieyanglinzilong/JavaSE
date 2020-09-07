package com.test;

import com.dao.services;
import com.dao.user;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void run1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        user userdao=(user)applicationContext.getBean("userdao");
        userdao.say();


    }
    @Test
    public void run2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        services service=(services)applicationContext.getBean("service");
        service.say();
    }
    @Test
    public  void  run3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("factory1"));
    }
    @Test
    public  void  run4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("factory3"));
    }
    @Test
    public static void  main(String []args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(applicationContext.getBean("a"));
        System.out.println(applicationContext.getBean("b"));
        System.out.println("2018118110 20181181 董辉");
    }

}
