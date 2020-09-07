package com.itheima.Test;

import com.itheima.dao.AccountDao;
import com.itheima.dao.StundetDao;
import com.itheima.dao.UserDao;
import com.itheima.domin.User;
import com.itheima.domin.student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class test {
    @Test
    public void find(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/dao/beans.xml") ;
        StundetDao StundetDa=(StundetDao) applicationContext.getBean("StduntDao");
        List<student> students=StundetDa.find();
        for(student student:students){
            System.out.println(student);
        }





        }
    @Test
    public  void createtable1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/dao/beans.xml") ;
        JdbcTemplate jdbcTemplate=(JdbcTemplate)applicationContext.getBean("jdbcTemplate");
        //jdbcTemplate.execute("create  table  student(id int primary  key )");
        jdbcTemplate.execute("alter table student add column  phone char(20)");

    }
    @Test
    public  void find1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/dao/beans.xml") ;
       AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");


        accountDao.tranfer("周庆空","赵紫欣",3000);









    }
    @Test
    public  void find2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/dao/bean.xml") ;
        AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");


        accountDao.tranfer("周庆空","赵紫欣",300);
    }



}


