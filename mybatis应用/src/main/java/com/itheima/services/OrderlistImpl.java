package com.itheima.services;

import com.itheima.dao.Orderlist;
import com.itheima.domin.Order;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public class OrderlistImpl extends SqlSessionDaoSupport  implements Orderlist {




    public List<Order> find(int id) {
        System.out.println("                  ");
        SqlSession sqlSession=this.getSqlSession();
         return  sqlSession.selectOne("com.itheima.dao.Orderlist.find",id);



    }


}
