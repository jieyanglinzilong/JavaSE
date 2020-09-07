package com.itheima.Test;

import com.itheima.dao.AccountDao;
import com.itheima.dao.StundetDao;
import com.itheima.domin.tranfer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tranfer implements  Runnable{

    public synchronized   void run() {

        while(true){

            if(count<0||sum<16)
                break;
            List<tranfer> tranfers=new ArrayList<tranfer>() ;
            for(int i=1;i<=16;i++){

                //1.读取配置文件，生成字节输入流
                try {
                   System.out.println("当前有"+count+"元 还剩 "+sum+" 个红包");
                    in = Resources.getResourceAsStream("SqlMapConfig.xml");
                    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
                    //3.获取SqlSession对象
                    sqlSession = factory.openSession(true);
                    //4.获取dao的代理对象
                    userDao = sqlSession.getMapper(AccountDao.class);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                Random random=new Random();
                double rm=random.nextDouble();
                rm=rm*10000;

                tranfer tranfer=new tranfer();

                tranfer.setMoney(rm);
                tranfer.setId(i);
                tranfers.add(tranfer);

                if(count>rm){
                count=count-rm;
                sum=sum-1;


                }


            }
            System.out.println("提交信息");
            if(sum<16)
                break;

            userDao.tranferin(tranfers);
            sqlSession.commit();
            sqlSession.close();

            if(count<1000)
                break;
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }

    private volatile InputStream in;
    private volatile SqlSession sqlSession;
    private volatile AccountDao userDao;
    volatile static double count=1000000000;
    volatile static  int sum=900000;


    public static  void main(String args[]){
        long timeStart=System.currentTimeMillis();
        Tranfer tranfer=new Tranfer();
        int i=1;
        while(true){

            for(;i<=4;i++) {
                new Thread(tranfer, "THREAD" + i).start();
                System.out.println("执行了" + i + "线程");
            }

           if(count<1000||sum<0)
            break;

        }
        long timeend=System.currentTimeMillis();



        System.out.println("----------耗时-------："+(timeend-timeStart));



    }

}
