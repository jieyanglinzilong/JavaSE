package com.itheima.Test;

import com.itheima.dao.StundetDao;
import com.itheima.domin.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
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
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        userDao = sqlSession.getMapper(StundetDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
        // sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }
    @Test
    public void like_find(){
        List<student> students=userDao.likefind("计算机");
        for(student student:students){
            System.out.println(student);
        }
    }

    @Test
    public void delete(){
        userDao.delete("计算机");
        System.out.println("删除成功");
    }
    @Test
    public  void add(){
        student students[]=new student[10];
        int i=0;
        int m=0;
        for( ;i<8;i++){
            students[i]=new student();
            students[i].setId(i);
            students[i].setPhone("abcfrg");
            students[i].setUsername("韦小刚");
            students[i].setDepartment("计算机学院");
            students[i].setMajor("软件工程");
            userDao.add(students[i]);
            m++;
        }
        System.out.println("成功插入"+m+"条数据");
    }
    @Test
    public  void update(){
        student student=new student();
        student.setId(3);
        student.setPhone("123456");
        userDao.update1(student);
        System.out.println("更新成功");
    }
    @Test
    public  void find2(){
       List<Integer> anger=new ArrayList<Integer>();
       anger.add(1);
       anger.add(3);
       anger.add(5);
       anger.add(7);
       List<student>students=userDao.findlist(anger);
       for(student student:students){
           System.out.println(student);
       }

    }


}
