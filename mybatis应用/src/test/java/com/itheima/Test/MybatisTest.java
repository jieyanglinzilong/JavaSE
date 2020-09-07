package com.itheima.Test;

import com.itheima.PO.OrderProduct;
import com.itheima.PO.StudentImpl;
import com.itheima.dao.Orderlist;
import com.itheima.dao.StudentsDao;
import com.itheima.domin.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private StudentsDao userdao;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        userdao= sqlSession.getMapper(StudentsDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        // sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void find(){/*
        List<Order> orderList=userdao.find(3);
        for(Order orderList1:orderList){
            System.out.println(orderList1);
        }
*/

    }
    @Test
    public void find1(){

   List<StudentImpl> studentList=userdao.find(1);
   for(StudentImpl student:studentList){
       System.out.println(student);
   }
   System.out.println("2018118110 董辉");



    }









}
