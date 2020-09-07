package com.example.springboot09;

import com.example.domin.Comment;
import com.example.it.mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class test1 {
    @Autowired
    private mapper mapper;
    @Test
    public void run1(){
        Comment comment=mapper.findbyid(1);
        System.out.println(comment);
        System.out.println("hello");
    }
    @Test
    public void run2(){
       List<Comment> comment=mapper.find();
        for(Comment comment1:comment){

        System.out.println(comment1);}
        System.out.println("hello");
    }
}
