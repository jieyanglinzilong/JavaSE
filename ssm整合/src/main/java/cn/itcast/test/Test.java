package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Test {
    InputStream in;
    SqlSession session;
    UserDao userDao;
    @Before
    public void init()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(UserDao.class);
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







    @org.junit.Test
    public  void test()throws Exception {
        //1.读取配置文件

        //5.使用代理对象执行方法
        List<User> users = userDao.findUser();
        for(User user : users){

            System.out.println(user);
        }

        //6.释放资源

    }
    @org.junit.Test
    public void save(){
        User user=new User();
        user.setAddress("江苏南京");
        String day="1998-8-30";
        Date a=new Date(2018-1900, 9-1, 10);
        user.setId(1015);

        user.setBirthday(a);
        user.setName("秦枫");
        user.setSex("女");
        userDao.saveUser(user);
        session.commit();


    }
    @org.junit.Test
    public void find(){
        Integer id=1008;
        List<User> users=userDao.findbyid(id);
        for(User user : users){

            System.out.println(user);
        }




    }
    @org.junit.Test
    public void findchoose1(){
         List<Integer> id=new ArrayList<Integer>();
         id.add(1010);
         id.add(1012);
         id.add(1018);
        List<User> users=userDao.findchoose(id);
        for(User user : users){

            System.out.println(user);
        }




    }
    @org.junit.Test
    public void find1(){
        List<cn.itcast.po.User> in=userDao.lianhe();
           for(cn.itcast.po.User user:in){
            System.out.println(user);}


    }
    @org.junit.Test
    public void find2(){
        List<cn.itcast.po.Users> in=userDao.con();
        for(cn.itcast.po.Users users:in){
            System.out.println(users);}


    }

}
