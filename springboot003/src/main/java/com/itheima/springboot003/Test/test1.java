package com.itheima.springboot003.Test;

import com.itheima.springboot003.Controller.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test1 {
    @Autowired
    private user users;
    @Test
    public  void run1(){
        String hello=users.run1();
        System.out.println(hello);

    }
}
