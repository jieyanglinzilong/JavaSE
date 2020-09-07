package com.itheima.springboot003.Test;



import com.itheima.springboot003.domin.person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test2 {
    @Autowired
    private person person;
    @Test
    public  void run1(){
       System.out.println(person);
    }
}
