package com.example.Test;

import com.example.domin.user;
import com.example.serives.usermapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class usertest {
    @Autowired
    private usermapper usermappers;
    @Test
    public void run1(){
        List<user> users=usermappers.find();
        for(user userss:users){
        System.out.println(userss);}
    }



}
