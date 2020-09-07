package com.example.springboot09;

import com.example.domin.Discuss;
import com.example.it.findDisscuss;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class jpaTest {
    @Autowired
    findDisscuss findDisscuss;
    @Test
    public void find(){
       /* Pageable pageable=PageRequest.of(0,3);
        List<Discuss> discusses=findDisscuss.getDiscussPaged(1,pageable);*/
       List<Discuss> list=findDisscuss.findByAuthorNotNull();
       System.out.println(list);
    }
    @Test
    public  void run1(){
        Pageable pageable = PageRequest.of(0,3);
        List<Discuss> allPaged = findDisscuss.getDiscussPaged(1, pageable);
        System.out.println(allPaged);
    }
}
