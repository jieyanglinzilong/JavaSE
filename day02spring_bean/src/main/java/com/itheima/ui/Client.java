package com.itheima.ui;

import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//         ApplicationContext为父类接口
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        IAccountService as  = (IAccountService)ac.getBean("accountService");
        as.saveAccount();

        //手动关闭容器
        ac.close();
    }
    /*
    使用普通工厂创建对象
     */
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as  = (IAccountService)ac.getBean("accountService");
        as.saveAccount();
    }
    /**
     * 使用普通工厂的静态方法创建对象
     */

    @Test
    public  void run2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as  = (IAccountService)ac.getBean("accountService");
        as.saveAccount();
    }

}
