package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.dao.imply.douser;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * mybatis的入门案例
 */
public class MybatisTest {
    InputStream in;

    IUserDao userDao;
    @Before
    public void init()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象

        //4.使用SqlSession创建Dao接口的代理对象
        userDao = new douser(factory);
    }
    /**
     * 入门案例
     * @param args
     */
    @After
    public void destroy()throws Exception{

        in.close();
    }
    @Test
    public  void findall()throws Exception {
        //1.读取配置文件

        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }

        //6.释放资源

    }
    @Test
    public  void add()throws Exception {
       User user=new User();
       user.setId(1011);
       user.setAddress("深圳");
       user.setBirthday(new Date());
       user.setSex("女");
       user.setUsername("谢凌薇");
       System.out.println(user);
       userDao.saveuser(user);



        //6.释放资源
    }
    @Test
    public void findone()throws Exception{
       List<User> user=userDao.find(1004);
       System.out.println(user);

    }
    @Test
    public void findbyname()throws Exception{
        List<User> user=userDao.findname("%楚%");
        for(User us : user){
            System.out.println(us);
        }

    }
    @Test
    public void testFindInIds(){
        QueryVo vo = new QueryVo();
        List<Integer> list = new ArrayList<Integer>();
        list.add(41);
        list.add(42);
        list.add(46);
        vo.setIds(list);


        //5.执行查询所有方法
        List<User> users = userDao.findUserInIds(vo);
        for(User user : users){
            System.out.println(user);
        }

    }



}
