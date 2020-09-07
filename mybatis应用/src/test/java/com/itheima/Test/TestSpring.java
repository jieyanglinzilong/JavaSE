package com.itheima.Test;


import com.itheima.dao.Orderlist;
import com.itheima.domin.Order;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class TestSpring {


    @Test
    public void test1(){
        try {
           ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
           System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello------------------");
           Orderlist orderlist=(Orderlist)applicationContext.getBean("orderlist");
           List<Order> orderList1=orderlist.find(3);
           System.out.println(orderList1);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}
