package com.it.cn;

//import com.it.domin.User;
import com.it.Ido.Iuser;
import com.it.domin.Area;
import com.it.domin.Quervo;
import com.it.domin.User;
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

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * mybatis的入门案例
 */
public class MybatisTest {
    InputStream in;
    SqlSession session;
    Iuser userDao;
    @Before
    public void init()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
         session = factory.openSession(true);
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(Iuser.class);
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
    public void findbyname(){
        List<User> users=userDao.findname("%谢%");//模糊查询
        // List<User> users=userDao.findname("陈森");
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void findarea(){
       List<Area> areas=userDao.findarea();
       for(Area area:areas){
           System.out.println(area);
           System.out.println(area.getArea());
       }

    }
    @Test
    public void findcondtion(){
        User us=new User();
        us.setUsername("%谢%");
        us.setAddress("%连云港%");

        List<User> users=userDao.findbycondtion(us);
        for(User user:users ){
            System.out.println(user);}

    }
    @Test
    public void show(){
        List<String> list=new ArrayList<String>();
        list.add("谢凌薇");
        list.add("宁紫陌");

        Quervo vo=new Quervo();
        vo.setName(list);

        List<User> users=userDao.findwhere(vo);
        for(User user:users ){
            System.out.println(user);}

    }



}
