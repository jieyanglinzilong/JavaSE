package com.example.springboot09;

import com.example.domin.Article;
import com.example.it.Artimapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class test2 {
    @Autowired
    Artimapper artimapper;
    @Test
    public void run1(){
      List<Article> articles= artimapper.find();
        System.out.println(articles);
    }
}
