package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.Account;
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
import java.util.Date;
import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * mybatis的入门案例
 */
public class MybatisTest {
    InputStream in;
    SqlSession session;
    IUserDao userDao;
    @Before
    public void init()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
         session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(IUserDao.class);
    }
    /**
     * 入门案例
     * @param args
     */
    @After
    public void destroy()throws Exception{
        session.close();
        in.close();
    }
    @Test
    public  void testall()throws Exception {
        //1.读取配置文件

        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }

        //6.释放资源

    }
    @Test
    public  void find_account() throws  Exception{
        List<Account> a=userDao.findaccout();
        for(Account account:a){
            System.out.println(account);
        }
    }
    @Test
    public  void add()throws Exception {
       User user=new User();
       user.setId(1016);
       user.setAddress("北京");
       user.setBirthday(new Date());
       user.setSex("女");
       user.setUsername("卫子晴");
       System.out.println(user);
       userDao.saveuser(user);
       session.commit();


        //6.释放资源
    }
    @Test
    public void findone()throws Exception{
       User user=userDao.find(1004);
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
    public  void findsaverbyVo() throws Exception{
        QueryVo vo=new QueryVo();
        User user =new User();
        user.setUsername("%周%");
        vo.setUser(user);
        List<User> users =userDao.findsaverbyVo(vo);
        for(User u:users){
            System.out.println(u);
        }



    }



}
