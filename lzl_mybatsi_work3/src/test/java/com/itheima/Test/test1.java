package com.itheima.Test;

import com.itheima.dao.StundetDao;
import com.itheima.domin.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Random;

public class test1 {
    private InputStream in;
    private SqlSession sqlSession;
    private StundetDao userDao;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession(ExecutorType.BATCH, false);
        //4.获取dao的代理对象
        userDao = sqlSession.getMapper(StundetDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        // sqlSession.commit();
        //6.释放资源
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test
    public  void add(){
        student students[]=new student[20];

        for(int i=5;i<8;i++){
            students[i]=new student();
            students[i].setId(i);
            students[i].setPhone("123456");
            students[i].setUsername("韦小刚");
            students[i].setDepartment("计算机学院");
            students[i].setMajor("计算机");
            userDao.add(students[i]);

        }

    }
    @Test
    public  void run3(){
        Random random=new Random();
        double rm=random.nextDouble();
        rm=rm*10000;
        System.out.println(rm);
    }

}
