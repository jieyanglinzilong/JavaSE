package com.itheima.Test;

import com.itheima.dao.AccountDao;
import com.itheima.dao.StundetDao;
import com.itheima.domin.tranfer;
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
import java.util.Random;

public class test2 {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountDao userDao;

    @Before//用于在测试方法执行之前执行
    public void init() throws Exception {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        userDao = sqlSession.getMapper(AccountDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy() throws Exception {
        //提交事务
        // sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void test1() {
        Random random = new Random();
        double rm = random.nextDouble();
        rm = rm * 10000;

        tranfer tranfer = new tranfer();
        List<tranfer> tranfers = new ArrayList<tranfer>();
        for (int i = 1; i <= 16; i++) {
            tranfer.setMoney(rm);
            tranfer.setId(i);
            tranfers.add(tranfer);
        }

        userDao.tranferin(tranfers);
    }
}