package com.itheima.Test;


import com.itheima.dao.CustomerDao;
import com.itheima.domin.Customer;
import com.itheima.domin.t_user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class sql_test {

    private InputStream in;
    private SqlSessionFactory sqlSessionFactory;
    private CustomerDao userDao;


    @Test
    public  void sqltest() throws  Exception{
        String resorce="SqlMapConfig.xml";
        in= Resources.getResourceAsStream(resorce);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<Customer> customers=sqlSession.selectList("com.itheima.dao"+".Customer_mybatis.findCustomerById",1);
        System.out.println(customers);
        sqlSession.close();
    }
    @Test
    public  void sqltest2() throws  Exception{
        String resorce="SqlMapConfig.xml";
        in= Resources.getResourceAsStream(resorce);
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<t_user> users=sqlSession.selectList("com.itheima.dao"+".Customer_mybatis.findAllUser");
        System.out.println(users);
        sqlSession.close();
    }


}
